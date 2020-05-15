package p000;

/* renamed from: bxkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxkv f163798c;

    /* renamed from: d */
    private static volatile bxxk f163799d;

    /* renamed from: a */
    public int f163800a;

    /* renamed from: b */
    public String f163801b = "";

    static {
        bxkv bxkv = new bxkv();
        f163798c = bxkv;
        GeneratedMessageLite.m124024a(bxkv.class, bxkv);
    }

    private bxkv() {
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
            return GeneratedMessageLite.m124022a(f163798c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxkv();
        } else {
            if (i2 == 4) {
                return new bxvd(f163798c);
            }
            if (i2 == 5) {
                return f163798c;
            }
            bxxk bxxk = f163799d;
            if (bxxk == null) {
                synchronized (bxkv.class) {
                    bxxk = f163799d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163798c);
                        f163799d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
