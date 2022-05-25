import javax.imageio.ImageTranscoder;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double height = 164;
        double IMT = service.calculate(weight, height);
        System.out.println("Индекс массы тела - " + IMT);
    }
}