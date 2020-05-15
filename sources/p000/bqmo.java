package p000;

/* renamed from: bqmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqmo f141243b;

    /* renamed from: c */
    private static volatile bxxk f141244c;

    /* renamed from: a */
    public bxvw f141245a = bxwq.f165002b;

    static {
        bqmo bqmo = new bqmo();
        f141243b = bqmo;
        bxvk.m124024a(bqmo.class, bqmo);
    }

    private bqmo() {
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
            return bxvk.m124022a(f141243b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqmo();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141243b;
            }
            bxxk bxxk = f141244c;
            if (bxxk == null) {
                synchronized (bqmo.class) {
                    bxxk = f141244c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141243b);
                        f141244c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
