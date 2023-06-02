import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}); //создаём одну матрицу и заполняем элементами
        Matrix matrix2 = new Matrix(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}); //создаём другую матрицу и тоже заполняем
        System.out.println(Arrays.toString(matrix1.addConst(matrix2).matrix)); //добавляем к matrix1 matrix2 и выводим новую матрицу
        System.out.println(Arrays.toString(matrix1.matrix)); //проверка, что addConst не поменял текущую матрицу
        matrix1.add(matrix2); //добавляем к matrix1 matrix2 через метод add()
        System.out.println(Arrays.toString(matrix1.matrix)); //проверка - add() поменял текущую матрицу
    }
}
