package p000;

/* renamed from: bzca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzca extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzca f169288c;

    /* renamed from: e */
    private static volatile bxxk f169289e;

    /* renamed from: a */
    public bxwc f169290a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f169291b = bxxn.f165040b;

    /* renamed from: d */
    private byte f169292d = 2;

    static {
        bzca bzca = new bzca();
        f169288c = bzca;
        bxvk.m124024a(bzca.class, bzca);
    }

    private bzca() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169292d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169292d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169288c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", byyx.class, "b", byzr.class});
        } else if (i2 == 3) {
            return new bzca();
        } else {
            if (i2 == 4) {
                return new bxvd(f169288c);
            }
            if (i2 == 5) {
                return f169288c;
            }
            bxxk bxxk = f169289e;
            if (bxxk == null) {
                synchronized (bzca.class) {
                    bxxk = f169289e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169288c);
                        f169289e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
