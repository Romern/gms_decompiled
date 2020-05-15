package p000;

/* renamed from: bmoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmoc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmoc f130208e;

    /* renamed from: f */
    private static volatile bxxk f130209f;

    /* renamed from: a */
    public int f130210a;

    /* renamed from: b */
    public bmno f130211b;

    /* renamed from: c */
    public bmon f130212c;

    /* renamed from: d */
    public bmno f130213d;

    static {
        bmoc bmoc = new bmoc();
        f130208e = bmoc;
        bxvk.m124024a(bmoc.class, bmoc);
    }

    private bmoc() {
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
            return bxvk.m124022a(f130208e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmoc();
        } else {
            if (i2 == 4) {
                return new bxvd(f130208e);
            }
            if (i2 == 5) {
                return f130208e;
            }
            bxxk bxxk = f130209f;
            if (bxxk == null) {
                synchronized (bmoc.class) {
                    bxxk = f130209f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130208e);
                        f130209f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
