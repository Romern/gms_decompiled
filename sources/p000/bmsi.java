package p000;

/* renamed from: bmsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmsi f130680e;

    /* renamed from: f */
    private static volatile bxxk f130681f;

    /* renamed from: a */
    public int f130682a;

    /* renamed from: b */
    public int f130683b = 0;

    /* renamed from: c */
    public Object f130684c;

    /* renamed from: d */
    public bmaj f130685d;

    static {
        bmsi bmsi = new bmsi();
        f130680e = bmsi;
        bxvk.m124024a(bmsi.class, bmsi);
    }

    private bmsi() {
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
            return bxvk.m124022a(f130680e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ွ\u0000\u0004ွ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new bmsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f130680e);
            }
            if (i2 == 5) {
                return f130680e;
            }
            bxxk bxxk = f130681f;
            if (bxxk == null) {
                synchronized (bmsi.class) {
                    bxxk = f130681f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130680e);
                        f130681f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
