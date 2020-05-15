package p000;

/* renamed from: caje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caje extends bxvk implements bxxd {

    /* renamed from: d */
    public static final caje f174809d;

    /* renamed from: e */
    private static volatile bxxk f174810e;

    /* renamed from: a */
    public int f174811a;

    /* renamed from: b */
    public int f174812b;

    /* renamed from: c */
    public int f174813c;

    static {
        caje caje = new caje();
        f174809d = caje;
        bxvk.m124024a(caje.class, caje);
    }

    private caje() {
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
            return bxvk.m124022a(f174809d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", cajd.f174808a, "c"});
        } else if (i2 == 3) {
            return new caje();
        } else {
            if (i2 == 4) {
                return new bxvd(f174809d);
            }
            if (i2 == 5) {
                return f174809d;
            }
            bxxk bxxk = f174810e;
            if (bxxk == null) {
                synchronized (caje.class) {
                    bxxk = f174810e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174809d);
                        f174810e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
