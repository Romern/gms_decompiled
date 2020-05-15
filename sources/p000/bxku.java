package p000;

/* renamed from: bxku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxku extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxku f163794b;

    /* renamed from: c */
    public static final bxvj f163795c;

    /* renamed from: d */
    private static volatile bxxk f163796d;

    /* renamed from: a */
    public bxwc f163797a = bxxn.f165040b;

    static {
        bxku bxku = new bxku();
        f163794b = bxku;
        bxvk.m124024a(bxku.class, bxku);
        bxcf bxcf = bxcf.f162779a;
        bxku bxku2 = f163794b;
        f163795c = bxvk.m124006a(bxcf, bxku2, bxku2, 125695873, bxzf.MESSAGE);
    }

    private bxku() {
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
            return bxvk.m124022a(f163794b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxkv.class});
        } else if (i2 == 3) {
            return new bxku();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f163794b;
            }
            bxxk bxxk = f163796d;
            if (bxxk == null) {
                synchronized (bxku.class) {
                    bxxk = f163796d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163794b);
                        f163796d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
