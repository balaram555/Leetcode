class Solution {
    public double largestTriangleArea(int[][] points) {
      int n = points.length;
        double max = 0.0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double area = Math.abs(
                            (points[i][0] - points[j][0]) * (points[i][1] - points[k][1])
                          - (points[i][1] - points[j][1]) * (points[i][0] - points[k][0])
                    ) * 0.5;

                    if (area > max) {
                        max = area;
                    }
                }
            }
        }
        return max;    
    }
}