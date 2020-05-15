package p000;

/* renamed from: btcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btcg f148266d;

    /* renamed from: e */
    private static volatile bxxk f148267e;

    /* renamed from: a */
    public bxwc f148268a = bxxn.f165040b;

    /* renamed from: b */
    public boolean f148269b;

    /* renamed from: c */
    public btea f148270c;

    static {
        btcg btcg = new btcg();
        f148266d = btcg;
        bxvk.m124024a(btcg.class, btcg);
    }

    private btcg() {
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
            return bxvk.m124022a(f148266d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btcg();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148266d;
            }
            bxxk bxxk = f148267e;
            if (bxxk == null) {
                synchronized (btcg.class) {
                    bxxk = f148267e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148266d);
                        f148267e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
