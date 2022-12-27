def _init_(self,value):
    self.value=value
    self.leftchild=None
    self.rightchild=None


def insert_leftchild(self,value):
    if(self.leftchild==None):
        self.value=value
    else:
        leftchild = Binarytree(value)