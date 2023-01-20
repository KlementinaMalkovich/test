public class Main {
    public static void main(String[] args) {
        String color = "green";
        result(color);
    }


    public static void result (String color){
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
            default:
                System.out.println("Wrong color");
        }
    }
}