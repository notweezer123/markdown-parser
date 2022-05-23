import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;
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

    @Test
    public void testSnippet1() throws IOException {
        String contents= Files.readString(Path.of("./snippet-1.md"));
        List<String> expect = List.of("google.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException {
        String contents= Files.readString(Path.of("./snippet-2.md"));
        List<String> expect = List.of("a.com", "a.com", "example.com");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException {
        String contents= Files.readString(Path.of("./snippet-3.md"));
        List<String> expect = List.of(
            "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }
    // @Test
    // public void testUniverseWorks() {
    //     assertEquals(1,1);
    // }
}
