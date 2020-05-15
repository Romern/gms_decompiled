package p000;

/* renamed from: cejl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cejl f182782d;

    /* renamed from: f */
    private static volatile bxxk f182783f;

    /* renamed from: a */
    public int f182784a = 0;

    /* renamed from: b */
    public Object f182785b;

    /* renamed from: c */
    public String f182786c = "";

    /* renamed from: e */
    private int f182787e;

    static {
        cejl cejl = new cejl();
        f182782d = cejl;
        bxvk.m124024a(cejl.class, cejl);
    }

    private cejl() {
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
            return bxvk.m124022a(f182782d, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ွ\u0000\u0004့\u0000\u0005ဵ\u0000\u0006်\u0000\u0007ဳ\u0000", new Object[]{"b", "a", "e", "c"});
        } else if (i2 == 3) {
            return new cejl();
        } else {
            if (i2 == 4) {
                return new bxvd(f182782d);
            }
            if (i2 == 5) {
                return f182782d;
            }
            bxxk bxxk = f182783f;
            if (bxxk == null) {
                synchronized (cejl.class) {
                    bxxk = f182783f;
                    if (bxxk == null) {
                        bxxk = new bxve(f182782d);
                        f182783f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
