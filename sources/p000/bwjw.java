package p000;

/* renamed from: bwjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwjw f159882e;

    /* renamed from: f */
    private static volatile bxxk f159883f;

    /* renamed from: a */
    public int f159884a;

    /* renamed from: b */
    public bmaj f159885b;

    /* renamed from: c */
    public bxtx f159886c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f159887d = bxtx.f164797b;

    static {
        bwjw bwjw = new bwjw();
        f159882e = bwjw;
        bxvk.m124024a(bwjw.class, bwjw);
    }

    private bwjw() {
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
            return bxvk.m124022a(f159882e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ည\u0001\u0004ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f159882e);
            }
            if (i2 == 5) {
                return f159882e;
            }
            bxxk bxxk = f159883f;
            if (bxxk == null) {
                synchronized (bwjw.class) {
                    bxxk = f159883f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159882e);
                        f159883f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
