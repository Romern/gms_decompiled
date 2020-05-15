package p000;

/* renamed from: bydx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bydx f165868c;

    /* renamed from: d */
    private static volatile bxxk f165869d;

    /* renamed from: a */
    public String f165870a = "";

    /* renamed from: b */
    public String f165871b = "";

    static {
        bydx bydx = new bydx();
        f165868c = bydx;
        bxvk.m124024a(bydx.class, bydx);
    }

    private bydx() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f165868c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bydx();
        } else {
            if (i2 == 4) {
                return new bxvd(f165868c);
            }
            if (i2 == 5) {
                return f165868c;
            }
            bxxk bxxk = f165869d;
            if (bxxk == null) {
                synchronized (bydx.class) {
                    bxxk = f165869d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165868c);
                        f165869d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
