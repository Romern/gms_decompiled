package p000;

/* renamed from: caaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caaq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final caaq f172356h;

    /* renamed from: i */
    private static volatile bxxk f172357i;

    /* renamed from: a */
    public int f172358a;

    /* renamed from: b */
    public String f172359b = "";

    /* renamed from: c */
    public int f172360c;

    /* renamed from: d */
    public String f172361d = "";

    /* renamed from: e */
    public String f172362e = "";

    /* renamed from: f */
    public String f172363f = "";

    /* renamed from: g */
    public int f172364g;

    static {
        caaq caaq = new caaq();
        f172356h = caaq;
        bxvk.m124024a(caaq.class, caaq);
    }

    private caaq() {
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
            return bxvk.m124022a(f172356h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", caap.m126422b(), "d", "e", "f", "g", caam.f172345a});
        } else if (i2 == 3) {
            return new caaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f172356h);
            }
            if (i2 == 5) {
                return f172356h;
            }
            bxxk bxxk = f172357i;
            if (bxxk == null) {
                synchronized (caaq.class) {
                    bxxk = f172357i;
                    if (bxxk == null) {
                        bxxk = new bxve(f172356h);
                        f172357i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
