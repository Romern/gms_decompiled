package p000;

/* renamed from: bxsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxsf f164674e;

    /* renamed from: f */
    private static volatile bxxk f164675f;

    /* renamed from: a */
    public int f164676a;

    /* renamed from: b */
    public bxsi f164677b;

    /* renamed from: c */
    public bxsk f164678c;

    /* renamed from: d */
    public bxsk f164679d;

    static {
        bxsf bxsf = new bxsf();
        f164674e = bxsf;
        GeneratedMessageLite.m124024a(bxsf.class, bxsf);
    }

    private bxsf() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f164674e, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0005\u0011ဉ\u0006", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxsf();
        } else {
            if (i2 == 4) {
                return new bxvd(f164674e);
            }
            if (i2 == 5) {
                return f164674e;
            }
            bxxk bxxk = f164675f;
            if (bxxk == null) {
                synchronized (bxsf.class) {
                    bxxk = f164675f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164674e);
                        f164675f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
