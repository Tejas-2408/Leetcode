'''
Question link:
https://leetcode.com/problems/valid-palindrome/
'''
import re
n = input()
n = re.sub(r'[^A-Za-z0-9]', '',n)
n = n.lower()
print(n==n[::-1])