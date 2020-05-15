package p000;

/* renamed from: byho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byho extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byho f166484c;

    /* renamed from: d */
    private static volatile bxxk f166485d;

    /* renamed from: a */
    public int f166486a;

    /* renamed from: b */
    public String f166487b = "";

    static {
        byho byho = new byho();
        f166484c = byho;
        GeneratedMessageLite.m124024a(byho.class, byho);
    }

    private byho() {
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
            return GeneratedMessageLite.m124022a(f166484c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byho();
        } else {
            if (i2 == 4) {
                return new bxvd(f166484c);
            }
            if (i2 == 5) {
                return f166484c;
            }
            bxxk bxxk = f166485d;
            if (bxxk == null) {
                synchronized (byho.class) {
                    bxxk = f166485d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166484c);
                        f166485d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
