package p000;

/* renamed from: blzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blzk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blzk f128350d;

    /* renamed from: f */
    private static volatile bxxk f128351f;

    /* renamed from: a */
    public int f128352a;

    /* renamed from: b */
    public int f128353b;

    /* renamed from: c */
    public String f128354c = "";

    /* renamed from: e */
    private int f128355e;

    static {
        blzk blzk = new blzk();
        f128350d = blzk;
        GeneratedMessageLite.m124024a(blzk.class, blzk);
    }

    private blzk() {
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
            return GeneratedMessageLite.m124022a(f128350d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0001\u0004ဈ\u0002", new Object[]{"e", "a", blzi.f128349a, "b", "c"});
        } else if (i2 == 3) {
            return new blzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f128350d);
            }
            if (i2 == 5) {
                return f128350d;
            }
            bxxk bxxk = f128351f;
            if (bxxk == null) {
                synchronized (blzk.class) {
                    bxxk = f128351f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128350d);
                        f128351f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
