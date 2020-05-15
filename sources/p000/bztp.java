package p000;

/* renamed from: bztp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bztp f171356b;

    /* renamed from: c */
    private static volatile bxxk f171357c;

    /* renamed from: a */
    public String f171358a = "";

    static {
        bztp bztp = new bztp();
        f171356b = bztp;
        GeneratedMessageLite.m124024a(bztp.class, bztp);
    }

    private bztp() {
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
            return GeneratedMessageLite.m124022a(f171356b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bztp();
        } else {
            if (i2 == 4) {
                return new bxvd(f171356b);
            }
            if (i2 == 5) {
                return f171356b;
            }
            bxxk bxxk = f171357c;
            if (bxxk == null) {
                synchronized (bztp.class) {
                    bxxk = f171357c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171356b);
                        f171357c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
