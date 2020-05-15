package p000;

/* renamed from: bpym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpym extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpym f139887f;

    /* renamed from: g */
    private static volatile bxxk f139888g;

    /* renamed from: a */
    public int f139889a;

    /* renamed from: b */
    public String f139890b = "";

    /* renamed from: c */
    public int f139891c;

    /* renamed from: d */
    public int f139892d;

    /* renamed from: e */
    public int f139893e;

    static {
        bpym bpym = new bpym();
        f139887f = bpym;
        GeneratedMessageLite.m124024a(bpym.class, bpym);
    }

    private bpym() {
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
            return GeneratedMessageLite.m124022a(f139887f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpym();
        } else {
            if (i2 == 4) {
                return new bxvd(f139887f);
            }
            if (i2 == 5) {
                return f139887f;
            }
            bxxk bxxk = f139888g;
            if (bxxk == null) {
                synchronized (bpym.class) {
                    bxxk = f139888g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139887f);
                        f139888g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
