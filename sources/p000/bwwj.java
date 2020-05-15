package p000;

/* renamed from: bwwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwwj f161251d;

    /* renamed from: e */
    public static final bxvj f161252e;

    /* renamed from: f */
    private static volatile bxxk f161253f;

    /* renamed from: a */
    public int f161254a;

    /* renamed from: b */
    public String f161255b = "";

    /* renamed from: c */
    public bxvt f161256c = bxvm.f164965b;

    static {
        bwwj bwwj = new bwwj();
        f161251d = bwwj;
        GeneratedMessageLite.m124024a(bwwj.class, bwwj);
        bwog bwog = bwog.f160437f;
        bwwj bwwj2 = f161251d;
        f161252e = GeneratedMessageLite.m124006a(bwog, bwwj2, bwwj2, 235650859, bxzf.MESSAGE);
    }

    private bwwj() {
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
            return GeneratedMessageLite.m124022a(f161251d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwwj();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161251d;
            }
            bxxk bxxk = f161253f;
            if (bxxk == null) {
                synchronized (bwwj.class) {
                    bxxk = f161253f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161251d);
                        f161253f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
