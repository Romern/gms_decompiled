package p000;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Deprecated
/* renamed from: bmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bmk {

    /* renamed from: b */
    protected final Resources f5166b;

    protected bmk(Resources resources) {
        this.f5166b = resources;
    }

    /* renamed from: a */
    private final void m3349a(XmlPullParser xmlPullParser, Object obj, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                Object b = m3350b(xmlPullParser.getName(), attributeSet);
                mo3278a(obj, b);
                m3349a(xmlPullParser, b, attributeSet);
            }
        }
    }

    /* renamed from: b */
    private final Object m3350b(String str, AttributeSet attributeSet) {
        try {
            return mo3277a(str, attributeSet);
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
    public abstract Object mo3277a(String str, AttributeSet attributeSet);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3278a(Object obj, Object obj2);

    /* renamed from: a */
    public final Object mo3279a(int i) {
        XmlResourceParser xml = this.f5166b.getXml(i);
        try {
            return mo3280a(xml);
        } finally {
            xml.close();
        }
    }

    /* renamed from: a */
    public final Object mo3280a(XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    Object b = m3350b(xmlPullParser.getName(), asAttributeSet);
                    m3349a(xmlPullParser, b, asAttributeSet);
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
