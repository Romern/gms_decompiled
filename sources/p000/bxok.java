package p000;

/* renamed from: bxok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxok extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxok f164161d;

    /* renamed from: e */
    private static volatile bxxk f164162e;

    /* renamed from: a */
    public int f164163a;

    /* renamed from: b */
    public boolean f164164b;

    /* renamed from: c */
    public boolean f164165c;

    static {
        bxok bxok = new bxok();
        f164161d = bxok;
        bxvk.m124024a(bxok.class, bxok);
    }

    private bxok() {
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
            return bxvk.m124022a(f164161d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxok();
        } else {
            if (i2 == 4) {
                return new bxvd(f164161d);
            }
            if (i2 == 5) {
                return f164161d;
            }
            bxxk bxxk = f164162e;
            if (bxxk == null) {
                synchronized (bxok.class) {
                    bxxk = f164162e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164161d);
                        f164162e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
