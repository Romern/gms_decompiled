package p000;

/* renamed from: bvkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvkh f156412b;

    /* renamed from: c */
    private static volatile bxxk f156413c;

    /* renamed from: a */
    public bxtx f156414a = bxtx.f164797b;

    static {
        bvkh bvkh = new bvkh();
        f156412b = bvkh;
        bxvk.m124024a(bvkh.class, bvkh);
    }

    private bvkh() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f156412b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bvkh();
        } else {
            if (i2 == 4) {
                return new bxvd(f156412b);
            }
            if (i2 == 5) {
                return f156412b;
            }
            bxxk bxxk = f156413c;
            if (bxxk == null) {
                synchronized (bvkh.class) {
                    bxxk = f156413c;
                    if (bxxk == null) {
                        bxxk = new bxve(f156412b);
                        f156413c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
