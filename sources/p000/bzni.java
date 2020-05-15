package p000;

/* renamed from: bzni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzni extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzni f170710d;

    /* renamed from: f */
    private static volatile bxxk f170711f;

    /* renamed from: a */
    public int f170712a;

    /* renamed from: b */
    public bxwc f170713b = bxxn.f165040b;

    /* renamed from: c */
    public bzmb f170714c;

    /* renamed from: e */
    private int f170715e;

    static {
        bzni bzni = new bzni();
        f170710d = bzni;
        bxvk.m124024a(bzni.class, bzni);
    }

    private bzni() {
        bxxn bxxn = bxxn.f165040b;
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f170710d, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0000\u0001ဌ\u0001\u0003\u001b\u0007ဉ\u0002", new Object[]{"e", "a", bzng.f170709a, "b", bzlx.class, "c"});
        } else if (i2 == 3) {
            return new bzni();
        } else {
            if (i2 == 4) {
                return new bxvd(f170710d);
            }
            if (i2 == 5) {
                return f170710d;
            }
            bxxk bxxk = f170711f;
            if (bxxk == null) {
                synchronized (bzni.class) {
                    bxxk = f170711f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170710d);
                        f170711f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
