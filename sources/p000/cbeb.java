package p000;

/* renamed from: cbeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbeb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbeb f176817c;

    /* renamed from: d */
    private static volatile bxxk f176818d;

    /* renamed from: a */
    public cbec f176819a;

    /* renamed from: b */
    public cbdh f176820b;

    static {
        cbeb cbeb = new cbeb();
        f176817c = cbeb;
        bxvk.m124024a(cbeb.class, cbeb);
    }

    private cbeb() {
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
            return bxvk.m124022a(f176817c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbeb();
        } else {
            if (i2 == 4) {
                return new bxvd(f176817c);
            }
            if (i2 == 5) {
                return f176817c;
            }
            bxxk bxxk = f176818d;
            if (bxxk == null) {
                synchronized (cbeb.class) {
                    bxxk = f176818d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176817c);
                        f176818d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
