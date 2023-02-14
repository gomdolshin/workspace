# -*- coding: utf-8 -*-
 
import sys
#from itertools import accumulate, combinations
#from operator import add

input = sys.stdin.readline
N = int(input())
num_list = sorted(list(map(int, input().split())))

# i = 0
# j = N-1
count = 0

for k, num in enumerate(num_list):
    i = 0
    j = N-1
    while i < j:
        if num_list[i] + num_list[j] > num:
            j -= 1
        elif num_list[i] + num_list[j] < num:
            i += 1
        else:
            if i != k and j!= k:
                count += 1
                break
            elif i == k: i +=1
            elif j == k: j -=1    
        #print(i, j)

print(count)