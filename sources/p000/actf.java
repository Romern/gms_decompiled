package p000;

/* renamed from: actf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final actf f60734c;

    /* renamed from: d */
    private static volatile bxxk f60735d;

    /* renamed from: a */
    public bxwc f60736a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f60737b = bxxn.f165040b;

    static {
        actf actf = new actf();
        f60734c = actf;
        bxvk.m124024a(actf.class, actf);
    }

    private actf() {
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
            return bxvk.m124022a(f60734c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", acte.class, "b", acte.class});
        } else if (i2 == 3) {
            return new actf();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f60734c;
            }
            bxxk bxxk = f60735d;
            if (bxxk == null) {
                synchronized (actf.class) {
                    bxxk = f60735d;
                    if (bxxk == null) {
                        bxxk = new bxve(f60734c);
                        f60735d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
