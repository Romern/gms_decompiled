package p000;

/* renamed from: ghc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ghc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ghc f18218c;

    /* renamed from: d */
    private static volatile bxxk f18219d;

    /* renamed from: a */
    public int f18220a;

    /* renamed from: b */
    public int f18221b;

    static {
        ghc ghc = new ghc();
        f18218c = ghc;
        GeneratedMessageLite.m124024a(ghc.class, ghc);
    }

    private ghc() {
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
            return GeneratedMessageLite.m124022a(f18218c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ghb.f18217a});
        } else if (i2 == 3) {
            return new ghc();
        } else {
            if (i2 == 4) {
                return new bxvd(f18218c);
            }
            if (i2 == 5) {
                return f18218c;
            }
            bxxk bxxk = f18219d;
            if (bxxk == null) {
                synchronized (ghc.class) {
                    bxxk = f18219d;
                    if (bxxk == null) {
                        bxxk = new bxve(f18218c);
                        f18219d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
