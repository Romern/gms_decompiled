package p000;

/* renamed from: bomx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bomx f133732c;

    /* renamed from: d */
    private static volatile bxxk f133733d;

    /* renamed from: a */
    public int f133734a;

    /* renamed from: b */
    public String f133735b = "";

    static {
        bomx bomx = new bomx();
        f133732c = bomx;
        GeneratedMessageLite.m124024a(bomx.class, bomx);
    }

    private bomx() {
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
            return GeneratedMessageLite.m124022a(f133732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bomx();
        } else {
            if (i2 == 4) {
                return new bxvd(f133732c);
            }
            if (i2 == 5) {
                return f133732c;
            }
            bxxk bxxk = f133733d;
            if (bxxk == null) {
                synchronized (bomx.class) {
                    bxxk = f133733d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133732c);
                        f133733d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
