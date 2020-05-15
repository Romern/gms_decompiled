package p000;

/* renamed from: bptc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bptc f139085d;

    /* renamed from: e */
    private static volatile bxxk f139086e;

    /* renamed from: a */
    public int f139087a;

    /* renamed from: b */
    public String f139088b = "";

    /* renamed from: c */
    public String f139089c = "";

    static {
        bptc bptc = new bptc();
        f139085d = bptc;
        GeneratedMessageLite.m124024a(bptc.class, bptc);
    }

    private bptc() {
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
            return GeneratedMessageLite.m124022a(f139085d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bptc();
        } else {
            if (i2 == 4) {
                return new bxvd(f139085d);
            }
            if (i2 == 5) {
                return f139085d;
            }
            bxxk bxxk = f139086e;
            if (bxxk == null) {
                synchronized (bptc.class) {
                    bxxk = f139086e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139085d);
                        f139086e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
