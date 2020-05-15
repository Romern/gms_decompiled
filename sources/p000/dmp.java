package p000;

/* renamed from: dmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final dmp f13579f;

    /* renamed from: g */
    private static volatile bxxk f13580g;

    /* renamed from: a */
    public int f13581a;

    /* renamed from: b */
    public String f13582b = "";

    /* renamed from: c */
    public String f13583c = "";

    /* renamed from: d */
    public boolean f13584d;

    /* renamed from: e */
    public int f13585e;

    static {
        dmp dmp = new dmp();
        f13579f = dmp;
        bxvk.m124024a(dmp.class, dmp);
    }

    private dmp() {
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
            return bxvk.m124022a(f13579f, "\u0001\u0004\u0000\u0001\u0001d\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002dင\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new dmp();
        } else {
            if (i2 == 4) {
                return new bxvd(f13579f);
            }
            if (i2 == 5) {
                return f13579f;
            }
            bxxk bxxk = f13580g;
            if (bxxk == null) {
                synchronized (dmp.class) {
                    bxxk = f13580g;
                    if (bxxk == null) {
                        bxxk = new bxve(f13579f);
                        f13580g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
