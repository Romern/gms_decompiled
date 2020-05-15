package p000;

/* renamed from: bisz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bisz f121616e;

    /* renamed from: g */
    private static volatile bxxk f121617g;

    /* renamed from: a */
    public int f121618a;

    /* renamed from: b */
    public int f121619b;

    /* renamed from: c */
    public int f121620c;

    /* renamed from: d */
    public int f121621d;

    /* renamed from: f */
    private byte f121622f = 2;

    static {
        bisz bisz = new bisz();
        f121616e = bisz;
        GeneratedMessageLite.m124024a(bisz.class, bisz);
    }

    private bisz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121622f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121622f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121616e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bisz();
        } else {
            if (i2 == 4) {
                return new bxvd(f121616e);
            }
            if (i2 == 5) {
                return f121616e;
            }
            bxxk bxxk = f121617g;
            if (bxxk == null) {
                synchronized (bisz.class) {
                    bxxk = f121617g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121616e);
                        f121617g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
