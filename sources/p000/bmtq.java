package p000;

/* renamed from: bmtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmtq f130900b;

    /* renamed from: c */
    private static volatile bxxk f130901c;

    /* renamed from: a */
    public String f130902a = "";

    static {
        bmtq bmtq = new bmtq();
        f130900b = bmtq;
        GeneratedMessageLite.m124024a(bmtq.class, bmtq);
    }

    private bmtq() {
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
            return GeneratedMessageLite.m124022a(f130900b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bmtq();
        } else {
            if (i2 == 4) {
                return new bxvd(f130900b);
            }
            if (i2 == 5) {
                return f130900b;
            }
            bxxk bxxk = f130901c;
            if (bxxk == null) {
                synchronized (bmtq.class) {
                    bxxk = f130901c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130900b);
                        f130901c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
