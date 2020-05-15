package p000;

/* renamed from: ammk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ammk f75296c;

    /* renamed from: d */
    private static volatile bxxk f75297d;

    /* renamed from: a */
    public int f75298a;

    /* renamed from: b */
    public String f75299b = "";

    static {
        ammk ammk = new ammk();
        f75296c = ammk;
        bxvk.m124024a(ammk.class, ammk);
    }

    private ammk() {
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
            return bxvk.m124022a(f75296c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ammk();
        } else {
            if (i2 == 4) {
                return new bxvd(f75296c);
            }
            if (i2 == 5) {
                return f75296c;
            }
            bxxk bxxk = f75297d;
            if (bxxk == null) {
                synchronized (ammk.class) {
                    bxxk = f75297d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75296c);
                        f75297d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
