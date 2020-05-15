package p000;

/* renamed from: btro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btro extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btro f150127e;

    /* renamed from: f */
    private static volatile bxxk f150128f;

    /* renamed from: a */
    public btrn f150129a;

    /* renamed from: b */
    public bxwc f150130b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f150131c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f150132d = bxxn.f165040b;

    static {
        btro btro = new btro();
        f150127e = btro;
        bxvk.m124024a(btro.class, btro);
    }

    private btro() {
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
            return bxvk.m124022a(f150127e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0003\u0000\u0001\t\u0004\u001b\u0005\u001b\u0006\u001b", new Object[]{"a", "b", bmve.class, "c", bmvi.class, "d", bmvu.class});
        } else if (i2 == 3) {
            return new btro();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f150127e;
            }
            bxxk bxxk = f150128f;
            if (bxxk == null) {
                synchronized (btro.class) {
                    bxxk = f150128f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150127e);
                        f150128f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
