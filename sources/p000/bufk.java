package p000;

/* renamed from: bufk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bufk f153709c;

    /* renamed from: d */
    private static volatile bxxk f153710d;

    /* renamed from: a */
    public bxwc f153711a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f153712b = bxxn.f165040b;

    static {
        bufk bufk = new bufk();
        f153709c = bufk;
        bxvk.m124024a(bufk.class, bufk);
    }

    private bufk() {
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
            return bxvk.m124022a(f153709c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", bufn.class, "b", bufh.class});
        } else if (i2 == 3) {
            return new bufk();
        } else {
            if (i2 == 4) {
                return new bxvd(f153709c);
            }
            if (i2 == 5) {
                return f153709c;
            }
            bxxk bxxk = f153710d;
            if (bxxk == null) {
                synchronized (bufk.class) {
                    bxxk = f153710d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153709c);
                        f153710d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
