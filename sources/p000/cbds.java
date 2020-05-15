package p000;

/* renamed from: cbds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbds extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbds f176782e;

    /* renamed from: f */
    private static volatile bxxk f176783f;

    /* renamed from: a */
    public int f176784a;

    /* renamed from: b */
    public String f176785b = "";

    /* renamed from: c */
    public String f176786c = "";

    /* renamed from: d */
    public String f176787d = "";

    static {
        cbds cbds = new cbds();
        f176782e = cbds;
        bxvk.m124024a(cbds.class, cbds);
    }

    private cbds() {
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
            return bxvk.m124022a(f176782e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbds();
        } else {
            if (i2 == 4) {
                return new bxvd(f176782e);
            }
            if (i2 == 5) {
                return f176782e;
            }
            bxxk bxxk = f176783f;
            if (bxxk == null) {
                synchronized (cbds.class) {
                    bxxk = f176783f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176782e);
                        f176783f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
