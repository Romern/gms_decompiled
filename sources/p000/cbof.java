package p000;

/* renamed from: cbof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbof extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbof f177810b;

    /* renamed from: c */
    private static volatile bxxk f177811c;

    /* renamed from: a */
    public int f177812a;

    static {
        cbof cbof = new cbof();
        f177810b = cbof;
        bxvk.m124024a(cbof.class, cbof);
    }

    private cbof() {
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
            return bxvk.m124022a(f177810b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbof();
        } else {
            if (i2 == 4) {
                return new bxvd(f177810b);
            }
            if (i2 == 5) {
                return f177810b;
            }
            bxxk bxxk = f177811c;
            if (bxxk == null) {
                synchronized (cbof.class) {
                    bxxk = f177811c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177810b);
                        f177811c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
