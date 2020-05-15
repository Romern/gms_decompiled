package p000;

/* renamed from: cams */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cams {

    /* renamed from: a */
    public String f175312a = null;

    /* renamed from: b */
    public String f175313b = null;

    /* renamed from: c */
    public String f175314c = null;

    /* renamed from: d */
    public String f175315d = null;

    /* renamed from: e */
    public String f175316e = null;

    /* renamed from: f */
    public String f175317f = null;

    /* renamed from: g */
    public String f175318g = null;

    /* renamed from: h */
    public String f175319h = null;

    /* renamed from: i */
    public String f175320i = null;

    /* renamed from: j */
    public String f175321j = null;

    /* renamed from: k */
    public String f175322k = null;

    /* renamed from: l */
    public String f175323l = null;

    /* renamed from: m */
    public boolean f175324m = false;

    /* renamed from: a */
    protected static final void m126792a(StringBuffer stringBuffer, String str, String str2) {
        if (!camt.m126794a(str2)) {
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(str2);
            stringBuffer.append("\n");
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        mo74668a(stringBuffer);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo74668a(StringBuffer stringBuffer) {
        m126792a(stringBuffer, "ID", this.f175312a);
        m126792a(stringBuffer, "TITLE", this.f175313b);
        m126792a(stringBuffer, "EDIT URI", this.f175314c);
        m126792a(stringBuffer, "HTML URI", this.f175315d);
        m126792a(stringBuffer, "SUMMARY", this.f175316e);
        m126792a(stringBuffer, "CONTENT", this.f175317f);
        m126792a(stringBuffer, "AUTHOR", this.f175318g);
        m126792a(stringBuffer, "CATEGORY", this.f175320i);
        m126792a(stringBuffer, "CATEGORY SCHEME", this.f175321j);
        m126792a(stringBuffer, "PUBLICATION DATE", this.f175322k);
        m126792a(stringBuffer, "UPDATE DATE", this.f175323l);
        m126792a(stringBuffer, "DELETED", String.valueOf(this.f175324m));
    }
}
