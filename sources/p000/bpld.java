package p000;

/* renamed from: bpld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpld extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpld f138067f;

    /* renamed from: g */
    private static volatile bxxk f138068g;

    /* renamed from: a */
    public int f138069a;

    /* renamed from: b */
    public int f138070b;

    /* renamed from: c */
    public int f138071c;

    /* renamed from: d */
    public int f138072d;

    /* renamed from: e */
    public int f138073e;

    static {
        bpld bpld = new bpld();
        f138067f = bpld;
        GeneratedMessageLite.m124024a(bpld.class, bpld);
    }

    private bpld() {
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
            return GeneratedMessageLite.m124022a(f138067f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpld();
        } else {
            if (i2 == 4) {
                return new bxvd(f138067f);
            }
            if (i2 == 5) {
                return f138067f;
            }
            bxxk bxxk = f138068g;
            if (bxxk == null) {
                synchronized (bpld.class) {
                    bxxk = f138068g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138067f);
                        f138068g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
