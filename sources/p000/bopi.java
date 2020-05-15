package p000;

/* renamed from: bopi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bopi f134125e;

    /* renamed from: f */
    private static volatile bxxk f134126f;

    /* renamed from: a */
    public bopl f134127a;

    /* renamed from: b */
    public int f134128b;

    /* renamed from: c */
    public bxyk f134129c;

    /* renamed from: d */
    public int f134130d;

    static {
        bopi bopi = new bopi();
        f134125e = bopi;
        bxvk.m124024a(bopi.class, bopi);
    }

    private bopi() {
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
            return bxvk.m124022a(f134125e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t\u0004\u000b", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bopi();
        } else {
            if (i2 == 4) {
                return new bxvd(f134125e);
            }
            if (i2 == 5) {
                return f134125e;
            }
            bxxk bxxk = f134126f;
            if (bxxk == null) {
                synchronized (bopi.class) {
                    bxxk = f134126f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134125e);
                        f134126f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
