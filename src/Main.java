import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] map = {
                {"*", "0", "0", "*"},
                {"*", "*", "0", "*"},
                {"0", "0", "*", "*"},
                {"0", "0", "0", "0"}
        };
        int[][] mapReport = new int[map.length][map[0].length];
        for (int xPos = 0; xPos < map.length; xPos ++) {
            for (int yPos = 0; yPos <map[0].length; yPos ++) {
                String value = map[xPos][yPos];
                if (value.equals("*")) {
                    if (yPos + 1 < map[0].length) {
                        mapReport[xPos][yPos+1]++;
                        if (xPos > 0) mapReport[xPos-1][yPos+1]++;
                        if (xPos + 1 < map.length) mapReport[xPos+1][yPos+1]++;
                    }
                    if (yPos > 0) {
                        mapReport[xPos][yPos-1]++;
                        if (xPos > 0) mapReport[xPos-1][yPos-1]++;
                        if (xPos + 1 < map.length) mapReport[xPos+1][yPos-1]++;
                    }
                    if (xPos + 1 < map.length) mapReport[xPos+1][yPos]++;
                    if (xPos > 0) mapReport[xPos-1][yPos]++;
                }
            }
        }
        System.out.println("The matrix of mine report: " );
        for (int[] row : mapReport) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
