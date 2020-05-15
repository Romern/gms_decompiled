package p000;

/* renamed from: agnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final agnj f66072d;

    /* renamed from: e */
    private static volatile bxxk f66073e;

    /* renamed from: a */
    public int f66074a;

    /* renamed from: b */
    public String f66075b = "";

    /* renamed from: c */
    public long f66076c;

    static {
        agnj agnj = new agnj();
        f66072d = agnj;
        bxvk.m124024a(agnj.class, agnj);
    }

    private agnj() {
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
            return bxvk.m124022a(f66072d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new agnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f66072d);
            }
            if (i2 == 5) {
                return f66072d;
            }
            bxxk bxxk = f66073e;
            if (bxxk == null) {
                synchronized (agnj.class) {
                    bxxk = f66073e;
                    if (bxxk == null) {
                        bxxk = new bxve(f66072d);
                        f66073e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
