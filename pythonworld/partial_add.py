# -*- coding: utf-8 -*-

# import sys

# input = sys.stdin.readline
# print(input)
# N, M = map(int, input().split())
# input_list = list(map(int, input().split()))

# sum_list = [0] * (N+1)

# for _ in range(N):
#     sum_list[_+1] = sum_list[_] + input_list[_]

# for _ in range(M):
# 	i, j = map(int, input().split())
# 	print(sum_list[j] - sum_list[i-1])
 
 
import sys
from itertools import accumulate
from operator import add

input = sys.stdin.readline

N, M = map(int, input().split())


sums = [[0 for _ in range(N+1)]]

for i in range(1, N+1):
    sums.append(list(map(add, [0] + list(accumulate(map(int, input().split()))), sums[i-1])))
    
print(sums)
for _ in range(M):
    i, j, k, h = map(int, input().split())
    print(sums[k][h] - sums[i-1][h] - sums[k][j-1] + sums[i-1][j-1])

# import sys
# input = sys.stdin.readline

# n, m = map(int, input().split())
# data = [list(map(int, input().split())) for _ in range(n)]
# sum_data = [[0] * (n+1) for i in range(n+1)]

# for i in range(1, n+1):
#     for j in range(1, n+1):
#         sum_data[i][j] = sum_data[i][j-1] + sum_data[i-1][j] - sum_data[i-1][j-1] + data[i-1][j-1]
        
# print(data)
# print(sum_data)