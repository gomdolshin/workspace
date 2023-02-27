# -*- coding: utf-8 -*-
 
# import datetime

# ms = 47113920600

# ms = 623980809000

# print(datetime.datetime.fromtimestamp(ms/1000.0))


from functools import cmp_to_key

def comp(x, y):
    if x[0]<y[0]:
        return True
    else:
        return -1

def comp_2(x, y):
    if x[0]<y[0]:
        return 1
    else:
        return -1

l = []
l.append((1,4))
l.append((3,1))
l.append((2,2))
l.append((4,5))
l.append((3,4
          ))

print(l)
sorted_list = sorted(l, key=cmp_to_key(comp))

print(sorted_list)
print(sorted(l, key=cmp_to_key(comp_2)))