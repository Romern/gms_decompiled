package p000;

/* renamed from: bspn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspn extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bspn f146530j;

    /* renamed from: k */
    private static volatile bxxk f146531k;

    /* renamed from: a */
    public int f146532a;

    /* renamed from: b */
    public int f146533b;

    /* renamed from: c */
    public int f146534c;

    /* renamed from: d */
    public int f146535d;

    /* renamed from: e */
    public int f146536e;

    /* renamed from: f */
    public int f146537f;

    /* renamed from: g */
    public int f146538g;

    /* renamed from: h */
    public int f146539h = -1;

    /* renamed from: i */
    public int f146540i = -1;

    static {
        bspn bspn = new bspn();
        f146530j = bspn;
        bxvk.m124024a(bspn.class, bspn);
    }

    private bspn() {
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
            return bxvk.m124022a(f146530j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0007င\u0006\bင\u0007\tင\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bspn();
        } else {
            if (i2 == 4) {
                return new bxvd(f146530j);
            }
            if (i2 == 5) {
                return f146530j;
            }
            bxxk bxxk = f146531k;
            if (bxxk == null) {
                synchronized (bspn.class) {
                    bxxk = f146531k;
                    if (bxxk == null) {
                        bxxk = new bxve(f146530j);
                        f146531k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
