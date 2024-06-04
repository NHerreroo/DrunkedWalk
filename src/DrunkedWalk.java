import static java.lang.Math.random;
import static java.lang.Math.round;

public class DrunkedWalk {
    public void lvlGenerator(int levelSize, int walkSize) {
        char[][] lvl = new char[levelSize][levelSize];
        char walker = ' ';
        char floor = '#';

        for (int i = 0; i < levelSize; i++) {
            for (int j = 0; j < levelSize; j++) {
                lvl[i][j] = '#';
            }
        }

        int walkerPositionX = levelSize / 2;
        int walkerPositionY = levelSize / 2;

        lvl[walkerPositionX][walkerPositionY] = walker;

        for (int i = 0; i < walkSize; i++) {
            int direction = direct();

            switch (direction) {
                case 0:
                    if (walkerPositionX > 0) {
                        walkerPositionX--;
                    }
                    break;
                case 1:
                    if (walkerPositionX < levelSize - 1) {
                        walkerPositionX++;
                    }
                    break;
                case 2:
                    if (walkerPositionY > 0) {
                        walkerPositionY--;
                    }
                    break;
                case 3:
                    if (walkerPositionY < levelSize - 1) {
                        walkerPositionY++;
                    }
                    break;
            }

            lvl[walkerPositionX][walkerPositionY] = walker;
        }
        printLevel(lvl, levelSize);
    }

    public int direct() {
        int dir = (int) (random() * 4);
        return dir;
    }

    public void printLevel(char[][] lvl, int levelSize) {
        for (int i = 0; i < levelSize; i++) {
            for (int j = 0; j < levelSize; j++) {
                System.out.print(lvl[i][j]);
            }
            System.out.println();
        }
    }
}