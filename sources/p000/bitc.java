package p000;

/* renamed from: bitc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bitc f121624e;

    /* renamed from: g */
    private static volatile bxxk f121625g;

    /* renamed from: a */
    public int f121626a;

    /* renamed from: b */
    public int f121627b;

    /* renamed from: c */
    public int f121628c = 1;

    /* renamed from: d */
    public bisz f121629d;

    /* renamed from: f */
    private byte f121630f = 2;

    static {
        bitc bitc = new bitc();
        f121624e = bitc;
        bxvk.m124024a(bitc.class, bitc);
    }

    private bitc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121630f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121630f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121624e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔌ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", bita.f121623a, "d"});
        } else if (i2 == 3) {
            return new bitc();
        } else {
            if (i2 == 4) {
                return new bxvd(f121624e);
            }
            if (i2 == 5) {
                return f121624e;
            }
            bxxk bxxk = f121625g;
            if (bxxk == null) {
                synchronized (bitc.class) {
                    bxxk = f121625g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121624e);
                        f121625g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
