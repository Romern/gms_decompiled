package p000;

/* renamed from: bykf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bykf f166742c;

    /* renamed from: e */
    private static volatile bxxk f166743e;

    /* renamed from: a */
    public bykz f166744a;

    /* renamed from: b */
    public bykg f166745b;

    /* renamed from: d */
    private int f166746d;

    static {
        bykf bykf = new bykf();
        f166742c = bykf;
        bxvk.m124024a(bykf.class, bykf);
    }

    private bykf() {
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
            return bxvk.m124022a(f166742c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bykf();
        } else {
            if (i2 == 4) {
                return new bxvd(f166742c);
            }
            if (i2 == 5) {
                return f166742c;
            }
            bxxk bxxk = f166743e;
            if (bxxk == null) {
                synchronized (bykf.class) {
                    bxxk = f166743e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166742c);
                        f166743e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
