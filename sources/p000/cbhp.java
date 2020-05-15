package p000;

/* renamed from: cbhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbhp f177158b;

    /* renamed from: c */
    private static volatile bxxk f177159c;

    /* renamed from: a */
    public bxwc f177160a = bxxn.f165040b;

    static {
        cbhp cbhp = new cbhp();
        f177158b = cbhp;
        bxvk.m124024a(cbhp.class, cbhp);
    }

    private cbhp() {
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
            return bxvk.m124022a(f177158b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbhn.class});
        } else if (i2 == 3) {
            return new cbhp();
        } else {
            if (i2 == 4) {
                return new cbho();
            }
            if (i2 == 5) {
                return f177158b;
            }
            bxxk bxxk = f177159c;
            if (bxxk == null) {
                synchronized (cbhp.class) {
                    bxxk = f177159c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177158b);
                        f177159c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
