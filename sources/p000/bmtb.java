package p000;

/* renamed from: bmtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmtb f130808d;

    /* renamed from: e */
    private static volatile bxxk f130809e;

    /* renamed from: a */
    public String f130810a = "";

    /* renamed from: b */
    public bxwc f130811b = bxxn.f165040b;

    /* renamed from: c */
    public String f130812c = "";

    static {
        bmtb bmtb = new bmtb();
        f130808d = bmtb;
        GeneratedMessageLite.m124024a(bmtb.class, bmtb);
    }

    private bmtb() {
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
            return GeneratedMessageLite.m124022a(f130808d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmtb();
        } else {
            if (i2 == 4) {
                return new bxvd(f130808d);
            }
            if (i2 == 5) {
                return f130808d;
            }
            bxxk bxxk = f130809e;
            if (bxxk == null) {
                synchronized (bmtb.class) {
                    bxxk = f130809e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130808d);
                        f130809e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
