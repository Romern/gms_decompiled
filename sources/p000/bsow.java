package p000;

/* renamed from: bsow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsow extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bsow f146438g;

    /* renamed from: h */
    private static volatile bxxk f146439h;

    /* renamed from: a */
    public int f146440a;

    /* renamed from: b */
    public String f146441b = "";

    /* renamed from: c */
    public String f146442c = "";

    /* renamed from: d */
    public String f146443d = "";

    /* renamed from: e */
    public int f146444e;

    /* renamed from: f */
    public String f146445f = "";

    static {
        bsow bsow = new bsow();
        f146438g = bsow;
        GeneratedMessageLite.m124024a(bsow.class, bsow);
    }

    private bsow() {
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
            return GeneratedMessageLite.m124022a(f146438g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsow();
        } else {
            if (i2 == 4) {
                return new bxvd(f146438g);
            }
            if (i2 == 5) {
                return f146438g;
            }
            bxxk bxxk = f146439h;
            if (bxxk == null) {
                synchronized (bsow.class) {
                    bxxk = f146439h;
                    if (bxxk == null) {
                        bxxk = new bxve(f146438g);
                        f146439h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
