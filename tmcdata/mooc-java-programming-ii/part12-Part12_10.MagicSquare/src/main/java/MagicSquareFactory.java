
public class MagicSquareFactory {
    private MagicSquare square;
    int posX;
    int posY;
    int freePositions;

    public void initializeSquare(int size) {
        this.square = new MagicSquare(size);
        this.freePositions = size * size;
        this.posX = 0;
        this.posY = size / 2;
    }

    public MagicSquare createMagicSquare(int size) {
        this.initializeSquare(size);
        int number = 1;

        while (this.freePositions-- > 0) {
            square.placeValue(this.posY, this.posX, number++);
            validatePosition();
        }
        return this.square;
    }

    private void validatePosition() {
        int posXActual = this.posX;
        int posYActual = this.posY;

        this.posX += this.square.getHeight() - 1;
        this.posY++;

        if (this.posX >= this.square.getHeight()) {
            this.posX -= this.square.getHeight();
        }

        if (this.posY >= this.square.getHeight()) {
            this.posY = 0;
        }

        if (this.square.readValue(posY, posX) > 0) {
            this.posX = ++posXActual;
            this.posY = posYActual;
        }
    }
}
