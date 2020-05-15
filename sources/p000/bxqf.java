package p000;

/* renamed from: bxqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxqf f164373f;

    /* renamed from: g */
    private static volatile bxxk f164374g;

    /* renamed from: a */
    public int f164375a;

    /* renamed from: b */
    public bxwc f164376b = bxxn.f165040b;

    /* renamed from: c */
    public bxok f164377c;

    /* renamed from: d */
    public bxok f164378d;

    /* renamed from: e */
    public boolean f164379e;

    static {
        bxqf bxqf = new bxqf();
        f164373f = bxqf;
        GeneratedMessageLite.m124024a(bxqf.class, bxqf);
    }

    private bxqf() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f164373f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", bxqe.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bxqf();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164373f;
            }
            bxxk bxxk = f164374g;
            if (bxxk == null) {
                synchronized (bxqf.class) {
                    bxxk = f164374g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164373f);
                        f164374g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
