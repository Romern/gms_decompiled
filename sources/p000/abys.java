package p000;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: abys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abys {

    /* renamed from: a */
    public final XmlPullParser f58753a;

    /* renamed from: b */
    private final int f58754b;

    /* renamed from: c */
    private int f58755c = -1;

    public abys(XmlPullParser xmlPullParser) {
        this.f58753a = xmlPullParser;
        this.f58754b = xmlPullParser.getDepth();
    }

    /* renamed from: a */
    public final boolean mo32458a() {
        int i;
        this.f58755c = this.f58753a.next();
        while (true) {
            if ((this.f58755c == 3 && this.f58753a.getDepth() <= this.f58754b) || (i = this.f58755c) == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f58755c = this.f58753a.next();
        }
    }

    /* renamed from: b */
    public final String mo32459b() {
        return this.f58753a.getName();
    }
}
