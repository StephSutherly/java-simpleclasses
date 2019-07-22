public class Calculator {

    private double numOne;
    private double numTwo;

    public Calculator(double numOne, double numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double addNums() {
       return numOne + numTwo;
    }

    public double subtractNums() {
        return numOne - numTwo;
    }

    public double multiplyNums() {
        return numOne * numTwo;
    }

    public double divideNums() {
        return numOne / numTwo;
    }
}





