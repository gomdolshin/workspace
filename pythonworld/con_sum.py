# -*- coding: utf-8 -*-
 
import sys
#from itertools import accumulate, combinations
#from operator import add

input = sys.stdin.readline
N = int(input())
M = int(input())

start_index = 0
end_index = N-1
count = 0

num_list = sorted(list(map(int, input().split())))
print(num_list)
while start_index < end_index:
    if num_list[start_index] + num_list[end_index] > M: end_index -= 1
    elif num_list[start_index] + num_list[end_index] < M: start_index += 1
    else:
        start_index += 1
        end_index -= 1
        count += 1

print(count)


'''
230208 bj2018

input = sys.stdin.readline

N = int(input())

sum = 1
count = 1
start_index = 1
end_index = 1

while (end_index != N):
    if sum > N:
        sum -= start_index
        start_index += 1
    elif sum < N:
        end_index += 1
        sum += end_index
    else:
        end_index += 1
        sum += end_index
        count += 1

print(count)
'''