public class Tile {
    //change interface to be more useful
    interface allTiles {
        public void printTile();
    }
    private int bTileNum;
    class Bamboo implements allTiles {
        public Bamboo(int num) {
            bTileNum = num;
        }
        public void printTile() {
            System.out.println("Bamboo of " + bTileNum);
        }
    }
    private int cTileNum;
    class Circle implements allTiles {
        public Circle(int num) {
            cTileNum = num;
        }
        public void printTile() {
            System.out.println("Circle of " + cTileNum);
        }
    }
    private int rTileNum;
    class Red implements allTiles {
        public Red(int num) {
            rTileNum = num;
        }
        public void printTile() {
            System.out.println("Red of " + rTileNum);
        }
    }

}
