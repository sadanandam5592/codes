class nqueen{
   static final int n=4;
   

  static boolean isSafe(int[][] board,int row,int col){
     for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){//left upper diagonal
        if(board[i][j]==1) return false;
     }
     for(int i=0;i<row;i++){ 
        if(board[i][col]==1) return false; //top rows in the same column
     }
     for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
        if(board[i][j]==1) return false;// right upper diagonal
     }
     
    return true;
   }
   static void printSol(int[][] board){
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(" " + board[i][j]
								+ " ");
			System.out.println();
		}
    }

   static boolean solveNQueenUtil(int[][] board,int row){
       if(row==n) return true;
       for(int col=0;col<n;col++){
        if(isSafe(board,row,col)){
            board[row][col]=1;
            if(!solveNQueenUtil(board, row+1)){
                board[row][col]=0;
            }
            else return true;
        }
       }
       return false;
   }
   static boolean solveNQueen(){
    int[][] board={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    if(solveNQueenUtil(board, 0)){
        
        printSol(board);
        return true;
    }
    return false;
   }
    
    public static void main(String[] args) {
        
        boolean a=solveNQueen();
        System.out.println(a);
        
    }
}