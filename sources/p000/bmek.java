package p000;

/* renamed from: bmek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmek extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmek f128952d;

    /* renamed from: e */
    private static volatile bxxk f128953e;

    /* renamed from: a */
    public int f128954a;

    /* renamed from: b */
    public String f128955b = "";

    /* renamed from: c */
    public String f128956c = "";

    static {
        bmek bmek = new bmek();
        f128952d = bmek;
        bxvk.m124024a(bmek.class, bmek);
    }

    private bmek() {
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
            return bxvk.m124022a(f128952d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmek();
        } else {
            if (i2 == 4) {
                return new bxvd(f128952d);
            }
            if (i2 == 5) {
                return f128952d;
            }
            bxxk bxxk = f128953e;
            if (bxxk == null) {
                synchronized (bmek.class) {
                    bxxk = f128953e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128952d);
                        f128953e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
