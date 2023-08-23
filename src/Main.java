public class Main {
    public static void main(String[] args) {
       int result = 7;
       int b = 2000;
       int c = 7777;
       if (b>result)
           result = b;
       if (c>result)
           result=c;
       System.out.println(result);
       //program seems to solve for the largest value: whether it is the original result, b or c.
        //It is successful at doing this because if b is greater than result, b becomes the result
        //and if c is greater than the result or b, than c becomes the new result. Finally the biggest is printed.
    }
}