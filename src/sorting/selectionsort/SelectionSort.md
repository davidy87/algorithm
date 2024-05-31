# Selection Sort

## 개요
Selection Sort는 Bubble Sort와 유사한 알고리즘으로, **해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘**이다.

<br>

## 동작 방식
1. 주어진 배열 중에 최소값을 찾는다.
2. 이 값을 맨 앞에 위치한 값과 교체한다.
3. 맨 처음 위치를 뺀 나머지 배열을 같은 방법으로 교체한다.

<br>

## Complexity
### Time Complexity
- 첫 번째 loop에서 비교 횟수 → n - 1
- 두 번째 loop에서 비교 횟수 → n - 2

  …

- (n - 1) + (n - 2) + … + 2 + 1 = n(n - 1) / 2 → **O(N^2)**

### Space Complexity
- O(N)
- O(1) (Auxiliary)

<br>

## 장단점
### 장점
- Bubble Sort과 마찬가지로 알고리즘이 단순하다.
- 정렬을 위한 비교 횟수는 많지만, Bubble Sort에 비해 swap하는 횟수는 적기 때문에 많은 swap이 필요한 곳에서 효율적이다.
- 정렬하는 과정에서 별도의 메모리를 거의 사용하지 않는다. → Inplace sorting

### 단점
- Time complexity
- Unstable sort