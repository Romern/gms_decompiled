package p000;

/* renamed from: cbfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbfd f176887c;

    /* renamed from: d */
    private static volatile bxxk f176888d;

    /* renamed from: a */
    public int f176889a;

    /* renamed from: b */
    public bxte f176890b;

    static {
        cbfd cbfd = new cbfd();
        f176887c = cbfd;
        bxvk.m124024a(cbfd.class, cbfd);
    }

    private cbfd() {
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
            return bxvk.m124022a(f176887c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f176887c);
            }
            if (i2 == 5) {
                return f176887c;
            }
            bxxk bxxk = f176888d;
            if (bxxk == null) {
                synchronized (cbfd.class) {
                    bxxk = f176888d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176887c);
                        f176888d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
