package p000;

/* renamed from: cbfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbfo f176943c;

    /* renamed from: d */
    private static volatile bxxk f176944d;

    /* renamed from: a */
    public bzrt f176945a;

    /* renamed from: b */
    public float f176946b;

    static {
        cbfo cbfo = new cbfo();
        f176943c = cbfo;
        bxvk.m124024a(cbfo.class, cbfo);
    }

    private cbfo() {
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
            return bxvk.m124022a(f176943c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbfo();
        } else {
            if (i2 == 4) {
                return new bxvd(f176943c);
            }
            if (i2 == 5) {
                return f176943c;
            }
            bxxk bxxk = f176944d;
            if (bxxk == null) {
                synchronized (cbfo.class) {
                    bxxk = f176944d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176943c);
                        f176944d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
