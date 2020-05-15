package p000;

import android.text.Spanned;
import org.ccil.cowan.tagsoup.Parser;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/* renamed from: avhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avhd {
    /* renamed from: a */
    public static Spanned m78503a(String str, avin avin) {
        Parser parser = new Parser();
        try {
            parser.setProperty("http://www.ccil.org/~cowan/tagsoup/properties/schema", avhc.f93175a);
            return new avhj(str, parser, avin).mo51220a();
        } catch (SAXNotRecognizedException e) {
            throw new RuntimeException(e);
        } catch (SAXNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
