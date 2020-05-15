package p000;

/* renamed from: abuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abuw f58491b;

    /* renamed from: c */
    private static volatile bxxk f58492c;

    /* renamed from: a */
    public bxwc f58493a = bxxn.f165040b;

    static {
        abuw abuw = new abuw();
        f58491b = abuw;
        bxvk.m124024a(abuw.class, abuw);
    }

    private abuw() {
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
            return bxvk.m124022a(f58491b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abuv.class});
        } else if (i2 == 3) {
            return new abuw();
        } else {
            if (i2 == 4) {
                return new bxvd(f58491b);
            }
            if (i2 == 5) {
                return f58491b;
            }
            bxxk bxxk = f58492c;
            if (bxxk == null) {
                synchronized (abuw.class) {
                    bxxk = f58492c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58491b);
                        f58492c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
