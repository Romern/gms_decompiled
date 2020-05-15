package p000;

/* renamed from: adiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final adiq f61831d;

    /* renamed from: e */
    private static volatile bxxk f61832e;

    /* renamed from: a */
    public long f61833a;

    /* renamed from: b */
    public String f61834b = "";

    /* renamed from: c */
    public ByteString f61835c = ByteString.f164797b;

    static {
        adiq adiq = new adiq();
        f61831d = adiq;
        GeneratedMessageLite.m124024a(adiq.class, adiq);
    }

    private adiq() {
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
            return GeneratedMessageLite.m124022a(f61831d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new adiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f61831d);
            }
            if (i2 == 5) {
                return f61831d;
            }
            bxxk bxxk = f61832e;
            if (bxxk == null) {
                synchronized (adiq.class) {
                    bxxk = f61832e;
                    if (bxxk == null) {
                        bxxk = new bxve(f61831d);
                        f61832e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
