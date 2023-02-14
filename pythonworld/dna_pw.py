# -*- coding: utf-8 -*-


from collections import deque

s, p = map(int, input().split())
string = list(str(input()))
A, C, G, T = map(int, input().split())

dic = {'A': 0, 'C': 0, 'G': 0, 'T': 0}
left, right = 0, p-1
arr = deque(string[left:right])
for i in arr:
    dic[i] += 1
cnt = 0

while right < s:

    # 구간 완성
    dic[string[right]] += 1 # 가장 오른쪽 원소 추가

    # 계산
    if dic['A'] >= A  and dic['C'] >= C and dic['G'] >= G and dic['T'] >= T:
        cnt += 1

    # 구간이동
    dic[string[left]] -= 1 # 가장 왼쪽 원소 제거
    left += 1
    right += 1

print(cnt)


'''
아래의 풀이는 runtime error
'''
import sys
#from itertools import accumulate, combinations
#from operator import add

input = sys.stdin.readline
S, P = map(int, input().split())
dna = list(input())
pwlist = list(map(int, input().split()))

dic = {'A':pwlist[0], 'C': pwlist[1], 'G':pwlist[2], 'T':pwlist[3]}
base = {'A':0,'C':0,'G':0,'T':0}

cnt = 0
for i in range(S-P+1):
    flag = True
    
    if i == 0:
        for j in range(P):
            base[dna[j]] += 1
    else:
        base[dna[i+P-1]] += 1
        base[dna[i-1]] -= 1
    
    for k in ('A', 'C', 'G', 'T'):
        if base[k] < dic[k]:
            flag = False
            break
    
    if flag:
        cnt +=1
        
print(cnt)
