package p000;

/* renamed from: abpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abpo f57877b;

    /* renamed from: c */
    private static volatile bxxk f57878c;

    /* renamed from: a */
    public bxwc f57879a = bxxn.f165040b;

    static {
        abpo abpo = new abpo();
        f57877b = abpo;
        bxvk.m124024a(abpo.class, abpo);
    }

    private abpo() {
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
            return bxvk.m124022a(f57877b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new abpo();
        } else {
            if (i2 == 4) {
                return new bxvd(f57877b);
            }
            if (i2 == 5) {
                return f57877b;
            }
            bxxk bxxk = f57878c;
            if (bxxk == null) {
                synchronized (abpo.class) {
                    bxxk = f57878c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57877b);
                        f57878c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
