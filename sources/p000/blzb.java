package p000;

/* renamed from: blzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blzb f128326d;

    /* renamed from: f */
    private static volatile bxxk f128327f;

    /* renamed from: a */
    public int f128328a;

    /* renamed from: b */
    public int f128329b;

    /* renamed from: c */
    public bxvt f128330c = bxvm.f164965b;

    /* renamed from: e */
    private int f128331e;

    static {
        blzb blzb = new blzb();
        f128326d = blzb;
        GeneratedMessageLite.m124024a(blzb.class, blzb);
    }

    private blzb() {
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
            return GeneratedMessageLite.m124022a(f128326d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003'", new Object[]{"e", "a", blyx.f128324a, "b", blyz.f128325a, "c"});
        } else if (i2 == 3) {
            return new blzb();
        } else {
            if (i2 == 4) {
                return new bxvd(f128326d);
            }
            if (i2 == 5) {
                return f128326d;
            }
            bxxk bxxk = f128327f;
            if (bxxk == null) {
                synchronized (blzb.class) {
                    bxxk = f128327f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128326d);
                        f128327f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
