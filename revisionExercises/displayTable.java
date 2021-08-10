import java.text.MessageFormat;

public class displayTable {
    public static void main(String[] arguments) {
        String tableTop = "a\ta*2\ta*3";
        System.out.println(tableTop);
        int startNum = 1;

        while(startNum<5){
            int a = startNum;
            int at2 = startNum*2;
            int at3 = startNum*3;
            System.out.println(MessageFormat.format("{0}\t{1}\t{2}", a,at2,at3));
            startNum++;

        }
    }
}
