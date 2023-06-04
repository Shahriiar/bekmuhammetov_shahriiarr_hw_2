public class Main {
    public static void main(String[] args) {
        System.out.println(character(19 , -29));
        System.out.println(character(20 , -1));
        System.out.println(character(16 , 24));
        System.out.println(character(19 , -20));
        System.out.println(character(23 , 10));
        System.out.println(character(generateRandomAge(), generateRandomAge()));

    }
    //)

    public static String character(int years , int temp ){
        if ((years >= 20 && years <= 45) && (temp >= -20 && temp <= 30)){
            return "Можно идти гулять";
        } else if (years > 10  && years <= 20 && (temp >= 0 && temp <= 28)) {
            return "Можно идти гулять";
        }
        else if(years >= 45 && (temp >= -10 && temp <= 25)){
            return "Можно идти гулять";
        }
        else return "Оставайтесь дома";
    }
    //ДЗ на сообразительность

    public static int generateRandomAge(){
       int ranYears = (int) (Math.random() * 40);

        return ranYears;
    }
}