package p000;

/* renamed from: bzym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzym extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzym f171894c;

    /* renamed from: d */
    private static volatile bxxk f171895d;

    /* renamed from: a */
    public String f171896a = "";

    /* renamed from: b */
    public bxwc f171897b = bxxn.f165040b;

    static {
        bzym bzym = new bzym();
        f171894c = bzym;
        bxvk.m124024a(bzym.class, bzym);
    }

    private bzym() {
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
            return bxvk.m124022a(f171894c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", bzyl.class});
        } else if (i2 == 3) {
            return new bzym();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f171894c;
            }
            bxxk bxxk = f171895d;
            if (bxxk == null) {
                synchronized (bzym.class) {
                    bxxk = f171895d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171894c);
                        f171895d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
