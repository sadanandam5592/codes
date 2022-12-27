
# if __name__=='__main__':
#     n = int(input())
#     dict={}
#     for a in range(n):
#      data=input().split(" ")
#      dict[data[0]]=data[1]
#     while(True):
#         try:
#          if(name in dict):
#             print(name+"="+dict[name])
#          else: print("Not Found")
#         except EOFError:
#             break
         
def lookup(name):
    if name in phonebook:
        return name +"="+phonebook[name]
    else:
        return "Not found"
if __name__ == '__main__':
    n = int(input())
    phonebook={}
    for a in range(n):
      data=input().split()
      phonebook[data[0]]=data[1]
    while True:
      try:
        name = input()
      except EOFError:
        break
      print(lookup(name))
        
