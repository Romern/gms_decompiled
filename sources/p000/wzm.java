package p000;

/* renamed from: wzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final wzm f51614c;

    /* renamed from: d */
    private static volatile bxxk f51615d;

    /* renamed from: a */
    public int f51616a;

    /* renamed from: b */
    public int f51617b;

    static {
        wzm wzm = new wzm();
        f51614c = wzm;
        GeneratedMessageLite.m124024a(wzm.class, wzm);
    }

    private wzm() {
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
            return GeneratedMessageLite.m124022a(f51614c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new wzm();
        } else {
            if (i2 == 4) {
                return new bxvd(f51614c);
            }
            if (i2 == 5) {
                return f51614c;
            }
            bxxk bxxk = f51615d;
            if (bxxk == null) {
                synchronized (wzm.class) {
                    bxxk = f51615d;
                    if (bxxk == null) {
                        bxxk = new bxve(f51614c);
                        f51615d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
