package p000;

/* renamed from: cacc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cacc f172510d;

    /* renamed from: f */
    private static volatile bxxk f172511f;

    /* renamed from: a */
    public int f172512a;

    /* renamed from: b */
    public String f172513b = "";

    /* renamed from: c */
    public cack f172514c;

    /* renamed from: e */
    private byte f172515e = 2;

    static {
        cacc cacc = new cacc();
        f172510d = cacc;
        bxvk.m124024a(cacc.class, cacc);
    }

    private cacc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172515e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172515e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f172510d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cacc();
        } else {
            if (i2 == 4) {
                return new bxvd(f172510d);
            }
            if (i2 == 5) {
                return f172510d;
            }
            bxxk bxxk = f172511f;
            if (bxxk == null) {
                synchronized (cacc.class) {
                    bxxk = f172511f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172510d);
                        f172511f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
