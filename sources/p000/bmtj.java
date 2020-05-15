package p000;

/* renamed from: bmtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmtj f130848c;

    /* renamed from: d */
    private static volatile bxxk f130849d;

    /* renamed from: a */
    public String f130850a = "";

    /* renamed from: b */
    public String f130851b = "";

    static {
        bmtj bmtj = new bmtj();
        f130848c = bmtj;
        GeneratedMessageLite.m124024a(bmtj.class, bmtj);
    }

    private bmtj() {
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
            return GeneratedMessageLite.m124022a(f130848c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0002\b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmtj();
        } else {
            if (i2 == 4) {
                return new bxvd(f130848c);
            }
            if (i2 == 5) {
                return f130848c;
            }
            bxxk bxxk = f130849d;
            if (bxxk == null) {
                synchronized (bmtj.class) {
                    bxxk = f130849d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130848c);
                        f130849d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
