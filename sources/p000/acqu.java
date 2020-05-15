package p000;

/* renamed from: acqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final acqu f60543c;

    /* renamed from: e */
    private static volatile bxxk f60544e;

    /* renamed from: a */
    public String f60545a = "";

    /* renamed from: b */
    public bxwc f60546b = bxxn.f165040b;

    /* renamed from: d */
    private int f60547d;

    static {
        acqu acqu = new acqu();
        f60543c = acqu;
        GeneratedMessageLite.m124024a(acqu.class, acqu);
    }

    private acqu() {
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
            return GeneratedMessageLite.m124022a(f60543c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bxsi.class});
        } else if (i2 == 3) {
            return new acqu();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f60543c;
            }
            bxxk bxxk = f60544e;
            if (bxxk == null) {
                synchronized (acqu.class) {
                    bxxk = f60544e;
                    if (bxxk == null) {
                        bxxk = new bxve(f60543c);
                        f60544e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
