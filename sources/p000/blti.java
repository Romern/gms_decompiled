package p000;

/* renamed from: blti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blti extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blti f127703c;

    /* renamed from: e */
    private static volatile bxxk f127704e;

    /* renamed from: a */
    public String f127705a = "";

    /* renamed from: b */
    public String f127706b = "";

    /* renamed from: d */
    private int f127707d;

    static {
        blti blti = new blti();
        f127703c = blti;
        GeneratedMessageLite.m124024a(blti.class, blti);
    }

    private blti() {
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
            return GeneratedMessageLite.m124022a(f127703c, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blti();
        } else {
            if (i2 == 4) {
                return new bxvd(f127703c);
            }
            if (i2 == 5) {
                return f127703c;
            }
            bxxk bxxk = f127704e;
            if (bxxk == null) {
                synchronized (blti.class) {
                    bxxk = f127704e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127703c);
                        f127704e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
