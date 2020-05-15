package p000;

/* renamed from: cacm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cacm f172578b;

    /* renamed from: c */
    private static volatile bxxk f172579c;

    /* renamed from: a */
    public bxwc f172580a = bxxn.f165040b;

    static {
        cacm cacm = new cacm();
        f172578b = cacm;
        GeneratedMessageLite.m124024a(cacm.class, cacm);
    }

    private cacm() {
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
            return GeneratedMessageLite.m124022a(f172578b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cacl.class});
        } else if (i2 == 3) {
            return new cacm();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f172578b;
            }
            bxxk bxxk = f172579c;
            if (bxxk == null) {
                synchronized (cacm.class) {
                    bxxk = f172579c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172578b);
                        f172579c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
