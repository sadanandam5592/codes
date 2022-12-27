import sys

def m():
    d,name,phone = dict(),str(),""
    for i in range(int(input())):
        name, phone = input().split(' ')
        d[name] = phone
    while(True):
        try:
          name = input()
          if name in d: print(d[name])
          else: print("Not Found")
        except EOFError:
          break
if __name__ == "__main__":
    m()
