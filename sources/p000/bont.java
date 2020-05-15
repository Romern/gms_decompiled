package p000;

/* renamed from: bont */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bont extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bont f133854b;

    /* renamed from: c */
    private static volatile bxxk f133855c;

    /* renamed from: a */
    public int f133856a;

    static {
        bont bont = new bont();
        f133854b = bont;
        bxvk.m124024a(bont.class, bont);
    }

    private bont() {
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
            return bxvk.m124022a(f133854b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bont();
        } else {
            if (i2 == 4) {
                return new bxvd(f133854b);
            }
            if (i2 == 5) {
                return f133854b;
            }
            bxxk bxxk = f133855c;
            if (bxxk == null) {
                synchronized (bont.class) {
                    bxxk = f133855c;
                    if (bxxk == null) {
                        bxxk = new bxve(f133854b);
                        f133855c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
