package p000;

/* renamed from: blfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blfj f126372b;

    /* renamed from: e */
    private static volatile bxxk f126373e;

    /* renamed from: a */
    public blfq f126374a;

    /* renamed from: c */
    private int f126375c;

    /* renamed from: d */
    private byte f126376d = 2;

    static {
        blfj blfj = new blfj();
        f126372b = blfj;
        bxvk.m124024a(blfj.class, blfj);
    }

    private blfj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126376d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126376d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126372b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blfj();
        } else {
            if (i2 == 4) {
                return new bxvd(f126372b);
            }
            if (i2 == 5) {
                return f126372b;
            }
            bxxk bxxk = f126373e;
            if (bxxk == null) {
                synchronized (blfj.class) {
                    bxxk = f126373e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126372b);
                        f126373e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
