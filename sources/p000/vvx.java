package p000;

/* renamed from: vvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final vvx f50091e;

    /* renamed from: f */
    private static volatile bxxk f50092f;

    /* renamed from: a */
    public int f50093a;

    /* renamed from: b */
    public String f50094b = "";

    /* renamed from: c */
    public String f50095c = "";

    /* renamed from: d */
    public bxwc f50096d = bxxn.f165040b;

    static {
        vvx vvx = new vvx();
        f50091e = vvx;
        bxvk.m124024a(vvx.class, vvx);
    }

    private vvx() {
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
            return bxvk.m124022a(f50091e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", vwd.class});
        } else if (i2 == 3) {
            return new vvx();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f50091e;
            }
            bxxk bxxk = f50092f;
            if (bxxk == null) {
                synchronized (vvx.class) {
                    bxxk = f50092f;
                    if (bxxk == null) {
                        bxxk = new bxve(f50091e);
                        f50092f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
