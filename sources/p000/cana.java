package p000;

import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: cana */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cana extends camw {
    public cana(InputStream inputStream, XmlPullParser xmlPullParser) {
        super(inputStream, xmlPullParser);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final cams mo74670a() {
        return new camz();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74672b(cams cams) {
        XmlPullParser xmlPullParser = this.f175325a;
        if (cams instanceof camz) {
            camz camz = (camz) cams;
            String name = xmlPullParser.getName();
            if ("feedurl".equals(name)) {
                camy camy = new camy();
                camy.f175329a = xmlPullParser.getAttributeValue(null, "value");
                camy.f175330b = xmlPullParser.getAttributeValue(null, "service");
                camy.f175331c = xmlPullParser.getAttributeValue(null, "authtoken");
                camz.f175332n = camy;
            }
            if ("routingInfo".equals(name)) {
                camz.f175333o = camu.m126796a(xmlPullParser);
            }
            if ("clientToken".equals(name)) {
                camz.f175334p = camu.m126796a(xmlPullParser);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Expected SubscribedFeedsEntry!");
    }
}
