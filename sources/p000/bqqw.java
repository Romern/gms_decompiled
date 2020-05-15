package p000;

/* renamed from: bqqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqqw f141394c;

    /* renamed from: d */
    private static volatile bxxk f141395d;

    /* renamed from: a */
    public bqqy f141396a;

    /* renamed from: b */
    public bqsa f141397b;

    static {
        bqqw bqqw = new bqqw();
        f141394c = bqqw;
        bxvk.m124024a(bqqw.class, bqqw);
    }

    private bqqw() {
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
            return bxvk.m124022a(f141394c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f141394c);
            }
            if (i2 == 5) {
                return f141394c;
            }
            bxxk bxxk = f141395d;
            if (bxxk == null) {
                synchronized (bqqw.class) {
                    bxxk = f141395d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141394c);
                        f141395d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
