package p000;

/* renamed from: bzvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvx extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bzvx f171563i;

    /* renamed from: j */
    private static volatile bxxk f171564j;

    /* renamed from: a */
    public int f171565a;

    /* renamed from: b */
    public String f171566b = "";

    /* renamed from: c */
    public String f171567c = "";

    /* renamed from: d */
    public String f171568d = "";

    /* renamed from: e */
    public int f171569e = 1;

    /* renamed from: f */
    public String f171570f = "";

    /* renamed from: g */
    public long f171571g;

    /* renamed from: h */
    public int f171572h = 1;

    static {
        bzvx bzvx = new bzvx();
        f171563i = bzvx;
        GeneratedMessageLite.m124024a(bzvx.class, bzvx);
    }

    private bzvx() {
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
            return GeneratedMessageLite.m124022a(f171563i, "\u0001\u0007\u0000\u0001\u0006\u0012\u0007\u0000\u0000\u0000\u0006ဈ\u0006\u0007ဈ\u0007\bဌ\t\nဈ\u000b\rဂ\u000e\u0011ဈ\b\u0012ဌ\u0012", new Object[]{"a", "b", "c", "e", bzvw.f171562a, "f", "g", "d", "h", bzvv.f171561a});
        } else if (i2 == 3) {
            return new bzvx();
        } else {
            if (i2 == 4) {
                return new bxvd(f171563i);
            }
            if (i2 == 5) {
                return f171563i;
            }
            bxxk bxxk = f171564j;
            if (bxxk == null) {
                synchronized (bzvx.class) {
                    bxxk = f171564j;
                    if (bxxk == null) {
                        bxxk = new bxve(f171563i);
                        f171564j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
