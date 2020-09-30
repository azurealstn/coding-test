## p.110 상하좌우

- 상(-1,0) 하(1,0) 좌(0,-1) 우(0,1)에서 dx={0,0,-1,1}, dy={-1,1,0,0} 방향을 정해놓고 문제를 푼다.
- String[] plans = sc.nextLine().split(" "); //plans 배열에 입력을 시키고, char[] moveTypes = {'L', 'R', 'U', 'D'}; 로 선언한다.
- for문을 이용하여 하나씩 확인하여 if (plan == moveTypes[j]) 같다면 이동시켜 준다. nx = x + dx[j]; ny = y + dy[j];

[Java코드](https://github.com/azurealstn/coding-test/blob/master/implement/LRUD.java)

## p.113 시각

- 가능한 모든 경우의 수를 검사하는 '완전탐색' 문제
- check 메서드를 만들어 반환타입이 true이면 카운트 증가 if (check(i, j, k)) cnt++;

[Java코드](https://github.com/azurealstn/coding-test/blob/master/implement/time.java)

## p.115 왕실의 나이트

- 전에 '상하좌우' 문제와 굉장히 유사
- 나이트가 이동할 수 있는 경로를 하나씩 확인하여 이동
- 코드를 보면서 이해할 것!

[Java코드](https://github.com/azurealstn/coding-test/blob/master/implement/Night.java)

## p.118 게임

- 전형적인 시뮬레이션 문제
- 먼저 뱡향을 정의하고, 왼쪽으로 회전하는 static 메서드 `turn_left()`, 맵 저장을 위한 초기화를 해준다음 메인메서드에서 코드를 작성
- 먼저 문제대로 `//왼쪽 회전`하여 위치를 각각 `nx`, `ny`에 저장
- 이제 회전 이후 가보지 않은 칸, 가보지 않은 칸이 없는 경우, 뒤에도 막혔을 경우를 나누어서 해결
- 문제를 최대한 이해할 것!

[Java코드](https://github.com/azurealstn/coding-test/blob/master/implement/Game.java)
