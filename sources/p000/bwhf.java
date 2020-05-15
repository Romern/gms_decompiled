package p000;

/* renamed from: bwhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwhf f159500e;

    /* renamed from: f */
    private static volatile bxxk f159501f;

    /* renamed from: a */
    public int f159502a;

    /* renamed from: b */
    public String f159503b = "";

    /* renamed from: c */
    public bxvt f159504c = bxvm.f164965b;

    /* renamed from: d */
    public bwhe f159505d;

    static {
        bwhf bwhf = new bwhf();
        f159500e = bwhf;
        GeneratedMessageLite.m124024a(bwhf.class, bwhf);
    }

    private bwhf() {
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
            return GeneratedMessageLite.m124022a(f159500e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0004\u001e\u0006ဉ\u0003", new Object[]{"a", "b", "c", bmkf.m108113b(), "d"});
        } else if (i2 == 3) {
            return new bwhf();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f159500e;
            }
            bxxk bxxk = f159501f;
            if (bxxk == null) {
                synchronized (bwhf.class) {
                    bxxk = f159501f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159500e);
                        f159501f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
