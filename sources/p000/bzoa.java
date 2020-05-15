package p000;

/* renamed from: bzoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzoa f170784c;

    /* renamed from: d */
    private static volatile bxxk f170785d;

    /* renamed from: a */
    public bzod f170786a;

    /* renamed from: b */
    public String f170787b = "";

    static {
        bzoa bzoa = new bzoa();
        f170784c = bzoa;
        bxvk.m124024a(bzoa.class, bzoa);
    }

    private bzoa() {
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
            return bxvk.m124022a(f170784c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzoa();
        } else {
            if (i2 == 4) {
                return new bxvd(f170784c);
            }
            if (i2 == 5) {
                return f170784c;
            }
            bxxk bxxk = f170785d;
            if (bxxk == null) {
                synchronized (bzoa.class) {
                    bxxk = f170785d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170784c);
                        f170785d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
