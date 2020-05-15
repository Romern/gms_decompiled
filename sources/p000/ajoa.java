package p000;

/* renamed from: ajoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajoa extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ajoa f71043e;

    /* renamed from: f */
    private static volatile bxxk f71044f;

    /* renamed from: a */
    public int f71045a;

    /* renamed from: b */
    public String f71046b = "";

    /* renamed from: c */
    public int f71047c;

    /* renamed from: d */
    public long f71048d;

    static {
        ajoa ajoa = new ajoa();
        f71043e = ajoa;
        bxvk.m124024a(ajoa.class, ajoa);
    }

    private ajoa() {
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
            return bxvk.m124022a(f71043e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဌ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", "c", ajnz.m58903b(), "d"});
        } else if (i2 == 3) {
            return new ajoa();
        } else {
            if (i2 == 4) {
                return new bxvd(f71043e);
            }
            if (i2 == 5) {
                return f71043e;
            }
            bxxk bxxk = f71044f;
            if (bxxk == null) {
                synchronized (ajoa.class) {
                    bxxk = f71044f;
                    if (bxxk == null) {
                        bxxk = new bxve(f71043e);
                        f71044f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
