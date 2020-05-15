package p000;

/* renamed from: bzle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzle extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzle f170513c;

    /* renamed from: d */
    private static volatile bxxk f170514d;

    /* renamed from: a */
    public int f170515a;

    /* renamed from: b */
    public String f170516b = "";

    static {
        bzle bzle = new bzle();
        f170513c = bzle;
        GeneratedMessageLite.m124024a(bzle.class, bzle);
    }

    private bzle() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f170513c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzle();
        } else {
            if (i2 == 4) {
                return new bxvd(f170513c);
            }
            if (i2 == 5) {
                return f170513c;
            }
            bxxk bxxk = f170514d;
            if (bxxk == null) {
                synchronized (bzle.class) {
                    bxxk = f170514d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170513c);
                        f170514d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
