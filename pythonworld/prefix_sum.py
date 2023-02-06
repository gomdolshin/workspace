# -*- coding: utf-8 -*-
 
import sys
#from itertools import accumulate, combinations
#from operator import add

input = sys.stdin.readline

#(1 ≤ N ≤ 106, 2 ≤ M ≤ 103)
N, M = map(int, input().split())

prefix_list = list(map(int, input().split()))

sums = [0 for _ in range(M)]
sums[0] = 1

tot = 0
for i in range(N):
    tot += prefix_list[i]
    r = tot%M
    sums[r] += 1
    
#print(sums)
cnt = 0
for i in sums:
    cnt += i*(i-1)//2

print(cnt)
    

#print(prefix_list)
# tot_cnt = 0
# tot_cnt += prefix_list.count(0)
# for i in range(1, M):
#     tmp_cnt = prefix_list.count(i)
#     if tmp_cnt > 1:
#         tot_cnt += nCr(tmp_cnt, 2)

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