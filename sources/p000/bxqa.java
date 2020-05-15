package p000;

/* renamed from: bxqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqa extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxqa f164349b;

    /* renamed from: d */
    private static volatile bxxk f164350d;

    /* renamed from: a */
    public bxwc f164351a = bxxn.f165040b;

    /* renamed from: c */
    private byte f164352c = 2;

    static {
        bxqa bxqa = new bxqa();
        f164349b = bxqa;
        GeneratedMessageLite.m124024a(bxqa.class, bxqa);
    }

    private bxqa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164352c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164352c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f164349b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bxpz.class});
        } else if (i2 == 3) {
            return new bxqa();
        } else {
            if (i2 == 4) {
                return new bxvd(f164349b);
            }
            if (i2 == 5) {
                return f164349b;
            }
            bxxk bxxk = f164350d;
            if (bxxk == null) {
                synchronized (bxqa.class) {
                    bxxk = f164350d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164349b);
                        f164350d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
