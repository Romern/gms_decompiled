package p000;

/* renamed from: bmtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtf extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bmtf f130824g;

    /* renamed from: h */
    private static volatile bxxk f130825h;

    /* renamed from: a */
    public String f130826a = "";

    /* renamed from: b */
    public String f130827b = "";

    /* renamed from: c */
    public String f130828c = "";

    /* renamed from: d */
    public String f130829d = "";

    /* renamed from: e */
    public boolean f130830e;

    /* renamed from: f */
    public String f130831f = "";

    static {
        bmtf bmtf = new bmtf();
        f130824g = bmtf;
        bxvk.m124024a(bmtf.class, bmtf);
    }

    private bmtf() {
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
            return bxvk.m124022a(f130824g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0002\b\u0003\b\u0004\b\u0005\u0007\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bmtf();
        } else {
            if (i2 == 4) {
                return new bxvd(f130824g);
            }
            if (i2 == 5) {
                return f130824g;
            }
            bxxk bxxk = f130825h;
            if (bxxk == null) {
                synchronized (bmtf.class) {
                    bxxk = f130825h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130824g);
                        f130825h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
