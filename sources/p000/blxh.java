package p000;

/* renamed from: blxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxh extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final blxh f128058h;

    /* renamed from: j */
    private static volatile bxxk f128059j;

    /* renamed from: a */
    public String f128060a = "";

    /* renamed from: b */
    public String f128061b = "";

    /* renamed from: c */
    public String f128062c = "";

    /* renamed from: d */
    public boolean f128063d;

    /* renamed from: e */
    public int f128064e;

    /* renamed from: f */
    public boolean f128065f;

    /* renamed from: g */
    public String f128066g = "";

    /* renamed from: i */
    private int f128067i;

    static {
        blxh blxh = new blxh();
        f128058h = blxh;
        GeneratedMessageLite.m124024a(blxh.class, blxh);
    }

    private blxh() {
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
            return GeneratedMessageLite.m124022a(f128058h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new blxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f128058h);
            }
            if (i2 == 5) {
                return f128058h;
            }
            bxxk bxxk = f128059j;
            if (bxxk == null) {
                synchronized (blxh.class) {
                    bxxk = f128059j;
                    if (bxxk == null) {
                        bxxk = new bxve(f128058h);
                        f128059j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
