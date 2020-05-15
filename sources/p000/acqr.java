package p000;

/* renamed from: acqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final acqr f60528c;

    /* renamed from: d */
    private static volatile bxxk f60529d;

    /* renamed from: a */
    public int f60530a;

    /* renamed from: b */
    public acqq f60531b;

    static {
        acqr acqr = new acqr();
        f60528c = acqr;
        GeneratedMessageLite.m124024a(acqr.class, acqr);
    }

    private acqr() {
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
            return GeneratedMessageLite.m124022a(f60528c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new acqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f60528c);
            }
            if (i2 == 5) {
                return f60528c;
            }
            bxxk bxxk = f60529d;
            if (bxxk == null) {
                synchronized (acqr.class) {
                    bxxk = f60529d;
                    if (bxxk == null) {
                        bxxk = new bxve(f60528c);
                        f60529d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
