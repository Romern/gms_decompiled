package p000;

/* renamed from: bmru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmru extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmru f130581d;

    /* renamed from: e */
    private static volatile bxxk f130582e;

    /* renamed from: a */
    public int f130583a;

    /* renamed from: b */
    public bmaj f130584b;

    /* renamed from: c */
    public bxtx f130585c = bxtx.f164797b;

    static {
        bmru bmru = new bmru();
        f130581d = bmru;
        bxvk.m124024a(bmru.class, bmru);
    }

    private bmru() {
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
            return bxvk.m124022a(f130581d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ည\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmru();
        } else {
            if (i2 == 4) {
                return new bxvd(f130581d);
            }
            if (i2 == 5) {
                return f130581d;
            }
            bxxk bxxk = f130582e;
            if (bxxk == null) {
                synchronized (bmru.class) {
                    bxxk = f130582e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130581d);
                        f130582e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
