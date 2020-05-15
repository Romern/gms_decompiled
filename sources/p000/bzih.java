package p000;

/* renamed from: bzih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzih extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzih f170179b;

    /* renamed from: d */
    private static volatile bxxk f170180d;

    /* renamed from: a */
    public bxwc f170181a = bxxn.f165040b;

    /* renamed from: c */
    private byte f170182c = 2;

    static {
        bzih bzih = new bzih();
        f170179b = bzih;
        bxvk.m124024a(bzih.class, bzih);
    }

    private bzih() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170182c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170182c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f170179b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", bzif.class});
        } else if (i2 == 3) {
            return new bzih();
        } else {
            if (i2 == 4) {
                return new bxvd(f170179b);
            }
            if (i2 == 5) {
                return f170179b;
            }
            bxxk bxxk = f170180d;
            if (bxxk == null) {
                synchronized (bzih.class) {
                    bxxk = f170180d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170179b);
                        f170180d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
