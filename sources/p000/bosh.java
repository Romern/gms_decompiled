package p000;

/* renamed from: bosh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosh extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bosh f134587e;

    /* renamed from: f */
    private static volatile bxxk f134588f;

    /* renamed from: a */
    public int f134589a;

    /* renamed from: b */
    public boolean f134590b;

    /* renamed from: c */
    public boolean f134591c;

    /* renamed from: d */
    public int f134592d;

    static {
        bosh bosh = new bosh();
        f134587e = bosh;
        bxvk.m124024a(bosh.class, bosh);
    }

    private bosh() {
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
            return bxvk.m124022a(f134587e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bosf.f134580a});
        } else if (i2 == 3) {
            return new bosh();
        } else {
            if (i2 == 4) {
                return new bxvd(f134587e);
            }
            if (i2 == 5) {
                return f134587e;
            }
            bxxk bxxk = f134588f;
            if (bxxk == null) {
                synchronized (bosh.class) {
                    bxxk = f134588f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134587e);
                        f134588f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
