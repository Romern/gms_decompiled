package p000;

/* renamed from: bvpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvpe f157273c;

    /* renamed from: e */
    private static volatile bxxk f157274e;

    /* renamed from: a */
    public int f157275a;

    /* renamed from: b */
    public int f157276b;

    /* renamed from: d */
    private int f157277d;

    static {
        bvpe bvpe = new bvpe();
        f157273c = bvpe;
        bxvk.m124024a(bvpe.class, bvpe);
    }

    private bvpe() {
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
            return bxvk.m124022a(f157273c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bvpe();
        } else {
            if (i2 == 4) {
                return new bxvd(f157273c);
            }
            if (i2 == 5) {
                return f157273c;
            }
            bxxk bxxk = f157274e;
            if (bxxk == null) {
                synchronized (bvpe.class) {
                    bxxk = f157274e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157273c);
                        f157274e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
