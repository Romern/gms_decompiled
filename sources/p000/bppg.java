package p000;

/* renamed from: bppg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bppg f138615d;

    /* renamed from: e */
    private static volatile bxxk f138616e;

    /* renamed from: a */
    public int f138617a;

    /* renamed from: b */
    public String f138618b = "";

    /* renamed from: c */
    public String f138619c = "";

    static {
        bppg bppg = new bppg();
        f138615d = bppg;
        GeneratedMessageLite.m124024a(bppg.class, bppg);
    }

    private bppg() {
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
            return GeneratedMessageLite.m124022a(f138615d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bppg();
        } else {
            if (i2 == 4) {
                return new bxvd(f138615d);
            }
            if (i2 == 5) {
                return f138615d;
            }
            bxxk bxxk = f138616e;
            if (bxxk == null) {
                synchronized (bppg.class) {
                    bxxk = f138616e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138615d);
                        f138616e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
