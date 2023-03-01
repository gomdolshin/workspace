# -*- coding: utf-8 -*-

'''
bj 1377번 / 버블소트

버블정렬의 이중 for문중 안에 for문에서 한번도 버블정렬이 일어나지 않은 경우를 찾는문제
하지만 N이 50만이하이므로 버블정렬로 풀경우 시간제한이 걸린다

Q. 안쪽 for문이 버블정렬이 일어나지 않았을때의 i를 출력하는 문제

1. 한번도 버블정렬이 일어나지 않았다면 => 이미 정렬이 끝남
2. 안쪽 for문이 한번 루프를 도는 동안 한index의 데이터가 이동할수 있는 최대거리는 1
   2-1 어떤 데이터의 index가 가장 많이 이동했다면 그게 for문이 수행된 횟수(i)
   2-2 이동한 데이터의 index값을 구하고 버블정렬이 일어나지 않았더라도 i는 ++ 이다

시행착오
A.index(sorted_A[i]) sort하고 A의 index를 찾는 과정에서 시간초과가 생김
=> array A의 elements를 (value, index)로 변경하여 sort 진행하니 통과 

'''
import sys
N = int(sys.stdin.readline())

A = [(int(sys.stdin.readline()), i) for i in range(N)]
sorted_A = sorted(A)

ans = []
for i in range(N):
    ans.append(sorted_A[i][1] - A[i][1])
print(max(ans) + 1) 

# import sys
# N = int(sys.stdin.readline())

# A = [int(sys.stdin.readline()) for _ in range(N)]
# sorted_A = sorted(A)

# ans = []
# for i in range(N):
#    ans.append(A.index(sorted_A[i]) - i)
# print(max(ans) + 1) 

