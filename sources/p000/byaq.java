package p000;

/* renamed from: byaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byaq extends bxvk implements bxxd {

    /* renamed from: j */
    public static final byaq f165296j;

    /* renamed from: k */
    private static volatile bxxk f165297k;

    /* renamed from: a */
    public int f165298a;

    /* renamed from: b */
    public bxvt f165299b = bxvm.f164965b;

    /* renamed from: c */
    public int f165300c;

    /* renamed from: d */
    public int f165301d;

    /* renamed from: e */
    public String f165302e = "";

    /* renamed from: f */
    public int f165303f;

    /* renamed from: g */
    public int f165304g;

    /* renamed from: h */
    public String f165305h = "";

    /* renamed from: i */
    public int f165306i;

    static {
        byaq byaq = new byaq();
        f165296j = byaq;
        bxvk.m124024a(byaq.class, byaq);
    }

    private byaq() {
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
            return bxvk.m124022a(f165296j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001e\u0002င\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005င\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bင\u0006", new Object[]{"a", "b", byan.m124605b(), "c", "d", byao.f165295a, "e", "f", "g", byao.f165295a, "h", "i"});
        } else if (i2 == 3) {
            return new byaq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f165296j;
            }
            bxxk bxxk = f165297k;
            if (bxxk == null) {
                synchronized (byaq.class) {
                    bxxk = f165297k;
                    if (bxxk == null) {
                        bxxk = new bxve(f165296j);
                        f165297k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
