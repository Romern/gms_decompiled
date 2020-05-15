package p000;

/* renamed from: aorx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aorx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aorx f78745d;

    /* renamed from: e */
    private static volatile bxxk f78746e;

    /* renamed from: a */
    public String f78747a = "";

    /* renamed from: b */
    public bxyk f78748b;

    /* renamed from: c */
    public bxwc f78749c = bxxn.f165040b;

    static {
        aorx aorx = new aorx();
        f78745d = aorx;
        bxvk.m124024a(aorx.class, aorx);
    }

    private aorx() {
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
            return bxvk.m124022a(f78745d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aorx();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f78745d;
            }
            bxxk bxxk = f78746e;
            if (bxxk == null) {
                synchronized (aorx.class) {
                    bxxk = f78746e;
                    if (bxxk == null) {
                        bxxk = new bxve(f78745d);
                        f78746e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
