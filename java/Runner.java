package iweb2.ch2;
import iweb2.ch2.webcrawler.BasicWebCrawler;
import iweb2.ch2.webcrawler.CrawlData;

/**
 * Created with IntelliJ IDEA.
 * User: gennad
 * Date: 22/05/14
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {
        CrawlData crawlData = new CrawlData("/Users/gennad/Downloads/iWeb2/data");
        BasicWebCrawler basicWebCrawler = new BasicWebCrawler(crawlData);
        basicWebCrawler.fetchAndProcess(2, 2);
    }
}
