package p000;

/* renamed from: bzgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzgl f169943d;

    /* renamed from: e */
    private static volatile bxxk f169944e;

    /* renamed from: a */
    public int f169945a;

    /* renamed from: b */
    public String f169946b = "";

    /* renamed from: c */
    public String f169947c = "";

    static {
        bzgl bzgl = new bzgl();
        f169943d = bzgl;
        bxvk.m124024a(bzgl.class, bzgl);
    }

    private bzgl() {
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
            return bxvk.m124022a(f169943d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzgl();
        } else {
            if (i2 == 4) {
                return new bxvd(f169943d);
            }
            if (i2 == 5) {
                return f169943d;
            }
            bxxk bxxk = f169944e;
            if (bxxk == null) {
                synchronized (bzgl.class) {
                    bxxk = f169944e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169943d);
                        f169944e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
