package graph

class Islands {

    fun numIslands(grid: Array<CharArray>): Int {
        var islandCount = 0;
        for (i in 0..grid.size) {
            for (j in 0..grid[i].size) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    callBfs(grid, i, j)
                }
            }
        }
        return islandCount
    }

    private fun callBfs(grid: Array<CharArray>, i: Int, j: Int) {
        if (grid[i][j] == '0' || i < 0 || j < 0 || i > grid.size - 1 || j > grid[i].size - 1) {
            return
        }

        grid[i][j] = '0'
        callBfs(grid, i + 1, j)
        callBfs(grid, i - 1, j)
        callBfs(grid, i, j - 1)
        callBfs(grid, i, j + 1)

    }
}