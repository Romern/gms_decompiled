package p000;

/* renamed from: bywe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bywe f168560e;

    /* renamed from: f */
    private static volatile bxxk f168561f;

    /* renamed from: a */
    public int f168562a;

    /* renamed from: b */
    public bxwc f168563b = bxxn.f165040b;

    /* renamed from: c */
    public bywq f168564c;

    /* renamed from: d */
    public boolean f168565d;

    static {
        bywe bywe = new bywe();
        f168560e = bywe;
        bxvk.m124024a(bywe.class, bywe);
    }

    private bywe() {
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
            return bxvk.m124022a(f168560e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", byxb.class, "c", "d"});
        } else if (i2 == 3) {
            return new bywe();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168560e;
            }
            bxxk bxxk = f168561f;
            if (bxxk == null) {
                synchronized (bywe.class) {
                    bxxk = f168561f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168560e);
                        f168561f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
