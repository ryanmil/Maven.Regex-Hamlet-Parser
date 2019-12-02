import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacer {
    String text;

    public Replacer(String text) {
        this.text = text;
    }

    public String replace(String old, String replaced) {

        Pattern replace = Pattern.compile("(?i)" + old);
        Matcher matcher = replace.matcher(text);
        text =  matcher.replaceAll(replaced);
        return text;
    }

    public String getText() {
        return text;
    }

}
