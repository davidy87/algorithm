# Merge Sort

## 개요
병합 정렬 (혹은 합병 정렬) 이라고 부르며, Divide & Conquer 방법을 통해 구현

*Divide & Conquer?*
> 하나의 문제를 작은 문제들로 분리하고, 각각 해결한 후, 결과를 모아서 원래의 문제를 해결하는 방식

병합 정렬은 빠른 정렬로 분류되며, Quick Sort 와 함께 많이 언급되는 정렬 방식이다.
- Quick Sort 와는 반대로 stable sort에 속한다.

<br>

## 동작 방식
1. 배열을 나눌 수 있을 때 까지 나눈다 (Divide & Conquer)
   - 나누는 기준은 가운데 → (left + right) / 2
2. 나눠진 배열들을 정렬하며 병합한다 (Combine)

<br>

## Complexity
### Time Complexity

| Best Case | Average Case | Worst Case |
|-----------|--------------|------------|
| Θ(N logN) | Ω(N logn)    | O(N logN)  |

### Space Complexity

- `O(N)`

<br>

## 장단점
### 장점
- 만약 레코드를 배열(Array)로 구성하면, 임시 배열이 필요하다.
- 제자리 정렬(in-place sorting)이 아니다.
- Record의 크기가 큰 경우에는 이동 횟수가 많으므로 매우 큰 시간적 낭비를 초래한다.

### 단점
- Stable sorting
- 데이터의 분포에 영향을 덜 받는다. 즉, 입력 데이터가 무엇이든 간에 정렬되는 시간은 동일하다.
    - `O(nlogn)`으로 동일
- 만약 record를 LinkedList로 구성하면, link index만 변경되므로 데이터의 이동은 무시할 수 있을 정도로 작아진다.
    - 제자리 정렬(in-place sorting)로 구현할 수 있다.
    - 따라서, 크기가 큰 record를 정렬할 경우에 LinkedList를 사용한다면, Merge Sort는 Quick Sort을 포함한 다른 어떤 졍렬 방법보다 효율적이다.