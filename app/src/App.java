import java.io.IOException;  
import javax.swing.text.html.parser.Element;
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;

public class App{  
    public static void main( String[] args ) throws IOException{  
                Document doc = Jsoup.connect("https://www.amazon.com/Bluetooth-Belt-Driven-Turntable-Speakers-Headphone/dp/B07N3WYLKZ?crid=1JK35IVQNR3L2&dib=eyJ2IjoiMSJ9.cxFMAS42Ep4jY1NvUOT9XqkNfs1jsT9zd3txfyjncJVUj-W-s6TBlqDWEPkCLLV79wLgvR70MPAj9d3jdTtgUzS5Cbwdj85DtStE5rFNI_IHbTwf6k7xz1J_1qy2-m_6yvwDkYn9g0dgGSG95Q1SFtc_0VsBR929Pga8gXExp4b5rnx8tQpw8b6SbUQqh6D59yCMFjwfUdYg_SsXrTXBkFHf-S6-ARxy22i0mzTrkng.2bR75VTU5IN4wbu7UHsjMsPAk3V6qgNW2fTJ3Yv3Imo&dib_tag=se&keywords=vinyl%2Brecord%2Bplayer%2Bvintage&qid=1733644845&sprefix=vinyl%2Brecord%2Bplayer%2Bvint%2Caps%2C248&sr=8-3&th=1").get();  
                String title = doc.title();  
                System.out.println("title is: " + title);
    }  
}  