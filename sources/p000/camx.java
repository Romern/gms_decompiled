package p000;

import android.util.Xml;
import java.io.OutputStream;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: camx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class camx {

    /* renamed from: a */
    public final cams f175328a;

    public camx(cams cams) {
        this.f175328a = cams;
    }

    /* renamed from: a */
    public final void mo74679a(OutputStream outputStream) {
        try {
            asib asib = new asib(Xml.newSerializer());
            asib.setOutput(outputStream, "UTF-8");
            asib.startDocument("UTF-8", Boolean.FALSE);
            asib.setPrefix("", "http://www.w3.org/2005/Atom");
            asib.setPrefix("gd", "http://schemas.google.com/g/2005");
            mo74680a(asib);
            asib.startTag("http://www.w3.org/2005/Atom", "entry");
            String str = this.f175328a.f175313b;
            if (!camt.m126794a(str)) {
                asib.startTag(null, "title");
                asib.text(str);
                asib.endTag(null, "title");
            }
            String str2 = this.f175328a.f175316e;
            if (!camt.m126794a(str2)) {
                asib.startTag(null, "summary");
                asib.text(str2);
                asib.endTag(null, "summary");
            }
            String str3 = this.f175328a.f175317f;
            if (str3 != null) {
                asib.startTag(null, "content");
                asib.attribute(null, "type", "text");
                asib.text(str3);
                asib.endTag(null, "content");
            }
            cams cams = this.f175328a;
            String str4 = cams.f175318g;
            String str5 = cams.f175319h;
            if (!camt.m126794a(str4) && !camt.m126794a(str5)) {
                asib.startTag(null, "author");
                asib.startTag(null, "name");
                asib.text(str4);
                asib.endTag(null, "name");
                asib.startTag(null, "email");
                asib.text(str5);
                asib.endTag(null, "email");
                asib.endTag(null, "author");
            }
            cams cams2 = this.f175328a;
            String str6 = cams2.f175320i;
            String str7 = cams2.f175321j;
            if (!camt.m126794a(str6) || !camt.m126794a(str7)) {
                asib.startTag(null, "category");
                if (!camt.m126794a(str6)) {
                    asib.attribute(null, "term", str6);
                }
                if (!camt.m126794a(str7)) {
                    asib.attribute(null, "scheme", str7);
                }
                asib.endTag(null, "category");
            }
            mo74681b(asib);
            asib.endTag("http://www.w3.org/2005/Atom", "entry");
            asib.endDocument();
            asib.flush();
        } catch (XmlPullParserException e) {
            throw new camv("Unable to create XmlSerializer.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo74680a(XmlSerializer xmlSerializer) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo74681b(XmlSerializer xmlSerializer) {
    }
}
