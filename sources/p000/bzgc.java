package p000;

/* renamed from: bzgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzgc f169907b;

    /* renamed from: d */
    private static volatile bxxk f169908d;

    /* renamed from: a */
    public String f169909a = "";

    /* renamed from: c */
    private int f169910c;

    static {
        bzgc bzgc = new bzgc();
        f169907b = bzgc;
        bxvk.m124024a(bzgc.class, bzgc);
    }

    private bzgc() {
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
            return bxvk.m124022a(f169907b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzgc();
        } else {
            if (i2 == 4) {
                return new bxvd(f169907b);
            }
            if (i2 == 5) {
                return f169907b;
            }
            bxxk bxxk = f169908d;
            if (bxxk == null) {
                synchronized (bzgc.class) {
                    bxxk = f169908d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169907b);
                        f169908d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
