package p000;

/* renamed from: bplm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bplm f138109f;

    /* renamed from: g */
    private static volatile bxxk f138110g;

    /* renamed from: a */
    public int f138111a;

    /* renamed from: b */
    public boolean f138112b;

    /* renamed from: c */
    public boolean f138113c;

    /* renamed from: d */
    public int f138114d;

    /* renamed from: e */
    public int f138115e;

    static {
        bplm bplm = new bplm();
        f138109f = bplm;
        bxvk.m124024a(bplm.class, bplm);
    }

    private bplm() {
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
            return bxvk.m124022a(f138109f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bplm();
        } else {
            if (i2 == 4) {
                return new bxvd(f138109f);
            }
            if (i2 == 5) {
                return f138109f;
            }
            bxxk bxxk = f138110g;
            if (bxxk == null) {
                synchronized (bplm.class) {
                    bxxk = f138110g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138109f);
                        f138110g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
