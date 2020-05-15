package p000;

/* renamed from: bofx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bofx f132950d;

    /* renamed from: e */
    private static volatile bxxk f132951e;

    /* renamed from: a */
    public int f132952a;

    /* renamed from: b */
    public int f132953b;

    /* renamed from: c */
    public int f132954c;

    static {
        bofx bofx = new bofx();
        f132950d = bofx;
        bxvk.m124024a(bofx.class, bofx);
    }

    private bofx() {
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
            return bxvk.m124022a(f132950d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bofv.f132949a, "c", boft.f132948a});
        } else if (i2 == 3) {
            return new bofx();
        } else {
            if (i2 == 4) {
                return new bxvd(f132950d);
            }
            if (i2 == 5) {
                return f132950d;
            }
            bxxk bxxk = f132951e;
            if (bxxk == null) {
                synchronized (bofx.class) {
                    bxxk = f132951e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132950d);
                        f132951e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
