package p000;

/* renamed from: bmit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmit extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmit f129635e;

    /* renamed from: f */
    private static volatile bxxk f129636f;

    /* renamed from: a */
    public int f129637a;

    /* renamed from: b */
    public String f129638b = "";

    /* renamed from: c */
    public int f129639c;

    /* renamed from: d */
    public String f129640d = "";

    static {
        bmit bmit = new bmit();
        f129635e = bmit;
        bxvk.m124024a(bmit.class, bmit);
    }

    private bmit() {
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
            return bxvk.m124022a(f129635e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004င\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new bmit();
        } else {
            if (i2 == 4) {
                return new bxvd(f129635e);
            }
            if (i2 == 5) {
                return f129635e;
            }
            bxxk bxxk = f129636f;
            if (bxxk == null) {
                synchronized (bmit.class) {
                    bxxk = f129636f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129635e);
                        f129636f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
