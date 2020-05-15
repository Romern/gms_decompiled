package p000;

/* renamed from: blxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blxb f128033c;

    /* renamed from: d */
    private static volatile bxxk f128034d;

    /* renamed from: a */
    public int f128035a = 0;

    /* renamed from: b */
    public Object f128036b;

    static {
        blxb blxb = new blxb();
        f128033c = blxb;
        GeneratedMessageLite.m124024a(blxb.class, blxb);
    }

    private blxb() {
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
            return GeneratedMessageLite.m124022a(f128033c, "\u0001\u0001\u0001\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဵ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new blxb();
        } else {
            if (i2 == 4) {
                return new bxvd(f128033c);
            }
            if (i2 == 5) {
                return f128033c;
            }
            bxxk bxxk = f128034d;
            if (bxxk == null) {
                synchronized (blxb.class) {
                    bxxk = f128034d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128033c);
                        f128034d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
