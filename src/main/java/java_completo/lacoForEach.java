package java_completo;

public class lacoForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i =0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("------------------------------");

        //para cada objeto 'obg' contido em vect, faça.....
        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
