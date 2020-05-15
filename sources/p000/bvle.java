package p000;

/* renamed from: bvle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvle extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bvle f156515h;

    /* renamed from: i */
    private static volatile bxxk f156516i;

    /* renamed from: a */
    public int f156517a;

    /* renamed from: b */
    public bvov f156518b;

    /* renamed from: c */
    public bvla f156519c;

    /* renamed from: d */
    public bvme f156520d;

    /* renamed from: e */
    public String f156521e = "";

    /* renamed from: f */
    public int f156522f;

    /* renamed from: g */
    public boolean f156523g;

    static {
        bvle bvle = new bvle();
        f156515h = bvle;
        bxvk.m124024a(bvle.class, bvle);
    }

    private bvle() {
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
            return bxvk.m124022a(f156515h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvle();
        } else {
            if (i2 == 4) {
                return new bxvd(f156515h);
            }
            if (i2 == 5) {
                return f156515h;
            }
            bxxk bxxk = f156516i;
            if (bxxk == null) {
                synchronized (bvle.class) {
                    bxxk = f156516i;
                    if (bxxk == null) {
                        bxxk = new bxve(f156515h);
                        f156516i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
