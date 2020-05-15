package p000;

/* renamed from: bzpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpp extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bzpp f170939h;

    /* renamed from: i */
    private static volatile bxxk f170940i;

    /* renamed from: a */
    public int f170941a;

    /* renamed from: b */
    public int f170942b = 0;

    /* renamed from: c */
    public Object f170943c;

    /* renamed from: d */
    public String f170944d = "";

    /* renamed from: e */
    public bxyk f170945e;

    /* renamed from: f */
    public int f170946f;

    /* renamed from: g */
    public bzpm f170947g;

    static {
        bzpp bzpp = new bzpp();
        f170939h = bzpp;
        bxvk.m124024a(bzpp.class, bzpp);
    }

    private bzpp() {
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
            return bxvk.m124022a(f170939h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ျ\u0000\u0004ြ\u0000\u0005ဌ\u0004\u0006ဉ\u0005", new Object[]{"c", "b", "a", "d", "e", bzpl.class, "f", bzpo.f170938a, "g"});
        } else if (i2 == 3) {
            return new bzpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f170939h);
            }
            if (i2 == 5) {
                return f170939h;
            }
            bxxk bxxk = f170940i;
            if (bxxk == null) {
                synchronized (bzpp.class) {
                    bxxk = f170940i;
                    if (bxxk == null) {
                        bxxk = new bxve(f170939h);
                        f170940i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
