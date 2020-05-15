package p000;

/* renamed from: cbla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbla extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cbla f177461f;

    /* renamed from: g */
    private static volatile bxxk f177462g;

    /* renamed from: a */
    public cbmo f177463a;

    /* renamed from: b */
    public String f177464b = "";

    /* renamed from: c */
    public cbld f177465c;

    /* renamed from: d */
    public cbkz f177466d;

    /* renamed from: e */
    public cbmd f177467e;

    static {
        cbla cbla = new cbla();
        f177461f = cbla;
        bxvk.m124024a(cbla.class, cbla);
    }

    private cbla() {
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
            return bxvk.m124022a(f177461f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbla();
        } else {
            if (i2 == 4) {
                return new bxvd(f177461f);
            }
            if (i2 == 5) {
                return f177461f;
            }
            bxxk bxxk = f177462g;
            if (bxxk == null) {
                synchronized (cbla.class) {
                    bxxk = f177462g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177461f);
                        f177462g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
