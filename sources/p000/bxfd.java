package p000;

/* renamed from: bxfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxfd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bxfd f163162g;

    /* renamed from: i */
    private static volatile bxxk f163163i;

    /* renamed from: a */
    public int f163164a;

    /* renamed from: b */
    public float f163165b;

    /* renamed from: c */
    public float f163166c;

    /* renamed from: d */
    public int f163167d;

    /* renamed from: e */
    public int f163168e;

    /* renamed from: f */
    public int f163169f;

    /* renamed from: h */
    private int f163170h;

    static {
        bxfd bxfd = new bxfd();
        f163162g = bxfd;
        bxvk.m124024a(bxfd.class, bxfd);
    }

    private bxfd() {
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
            return bxvk.m124022a(f163162g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"h", "a", bxfb.f163161a, "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bxfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f163162g);
            }
            if (i2 == 5) {
                return f163162g;
            }
            bxxk bxxk = f163163i;
            if (bxxk == null) {
                synchronized (bxfd.class) {
                    bxxk = f163163i;
                    if (bxxk == null) {
                        bxxk = new bxve(f163162g);
                        f163163i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
