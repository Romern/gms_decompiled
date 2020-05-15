package p000;

/* renamed from: bmqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmqu f130430f;

    /* renamed from: g */
    private static volatile bxxk f130431g;

    /* renamed from: a */
    public int f130432a;

    /* renamed from: b */
    public int f130433b;

    /* renamed from: c */
    public String f130434c = "";

    /* renamed from: d */
    public int f130435d;

    /* renamed from: e */
    public bxtx f130436e = bxtx.f164797b;

    static {
        bmqu bmqu = new bmqu();
        f130430f = bmqu;
        bxvk.m124024a(bmqu.class, bmqu);
    }

    private bmqu() {
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
            return bxvk.m124022a(f130430f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001\u0005င\u0002\u0007ည\u0003", new Object[]{"a", "b", bmey.m107963b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f130430f);
            }
            if (i2 == 5) {
                return f130430f;
            }
            bxxk bxxk = f130431g;
            if (bxxk == null) {
                synchronized (bmqu.class) {
                    bxxk = f130431g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130430f);
                        f130431g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
