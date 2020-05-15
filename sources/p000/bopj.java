package p000;

/* renamed from: bopj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bopj f134131b;

    /* renamed from: c */
    private static volatile bxxk f134132c;

    /* renamed from: a */
    public int f134133a;

    static {
        bopj bopj = new bopj();
        f134131b = bopj;
        bxvk.m124024a(bopj.class, bopj);
    }

    private bopj() {
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
            return bxvk.m124022a(f134131b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bopj();
        } else {
            if (i2 == 4) {
                return new bxvd(f134131b);
            }
            if (i2 == 5) {
                return f134131b;
            }
            bxxk bxxk = f134132c;
            if (bxxk == null) {
                synchronized (bopj.class) {
                    bxxk = f134132c;
                    if (bxxk == null) {
                        bxxk = new bxve(f134131b);
                        f134132c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
