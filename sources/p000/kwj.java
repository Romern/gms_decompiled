package p000;

/* renamed from: kwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final kwj f25268f;

    /* renamed from: g */
    private static volatile bxxk f25269g;

    /* renamed from: a */
    public bxvt f25270a = bxvm.f164965b;

    /* renamed from: b */
    public int f25271b;

    /* renamed from: c */
    public int f25272c;

    /* renamed from: d */
    public int f25273d;

    /* renamed from: e */
    public int f25274e;

    static {
        kwj kwj = new kwj();
        f25268f = kwj;
        GeneratedMessageLite.m124024a(kwj.class, kwj);
    }

    private kwj() {
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
            return GeneratedMessageLite.m124022a(f25268f, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0001\u0000\u0002'\u0003\u0006\u0004\u0004\u0005\u0004\u0006\f", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new kwj();
        } else {
            if (i2 == 4) {
                return new bxvd(f25268f);
            }
            if (i2 == 5) {
                return f25268f;
            }
            bxxk bxxk = f25269g;
            if (bxxk == null) {
                synchronized (kwj.class) {
                    bxxk = f25269g;
                    if (bxxk == null) {
                        bxxk = new bxve(f25268f);
                        f25269g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
