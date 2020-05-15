package p000;

/* renamed from: bmrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmrj f130504d;

    /* renamed from: e */
    private static volatile bxxk f130505e;

    /* renamed from: a */
    public int f130506a;

    /* renamed from: b */
    public bmaj f130507b;

    /* renamed from: c */
    public bxtx f130508c = bxtx.f164797b;

    static {
        bmrj bmrj = new bmrj();
        f130504d = bmrj;
        bxvk.m124024a(bmrj.class, bmrj);
    }

    private bmrj() {
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
            return bxvk.m124022a(f130504d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f130504d);
            }
            if (i2 == 5) {
                return f130504d;
            }
            bxxk bxxk = f130505e;
            if (bxxk == null) {
                synchronized (bmrj.class) {
                    bxxk = f130505e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130504d);
                        f130505e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
