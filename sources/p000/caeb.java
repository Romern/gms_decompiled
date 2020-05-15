package p000;

/* renamed from: caeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caeb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final caeb f172791g;

    /* renamed from: h */
    private static volatile bxxk f172792h;

    /* renamed from: a */
    public int f172793a;

    /* renamed from: b */
    public boolean f172794b;

    /* renamed from: c */
    public int f172795c;

    /* renamed from: d */
    public String f172796d = "";

    /* renamed from: e */
    public bxwc f172797e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f172798f = bxxn.f165040b;

    static {
        caeb caeb = new caeb();
        f172791g = caeb;
        GeneratedMessageLite.m124024a(caeb.class, caeb);
    }

    private caeb() {
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
            return GeneratedMessageLite.m124022a(f172791g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", caed.class, "f", caed.class});
        } else if (i2 == 3) {
            return new caeb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f172791g;
            }
            bxxk bxxk = f172792h;
            if (bxxk == null) {
                synchronized (caeb.class) {
                    bxxk = f172792h;
                    if (bxxk == null) {
                        bxxk = new bxve(f172791g);
                        f172792h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
