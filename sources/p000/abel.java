package p000;

/* renamed from: abel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abel extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abel f57249e;

    /* renamed from: f */
    private static volatile bxxk f57250f;

    /* renamed from: a */
    public int f57251a;

    /* renamed from: b */
    public String f57252b = "";

    /* renamed from: c */
    public String f57253c = "";

    /* renamed from: d */
    public String f57254d = "";

    static {
        abel abel = new abel();
        f57249e = abel;
        bxvk.m124024a(abel.class, abel);
    }

    private abel() {
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
            return bxvk.m124022a(f57249e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abel();
        } else {
            if (i2 == 4) {
                return new bxvd(f57249e);
            }
            if (i2 == 5) {
                return f57249e;
            }
            bxxk bxxk = f57250f;
            if (bxxk == null) {
                synchronized (abel.class) {
                    bxxk = f57250f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57249e);
                        f57250f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
