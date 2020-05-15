package p000;

/* renamed from: brad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brad extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brad f142126d;

    /* renamed from: e */
    private static volatile bxxk f142127e;

    /* renamed from: a */
    public int f142128a;

    /* renamed from: b */
    public String f142129b = "";

    /* renamed from: c */
    public bxwc f142130c = bxxn.f165040b;

    static {
        brad brad = new brad();
        f142126d = brad;
        bxvk.m124024a(brad.class, brad);
    }

    private brad() {
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
            return bxvk.m124022a(f142126d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", brae.class});
        } else if (i2 == 3) {
            return new brad();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f142126d;
            }
            bxxk bxxk = f142127e;
            if (bxxk == null) {
                synchronized (brad.class) {
                    bxxk = f142127e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142126d);
                        f142127e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
