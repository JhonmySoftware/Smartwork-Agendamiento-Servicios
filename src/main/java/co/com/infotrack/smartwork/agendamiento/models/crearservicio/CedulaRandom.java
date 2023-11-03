package co.com.infotrack.smartwork.agendamiento.models.crearservicio;

public class CedulaRandom {

    private static int min_num;
    private static int max_num;
    private static String num_rand;

    public static int getMin_num() {
        return min_num;
    }

    public static void setMin_num(int min_num) {
        CedulaRandom.min_num = min_num;
    }

    public static int getMax_num() {
        return max_num;
    }

    public static void setMax_num(int max_num) {
        CedulaRandom.max_num = max_num;
    }

    public static String getNum_rand() {
        return num_rand;
    }

    public static void setNum_rand(int num_rand) {
        CedulaRandom.num_rand = String.valueOf(num_rand);
    }

    public static String numaleatorio() {
        setMin_num(1);
        setMax_num(999999999);
        setNum_rand((int) (Math.random() * (getMax_num() - getMin_num())));
        System.out.println("El numero random generado es: " + getNum_rand());

        return getNum_rand();

    }
}
