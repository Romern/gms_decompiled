package p000;

/* renamed from: bucx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bucx f153418d;

    /* renamed from: e */
    private static volatile bxxk f153419e;

    /* renamed from: a */
    public int f153420a;

    /* renamed from: b */
    public boolean f153421b = true;

    /* renamed from: c */
    public long f153422c = 8000;

    static {
        bucx bucx = new bucx();
        f153418d = bucx;
        bxvk.m124024a(bucx.class, bucx);
    }

    private bucx() {
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
            return bxvk.m124022a(f153418d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bucx();
        } else {
            if (i2 == 4) {
                return new bxvd(f153418d);
            }
            if (i2 == 5) {
                return f153418d;
            }
            bxxk bxxk = f153419e;
            if (bxxk == null) {
                synchronized (bucx.class) {
                    bxxk = f153419e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153418d);
                        f153419e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
