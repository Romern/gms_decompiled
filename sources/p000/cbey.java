package p000;

/* renamed from: cbey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbey extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cbey f176867f;

    /* renamed from: g */
    private static volatile bxxk f176868g;

    /* renamed from: a */
    public cbmf f176869a;

    /* renamed from: b */
    public String f176870b = "";

    /* renamed from: c */
    public bxtx f176871c = bxtx.f164797b;

    /* renamed from: d */
    public String f176872d = "";

    /* renamed from: e */
    public int f176873e;

    static {
        cbey cbey = new cbey();
        f176867f = cbey;
        bxvk.m124024a(cbey.class, cbey);
    }

    private cbey() {
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
            return bxvk.m124022a(f176867f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\n\u0004Ȉ\u0005\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbey();
        } else {
            if (i2 == 4) {
                return new bxvd(f176867f);
            }
            if (i2 == 5) {
                return f176867f;
            }
            bxxk bxxk = f176868g;
            if (bxxk == null) {
                synchronized (cbey.class) {
                    bxxk = f176868g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176867f);
                        f176868g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
