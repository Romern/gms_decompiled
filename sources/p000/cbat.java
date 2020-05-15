package p000;

/* renamed from: cbat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbat extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cbat f176487g;

    /* renamed from: h */
    private static volatile bxxk f176488h;

    /* renamed from: a */
    public String f176489a = "";

    /* renamed from: b */
    public String f176490b = "";

    /* renamed from: c */
    public String f176491c = "";

    /* renamed from: d */
    public String f176492d = "";

    /* renamed from: e */
    public bxtx f176493e = bxtx.f164797b;

    /* renamed from: f */
    public String f176494f = "";

    static {
        cbat cbat = new cbat();
        f176487g = cbat;
        bxvk.m124024a(cbat.class, cbat);
    }

    private cbat() {
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
            return bxvk.m124022a(f176487g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\n\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cbat();
        } else {
            if (i2 == 4) {
                return new bxvd(f176487g);
            }
            if (i2 == 5) {
                return f176487g;
            }
            bxxk bxxk = f176488h;
            if (bxxk == null) {
                synchronized (cbat.class) {
                    bxxk = f176488h;
                    if (bxxk == null) {
                        bxxk = new bxve(f176487g);
                        f176488h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
