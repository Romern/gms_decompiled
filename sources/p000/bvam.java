package p000;

/* renamed from: bvam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvam extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvam f155493c;

    /* renamed from: d */
    private static volatile bxxk f155494d;

    /* renamed from: a */
    public int f155495a;

    /* renamed from: b */
    public bvaa f155496b;

    static {
        bvam bvam = new bvam();
        f155493c = bvam;
        bxvk.m124024a(bvam.class, bvam);
    }

    private bvam() {
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
            return bxvk.m124022a(f155493c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvam();
        } else {
            if (i2 == 4) {
                return new bxvd(f155493c);
            }
            if (i2 == 5) {
                return f155493c;
            }
            bxxk bxxk = f155494d;
            if (bxxk == null) {
                synchronized (bvam.class) {
                    bxxk = f155494d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155493c);
                        f155494d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
