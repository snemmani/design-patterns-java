package design.patterns.java.snemmani.creational.factory;

public class WebsiteFactoryMain {
    public static void main(String[] args) {
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
    }
}

