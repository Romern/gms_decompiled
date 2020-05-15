package p000;

/* renamed from: dmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dmd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final dmd f13495g;

    /* renamed from: h */
    private static volatile bxxk f13496h;

    /* renamed from: a */
    public int f13497a;

    /* renamed from: b */
    public String f13498b = "";

    /* renamed from: c */
    public String f13499c = "";

    /* renamed from: d */
    public String f13500d = "";

    /* renamed from: e */
    public boolean f13501e;

    /* renamed from: f */
    public int f13502f;

    static {
        dmd dmd = new dmd();
        f13495g = dmd;
        bxvk.m124024a(dmd.class, dmd);
    }

    private dmd() {
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
            return bxvk.m124022a(f13495g, "\u0001\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u001eင\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new dmd();
        } else {
            if (i2 == 4) {
                return new bxvd(f13495g);
            }
            if (i2 == 5) {
                return f13495g;
            }
            bxxk bxxk = f13496h;
            if (bxxk == null) {
                synchronized (dmd.class) {
                    bxxk = f13496h;
                    if (bxxk == null) {
                        bxxk = new bxve(f13495g);
                        f13496h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
