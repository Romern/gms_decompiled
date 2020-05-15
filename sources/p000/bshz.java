package p000;

/* renamed from: bshz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshz extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bshz f144645b;

    /* renamed from: d */
    private static volatile bxxk f144646d;

    /* renamed from: a */
    public int f144647a;

    /* renamed from: c */
    private int f144648c;

    static {
        bshz bshz = new bshz();
        f144645b = bshz;
        bxvk.m124024a(bshz.class, bshz);
    }

    private bshz() {
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
            return bxvk.m124022a(f144645b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bshz();
        } else {
            if (i2 == 4) {
                return new bxvd(f144645b);
            }
            if (i2 == 5) {
                return f144645b;
            }
            bxxk bxxk = f144646d;
            if (bxxk == null) {
                synchronized (bshz.class) {
                    bxxk = f144646d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144645b);
                        f144646d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
