class Array {
   public static void main(String[] args){
     int[] arr = new int[3];

     arr[0] = 1;
     arr[1] = 2;
     arr[2] = 3;

     System.out.println(arr); // output: [I@15db9742
     System.out.println(arr[0]); // output: 1
     System.out.println(arr[1]); // output: 2
     System.out.println(arr[2]); // output: 3

     for (int i = 0; i < arr.length; i++) {
       System.out.println(arr[i]);
     }
     // output:
     // 1
     // 2
     // 3

     // another way to create an array
     int[] arr2 = {1,2,3,4,5,6,7,8,9};
     for (int i = 0; i < arr2.length; i++) {
       System.out.println(arr2[i]);
     }
     
   } 
}