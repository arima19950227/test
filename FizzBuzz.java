class Main {
  public static void main(String[] args){
   int[] numbers={1,4,6,9,13,16};
   int oddSum=0;
   int evenSum=0;
   
   for(int i:numbers){
     if(i%2==0){
       oddSum += i;
     }else{
       evenSum += i;
     }
   }
   System.out.println("偶数の和は" + oddSum + "です");
   System.out.println("奇数の和は"+ evenSum + "です");
  }
}