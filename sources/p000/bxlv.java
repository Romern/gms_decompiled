package p000;

/* renamed from: bxlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxlv f163898c;

    /* renamed from: e */
    private static volatile bxxk f163899e;

    /* renamed from: a */
    public int f163900a;

    /* renamed from: b */
    public int f163901b;

    /* renamed from: d */
    private int f163902d;

    static {
        bxlv bxlv = new bxlv();
        f163898c = bxlv;
        bxvk.m124024a(bxlv.class, bxlv);
    }

    private bxlv() {
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
            return bxvk.m124022a(f163898c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxlv();
        } else {
            if (i2 == 4) {
                return new bxvd(f163898c);
            }
            if (i2 == 5) {
                return f163898c;
            }
            bxxk bxxk = f163899e;
            if (bxxk == null) {
                synchronized (bxlv.class) {
                    bxxk = f163899e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163898c);
                        f163899e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
