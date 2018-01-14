class Solution { //purpose: sum two integers without + or -
    public int getSum(int a, int b) {
        while(b != 0){
            
        
        int carry = a & b;
        a= a ^ b;//carry through the code
        b= carry <<1;
        
        }
        return a;
    }
    
}
