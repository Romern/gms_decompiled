package p000;

/* renamed from: bxic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxic extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxic f163497g;

    /* renamed from: h */
    private static volatile bxxk f163498h;

    /* renamed from: a */
    public int f163499a;

    /* renamed from: b */
    public int f163500b;

    /* renamed from: c */
    public long f163501c;

    /* renamed from: d */
    public int f163502d;

    /* renamed from: e */
    public bxhy f163503e;

    /* renamed from: f */
    public bxhz f163504f;

    static {
        bxic bxic = new bxic();
        f163497g = bxic;
        GeneratedMessageLite.m124024a(bxic.class, bxic);
    }

    private bxic() {
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
            return GeneratedMessageLite.m124022a(f163497g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", bxib.f163496a, "c", "d", bxcl.m122572b(), "e", "f"});
        } else if (i2 == 3) {
            return new bxic();
        } else {
            if (i2 == 4) {
                return new bxvd(f163497g);
            }
            if (i2 == 5) {
                return f163497g;
            }
            bxxk bxxk = f163498h;
            if (bxxk == null) {
                synchronized (bxic.class) {
                    bxxk = f163498h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163497g);
                        f163498h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
