## p. 159 선택정렬

- 선택정렬은 0부터 9까지의 숫자가 있을 때, 이 중에서 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고,
- 첫 번째 데이터는 정렬되었으니까 이제 두 번째부터 또 가장 작은 데이터를 선택해 2번째에 있는 데이터와 바꾼다
- 위 과정을 반복.
- 선택정렬은 (N - 1)번만큼 가장 작은 수를 찾아서 맨 앞으로 보내야 한다. 그리고 매번 가장 작은 수를 찾기 위해 비교연산이 필요하다.
- 상수항은 무시되므로 선택정렬의 시간복잡도는 `O(N^2)`이다.

[Java코드](https://github.com/azurealstn/coding-test/blob/master/Sort/Selection.java)