package p000;

/* renamed from: bvyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvyh f158161d;

    /* renamed from: e */
    private static volatile bxxk f158162e;

    /* renamed from: a */
    public int f158163a;

    /* renamed from: b */
    public bvxn f158164b;

    /* renamed from: c */
    public int f158165c;

    static {
        bvyh bvyh = new bvyh();
        f158161d = bvyh;
        bxvk.m124024a(bvyh.class, bvyh);
    }

    private bvyh() {
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
            return bxvk.m124022a(f158161d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvyh();
        } else {
            if (i2 == 4) {
                return new bxvd(f158161d);
            }
            if (i2 == 5) {
                return f158161d;
            }
            bxxk bxxk = f158162e;
            if (bxxk == null) {
                synchronized (bvyh.class) {
                    bxxk = f158162e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158161d);
                        f158162e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
