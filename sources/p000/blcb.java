package p000;

/* renamed from: blcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blcb f125898d;

    /* renamed from: f */
    private static volatile bxxk f125899f;

    /* renamed from: a */
    public int f125900a;

    /* renamed from: b */
    public blca f125901b;

    /* renamed from: c */
    public bxbg f125902c;

    /* renamed from: e */
    private byte f125903e = 2;

    static {
        blcb blcb = new blcb();
        f125898d = blcb;
        GeneratedMessageLite.m124024a(blcb.class, blcb);
    }

    private blcb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125903e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125903e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125898d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blcb();
        } else {
            if (i2 == 4) {
                return new bxvd(f125898d);
            }
            if (i2 == 5) {
                return f125898d;
            }
            bxxk bxxk = f125899f;
            if (bxxk == null) {
                synchronized (blcb.class) {
                    bxxk = f125899f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125898d);
                        f125899f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
