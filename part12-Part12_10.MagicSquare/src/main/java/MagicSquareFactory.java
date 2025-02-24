
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        int freePositions = size * size;
        int number = 1;
        int posX = 0;
        int posY = size / 2;
        
        while(freePositions-- > 0){
            if(!isValidPosition(posX, posY, size)){
                posX = size - 2;
                posY --;
            }
            
            if(isFreePosition(posY, posX, square)){
                square.placeValue(posY, posX, number++);
                posX += size - 1;
                posY ++;
            }
        }
        return square;
    }
    
    private boolean isValidPosition(int posX, int posY, int size){
        return posX < size && posY < size;
    }
    
    private boolean isFreePosition(int posX, int posY, MagicSquare ms){
        return ms.readValue(posY, posX) != - 1;
    }
    
    

}
