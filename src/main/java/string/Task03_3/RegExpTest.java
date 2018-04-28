package string.Task03_3;

public class RegExpTest {
    public static final String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";

    public static void main(String[] args){

        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));

    }
}
