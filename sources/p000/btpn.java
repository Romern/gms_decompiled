package p000;

/* renamed from: btpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btpn f149866e;

    /* renamed from: f */
    private static volatile bxxk f149867f;

    /* renamed from: a */
    public String f149868a = "";

    /* renamed from: b */
    public bxwc f149869b = bxxn.f165040b;

    /* renamed from: c */
    public btpp f149870c;

    /* renamed from: d */
    public float f149871d;

    static {
        btpn btpn = new btpn();
        f149866e = btpn;
        bxvk.m124024a(btpn.class, btpn);
    }

    private btpn() {
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
            return bxvk.m124022a(f149866e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\t\u0004\u0001", new Object[]{"a", "b", btpm.class, "c", "d"});
        } else if (i2 == 3) {
            return new btpn();
        } else {
            if (i2 == 4) {
                return new bxvd(f149866e);
            }
            if (i2 == 5) {
                return f149866e;
            }
            bxxk bxxk = f149867f;
            if (bxxk == null) {
                synchronized (btpn.class) {
                    bxxk = f149867f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149866e);
                        f149867f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
