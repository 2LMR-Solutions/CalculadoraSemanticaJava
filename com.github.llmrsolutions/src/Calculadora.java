public class Calculadora {

    public double mais(double n1, double n2){
        return n1 + n2;
    }
    public double menos(double n1, double n2){
        return n1 - n2;
    }
    public double divide(double n1, double n2){
        if (n2 == 0.0){
            throw new ArithmeticException("Nao eh possivel dividir por zero!");
        }
        return n1 / n2;
    }
    public double multiplica(double n1, double n2){
        return n1 * n2;
    }
}