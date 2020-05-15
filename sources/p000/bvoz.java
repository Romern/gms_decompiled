package p000;

/* renamed from: bvoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvoz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvoz f157244g;

    /* renamed from: h */
    private static volatile bxxk f157245h;

    /* renamed from: a */
    public int f157246a;

    /* renamed from: b */
    public bvov f157247b;

    /* renamed from: c */
    public bvmw f157248c;

    /* renamed from: d */
    public bvme f157249d;

    /* renamed from: e */
    public String f157250e = "";

    /* renamed from: f */
    public int f157251f;

    static {
        bvoz bvoz = new bvoz();
        f157244g = bvoz;
        bxvk.m124024a(bvoz.class, bvoz);
    }

    private bvoz() {
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
            return bxvk.m124022a(f157244g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvoz();
        } else {
            if (i2 == 4) {
                return new bxvd(f157244g);
            }
            if (i2 == 5) {
                return f157244g;
            }
            bxxk bxxk = f157245h;
            if (bxxk == null) {
                synchronized (bvoz.class) {
                    bxxk = f157245h;
                    if (bxxk == null) {
                        bxxk = new bxve(f157244g);
                        f157245h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
