package p000;

/* renamed from: blmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blmu f126903b;

    /* renamed from: d */
    private static volatile bxxk f126904d;

    /* renamed from: a */
    public int f126905a;

    /* renamed from: c */
    private int f126906c;

    static {
        blmu blmu = new blmu();
        f126903b = blmu;
        GeneratedMessageLite.m124024a(blmu.class, blmu);
    }

    private blmu() {
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
            return GeneratedMessageLite.m124022a(f126903b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0002", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f126903b);
            }
            if (i2 == 5) {
                return f126903b;
            }
            bxxk bxxk = f126904d;
            if (bxxk == null) {
                synchronized (blmu.class) {
                    bxxk = f126904d;
                    if (bxxk == null) {
                        bxxk = new bxve(f126903b);
                        f126904d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
