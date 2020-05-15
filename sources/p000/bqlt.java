package p000;

/* renamed from: bqlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqlt extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqlt f141163f;

    /* renamed from: g */
    private static volatile bxxk f141164g;

    /* renamed from: a */
    public String f141165a = "";

    /* renamed from: b */
    public bxtx f141166b = bxtx.f164797b;

    /* renamed from: c */
    public bxtx f141167c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f141168d = bxtx.f164797b;

    /* renamed from: e */
    public bqls f141169e;

    static {
        bqlt bqlt = new bqlt();
        f141163f = bqlt;
        bxvk.m124024a(bqlt.class, bqlt);
    }

    private bqlt() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f141163f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004\n\u0007\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bqlt();
        } else {
            if (i2 == 4) {
                return new bxvd(f141163f);
            }
            if (i2 == 5) {
                return f141163f;
            }
            bxxk bxxk = f141164g;
            if (bxxk == null) {
                synchronized (bqlt.class) {
                    bxxk = f141164g;
                    if (bxxk == null) {
                        bxxk = new bxve(f141163f);
                        f141164g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
