package p000;

/* renamed from: bvyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvyf f158147d;

    /* renamed from: e */
    private static volatile bxxk f158148e;

    /* renamed from: a */
    public int f158149a;

    /* renamed from: b */
    public int f158150b;

    /* renamed from: c */
    public bvwb f158151c;

    static {
        bvyf bvyf = new bvyf();
        f158147d = bvyf;
        GeneratedMessageLite.m124024a(bvyf.class, bvyf);
    }

    private bvyf() {
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
            return GeneratedMessageLite.m124022a(f158147d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvyf();
        } else {
            if (i2 == 4) {
                return new bxvd(f158147d);
            }
            if (i2 == 5) {
                return f158147d;
            }
            bxxk bxxk = f158148e;
            if (bxxk == null) {
                synchronized (bvyf.class) {
                    bxxk = f158148e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158147d);
                        f158148e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
