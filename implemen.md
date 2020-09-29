## p.110 상하좌우

- 상(-1,0) 하(1,0) 좌(0,-1) 우(0,1)에서 dx={0,0,-1,1}, dy={-1,1,0,0} 방향을 정해놓고 문제를 푼다.
- String[] plans = sc.nextLine().split(" "); //plans 배열에 입력을 시키고, char[] moveTypes = {'L', 'R', 'U', 'D'}; 로 선언한다.
- for문을 이용하여 하나씩 확인하여 if (plan == moveTypes[j]) 같다면 이동시켜 준다. nx = x + dx[j]; ny = y + dy[j];

[Java코드](https://github.com/azurealstn/coding-test/blob/master/implement/LRUD.java)

## p.113 시각

- 가능한 모든 경우의 수를 검사하는 '완전탐색' 문제
- check 메서드를 만들어 반환타입이 true이면 카운트 증가 if (check(i, j, k)) cnt++;

[Java코드](https://github.com/azurealstn/coding-test/blob/master/implement/time.java)
