package p000;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: biyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biyq {

    /* renamed from: a */
    protected final Context f122339a;

    public biyq(Context context) {
        this.f122339a = context;
    }

    /* renamed from: a */
    private final biyp m103008a(XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new biyp(this.f122339a, asAttributeSet);
                    }
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": not a FooterButton"));
                } else if (next == 1) {
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": No start tag found!"));
                }
            } catch (XmlPullParserException e) {
                throw new InflateException(e.getMessage(), e);
            } catch (IOException e2) {
                String positionDescription = xmlPullParser.getPositionDescription();
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 2 + String.valueOf(message).length());
                sb.append(positionDescription);
                sb.append(": ");
                sb.append(message);
                throw new InflateException(sb.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public final biyp mo64890a(int i) {
        XmlResourceParser xml = this.f122339a.getResources().getXml(i);
        try {
            return m103008a(xml);
        } finally {
            xml.close();
        }
    }
}
