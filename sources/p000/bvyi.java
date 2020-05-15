package p000;

/* renamed from: bvyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyi extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvyi f158166g;

    /* renamed from: h */
    private static volatile bxxk f158167h;

    /* renamed from: a */
    public int f158168a;

    /* renamed from: b */
    public int f158169b;

    /* renamed from: c */
    public bvwb f158170c;

    /* renamed from: d */
    public long f158171d;

    /* renamed from: e */
    public bvvt f158172e;

    /* renamed from: f */
    public long f158173f;

    static {
        bvyi bvyi = new bvyi();
        f158166g = bvyi;
        bxvk.m124024a(bvyi.class, bvyi);
    }

    private bvyi() {
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
            return bxvk.m124022a(f158166g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0001\u0004ဂ\u0002\u0005ဉ\u0003\u0006ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bvyi();
        } else {
            if (i2 == 4) {
                return new bxvd(f158166g);
            }
            if (i2 == 5) {
                return f158166g;
            }
            bxxk bxxk = f158167h;
            if (bxxk == null) {
                synchronized (bvyi.class) {
                    bxxk = f158167h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158166g);
                        f158167h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
