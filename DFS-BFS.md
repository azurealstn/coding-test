## p.149 음료수 얼려먹기

- dfs문제(재귀함수, 스택 자료구조 이용)

[Java코드](https://github.com/azurealstn/coding-test/blob/master/DFS-BFS/Ice.java)

## p.152 미로 탈출

- BFS를 이용했을 경우 매우 효율적(문제에서 최소 칸의 개수를 구하는 것이므로 dfs보단 bfs)
- 특정한 노드를 방문하면 그 이전 노드의 거리에 1을 더한 값을 리스트에 넣는다.

```java
if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx, ny));
}
```

[Java코드](https://github.com/azurealstn/coding-test/blob/master/DFS-BFS/Escape.java)
