package p000;

/* renamed from: bwnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwnv f160397d;

    /* renamed from: e */
    public static final bxvj f160398e;

    /* renamed from: g */
    private static volatile bxxk f160399g;

    /* renamed from: a */
    public int f160400a = 0;

    /* renamed from: b */
    public Object f160401b;

    /* renamed from: c */
    public int f160402c;

    /* renamed from: f */
    private int f160403f;

    static {
        bwnv bwnv = new bwnv();
        f160397d = bwnv;
        GeneratedMessageLite.m124024a(bwnv.class, bwnv);
        bwoq bwoq = bwoq.f160480d;
        bwnv bwnv2 = f160397d;
        f160398e = GeneratedMessageLite.m124006a(bwoq, bwnv2, bwnv2, 232901548, bxzf.MESSAGE);
    }

    private bwnv() {
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
            return GeneratedMessageLite.m124022a(f160397d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "f", "c", bwns.f160391a, bwnl.f160372a, bwnu.class});
        } else if (i2 == 3) {
            return new bwnv();
        } else {
            if (i2 == 4) {
                return new bxvd(f160397d);
            }
            if (i2 == 5) {
                return f160397d;
            }
            bxxk bxxk = f160399g;
            if (bxxk == null) {
                synchronized (bwnv.class) {
                    bxxk = f160399g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160397d);
                        f160399g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
