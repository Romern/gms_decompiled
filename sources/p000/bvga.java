package p000;

/* renamed from: bvga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvga extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvga f155948e;

    /* renamed from: f */
    private static volatile bxxk f155949f;

    /* renamed from: a */
    public int f155950a;

    /* renamed from: b */
    public int f155951b;

    /* renamed from: c */
    public int f155952c;

    /* renamed from: d */
    public int f155953d;

    static {
        bvga bvga = new bvga();
        f155948e = bvga;
        GeneratedMessageLite.m124024a(bvga.class, bvga);
    }

    private bvga() {
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
            return GeneratedMessageLite.m124022a(f155948e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bvjh.f156343a, "c", bvjm.f156347a, "d", bvjg.f156342a});
        } else if (i2 == 3) {
            return new bvga();
        } else {
            if (i2 == 4) {
                return new bxvd(f155948e);
            }
            if (i2 == 5) {
                return f155948e;
            }
            bxxk bxxk = f155949f;
            if (bxxk == null) {
                synchronized (bvga.class) {
                    bxxk = f155949f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155948e);
                        f155949f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
