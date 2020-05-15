package p000;

/* renamed from: xao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xao extends bxvk implements bxxd {

    /* renamed from: d */
    public static final xao f51799d;

    /* renamed from: e */
    private static volatile bxxk f51800e;

    /* renamed from: a */
    public int f51801a;

    /* renamed from: b */
    public bxvt f51802b = bxvm.f164965b;

    /* renamed from: c */
    public bxtx f51803c = bxtx.f164797b;

    static {
        xao xao = new xao();
        f51799d = xao;
        bxvk.m124024a(xao.class, xao);
    }

    private xao() {
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
            return bxvk.m124022a(f51799d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ည\u0000", new Object[]{"a", "b", xan.m42568b(), "c"});
        } else if (i2 == 3) {
            return new xao();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f51799d;
            }
            bxxk bxxk = f51800e;
            if (bxxk == null) {
                synchronized (xao.class) {
                    bxxk = f51800e;
                    if (bxxk == null) {
                        bxxk = new bxve(f51799d);
                        f51800e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
