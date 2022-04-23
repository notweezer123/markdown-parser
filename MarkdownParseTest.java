import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test 
    public void getLinksCheck() throws IOException{
        
        String fileName = "test-file.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
       ArrayList<String> a=new ArrayList<String>();
       a.add("https://something.com");
       a.add("some-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }
}