public class Array3 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] arra={
            {10,11,12},{13,14,15},{16,17,18}
        };
        try{
            System.out.println(arr*arra);
        }
        catch (Except err){
            System.out.println("You can't multiply arrays.");
        }
        finally{
            System.out.println("Stuff.");
        }
    }
}
