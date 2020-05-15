package p000;

/* renamed from: bypg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bypg f167334g;

    /* renamed from: h */
    private static volatile bxxk f167335h;

    /* renamed from: a */
    public int f167336a;

    /* renamed from: b */
    public ByteString f167337b = ByteString.f164797b;

    /* renamed from: c */
    public long f167338c;

    /* renamed from: d */
    public bynz f167339d;

    /* renamed from: e */
    public int f167340e = 40;

    /* renamed from: f */
    public int f167341f;

    static {
        bypg bypg = new bypg();
        f167334g = bypg;
        GeneratedMessageLite.m124024a(bypg.class, bypg);
    }

    private bypg() {
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
            return GeneratedMessageLite.m124022a(f167334g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0002\u0003ဉ\u0003\u0005ဌ\u0005\u0006ဌ\u0006", new Object[]{"a", "b", "c", "d", "e", bypf.m125056b(), "f", byox.m125046b()});
        } else if (i2 == 3) {
            return new bypg();
        } else {
            if (i2 == 4) {
                return new bxvd(f167334g);
            }
            if (i2 == 5) {
                return f167334g;
            }
            bxxk bxxk = f167335h;
            if (bxxk == null) {
                synchronized (bypg.class) {
                    bxxk = f167335h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167334g);
                        f167335h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
