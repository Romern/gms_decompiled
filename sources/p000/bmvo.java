package p000;

/* renamed from: bmvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvo f131073d;

    /* renamed from: e */
    private static volatile bxxk f131074e;

    /* renamed from: a */
    public int f131075a;

    /* renamed from: b */
    public String f131076b = "";

    /* renamed from: c */
    public String f131077c = "";

    static {
        bmvo bmvo = new bmvo();
        f131073d = bmvo;
        bxvk.m124024a(bmvo.class, bmvo);
    }

    private bmvo() {
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
            return bxvk.m124022a(f131073d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvo();
        } else {
            if (i2 == 4) {
                return new bxvd(f131073d);
            }
            if (i2 == 5) {
                return f131073d;
            }
            bxxk bxxk = f131074e;
            if (bxxk == null) {
                synchronized (bmvo.class) {
                    bxxk = f131074e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131073d);
                        f131074e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
