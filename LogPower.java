class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1.0d;
        }
        if(n==1){
            return x;
        }
        if(n == -1){
            return 1/x;
        }
        
        if(n%2 ==0){
            double val = myPow(x ,n/2) ;
            return  val*val;
        }
        else{
            double val = myPow(x ,(n-1)/2) ;
            return  val*val*x;
        }
        
        
    }
}
