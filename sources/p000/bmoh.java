package p000;

/* renamed from: bmoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmoh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmoh f130231b;

    /* renamed from: d */
    private static volatile bxxk f130232d;

    /* renamed from: a */
    public long f130233a;

    /* renamed from: c */
    private int f130234c;

    static {
        bmoh bmoh = new bmoh();
        f130231b = bmoh;
        GeneratedMessageLite.m124024a(bmoh.class, bmoh);
    }

    private bmoh() {
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
            return GeneratedMessageLite.m124022a(f130231b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmoh();
        } else {
            if (i2 == 4) {
                return new bxvd(f130231b);
            }
            if (i2 == 5) {
                return f130231b;
            }
            bxxk bxxk = f130232d;
            if (bxxk == null) {
                synchronized (bmoh.class) {
                    bxxk = f130232d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130231b);
                        f130232d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
