import java.util.Random;
public class TheMaze{
    public static void main(String[] args) {
       int row = 10;
       int column = 13; 
       char[][] maze =  createMaze(10, 13);
       maze[1][1] = '*';
       maze = solveMaze(maze, 1, 1);
       printMaze(maze, row, column);
    }


    public static char[][] createMaze(int row, int column){
        char maze[][] = new char[row][column];
        int mazeBlocks = 30;
        Random rd = new Random();
        for(int j=0;j<column;j++){
            maze[0][j] = 5;
            maze[9][j] = 5;
        }
        for(int i=0;i<row;i++){
            maze[i][0] = 5;
            maze[i][12] = 5;
        }

        while(mazeBlocks>0){
            int i = rd.nextInt(9) + 1;
            int j = rd.nextInt(12) + 1;
            if(i==1 && j==1){
                continue;
            }
            maze[i][j] = 5;
            mazeBlocks--;
        }
        maze[0][1] = 'S';
        maze[8][11] = 'E';
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
        return maze;
    }


    public static char[][] solveMaze(char[][] maze, int row, int column){
        int right = maze[row][column+1];
        int left = maze[row][column-1];
        int up = maze[row-1][column];
        int down = maze[row+1][column];

        if(right=='E' || left=='E' || up=='E' || down=='E'){
            return maze;
        }
        else if(down == '\0'){
            maze[row+1][column] = '*';
            solveMaze(maze, row+1, column);
        }
        else if(right == '\0'){
            maze[row][column+1] = '*';
            solveMaze(maze, row, column+1);
        }
        else if(left == '\0'){
            maze[row][column-1] = '*';
            solveMaze(maze, row, column-1);
        }
        else if(up == '\0'){
            maze[row-1][column] = '*';
            solveMaze(maze, row-1, column);
        }
        return maze;
    }

    
    public static void printMaze(char[][] maze, int row, int column){
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}