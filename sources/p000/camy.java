package p000;

/* renamed from: camy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camy {

    /* renamed from: a */
    public String f175329a;

    /* renamed from: b */
    public String f175330b;

    /* renamed from: c */
    public String f175331c;

    public camy() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FeedUrl");
        stringBuffer.append(" url:");
        stringBuffer.append(this.f175329a);
        stringBuffer.append(" service:");
        stringBuffer.append(this.f175330b);
        stringBuffer.append(" authToken:");
        stringBuffer.append(this.f175331c);
        return stringBuffer.toString();
    }

    public camy(String str, String str2, String str3) {
        this.f175329a = str;
        this.f175330b = str2;
        this.f175331c = str3;
    }
}
