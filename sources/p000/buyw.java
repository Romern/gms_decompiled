package p000;

/* renamed from: buyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyw extends bxvg implements bxvh {

    /* renamed from: h */
    public static final buyw f155343h;

    /* renamed from: j */
    private static volatile bxxk f155344j;

    /* renamed from: a */
    public int f155345a;

    /* renamed from: b */
    public buzq f155346b;

    /* renamed from: c */
    public buzu f155347c;

    /* renamed from: d */
    public int f155348d;

    /* renamed from: e */
    public int f155349e;

    /* renamed from: f */
    public int f155350f;

    /* renamed from: g */
    public int f155351g;

    /* renamed from: i */
    private byte f155352i = 2;

    static {
        buyw buyw = new buyw();
        f155343h = buyw;
        GeneratedMessageLite.m124024a(buyw.class, buyw);
    }

    private buyw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155352i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155352i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155343h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004င\u0003\u0007ဌ\u0004\bဌ\u0005", new Object[]{"a", "b", "c", "d", buyv.m120789b(), "e", "f", buzc.f155371a, "g", bzak.f169217a});
        } else if (i2 == 3) {
            return new buyw();
        } else {
            if (i2 == 4) {
                return new bxvf(f155343h);
            }
            if (i2 == 5) {
                return f155343h;
            }
            bxxk bxxk = f155344j;
            if (bxxk == null) {
                synchronized (buyw.class) {
                    bxxk = f155344j;
                    if (bxxk == null) {
                        bxxk = new bxve(f155343h);
                        f155344j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
