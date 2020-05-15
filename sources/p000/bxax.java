package p000;

/* renamed from: bxax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxax extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxax f161755d;

    /* renamed from: e */
    public static final bxvj f161756e;

    /* renamed from: f */
    private static volatile bxxk f161757f;

    /* renamed from: a */
    public int f161758a;

    /* renamed from: b */
    public int f161759b;

    /* renamed from: c */
    public int f161760c;

    static {
        bxax bxax = new bxax();
        f161755d = bxax;
        GeneratedMessageLite.m124024a(bxax.class, bxax);
        bwxl bwxl = bwxl.f161383i;
        bxax bxax2 = f161755d;
        f161756e = GeneratedMessageLite.m124006a(bwxl, bxax2, bxax2, 213712846, bxzf.MESSAGE);
    }

    private bxax() {
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
            return GeneratedMessageLite.m124022a(f161755d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003င\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", bxav.f161754a});
        } else if (i2 == 3) {
            return new bxax();
        } else {
            if (i2 == 4) {
                return new bxvd(f161755d);
            }
            if (i2 == 5) {
                return f161755d;
            }
            bxxk bxxk = f161757f;
            if (bxxk == null) {
                synchronized (bxax.class) {
                    bxxk = f161757f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161755d);
                        f161757f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
