package p000;

/* renamed from: bwkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f159977c = new bwkj();

    /* renamed from: d */
    public static final bwkk f159978d;

    /* renamed from: f */
    private static volatile bxxk f159979f;

    /* renamed from: a */
    public int f159980a;

    /* renamed from: b */
    public bxvt f159981b = bxvm.f164965b;

    /* renamed from: e */
    private int f159982e;

    static {
        bwkk bwkk = new bwkk();
        f159978d = bwkk;
        bxvk.m124024a(bwkk.class, bwkk);
    }

    private bwkk() {
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
            return bxvk.m124022a(f159978d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"e", "a", blwh.f127944a, "b", bmfk.m107977b()});
        } else if (i2 == 3) {
            return new bwkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f159978d);
            }
            if (i2 == 5) {
                return f159978d;
            }
            bxxk bxxk = f159979f;
            if (bxxk == null) {
                synchronized (bwkk.class) {
                    bxxk = f159979f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159978d);
                        f159979f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
