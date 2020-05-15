package p000;

/* renamed from: dmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmf extends bxvk implements bxxd {

    /* renamed from: h */
    public static final dmf f13508h;

    /* renamed from: i */
    private static volatile bxxk f13509i;

    /* renamed from: a */
    public int f13510a;

    /* renamed from: b */
    public String f13511b = "";

    /* renamed from: c */
    public String f13512c = "";

    /* renamed from: d */
    public String f13513d = "";

    /* renamed from: e */
    public int f13514e;

    /* renamed from: f */
    public boolean f13515f;

    /* renamed from: g */
    public int f13516g;

    static {
        dmf dmf = new dmf();
        f13508h = dmf;
        bxvk.m124024a(dmf.class, dmf);
    }

    private dmf() {
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
            return bxvk.m124022a(f13508h, "\u0001\u0006\u0000\u0001\u0001d\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004dင\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new dmf();
        } else {
            if (i2 == 4) {
                return new bxvd(f13508h);
            }
            if (i2 == 5) {
                return f13508h;
            }
            bxxk bxxk = f13509i;
            if (bxxk == null) {
                synchronized (dmf.class) {
                    bxxk = f13509i;
                    if (bxxk == null) {
                        bxxk = new bxve(f13508h);
                        f13509i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
