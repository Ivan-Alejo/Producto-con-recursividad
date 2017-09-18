public class producto
{
    public static void main(String[] args) {
        producto x = new producto();
        System.out.println("El Resultado es " + x.multi(4,2));

    }

    public int multi(int a, int b){
        if(b==0) {

            return 0;
        }
        else

        return a+multi(a,b-1);
        }

}
