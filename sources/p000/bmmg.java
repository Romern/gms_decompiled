package p000;

/* renamed from: bmmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmmg f130007b;

    /* renamed from: d */
    private static volatile bxxk f130008d;

    /* renamed from: a */
    public blxi f130009a;

    /* renamed from: c */
    private int f130010c;

    static {
        bmmg bmmg = new bmmg();
        f130007b = bmmg;
        bxvk.m124024a(bmmg.class, bmmg);
    }

    private bmmg() {
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
            return bxvk.m124022a(f130007b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f130007b);
            }
            if (i2 == 5) {
                return f130007b;
            }
            bxxk bxxk = f130008d;
            if (bxxk == null) {
                synchronized (bmmg.class) {
                    bxxk = f130008d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130007b);
                        f130008d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
