# -*- coding: utf-8 -*-

'''
bj 1874번 / 스택수열

print를 많이 쓸수록 메모리 소모가 심하기에 print는 한꺼번에 하는게 효과적임


'''


# import sys

# input = sys.stdin.readline

N = int(input())

arr = []
cnt = 1
answer = []
result = True
for i in range(N):
    n = int(input())
    while cnt <= n:        
        arr.append(cnt)
        cnt += 1
        answer.append('+')
    
    if arr[-1] == n:
        arr.pop()
        answer.append('-')
    else:
        result = False
        # print("NO")
        break

if result:
    for i in answer:
        print(i)
else:
    print("NO")
    

# N = int(input())

# arr = []
# cnt = 1
# for i in range(N):
#     n = int(input())
#     while cnt <= n:        
#         arr.append(cnt)
#         cnt += 1
#         print('+')
    
#     print(arr, n, cnt)
#     if arr[-1] == n:
#         arr.pop()
#         print('-')
#     else:
#         print("NO")
#         break
        

        



