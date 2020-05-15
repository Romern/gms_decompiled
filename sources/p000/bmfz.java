package p000;

/* renamed from: bmfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmfz f129202d;

    /* renamed from: f */
    private static volatile bxxk f129203f;

    /* renamed from: a */
    public String f129204a = "";

    /* renamed from: b */
    public int f129205b;

    /* renamed from: c */
    public String f129206c = "";

    /* renamed from: e */
    private int f129207e;

    static {
        bmfz bmfz = new bmfz();
        f129202d = bmfz;
        bxvk.m124024a(bmfz.class, bmfz);
    }

    private bmfz() {
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
            return bxvk.m124022a(f129202d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001\u0004ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bmfz();
        } else {
            if (i2 == 4) {
                return new bxvd(f129202d);
            }
            if (i2 == 5) {
                return f129202d;
            }
            bxxk bxxk = f129203f;
            if (bxxk == null) {
                synchronized (bmfz.class) {
                    bxxk = f129203f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129202d);
                        f129203f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
