package p000;

/* renamed from: budc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final budc f153449b;

    /* renamed from: d */
    private static volatile bxxk f153450d;

    /* renamed from: a */
    public float f153451a;

    /* renamed from: c */
    private int f153452c;

    static {
        budc budc = new budc();
        f153449b = budc;
        bxvk.m124024a(budc.class, budc);
    }

    private budc() {
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
            return bxvk.m124022a(f153449b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new budc();
        } else {
            if (i2 == 4) {
                return new bxvd(f153449b);
            }
            if (i2 == 5) {
                return f153449b;
            }
            bxxk bxxk = f153450d;
            if (bxxk == null) {
                synchronized (budc.class) {
                    bxxk = f153450d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153449b);
                        f153450d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
