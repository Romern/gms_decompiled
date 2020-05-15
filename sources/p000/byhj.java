package p000;

/* renamed from: byhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byhj f166458h;

    /* renamed from: i */
    private static volatile bxxk f166459i;

    /* renamed from: a */
    public int f166460a;

    /* renamed from: b */
    public long f166461b;

    /* renamed from: c */
    public long f166462c = -1;

    /* renamed from: d */
    public bxtx f166463d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f166464e = bxtx.f164797b;

    /* renamed from: f */
    public bxtx f166465f = bxtx.f164797b;

    /* renamed from: g */
    public byhh f166466g;

    static {
        byhj byhj = new byhj();
        f166458h = byhj;
        bxvk.m124024a(byhj.class, byhj);
    }

    private byhj() {
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
            return bxvk.m124022a(f166458h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new byhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f166458h);
            }
            if (i2 == 5) {
                return f166458h;
            }
            bxxk bxxk = f166459i;
            if (bxxk == null) {
                synchronized (byhj.class) {
                    bxxk = f166459i;
                    if (bxxk == null) {
                        bxxk = new bxve(f166458h);
                        f166459i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
