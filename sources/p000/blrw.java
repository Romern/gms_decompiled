package p000;

/* renamed from: blrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blrw f127541c;

    /* renamed from: d */
    private static volatile bxxk f127542d;

    /* renamed from: a */
    public int f127543a;

    /* renamed from: b */
    public String f127544b = "";

    static {
        blrw blrw = new blrw();
        f127541c = blrw;
        GeneratedMessageLite.m124024a(blrw.class, blrw);
    }

    private blrw() {
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
            return GeneratedMessageLite.m124022a(f127541c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blrw();
        } else {
            if (i2 == 4) {
                return new bxvd(f127541c);
            }
            if (i2 == 5) {
                return f127541c;
            }
            bxxk bxxk = f127542d;
            if (bxxk == null) {
                synchronized (blrw.class) {
                    bxxk = f127542d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127541c);
                        f127542d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
