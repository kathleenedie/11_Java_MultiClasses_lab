public class Calculator {

    private int num1;
    private int num2;
    private double num3;
    private double num4;

    public Calculator(int num1, int num2, double num3, double num4){

        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public double getNum3() {
        return num3;
    }

    public double getNum4() {
        return num4;
    }

    public int add(){
        return(this.num1 + this.num2);
    }

    public int subtract(){
        return(this.num1 - this.num2);
    }

    public int multiply(){
        return(this.num1 * this.num2);
    }

    public double divide(){
        return(this.num3 / this.num4);
    }
}
