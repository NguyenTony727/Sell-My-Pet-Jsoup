import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {
    public static void main(String[] args) throws IOException {

        List<Review> reviews = new ArrayList<>();
        String url = "https://www.amazon.com/Orange-Mushroom-Lamp-Dimmable-Mid-Century/dp/B0CP6VVKMH?source=ps-sl-shoppingads-lpcontext&ref_=fplfs&smid=A2REG95GY1M7ED&th=1";

        while (true) {

            Document doc = Jsoup.connect(url).get();
            Elements reviewElements = doc.select(".review");
            if (reviewElements == null || reviewElements.isEmpty()) {
                break;
            }

            for (Element reviewElement : reviewElements) {

                Element titleElement = reviewElement.select(".review-title").first();
                String title = titleElement.text();

                Element textElement = reviewElement.select(".review-text").first();
                String text = textElement.text();

                reviews.add(new Review(title, text));
            }

        }

        for (Review review : reviews) {
            System.out.println(review.getTitle());
            System.out.println(review.getText());
            System.out.println("\n");
        }
    }

    static class Review {

        private final String title;
        private final String text;

        public Review(String title, String text) {
            this.title = title;
            this.text = text;
        }

        public String getTitle() {
            return title;
        }

        public String getText() {
            return text;
        }

    }

}