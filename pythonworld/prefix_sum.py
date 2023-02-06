# -*- coding: utf-8 -*-
 
import sys
from itertools import accumulate, combinations
from operator import add, mul
from functools import reduce

def nCr(n, r):
    if n < 1 or r < 0 or n < r:
        return 0
    else:
        r = min(r, n-r)
        numerator = reduce(mul, range(n, n-r, -1), 1)
        denominator = reduce(mul, range(1, r+1), 1)
        return numerator // denominator

input = sys.stdin.readline

#(1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
N, M = map(int, input().split())

prefix_list = list(map(lambda x : x%M, list(accumulate(map(int, input().split())))))

#print(prefix_list)
tot_cnt = 0
tot_cnt += prefix_list.count(0)
for i in range(1, M):
    tmp_cnt = prefix_list.count(i)
    if tmp_cnt > 1:
        tot_cnt += nCr(tmp_cnt, 2)

#print(tot_cnt)

# sums = [[0 for _ in range(N+1)]]

# for i in range(1, N+1):
#     sums.append(list(map(add, [0] + list(accumulate(map(int, input().split()))), sums[i-1])))
    
# print(sums)
# for _ in range(M):
#     i, j, k, h = map(int, input().split())
#     print(sums[k][h] - sums[i-1][h] - sums[k][j-1] + sums[i-1][j-1])

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