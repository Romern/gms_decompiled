package p000;

/* renamed from: bspl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspl extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bspl f146518f;

    /* renamed from: g */
    private static volatile bxxk f146519g;

    /* renamed from: a */
    public int f146520a;

    /* renamed from: b */
    public int f146521b;

    /* renamed from: c */
    public int f146522c;

    /* renamed from: d */
    public bxvt f146523d = bxvm.f164965b;

    /* renamed from: e */
    public int f146524e;

    static {
        bspl bspl = new bspl();
        f146518f = bspl;
        GeneratedMessageLite.m124024a(bspl.class, bspl);
    }

    private bspl() {
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
            return GeneratedMessageLite.m124022a(f146518f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u0016\u0004င\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bspl();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f146518f;
            }
            bxxk bxxk = f146519g;
            if (bxxk == null) {
                synchronized (bspl.class) {
                    bxxk = f146519g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146518f);
                        f146519g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
