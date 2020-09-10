### p.87 거스름돈 문제

- 가장 큰 화폐 단위부터 돈을 거슬러주면 됩니다.

#### 코드

- [Java](https://github.com/azurealstn/coding-test/blob/master/greedy/Money.java)

### p.99 1이 될 때까지

- 최대한 많이 나누면 됩니다.

#### 코드

- [Java](https://github.com/azurealstn/coding-test/blob/master/greedy/One.java)

### p.312 곱하기 혹은 더하기

- 두 수에 대하여 연산을 수행할 때, 두 수 중에서 하나라도 1이하인 경우에는 더하며, 두 수 모두 2이상인 경우에는 곱합니다.
- 현재까지 계산 결과를 result에 담은 상태로, 매 숫자에 대하여 연산 수행
- result가 1이하이거나, 현재 처리하고 있는 숫자가 1이하라면 더하기 연산 그렇지 않으면 곱하기 연산

#### 코드

- [Java](https://github.com/azurealstn/coding-test/blob/master/greedy/MulPlus.java)

### p.92 큰 수의 법치

- 반복되는 수열을 파악할 것
- 문제예시에서 [6,6,6,5]가 2번 반복 즉, M을 (K + 1)로 나눈 몫이 반복. 여기에 K를 곱하면 큰 수가 등장하는 횟수
- (나누어 떨어지지 않을 경우) 이 때는 M을 (K + 1)로 나눈 나머지만큼 가장 큰 수를 더합니다.

#### 코드

- [Java](https://github.com/azurealstn/coding-test/blob/master/greedy/92.java)

