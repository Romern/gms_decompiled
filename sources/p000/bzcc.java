package p000;

/* renamed from: bzcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzcc f169297b;

    /* renamed from: d */
    private static volatile bxxk f169298d;

    /* renamed from: a */
    public bxwc f169299a = bxxn.f165040b;

    /* renamed from: c */
    private byte f169300c = 2;

    static {
        bzcc bzcc = new bzcc();
        f169297b = bzcc;
        GeneratedMessageLite.m124024a(bzcc.class, bzcc);
    }

    private bzcc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169300c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169300c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169297b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", byzp.class});
        } else if (i2 == 3) {
            return new bzcc();
        } else {
            if (i2 == 4) {
                return new bxvd(f169297b);
            }
            if (i2 == 5) {
                return f169297b;
            }
            bxxk bxxk = f169298d;
            if (bxxk == null) {
                synchronized (bzcc.class) {
                    bxxk = f169298d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169297b);
                        f169298d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
