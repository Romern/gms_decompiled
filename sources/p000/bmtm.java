package p000;

/* renamed from: bmtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtm extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bmtm f130866j;

    /* renamed from: k */
    private static volatile bxxk f130867k;

    /* renamed from: a */
    public String f130868a = "";

    /* renamed from: b */
    public String f130869b = "";

    /* renamed from: c */
    public String f130870c = "";

    /* renamed from: d */
    public String f130871d = "";

    /* renamed from: e */
    public String f130872e = "";

    /* renamed from: f */
    public String f130873f = "";

    /* renamed from: g */
    public String f130874g = "";

    /* renamed from: h */
    public String f130875h = "";

    /* renamed from: i */
    public bmtn f130876i;

    static {
        bmtm bmtm = new bmtm();
        f130866j = bmtm;
        GeneratedMessageLite.m124024a(bmtm.class, bmtm);
    }

    private bmtm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f130866j, "\u0000\t\u0000\u0000\u0001\n\t\u0000\u0000\u0000\u0001\b\u0002\b\u0003\b\u0004\b\u0005\b\u0007\b\b\b\t\b\n\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bmtm();
        } else {
            if (i2 == 4) {
                return new bxvd(f130866j);
            }
            if (i2 == 5) {
                return f130866j;
            }
            bxxk bxxk = f130867k;
            if (bxxk == null) {
                synchronized (bmtm.class) {
                    bxxk = f130867k;
                    if (bxxk == null) {
                        bxxk = new bxve(f130866j);
                        f130867k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
