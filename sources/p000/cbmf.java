package p000;

/* renamed from: cbmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbmf f177611d;

    /* renamed from: e */
    private static volatile bxxk f177612e;

    /* renamed from: a */
    public String f177613a = "";

    /* renamed from: b */
    public int f177614b;

    /* renamed from: c */
    public bxvl f177615c;

    static {
        cbmf cbmf = new cbmf();
        f177611d = cbmf;
        bxvk.m124024a(cbmf.class, cbmf);
    }

    private cbmf() {
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
            return bxvk.m124022a(f177611d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbmf();
        } else {
            if (i2 == 4) {
                return new bxvd(f177611d);
            }
            if (i2 == 5) {
                return f177611d;
            }
            bxxk bxxk = f177612e;
            if (bxxk == null) {
                synchronized (cbmf.class) {
                    bxxk = f177612e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177611d);
                        f177612e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
