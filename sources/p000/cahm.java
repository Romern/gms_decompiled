package p000;

/* renamed from: cahm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahm extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cahm f174562f;

    /* renamed from: g */
    private static volatile bxxk f174563g;

    /* renamed from: a */
    public int f174564a;

    /* renamed from: b */
    public int f174565b;

    /* renamed from: c */
    public String f174566c = "";

    /* renamed from: d */
    public long f174567d;

    /* renamed from: e */
    public long f174568e;

    static {
        cahm cahm = new cahm();
        f174562f = cahm;
        bxvk.m124024a(cahm.class, cahm);
    }

    private cahm() {
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
            return bxvk.m124022a(f174562f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cahm();
        } else {
            if (i2 == 4) {
                return new bxvd(f174562f);
            }
            if (i2 == 5) {
                return f174562f;
            }
            bxxk bxxk = f174563g;
            if (bxxk == null) {
                synchronized (cahm.class) {
                    bxxk = f174563g;
                    if (bxxk == null) {
                        bxxk = new bxve(f174562f);
                        f174563g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
