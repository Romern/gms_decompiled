package p000;

/* renamed from: cbau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbau extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cbau f176495f;

    /* renamed from: g */
    private static volatile bxxk f176496g;

    /* renamed from: a */
    public bxtx f176497a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f176498b = bxtx.f164797b;

    /* renamed from: c */
    public String f176499c = "";

    /* renamed from: d */
    public String f176500d = "";

    /* renamed from: e */
    public cbas f176501e;

    static {
        cbau cbau = new cbau();
        f176495f = cbau;
        bxvk.m124024a(cbau.class, cbau);
    }

    private cbau() {
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
            return bxvk.m124022a(f176495f, "\u0000\u0005\u0000\u0000\u0001\u0014\u0005\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004\t\u0014\n", new Object[]{"a", "c", "d", "e", "b"});
        } else if (i2 == 3) {
            return new cbau();
        } else {
            if (i2 == 4) {
                return new bxvd(f176495f);
            }
            if (i2 == 5) {
                return f176495f;
            }
            bxxk bxxk = f176496g;
            if (bxxk == null) {
                synchronized (cbau.class) {
                    bxxk = f176496g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176495f);
                        f176496g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
