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
    public void getLinksCheck1() throws IOException{

        String fileName = "test-file.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
        ArrayList<String> a=new ArrayList<String>();
        a.add("https://something.com");
        a.add("some-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }

    @Test 
    public void getLinksCheck2() throws IOException{
        
        String fileName = "nothing.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
       ArrayList<String> a=new ArrayList<String>();
       //a.add("https://something.com");
       //a.add("some-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }

    @Test
    public void getLinksCheck3() throws IOException{
        
        String fileName = "aNewFile.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
       ArrayList<String> a=new ArrayList<String>();
       a.add("https://anything.com");
       a.add("any-thing.html");
       a.add("wrong-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }

    @Test 
    public void getLinksCheck4() throws IOException{
        
        String fileName = "cat.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
       ArrayList<String> a=new ArrayList<String>();
       //a.add("");
       //a.add("some-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }
    @Test 
    public void getLinksCheck5() throws IOException{
        
        String fileName = "test-file9.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
       ArrayList<String> a=new ArrayList<String>();
       //a.add("");
       //a.add("some-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }
    @Test 
    public void getLinksCheck6() throws IOException{
        
        String fileName = "test-file8.md";
        Path fileName1 = Path.of(fileName);
        String content = Files.readString(fileName1);
       ArrayList<String> a=new ArrayList<String>();
       //a.add("");
       //a.add("some-thing.html");
        assertEquals((a), MarkdownParse.getLinks(content) );
    }
    // @Test
    // public void testUniverseWorks() {
    //     assertEquals(1,1);
    // }
}
