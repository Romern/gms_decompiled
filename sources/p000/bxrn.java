package p000;

/* renamed from: bxrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxrn f164579e;

    /* renamed from: f */
    private static volatile bxxk f164580f;

    /* renamed from: a */
    public int f164581a;

    /* renamed from: b */
    public boolean f164582b;

    /* renamed from: c */
    public boolean f164583c;

    /* renamed from: d */
    public boolean f164584d;

    static {
        bxrn bxrn = new bxrn();
        f164579e = bxrn;
        bxvk.m124024a(bxrn.class, bxrn);
    }

    private bxrn() {
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
            return bxvk.m124022a(f164579e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxrn();
        } else {
            if (i2 == 4) {
                return new bxvd(f164579e);
            }
            if (i2 == 5) {
                return f164579e;
            }
            bxxk bxxk = f164580f;
            if (bxxk == null) {
                synchronized (bxrn.class) {
                    bxxk = f164580f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164579e);
                        f164580f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
