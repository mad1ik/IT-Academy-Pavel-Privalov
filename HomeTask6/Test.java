package HomeTask6;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        NBRBLoader nbrbLoader = new NBRBLoader();
        System.out.println("1 Евро = " + (nbrbLoader.load(SiteLoader.Currency.USD)));
        System.out.println("1 Российский рубль = " + (nbrbLoader.load(SiteLoader.Currency.RUS)));
        System.out.println("1 Доллар США = " + (nbrbLoader.load(SiteLoader.Currency.USD)));
    }
}