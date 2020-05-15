package p000;

/* renamed from: blxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blxe f128043c;

    /* renamed from: d */
    private static volatile bxxk f128044d;

    /* renamed from: a */
    public int f128045a;

    /* renamed from: b */
    public long f128046b;

    static {
        blxe blxe = new blxe();
        f128043c = blxe;
        GeneratedMessageLite.m124024a(blxe.class, blxe);
    }

    private blxe() {
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
            return GeneratedMessageLite.m124022a(f128043c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f128043c);
            }
            if (i2 == 5) {
                return f128043c;
            }
            bxxk bxxk = f128044d;
            if (bxxk == null) {
                synchronized (blxe.class) {
                    bxxk = f128044d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128043c);
                        f128044d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
