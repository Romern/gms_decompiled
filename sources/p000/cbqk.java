package p000;

/* renamed from: cbqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbqk f178037b;

    /* renamed from: c */
    private static volatile bxxk f178038c;

    /* renamed from: a */
    public int f178039a;

    static {
        cbqk cbqk = new cbqk();
        f178037b = cbqk;
        bxvk.m124024a(cbqk.class, cbqk);
    }

    private cbqk() {
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
            return bxvk.m124022a(f178037b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f178037b);
            }
            if (i2 == 5) {
                return f178037b;
            }
            bxxk bxxk = f178038c;
            if (bxxk == null) {
                synchronized (cbqk.class) {
                    bxxk = f178038c;
                    if (bxxk == null) {
                        bxxk = new bxve(f178037b);
                        f178038c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
