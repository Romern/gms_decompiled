package p000;

/* renamed from: bxjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxjt f163677b;

    /* renamed from: d */
    private static volatile bxxk f163678d;

    /* renamed from: a */
    public bxjd f163679a;

    /* renamed from: c */
    private int f163680c;

    static {
        bxjt bxjt = new bxjt();
        f163677b = bxjt;
        GeneratedMessageLite.m124024a(bxjt.class, bxjt);
    }

    private bxjt() {
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
            return GeneratedMessageLite.m124022a(f163677b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f163677b);
            }
            if (i2 == 5) {
                return f163677b;
            }
            bxxk bxxk = f163678d;
            if (bxxk == null) {
                synchronized (bxjt.class) {
                    bxxk = f163678d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163677b);
                        f163678d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
