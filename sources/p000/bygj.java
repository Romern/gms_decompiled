package p000;

/* renamed from: bygj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygj extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bygj f166319g;

    /* renamed from: h */
    private static volatile bxxk f166320h;

    /* renamed from: a */
    public int f166321a;

    /* renamed from: b */
    public String f166322b = "";

    /* renamed from: c */
    public String f166323c = "";

    /* renamed from: d */
    public long f166324d = -1;

    /* renamed from: e */
    public long f166325e = -1;

    /* renamed from: f */
    public String f166326f = "";

    static {
        bygj bygj = new bygj();
        f166319g = bygj;
        bxvk.m124024a(bygj.class, bygj);
    }

    private bygj() {
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
            return bxvk.m124022a(f166319g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bygj();
        } else {
            if (i2 == 4) {
                return new bxvd(f166319g);
            }
            if (i2 == 5) {
                return f166319g;
            }
            bxxk bxxk = f166320h;
            if (bxxk == null) {
                synchronized (bygj.class) {
                    bxxk = f166320h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166319g);
                        f166320h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
