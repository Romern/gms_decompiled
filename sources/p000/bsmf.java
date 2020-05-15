package p000;

/* renamed from: bsmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsmf f145008e;

    /* renamed from: g */
    private static volatile bxxk f145009g;

    /* renamed from: a */
    public int f145010a = 0;

    /* renamed from: b */
    public Object f145011b;

    /* renamed from: c */
    public String f145012c = "";

    /* renamed from: d */
    public boolean f145013d;

    /* renamed from: f */
    private int f145014f;

    static {
        bsmf bsmf = new bsmf();
        f145008e = bsmf;
        bxvk.m124024a(bsmf.class, bsmf);
    }

    private bsmf() {
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
            return bxvk.m124022a(f145008e, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", "f", "c", "d", bslv.class, bsmb.class, bsma.class, bslx.class, bsme.class, bsmc.class, bsmd.class, bslw.class, bsly.class});
        } else if (i2 == 3) {
            return new bsmf();
        } else {
            if (i2 == 4) {
                return new bxvd(f145008e);
            }
            if (i2 == 5) {
                return f145008e;
            }
            bxxk bxxk = f145009g;
            if (bxxk == null) {
                synchronized (bsmf.class) {
                    bxxk = f145009g;
                    if (bxxk == null) {
                        bxxk = new bxve(f145008e);
                        f145009g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
