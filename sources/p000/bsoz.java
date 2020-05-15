package p000;

/* renamed from: bsoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsoz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bsoz f146452h;

    /* renamed from: i */
    private static volatile bxxk f146453i;

    /* renamed from: a */
    public int f146454a;

    /* renamed from: b */
    public int f146455b;

    /* renamed from: c */
    public int f146456c;

    /* renamed from: d */
    public int f146457d;

    /* renamed from: e */
    public int f146458e;

    /* renamed from: f */
    public int f146459f = -1;

    /* renamed from: g */
    public int f146460g = -1;

    static {
        bsoz bsoz = new bsoz();
        f146452h = bsoz;
        GeneratedMessageLite.m124024a(bsoz.class, bsoz);
    }

    private bsoz() {
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
            return GeneratedMessageLite.m124022a(f146452h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsoz();
        } else {
            if (i2 == 4) {
                return new bxvd(f146452h);
            }
            if (i2 == 5) {
                return f146452h;
            }
            bxxk bxxk = f146453i;
            if (bxxk == null) {
                synchronized (bsoz.class) {
                    bxxk = f146453i;
                    if (bxxk == null) {
                        bxxk = new bxve(f146452h);
                        f146453i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
