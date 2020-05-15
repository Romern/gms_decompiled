package p000;

/* renamed from: quo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final quo f42179d;

    /* renamed from: e */
    private static volatile bxxk f42180e;

    /* renamed from: a */
    public int f42181a;

    /* renamed from: b */
    public String f42182b = "";

    /* renamed from: c */
    public String f42183c = "";

    static {
        quo quo = new quo();
        f42179d = quo;
        bxvk.m124024a(quo.class, quo);
    }

    private quo() {
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
            return bxvk.m124022a(f42179d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new quo();
        } else {
            if (i2 == 4) {
                return new bxvd(f42179d);
            }
            if (i2 == 5) {
                return f42179d;
            }
            bxxk bxxk = f42180e;
            if (bxxk == null) {
                synchronized (quo.class) {
                    bxxk = f42180e;
                    if (bxxk == null) {
                        bxxk = new bxve(f42179d);
                        f42180e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
