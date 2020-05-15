package p000;

/* renamed from: byjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byjn f166675c;

    /* renamed from: d */
    private static volatile bxxk f166676d;

    /* renamed from: a */
    public int f166677a = 0;

    /* renamed from: b */
    public Object f166678b;

    static {
        byjn byjn = new byjn();
        f166675c = byjn;
        bxvk.m124024a(byjn.class, byjn);
    }

    private byjn() {
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
            return bxvk.m124022a(f166675c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", byif.class, byjq.class, byjo.class});
        } else if (i2 == 3) {
            return new byjn();
        } else {
            if (i2 == 4) {
                return new bxvd(f166675c);
            }
            if (i2 == 5) {
                return f166675c;
            }
            bxxk bxxk = f166676d;
            if (bxxk == null) {
                synchronized (byjn.class) {
                    bxxk = f166676d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166675c);
                        f166676d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
