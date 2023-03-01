# -*- coding: utf-8 -*-

'''
bj 1427번 / 내림차순으로 자릿수 정렬하기

1. sys.stdin.readline()에는 '\n'이 있다
2. print(sep='')을 사용할수 있다. default는 sep=" "

'''
import sys

#아래의 세개 다 정답
print(*sorted(input(), reverse=True), sep='')

print(*sorted(sys.stdin.readline(), reverse=True), sep='')

print(''.join(sorted(input(), reverse=True)))

