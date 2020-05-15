package p000;

/* renamed from: bmgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgv extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bmgv f129339j;

    /* renamed from: k */
    private static volatile bxxk f129340k;

    /* renamed from: a */
    public int f129341a;

    /* renamed from: b */
    public bmdn f129342b;

    /* renamed from: c */
    public bmev f129343c;

    /* renamed from: d */
    public bmjf f129344d;

    /* renamed from: e */
    public bxwc f129345e = bxxn.f165040b;

    /* renamed from: f */
    public String f129346f = "";

    /* renamed from: g */
    public bmnr f129347g;

    /* renamed from: h */
    public boolean f129348h;

    /* renamed from: i */
    public String f129349i = "";

    static {
        bmgv bmgv = new bmgv();
        f129339j = bmgv;
        GeneratedMessageLite.m124024a(bmgv.class, bmgv);
    }

    private bmgv() {
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
            return GeneratedMessageLite.m124022a(f129339j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bဈ\u0006", new Object[]{"a", "b", "c", "d", "e", bmnr.class, "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bmgv();
        } else {
            if (i2 == 4) {
                return new bxvd(f129339j);
            }
            if (i2 == 5) {
                return f129339j;
            }
            bxxk bxxk = f129340k;
            if (bxxk == null) {
                synchronized (bmgv.class) {
                    bxxk = f129340k;
                    if (bxxk == null) {
                        bxxk = new bxve(f129339j);
                        f129340k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
