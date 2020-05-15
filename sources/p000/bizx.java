package p000;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: bizx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bizx {

    /* renamed from: b */
    protected final Resources f122403b;

    protected bizx(Resources resources) {
        this.f122403b = resources;
    }

    /* renamed from: a */
    private final void m103080a(XmlPullParser xmlPullParser, Object obj, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                Object b = m103081b(xmlPullParser.getName(), attributeSet);
                mo64928a(obj, b);
                m103080a(xmlPullParser, b, attributeSet);
            }
        }
    }

    /* renamed from: b */
    private final Object m103081b(String str, AttributeSet attributeSet) {
        try {
            return mo64927a(str, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (Exception e2) {
            String positionDescription = attributeSet.getPositionDescription();
            StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 24 + String.valueOf(str).length());
            sb.append(positionDescription);
            sb.append(": Error inflating class ");
            sb.append(str);
            throw new InflateException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo64927a(String str, AttributeSet attributeSet);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64928a(Object obj, Object obj2);

    /* renamed from: a */
    public final Object mo64929a(int i) {
        XmlResourceParser xml = this.f122403b.getXml(i);
        try {
            return mo64930a(xml);
        } finally {
            xml.close();
        }
    }

    /* renamed from: a */
    public final Object mo64930a(XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    Object b = m103081b(xmlPullParser.getName(), asAttributeSet);
                    m103080a(xmlPullParser, b, asAttributeSet);
                    return b;
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
}
