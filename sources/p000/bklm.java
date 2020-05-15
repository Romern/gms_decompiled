package p000;

/* renamed from: bklm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklm extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bklm f124800g;

    /* renamed from: i */
    private static volatile bxxk f124801i;

    /* renamed from: a */
    public String f124802a = "";

    /* renamed from: b */
    public String f124803b = "";

    /* renamed from: c */
    public String f124804c = "";

    /* renamed from: d */
    public String f124805d = "";

    /* renamed from: e */
    public String f124806e = "";

    /* renamed from: f */
    public String f124807f = "";

    /* renamed from: h */
    private int f124808h;

    static {
        bklm bklm = new bklm();
        f124800g = bklm;
        bxvk.m124024a(bklm.class, bklm);
    }

    private bklm() {
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
            return bxvk.m124022a(f124800g, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\tဈ\u0007", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bklm();
        } else {
            if (i2 == 4) {
                return new bxvd(f124800g);
            }
            if (i2 == 5) {
                return f124800g;
            }
            bxxk bxxk = f124801i;
            if (bxxk == null) {
                synchronized (bklm.class) {
                    bxxk = f124801i;
                    if (bxxk == null) {
                        bxxk = new bxve(f124800g);
                        f124801i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
