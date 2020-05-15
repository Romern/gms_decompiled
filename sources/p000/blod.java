package p000;

/* renamed from: blod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blod extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blod f127069e;

    /* renamed from: g */
    private static volatile bxxk f127070g;

    /* renamed from: a */
    public int f127071a;

    /* renamed from: b */
    public blnu f127072b;

    /* renamed from: c */
    public int f127073c = 1;

    /* renamed from: d */
    public boolean f127074d;

    /* renamed from: f */
    private byte f127075f = 2;

    static {
        blod blod = new blod();
        f127069e = blod;
        GeneratedMessageLite.m124024a(blod.class, blod);
    }

    private blod() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127075f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127075f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127069e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", blns.f127021a, "d"});
        } else if (i2 == 3) {
            return new blod();
        } else {
            if (i2 == 4) {
                return new bxvd(f127069e);
            }
            if (i2 == 5) {
                return f127069e;
            }
            bxxk bxxk = f127070g;
            if (bxxk == null) {
                synchronized (blod.class) {
                    bxxk = f127070g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127069e);
                        f127070g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
