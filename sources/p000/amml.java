package p000;

/* renamed from: amml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amml extends bxvk implements bxxd {

    /* renamed from: d */
    public static final amml f75300d;

    /* renamed from: e */
    private static volatile bxxk f75301e;

    /* renamed from: a */
    public int f75302a;

    /* renamed from: b */
    public boolean f75303b;

    /* renamed from: c */
    public int f75304c;

    static {
        amml amml = new amml();
        f75300d = amml;
        bxvk.m124024a(amml.class, amml);
    }

    private amml() {
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
            return bxvk.m124022a(f75300d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", amkk.f75069a});
        } else if (i2 == 3) {
            return new amml();
        } else {
            if (i2 == 4) {
                return new bxvd(f75300d);
            }
            if (i2 == 5) {
                return f75300d;
            }
            bxxk bxxk = f75301e;
            if (bxxk == null) {
                synchronized (amml.class) {
                    bxxk = f75301e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75300d);
                        f75301e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
