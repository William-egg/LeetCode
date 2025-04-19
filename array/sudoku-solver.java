class Solution {
    HashSet<Character>[] hang = new HashSet[9];
    HashSet<Character>[] lie = new HashSet[9];
    HashSet<Character>[] boxed = new HashSet[9];
    Boolean[][] visited = new boolean[9][9];
    public boolean check(char[][] board,int x,int y){
        if(hang[i].contains(value)||lie[j].contains(value)||boxed[(i/3)*3+j/3].contains(value)) return false;
        return true;
    }
    public void addInSet(int x,int y,char value){
        hang[i].add(value);
        lie[j].add(value);
        boxed[(i/3)*3+j/3].add(value);
    }
    public void RemoveFromSet(int x,int y,char value){
        hang[i].remove(value);
        lie[j].remove(value);
        boxed[(i/3)*3+j/3].remove(value);
    }
    public void dfs(char[][] board,int x,int y){
        if(visited[i][j]){
            dfs(board,y==8?x+1:x,y==8?0:j+1);
        }else{
            for(int i = 1;i<=9;i++){
                if(check(board,x,))
            }
        }
        
    }
    public void solveSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            hang[i] = new HashSet<>();
            lie[i] = new HashSet<>();
            boxed[i] = new HashSet<>();
        }
        for(int i = 0;i<9;i++)
            for(int j = 0;j < 9;j++){
                if(board[i][j] == '.') continue;
                visited[i][j] = true;
                hang[i].add(board[i][j]);
                lie[j].add(board[i][j]);
                boxed[(i/3)*3+j/3].add(board[i][j]);
            }
        dfs(board,0,0);
    }
}