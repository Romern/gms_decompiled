package p000;

/* renamed from: boos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boos extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boos f133990e;

    /* renamed from: f */
    private static volatile bxxk f133991f;

    /* renamed from: a */
    public int f133992a;

    /* renamed from: b */
    public bxyk f133993b;

    /* renamed from: c */
    public int f133994c;

    /* renamed from: d */
    public String f133995d = "";

    static {
        boos boos = new boos();
        f133990e = boos;
        GeneratedMessageLite.m124024a(boos.class, boos);
    }

    private boos() {
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
            return GeneratedMessageLite.m124022a(f133990e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\t\u0003\u000b\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boos();
        } else {
            if (i2 == 4) {
                return new bxvd(f133990e);
            }
            if (i2 == 5) {
                return f133990e;
            }
            bxxk bxxk = f133991f;
            if (bxxk == null) {
                synchronized (boos.class) {
                    bxxk = f133991f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133990e);
                        f133991f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
