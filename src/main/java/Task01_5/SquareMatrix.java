package Task01_5;

public class SquareMatrix {
    int[][] elements;

    SquareMatrix(int dim){
        elements = new int[dim][dim];
    }

    public void makeWeirdUnitMatrix(){
        for(int row = 0; row < elements.length; row++){
            for(int column = 0; column < elements[row].length; column++){
                if(row == column || row == elements.length - 1 - column)
                    elements[row][column] = 1;
                else elements[row][column] = 0;
            }
        }
    }


    public static void main(String[] args){
        SquareMatrix matrix = new SquareMatrix(5);

        matrix.makeWeirdUnitMatrix();

        for(int row = 0; row < matrix.elements.length; row++){
            for(int column = 0; column < matrix.elements[row].length; column++){
                System.out.print(matrix.elements[row][column]);
                if (column == matrix.elements.length - 1)
                    System.out.print("\n");
            }
        }
    }

}
