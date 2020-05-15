package p000;

/* renamed from: cacl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cacl f172570g;

    /* renamed from: h */
    private static volatile bxxk f172571h;

    /* renamed from: a */
    public int f172572a;

    /* renamed from: b */
    public int f172573b = 0;

    /* renamed from: c */
    public Object f172574c;

    /* renamed from: d */
    public String f172575d = "";

    /* renamed from: e */
    public long f172576e;

    /* renamed from: f */
    public cadz f172577f;

    static {
        cacl cacl = new cacl();
        f172570g = cacl;
        bxvk.m124024a(cacl.class, cacl);
    }

    private cacl() {
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
            return bxvk.m124022a(f172570g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဉ\u0004", new Object[]{"c", "b", "a", cadz.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new cacl();
        } else {
            if (i2 == 4) {
                return new bxvd(f172570g);
            }
            if (i2 == 5) {
                return f172570g;
            }
            bxxk bxxk = f172571h;
            if (bxxk == null) {
                synchronized (cacl.class) {
                    bxxk = f172571h;
                    if (bxxk == null) {
                        bxxk = new bxve(f172570g);
                        f172571h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
