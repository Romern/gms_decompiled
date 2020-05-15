package p000;

/* renamed from: bvhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvhk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvhk f156080d;

    /* renamed from: e */
    private static volatile bxxk f156081e;

    /* renamed from: a */
    public int f156082a;

    /* renamed from: b */
    public bvhl f156083b;

    /* renamed from: c */
    public bvhm f156084c;

    static {
        bvhk bvhk = new bvhk();
        f156080d = bvhk;
        bxvk.m124024a(bvhk.class, bvhk);
    }

    private bvhk() {
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
            return bxvk.m124022a(f156080d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f156080d);
            }
            if (i2 == 5) {
                return f156080d;
            }
            bxxk bxxk = f156081e;
            if (bxxk == null) {
                synchronized (bvhk.class) {
                    bxxk = f156081e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156080d);
                        f156081e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
