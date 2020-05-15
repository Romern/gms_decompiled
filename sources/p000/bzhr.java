package p000;

/* renamed from: bzhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzhr f170107e;

    /* renamed from: f */
    private static volatile bxxk f170108f;

    /* renamed from: a */
    public int f170109a;

    /* renamed from: b */
    public String f170110b = "";

    /* renamed from: c */
    public String f170111c = "";

    /* renamed from: d */
    public int f170112d;

    static {
        bzhr bzhr = new bzhr();
        f170107e = bzhr;
        bxvk.m124024a(bzhr.class, bzhr);
    }

    private bzhr() {
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
            return bxvk.m124022a(f170107e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", bzho.f170100a});
        } else if (i2 == 3) {
            return new bzhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f170107e);
            }
            if (i2 == 5) {
                return f170107e;
            }
            bxxk bxxk = f170108f;
            if (bxxk == null) {
                synchronized (bzhr.class) {
                    bxxk = f170108f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170107e);
                        f170108f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
