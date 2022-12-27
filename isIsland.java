class isIsland{
    private static int n;
    private static int m;
    public static int c(char[][] grid){
        char[][] g=grid;
        
         m=grid.length;
         n=grid[0].length;
        int[][] visited=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char p=g[i][j];
                if( p =='1' && visited[i][j]!=1){
    
                  m(i,j,g,visited);
                   ++count;
                }
            }
        }
        return count;
    }
    // public static char[][] m(int i,int j,char[][] g,int[][] visited){
        
       
    //     if(g[i][j]=='1' && visited[i][j]!=1){
    //         g[i][j]=0;
    //         if(i+1<g.length){
    //             g=m(i+1,j,g,visited);
    //         }
    //         if(j+1<g[0].length){
    //             g=m(i,j+1,g,visited);
    //         }
    //         if(i-1>=0){
    //              g=m(i-1,j,g,visited);
    //         }
    //         if(j-1>=0){
    //              g=m(i,j-1,g,visited);
    //         }
    //     }
    //     visited[i][j]=1;
    //     return g;

    // }

     public static void m(int i,int j,char[][] g,int[][] visited){
        if(i<0||j<0||i>=g.length||j>=g[0].length||g[i][j]!='1'||visited[i][j]==1) return ;
        
            g[i][j]=0;
            m(i+1,j,g,visited);
            m(i,j+1,g,visited);
            m(i-1,j,g,visited);
            
            m(i,j-1,g,visited);
        
        visited[i][j]=1;
        

    }
    public static void main(String[] args) {
        // char[][] o={
        //     {'1','1','1','1','0'},
        //     {'1','1','0','1','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','0','0','0'}
        // };
        // char[][] o={
        //     {'1','1','0','0','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','1','0','0'},
        //     {'0','0','0','1','1'}
        // };
        char[][] o={{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        
        System.out.println(c(o));
    }
}

