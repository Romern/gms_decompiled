package p000;

/* renamed from: blci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blci extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blci f125923f;

    /* renamed from: h */
    private static volatile bxxk f125924h;

    /* renamed from: a */
    public int f125925a;

    /* renamed from: b */
    public String f125926b = "";

    /* renamed from: c */
    public String f125927c = "";

    /* renamed from: d */
    public blde f125928d;

    /* renamed from: e */
    public long f125929e;

    /* renamed from: g */
    private byte f125930g = 2;

    static {
        blci blci = new blci();
        f125923f = blci;
        bxvk.m124024a(blci.class, blci);
    }

    private blci() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125930g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125930g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f125923f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0004ᐉ\u0002\tဃ\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blci();
        } else {
            if (i2 == 4) {
                return new bxvd(f125923f);
            }
            if (i2 == 5) {
                return f125923f;
            }
            bxxk bxxk = f125924h;
            if (bxxk == null) {
                synchronized (blci.class) {
                    bxxk = f125924h;
                    if (bxxk == null) {
                        bxxk = new bxve(f125923f);
                        f125924h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
