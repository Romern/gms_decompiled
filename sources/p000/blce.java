package p000;

/* renamed from: blce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blce extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blce f125910d;

    /* renamed from: f */
    private static volatile bxxk f125911f;

    /* renamed from: a */
    public int f125912a;

    /* renamed from: b */
    public blcd f125913b;

    /* renamed from: c */
    public bxbg f125914c;

    /* renamed from: e */
    private byte f125915e = 2;

    static {
        blce blce = new blce();
        f125910d = blce;
        GeneratedMessageLite.m124024a(blce.class, blce);
    }

    private blce() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125915e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125915e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125910d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blce();
        } else {
            if (i2 == 4) {
                return new bxvd(f125910d);
            }
            if (i2 == 5) {
                return f125910d;
            }
            bxxk bxxk = f125911f;
            if (bxxk == null) {
                synchronized (blce.class) {
                    bxxk = f125911f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125910d);
                        f125911f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
