package p000;

/* renamed from: cbpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbpo f177938c;

    /* renamed from: d */
    private static volatile bxxk f177939d;

    /* renamed from: a */
    public bxwc f177940a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f177941b = bxxn.f165040b;

    static {
        cbpo cbpo = new cbpo();
        f177938c = cbpo;
        bxvk.m124024a(cbpo.class, cbpo);
    }

    private cbpo() {
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
            return bxvk.m124022a(f177938c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbpo();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f177938c;
            }
            bxxk bxxk = f177939d;
            if (bxxk == null) {
                synchronized (cbpo.class) {
                    bxxk = f177939d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177938c);
                        f177939d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
