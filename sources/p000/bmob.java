package p000;

/* renamed from: bmob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmob extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmob f130205b;

    /* renamed from: c */
    private static volatile bxxk f130206c;

    /* renamed from: a */
    public bxwc f130207a = bxxn.f165040b;

    static {
        bmob bmob = new bmob();
        f130205b = bmob;
        bxvk.m124024a(bmob.class, bmob);
    }

    private bmob() {
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
            return bxvk.m124022a(f130205b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bmoa.class});
        } else if (i2 == 3) {
            return new bmob();
        } else {
            if (i2 == 4) {
                return new bxvd(f130205b);
            }
            if (i2 == 5) {
                return f130205b;
            }
            bxxk bxxk = f130206c;
            if (bxxk == null) {
                synchronized (bmob.class) {
                    bxxk = f130206c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130205b);
                        f130206c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
