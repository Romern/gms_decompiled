package p000;

/* renamed from: bvwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvwx f158029d;

    /* renamed from: e */
    private static volatile bxxk f158030e;

    /* renamed from: a */
    public int f158031a;

    /* renamed from: b */
    public bvuz f158032b;

    /* renamed from: c */
    public bvyv f158033c;

    static {
        bvwx bvwx = new bvwx();
        f158029d = bvwx;
        bxvk.m124024a(bvwx.class, bvwx);
    }

    private bvwx() {
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
            return bxvk.m124022a(f158029d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvwx();
        } else {
            if (i2 == 4) {
                return new bxvd(f158029d);
            }
            if (i2 == 5) {
                return f158029d;
            }
            bxxk bxxk = f158030e;
            if (bxxk == null) {
                synchronized (bvwx.class) {
                    bxxk = f158030e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158029d);
                        f158030e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
