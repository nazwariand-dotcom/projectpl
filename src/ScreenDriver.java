public class ScreenDriver {
    public static void main(String[] args) {
        Screen screen = new Screen("600x400", 40, 22);

        System.out.println("Resolution    : " + screen.getResolution());
        System.out.println("Refresh Rate  : " + screen.getRefreshRate());
        System.out.println("Response Time : " + screen.getResponseTime());
        System.out.println(screen);
        
        
    }
}
