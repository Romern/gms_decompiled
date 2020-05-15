package p000;

/* renamed from: bmum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmum extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmum f130943d;

    /* renamed from: e */
    private static volatile bxxk f130944e;

    /* renamed from: a */
    public int f130945a;

    /* renamed from: b */
    public bmuj f130946b;

    /* renamed from: c */
    public int f130947c;

    static {
        bmum bmum = new bmum();
        f130943d = bmum;
        bxvk.m124024a(bmum.class, bmum);
    }

    private bmum() {
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
            return bxvk.m124022a(f130943d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bmuk.f130942a});
        } else if (i2 == 3) {
            return new bmum();
        } else {
            if (i2 == 4) {
                return new bxvd(f130943d);
            }
            if (i2 == 5) {
                return f130943d;
            }
            bxxk bxxk = f130944e;
            if (bxxk == null) {
                synchronized (bmum.class) {
                    bxxk = f130944e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130943d);
                        f130944e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
