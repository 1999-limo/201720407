package test2;
// 
public class AdditionOperation extends BinaryOperation_3_1 {
	public AdditionOperation() {	
		generateBinaryOperation();		
	}
	public boolean checkingCalculation(int anInteger){
		return anInteger <= UPPER;
	}
	int calculate(int left, int right){
		return left+right;
	}
}