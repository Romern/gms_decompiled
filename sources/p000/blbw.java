package p000;

/* renamed from: blbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blbw f125875b;

    /* renamed from: d */
    private static volatile bxxk f125876d;

    /* renamed from: a */
    public bxwc f125877a = bxxn.f165040b;

    /* renamed from: c */
    private byte f125878c = 2;

    static {
        blbw blbw = new blbw();
        f125875b = blbw;
        GeneratedMessageLite.m124024a(blbw.class, blbw);
    }

    private blbw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125878c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125878c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125875b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", blby.class});
        } else if (i2 == 3) {
            return new blbw();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f125875b;
            }
            bxxk bxxk = f125876d;
            if (bxxk == null) {
                synchronized (blbw.class) {
                    bxxk = f125876d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125875b);
                        f125876d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
