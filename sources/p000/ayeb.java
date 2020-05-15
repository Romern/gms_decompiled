package p000;

/* renamed from: ayeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayeb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ayeb f97275b;

    /* renamed from: d */
    private static volatile bxxk f97276d;

    /* renamed from: a */
    public bxwc f97277a = bxxn.f165040b;

    /* renamed from: c */
    private byte f97278c = 2;

    static {
        ayeb ayeb = new ayeb();
        f97275b = ayeb;
        bxvk.m124024a(ayeb.class, ayeb);
    }

    private ayeb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97278c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97278c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97275b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", ayec.class});
        } else if (i2 == 3) {
            return new ayeb();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f97275b;
            }
            bxxk bxxk = f97276d;
            if (bxxk == null) {
                synchronized (ayeb.class) {
                    bxxk = f97276d;
                    if (bxxk == null) {
                        bxxk = new bxve(f97275b);
                        f97276d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
