package p000;

/* renamed from: bmct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmct extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmct f128745b;

    /* renamed from: d */
    private static volatile bxxk f128746d;

    /* renamed from: a */
    public int f128747a;

    /* renamed from: c */
    private int f128748c;

    static {
        bmct bmct = new bmct();
        f128745b = bmct;
        GeneratedMessageLite.m124024a(bmct.class, bmct);
    }

    private bmct() {
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
            return GeneratedMessageLite.m124022a(f128745b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bmcd.f128662a});
        } else if (i2 == 3) {
            return new bmct();
        } else {
            if (i2 == 4) {
                return new bxvd(f128745b);
            }
            if (i2 == 5) {
                return f128745b;
            }
            bxxk bxxk = f128746d;
            if (bxxk == null) {
                synchronized (bmct.class) {
                    bxxk = f128746d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128745b);
                        f128746d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
