package p000;

/* renamed from: bxpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpe extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxpe f164247d;

    /* renamed from: e */
    private static volatile bxxk f164248e;

    /* renamed from: a */
    public int f164249a;

    /* renamed from: b */
    public bxwc f164250b = bxxn.f165040b;

    /* renamed from: c */
    public bxok f164251c;

    static {
        bxpe bxpe = new bxpe();
        f164247d = bxpe;
        bxvk.m124024a(bxpe.class, bxpe);
    }

    private bxpe() {
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
            return bxvk.m124022a(f164247d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", bxpd.class, "c"});
        } else if (i2 == 3) {
            return new bxpe();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164247d;
            }
            bxxk bxxk = f164248e;
            if (bxxk == null) {
                synchronized (bxpe.class) {
                    bxxk = f164248e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164247d);
                        f164248e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
