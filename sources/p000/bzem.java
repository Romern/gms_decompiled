package p000;

/* renamed from: bzem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzem extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzem f169684e;

    /* renamed from: f */
    private static volatile bxxk f169685f;

    /* renamed from: a */
    public int f169686a;

    /* renamed from: b */
    public String f169687b = "";

    /* renamed from: c */
    public int f169688c;

    /* renamed from: d */
    public long f169689d;

    static {
        bzem bzem = new bzem();
        f169684e = bzem;
        bxvk.m124024a(bzem.class, bzem);
    }

    private bzem() {
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
            return bxvk.m124022a(f169684e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzem();
        } else {
            if (i2 == 4) {
                return new bxvd(f169684e);
            }
            if (i2 == 5) {
                return f169684e;
            }
            bxxk bxxk = f169685f;
            if (bxxk == null) {
                synchronized (bzem.class) {
                    bxxk = f169685f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169684e);
                        f169685f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
