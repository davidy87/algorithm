# Quick Sort

## 개요
Quick Sort는 Divide & Conquer 방법을 통해 주어진 배열을 정렬한다.

*Divide & Conquer?*
> 하나의 문제를 작은 문제들로 분리하고, 각각 해결한 후, 결과를 모아서 원래의 문제를 해결하는 방식

Quick Sort는 불안정 정렬(unstable sorting)에 속하며, 다른 원소와의 비교만으로 정렬을 수행하는 비교 정렬에 속한다.

또한, Merge Sort와는 달리 Quick Sort는 배열을 비균등하게 분할한다.

<br>

## 동작 방식
1. 배열 가운데에서 하나의 원소를 고른다. 이 원소를 pivot이라 부른다.
2. Pivot 앞에는 이보다 작은 원소들이 위치하게 되고, pivot 뒤에는 pivot의 값보다 큰 모든 원소들이 오도록 pivot을 기준으로 배열을 둘로 나눈다.
   - 이렇게 배열을 둘로 나누는 작업을 분할 (Divide) 이라고 한다. 분할을 마친 뒤에 pivot은 더 이상 움직이지 않는다.
3. 분할된 두 개의 작은 배열에 대해 재귀적 (recursive) 으로 위의 과정들을 반복한다.

<br>

## Complexity
### Time Complexity
- Best case: `O(N log N)`
- Worst case: `O(N^2)`

### Space Complexity
- Average:  `O(log N)`
- Worst case: `O(N)`

<br>

## Pros & Cons
### Pros
- 특정 상태가 아닌 이상 평균 시간 복잡도는 `NlogN`이며, 다른 `NlogN` 알고리즘에 비해 대체적으로 속도가 매우 빠르다. 
  - 유사하게 `NlogN` 정렬 알고리즘 중 분할 정복 방식인 Merge Sort에 비해 2~3배정도 빠르다.
- 추가적인 별도의 메모리를 필요로하지 않으며, 재귀 호출 stack frame에 의한 공간 복잡도는 `logN`으로 메모리를 적게 소비한다.

### Cons

- 불안정 정렬(unstable sorting)이다.
- 특정한 경우(i.e. 배열이 이미 정렬되어 있는 경우)에는 불균형 분할에 의해 효율성이 떨어진다.
- Pivot의 선택에 따라 성능이 크게 달라질 수 있다.