package p000;

/* renamed from: bmkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkd extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bmkd f129781l;

    /* renamed from: n */
    private static volatile bxxk f129782n;

    /* renamed from: a */
    public int f129783a;

    /* renamed from: b */
    public String f129784b = "";

    /* renamed from: c */
    public int f129785c = -1;

    /* renamed from: d */
    public String f129786d = "";

    /* renamed from: e */
    public String f129787e = "";

    /* renamed from: f */
    public String f129788f = "";

    /* renamed from: g */
    public bxwc f129789g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f129790h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f129791i = bxxn.f165040b;

    /* renamed from: j */
    public String f129792j = "";

    /* renamed from: k */
    public boolean f129793k;

    /* renamed from: m */
    private int f129794m;

    static {
        bmkd bmkd = new bmkd();
        f129781l = bmkd;
        GeneratedMessageLite.m124024a(bmkd.class, bmkd);
    }

    private bmkd() {
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
            return GeneratedMessageLite.m124022a(f129781l, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0003\u0000\u0001ဈ\u0001\u0002င\u0002\u0003ဈ\u0004\u0004ဈ\u0005\u0005\u001a\u0006ဌ\u0000\u0007\u001b\b\u001a\tဈ\u0006\nဇ\u0007\u000bဈ\u0003", new Object[]{"m", "b", "c", "e", "f", "g", "a", bmkb.f129780a, "h", bmka.class, "i", "j", "k", "d"});
        } else if (i2 == 3) {
            return new bmkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f129781l);
            }
            if (i2 == 5) {
                return f129781l;
            }
            bxxk bxxk = f129782n;
            if (bxxk == null) {
                synchronized (bmkd.class) {
                    bxxk = f129782n;
                    if (bxxk == null) {
                        bxxk = new bxve(f129781l);
                        f129782n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
