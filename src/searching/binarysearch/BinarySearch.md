# Binary Search

<br>

## 개요

탐색 범위를 두 부분으로 분할하여 찾는 방식이다.

**탐색 전 배열을 필수로 정렬해야 한다**는 특징이 있다.

<br>

## 동작 방식

1. 먼저 배열을 정렬

2. start index와 end index로 mid index 설정 → `mid = (start + end) / 2`

3. mid index에 해당하는 배열의 값과 찾고자 하는 값을 비교
    1. 찾고자 하는 값이 mid 보다 클 경우 → `start = mid + 1`
    2. 찾고자 하는 값이 mid 보다 작을 경우 → `end = mid - 1`

4. `start > end`가 될 때까지 계속 반복

<br>

## Java에서의 Binary Search

### `Arrays.binarySearch()`

``` java
Arrays.binarySearch(arr, key);
```

<br>

## Complexity

### Time Complexity

- `O(log N)` (linear search는 `O(N)`)