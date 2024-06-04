# Radix Sort

<br>

## 개요

> 데이터를 구성하는 기본 요소 (Radix) 를 이용하여 정렬을 진행하는 방식

입력 데이터의 최댓값에 따라서 Counting Sort의 비효율성을 개선하기 위해서, Radix Sort를 사용할 수 있다.

자릿수의 값(i.e. 1의 자리, 10의 자리)별로 정렬을 하므로, 나올 수 있는 값의 최대 사이즈는 9이다 (범위 : 0~9).

<br>

## 동작 방식

기본적으로 [Counting Sort](../countingsort/CountingSort.md)와 비슷하게 동작하지만, 최댓값을 찾은 후, 해당 값의 
자릿수의 값(i.e. 1의 자리, 10의 자리)별로 정렬하는 과정이 이루어진다.

<br>

## Complexity

### Time Complexity

`O(d * (N + k))`
- `d`는 정렬할 숫자의 자릿수, `k`는 10
- ( Counting Sort의 경우 : `O(N + k)` 로 배열의 최댓값 `k` 에 영향을 받음 )

### Space Complexity

`O(N + k)` → `N` 크기의 output 배열 + `k` 크기의 counter 배열