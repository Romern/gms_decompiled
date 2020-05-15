package p000;

/* renamed from: bmmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmmt f130044c;

    /* renamed from: e */
    private static volatile bxxk f130045e;

    /* renamed from: a */
    public String f130046a = "";

    /* renamed from: b */
    public int f130047b;

    /* renamed from: d */
    private int f130048d;

    static {
        bmmt bmmt = new bmmt();
        f130044c = bmmt;
        bxvk.m124024a(bmmt.class, bmmt);
    }

    private bmmt() {
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
            return bxvk.m124022a(f130044c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bmmr.f130043a});
        } else if (i2 == 3) {
            return new bmmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f130044c);
            }
            if (i2 == 5) {
                return f130044c;
            }
            bxxk bxxk = f130045e;
            if (bxxk == null) {
                synchronized (bmmt.class) {
                    bxxk = f130045e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130044c);
                        f130045e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
