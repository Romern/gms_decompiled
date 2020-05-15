package p000;

/* renamed from: bkjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkjz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkjz f124483d;

    /* renamed from: e */
    private static volatile bxxk f124484e;

    /* renamed from: a */
    public int f124485a;

    /* renamed from: b */
    public String f124486b = "";

    /* renamed from: c */
    public int f124487c;

    static {
        bkjz bkjz = new bkjz();
        f124483d = bkjz;
        bxvk.m124024a(bkjz.class, bkjz);
    }

    private bkjz() {
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
            return bxvk.m124022a(f124483d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkjz();
        } else {
            if (i2 == 4) {
                return new bxvd(f124483d);
            }
            if (i2 == 5) {
                return f124483d;
            }
            bxxk bxxk = f124484e;
            if (bxxk == null) {
                synchronized (bkjz.class) {
                    bxxk = f124484e;
                    if (bxxk == null) {
                        bxxk = new bxve(f124483d);
                        f124484e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
