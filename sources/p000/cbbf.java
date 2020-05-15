package p000;

/* renamed from: cbbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cbbf f176550e;

    /* renamed from: f */
    private static volatile bxxk f176551f;

    /* renamed from: a */
    public String f176552a = "";

    /* renamed from: b */
    public String f176553b = "";

    /* renamed from: c */
    public String f176554c = "";

    /* renamed from: d */
    public cbbe f176555d;

    static {
        cbbf cbbf = new cbbf();
        f176550e = cbbf;
        bxvk.m124024a(cbbf.class, cbbf);
    }

    private cbbf() {
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
            return bxvk.m124022a(f176550e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cbbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f176550e);
            }
            if (i2 == 5) {
                return f176550e;
            }
            bxxk bxxk = f176551f;
            if (bxxk == null) {
                synchronized (cbbf.class) {
                    bxxk = f176551f;
                    if (bxxk == null) {
                        bxxk = new bxve(f176550e);
                        f176551f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
