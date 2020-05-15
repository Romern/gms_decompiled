package p000;

/* renamed from: abek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abek extends bxvk implements bxxd {

    /* renamed from: g */
    public static final abek f57241g;

    /* renamed from: h */
    private static volatile bxxk f57242h;

    /* renamed from: a */
    public int f57243a;

    /* renamed from: b */
    public String f57244b = "";

    /* renamed from: c */
    public long f57245c;

    /* renamed from: d */
    public boolean f57246d;

    /* renamed from: e */
    public String f57247e = "";

    /* renamed from: f */
    public String f57248f = "";

    static {
        abek abek = new abek();
        f57241g = abek;
        bxvk.m124024a(abek.class, abek);
    }

    private abek() {
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
            return bxvk.m124022a(f57241g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new abek();
        } else {
            if (i2 == 4) {
                return new bxvd(f57241g);
            }
            if (i2 == 5) {
                return f57241g;
            }
            bxxk bxxk = f57242h;
            if (bxxk == null) {
                synchronized (abek.class) {
                    bxxk = f57242h;
                    if (bxxk == null) {
                        bxxk = new bxve(f57241g);
                        f57242h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
