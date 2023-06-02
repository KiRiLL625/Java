//Класс матрицы
public class Matrix {
    int[] matrix = new int[9]; //массив, в котором будет наша матрица (она размера 3x3)
    //конструктор, принимающий массив
    public Matrix(int[] matrix){
        this.matrix = matrix;
    }

    //метод к текущей матрице другой матрицы, меняет текущую матрицу
    public int[] add(Matrix otherMatrix){
        for (int i = 0; i < this.matrix.length; i++) {
            this.matrix[i] += otherMatrix.matrix[i];
        }
        return this.matrix;
    }

    //метод к текущей матрице другой матрицы, не меняет текущую матрицу,
    //а создаёт новую
    /*
    По этому образцу (ниже) надо сделать методы subtract (вычитание),
    multiply (умножение) и divide (деление). Также надо сделать методы
    trace (след матрицы - сумма элементов на главной диагонали) и get() -
    получение элемента по индексу
     */
    public Matrix addConst(Matrix otherMatrix){
        int[] otherMatrixMass = new int[9]; //создаём массив новой матрицы
        for (int i = 0; i < otherMatrixMass.length; i++) {
            otherMatrixMass[i] = this.matrix[i] + otherMatrix.matrix[i];
        }
        return new Matrix(otherMatrixMass); //создаём объект новой матрицы
    }
}
