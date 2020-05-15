package p000;

/* renamed from: blef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blef extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blef f126188d;

    /* renamed from: e */
    private static volatile bxxk f126189e;

    /* renamed from: a */
    public int f126190a;

    /* renamed from: b */
    public bleu f126191b;

    /* renamed from: c */
    public String f126192c = "";

    static {
        blef blef = new blef();
        f126188d = blef;
        GeneratedMessageLite.m124024a(blef.class, blef);
    }

    private blef() {
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
            return GeneratedMessageLite.m124022a(f126188d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blef();
        } else {
            if (i2 == 4) {
                return new bxvd(f126188d);
            }
            if (i2 == 5) {
                return f126188d;
            }
            bxxk bxxk = f126189e;
            if (bxxk == null) {
                synchronized (blef.class) {
                    bxxk = f126189e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126188d);
                        f126189e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
