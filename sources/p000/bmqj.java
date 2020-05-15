package p000;

/* renamed from: bmqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmqj extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmqj f130400b;

    /* renamed from: c */
    private static volatile bxxk f130401c;

    /* renamed from: a */
    public bxwc f130402a = bxxn.f165040b;

    static {
        bmqj bmqj = new bmqj();
        f130400b = bmqj;
        GeneratedMessageLite.m124024a(bmqj.class, bmqj);
    }

    private bmqj() {
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
            return GeneratedMessageLite.m124022a(f130400b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bmqi.class});
        } else if (i2 == 3) {
            return new bmqj();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f130400b;
            }
            bxxk bxxk = f130401c;
            if (bxxk == null) {
                synchronized (bmqj.class) {
                    bxxk = f130401c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130400b);
                        f130401c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
