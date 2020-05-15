package p000;

/* renamed from: bxhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxhw f163474d;

    /* renamed from: e */
    private static volatile bxxk f163475e;

    /* renamed from: a */
    public int f163476a;

    /* renamed from: b */
    public int f163477b;

    /* renamed from: c */
    public String f163478c = "";

    static {
        bxhw bxhw = new bxhw();
        f163474d = bxhw;
        GeneratedMessageLite.m124024a(bxhw.class, bxhw);
    }

    private bxhw() {
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
            return GeneratedMessageLite.m124022a(f163474d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bxhu.f163473a, "c"});
        } else if (i2 == 3) {
            return new bxhw();
        } else {
            if (i2 == 4) {
                return new bxvd(f163474d);
            }
            if (i2 == 5) {
                return f163474d;
            }
            bxxk bxxk = f163475e;
            if (bxxk == null) {
                synchronized (bxhw.class) {
                    bxxk = f163475e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163474d);
                        f163475e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
