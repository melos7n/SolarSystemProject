package common;

public class Main {

    public static void main(String[] arg) {

        solarSystem inception= new solarSystem();

        inception.Sun=1;
        inception.Moon=4;
        inception.Planets=2;

        System.out.println("the basic structure is ready");

        Sun omaro =new Sun();
        omaro.temperature = "12334433kj";
        omaro.name="ferro";
        omaro.radius=1234455;
        omaro.color="pink";

//        developing planet1
        Planet1 superplanet=new Planet1();
        superplanet.color="magenta";
        superplanet.name="hash";
        superplanet.size="545488km";

    }
}
