public class ShortestPath {
    private int[][] grid;
    private int rows;
    private int cols;

    public ShortestPath(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
    }

    public int[] findPath() {
        String finall = "";
        int totalSum = 0;

        for (int j = 0; j < cols; j++) {
            int shortest = grid[0][j]; 
            for (int i = 1; i < rows; i++) {
                if (grid[i][j] < shortest) {
                    shortest = grid[i][j]; 
                }
            }
            totalSum += shortest; 
            finall += shortest + ", "; 
        }
        System.out.println("Grid dimensions: " + rows + "x" + cols);
        System.out.println("Lowest number in each column: " + finall);
        return new int[]{totalSum};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {7, 0, 1, 5, 7},
            {2, 2, 4, 6, 2},
            {5, 0, 4, 6, 8},
            {6, 1, 0, 6, 3}
        };

        ShortestPath shortestPath = new ShortestPath(grid);
        int[] result = shortestPath.findPath();
        int totalSum = result[0];
        System.out.println("Total sum of numbers traveled: " + totalSum);
    }
}
