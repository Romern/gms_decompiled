package p000;

/* renamed from: bisc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bisc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bisc f121501f;

    /* renamed from: h */
    private static volatile bxxk f121502h;

    /* renamed from: a */
    public int f121503a;

    /* renamed from: b */
    public int f121504b = 1;

    /* renamed from: c */
    public int f121505c = 1;

    /* renamed from: d */
    public bxwc f121506d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f121507e = bxxn.f165040b;

    /* renamed from: g */
    private byte f121508g = 2;

    static {
        bisc bisc = new bisc();
        f121501f = bisc;
        GeneratedMessageLite.m124024a(bisc.class, bisc);
    }

    private bisc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121508g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121508g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121501f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0003Л\u0004\u001b", new Object[]{"a", "b", birv.m102769b(), "c", biov.f121112a, "d", bioo.class, "e", biwg.class});
        } else if (i2 == 3) {
            return new bisc();
        } else {
            if (i2 == 4) {
                return new bxvd(f121501f);
            }
            if (i2 == 5) {
                return f121501f;
            }
            bxxk bxxk = f121502h;
            if (bxxk == null) {
                synchronized (bisc.class) {
                    bxxk = f121502h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121501f);
                        f121502h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
