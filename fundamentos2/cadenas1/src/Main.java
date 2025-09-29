public class Main {
    public static void main(String[] args) {
        System.out.println(domain("https://www.java.com/en/"));
        System.out.println(domain("https://jcp.org"));
    }

    private static String domain(String url) {
        String sinProtocolo = url.substring("https://".length());
        int barra = sinProtocolo.indexOf("/");
        if (barra == -1) return sinProtocolo;
        return sinProtocolo.substring(0, barra);
    }
}
