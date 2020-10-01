import java.util.*;

public class Main {

    public static int n, m;
    public static int[][] graph = new int[201][201];

    //이동할 네가지 방향 정의 (상하좌우)
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static int bfs(int x, int y) {
        //큐 구현을 위한 라이브러리
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        //큐가 빌때까지 반복
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getIndex();
            y = node.getDistance();
            //현재 위치에서 4가지 방향 위치 확인
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                //벽인 경우 무시
                if (graph[nx][ny] == 0) continue;
                //해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        //ㄱ장 오른쪽 아래까지의 최단거리 반환
        return graph[n-1][m-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N,M 입력
        n = sc.nextInt();
        m = sc.nextInt();
        
        //맵 입력
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        System.out.println(bfs(0,0));

    }

}
