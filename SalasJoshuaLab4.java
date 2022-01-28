public class SalasJoshuaLab4 {
    public static void main(String[] args) {

        int n_f = 2, n_a=4, n_b=8;

        //f_linear(n_f);
        f_logN(n_a);
        // write methods for each tasks
        // method name starts with the alphabet according to lab Qutesions

    }
    //omega(n)
    public static void f_linear(int n){
        //System.out.println("inside f_linear " +n);
        int i = 0;
        // Using for loop (control flow stractrure for repeating the print statment for n times)
        for(i=0; i<n; i++){
            System.out.println("*");
        }

    }

    public static int f_logN(int n){
        if (n>0){
            System.out.println("*");
            return f_logN(n/2);
        }
        return (int) Math.log((double) n);
    }
}
