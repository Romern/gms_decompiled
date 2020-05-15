package p000;

/* renamed from: btbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btbr f148203c;

    /* renamed from: d */
    private static volatile bxxk f148204d;

    /* renamed from: a */
    public bxwc f148205a = bxxn.f165040b;

    /* renamed from: b */
    public String f148206b = "";

    static {
        btbr btbr = new btbr();
        f148203c = btbr;
        bxvk.m124024a(btbr.class, btbr);
    }

    private btbr() {
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
            return bxvk.m124022a(f148203c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"a", btbq.class, "b"});
        } else if (i2 == 3) {
            return new btbr();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f148203c;
            }
            bxxk bxxk = f148204d;
            if (bxxk == null) {
                synchronized (btbr.class) {
                    bxxk = f148204d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148203c);
                        f148204d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
