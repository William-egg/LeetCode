class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] hang = new HashSet[9];
        HashSet<Character>[] lie = new HashSet[9];
        HashSet<Character>[] boxed = new HashSet[9];
        for(int i = 0;i<9;i++){
            hang[i] = new HashSet<>();
            lie[i] = new HashSet<>();
            boxed[i] = new HashSet<>();
        }
        for(int i = 0;i<9;i++)
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.') continue;
                char value = board[i][j];
                if(hang[i].contains(value)||lie[j].contains(value)||boxed[(i/3)*3+j/3].contains(value)) return false;
                hang[i].add(value);
                lie[j].add(value);
                boxed[(i/3)*3+j/3].add(value);
            }
        return true;
    }
}