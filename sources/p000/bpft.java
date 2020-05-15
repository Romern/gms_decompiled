package p000;

/* renamed from: bpft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpft extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpft f137436g;

    /* renamed from: h */
    private static volatile bxxk f137437h;

    /* renamed from: a */
    public int f137438a;

    /* renamed from: b */
    public int f137439b;

    /* renamed from: c */
    public boolean f137440c;

    /* renamed from: d */
    public int f137441d;

    /* renamed from: e */
    public int f137442e;

    /* renamed from: f */
    public int f137443f;

    static {
        bpft bpft = new bpft();
        f137436g = bpft;
        GeneratedMessageLite.m124024a(bpft.class, bpft);
    }

    private bpft() {
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
            return GeneratedMessageLite.m124022a(f137436g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", bzzv.m126374b(), "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpft();
        } else {
            if (i2 == 4) {
                return new bxvd(f137436g);
            }
            if (i2 == 5) {
                return f137436g;
            }
            bxxk bxxk = f137437h;
            if (bxxk == null) {
                synchronized (bpft.class) {
                    bxxk = f137437h;
                    if (bxxk == null) {
                        bxxk = new bxve(f137436g);
                        f137437h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
