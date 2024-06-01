# Heap Sort

## 개요
완전 이진 트리 (Complete Binary Tree) 를 기본으로 하는 힙 (Heap) 자료구조를 기반으로 한 정렬 방식

*완전 이진 트리란?*
> 삽입할 때 왼쪽부터 차례대로 추가하는 이진 트리

Heap Sort는 unstable sort에 속한다.

<br>

## 동작 방식

1. Max heap을 구성
2. 현재 heap의 root는 가장 큰 값이 존재한다. Root의 값을 배열의 마지막 요소와 바꾼 후, heap의 크기를 하나 줄인다.
3. Heap 요소가 하나 제거된 이후, 다시 max heap을 구성
3. Heap의 크기가 1이 될 때까지 위의 과정들을 반복한다.

<br>

## Complexity
### Time Complexity

| Best     | Average  | Worst    |
|----------|----------|----------|
| Ω(nlogn) | Θ(nlogn) | O(nlogn) |


### Space Complextiy
- O(1) (Inplace sorting)

<br>

## 장단점
### 장점
- 가장 크거나 가장 작은 값을 구할 때 유용하다.
    - Min heap or max heap의 root이기 때문에 한 번의 heap 구성을 통해 구하는 것이 가능하다.
- 최대 k 만큼 떨어진 요소들을 정렬할 때 유용
    - Insertion Sort보다 더욱 개선된 결과를 얻을 수 있다.

### 단점
- Unstable sort

