# -*- coding: utf-8 -*-

'''
bj 11399번 / ATM

아래도 가능하나.. open(0)을 쓰진 않을듯..

'''
import sys

N = int(sys.stdin.readline())

tot = 0
res = 0
for i in sorted(list(map(int, sys.stdin.readline().split()))):
    tot += i
    res += tot

print(res)

# tot = res =0
# for i in sorted(list(map(int, [*open(0)][1].split()))):
#     tot += i
#     res += tot

# print(res)