package p000;

/* renamed from: vvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvw extends bxvk implements bxxd {

    /* renamed from: j */
    public static final vvw f50079j;

    /* renamed from: l */
    private static volatile bxxk f50080l;

    /* renamed from: a */
    public int f50081a;

    /* renamed from: b */
    public bxtx f50082b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f50083c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f50084d = bxtx.f164797b;

    /* renamed from: e */
    public int f50085e;

    /* renamed from: f */
    public boolean f50086f;

    /* renamed from: g */
    public int f50087g;

    /* renamed from: h */
    public int f50088h;

    /* renamed from: i */
    public bxtx f50089i = bxtx.f164797b;

    /* renamed from: k */
    private String f50090k = "";

    static {
        vvw vvw = new vvw();
        f50079j = vvw;
        bxvk.m124024a(vvw.class, vvw);
    }

    private vvw() {
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
            return bxvk.m124022a(f50079j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဋ\u0004\u0005ည\u0003\u0006ဇ\u0005\u0007ဋ\u0006\bဋ\u0007\tည\b", new Object[]{"a", "b", "k", "c", "e", "d", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new vvw();
        } else {
            if (i2 == 4) {
                return new bxvd(f50079j);
            }
            if (i2 == 5) {
                return f50079j;
            }
            bxxk bxxk = f50080l;
            if (bxxk == null) {
                synchronized (vvw.class) {
                    bxxk = f50080l;
                    if (bxxk == null) {
                        bxxk = new bxve(f50079j);
                        f50080l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
