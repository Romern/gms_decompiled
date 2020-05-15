package p000;

/* renamed from: bxis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxis extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxis f163562b;

    /* renamed from: d */
    private static volatile bxxk f163563d;

    /* renamed from: a */
    public bxjd f163564a;

    /* renamed from: c */
    private int f163565c;

    static {
        bxis bxis = new bxis();
        f163562b = bxis;
        bxvk.m124024a(bxis.class, bxis);
    }

    private bxis() {
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
            return bxvk.m124022a(f163562b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxis();
        } else {
            if (i2 == 4) {
                return new bxvd(f163562b);
            }
            if (i2 == 5) {
                return f163562b;
            }
            bxxk bxxk = f163563d;
            if (bxxk == null) {
                synchronized (bxis.class) {
                    bxxk = f163563d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163562b);
                        f163563d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
