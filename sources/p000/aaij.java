package p000;

/* renamed from: aaij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaij extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aaij f28182d;

    /* renamed from: e */
    private static volatile bxxk f28183e;

    /* renamed from: a */
    public int f28184a;

    /* renamed from: b */
    public bxtx f28185b = bxtx.f164797b;

    /* renamed from: c */
    public String f28186c = "";

    static {
        aaij aaij = new aaij();
        f28182d = aaij;
        bxvk.m124024a(aaij.class, aaij);
    }

    private aaij() {
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
            return bxvk.m124022a(f28182d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aaij();
        } else {
            if (i2 == 4) {
                return new bxvd(f28182d);
            }
            if (i2 == 5) {
                return f28182d;
            }
            bxxk bxxk = f28183e;
            if (bxxk == null) {
                synchronized (aaij.class) {
                    bxxk = f28183e;
                    if (bxxk == null) {
                        bxxk = new bxve(f28182d);
                        f28183e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
