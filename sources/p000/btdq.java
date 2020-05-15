package p000;

/* renamed from: btdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btdq f148432e;

    /* renamed from: f */
    private static volatile bxxk f148433f;

    /* renamed from: a */
    public bxwc f148434a = bxxn.f165040b;

    /* renamed from: b */
    public String f148435b = "";

    /* renamed from: c */
    public String f148436c = "";

    /* renamed from: d */
    public int f148437d;

    static {
        btdq btdq = new btdq();
        f148432e = btdq;
        bxvk.m124024a(btdq.class, btdq);
    }

    private btdq() {
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
            return bxvk.m124022a(f148432e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"a", bzkv.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new btdq();
        } else {
            if (i2 == 4) {
                return new bxvd(f148432e);
            }
            if (i2 == 5) {
                return f148432e;
            }
            bxxk bxxk = f148433f;
            if (bxxk == null) {
                synchronized (btdq.class) {
                    bxxk = f148433f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148432e);
                        f148433f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
