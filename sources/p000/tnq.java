package p000;

/* renamed from: tnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnq extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final tnq f46322h;

    /* renamed from: i */
    private static volatile bxxk f46323i;

    /* renamed from: a */
    public int f46324a;

    /* renamed from: b */
    public String f46325b = "";

    /* renamed from: c */
    public String f46326c = "";

    /* renamed from: d */
    public String f46327d = "";

    /* renamed from: e */
    public String f46328e = "";

    /* renamed from: f */
    public tiw f46329f;

    /* renamed from: g */
    public boolean f46330g;

    static {
        tnq tnq = new tnq();
        f46322h = tnq;
        GeneratedMessageLite.m124024a(tnq.class, tnq);
    }

    private tnq() {
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
            return GeneratedMessageLite.m124022a(f46322h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new tnq();
        } else {
            if (i2 == 4) {
                return new bxvd(f46322h);
            }
            if (i2 == 5) {
                return f46322h;
            }
            bxxk bxxk = f46323i;
            if (bxxk == null) {
                synchronized (tnq.class) {
                    bxxk = f46323i;
                    if (bxxk == null) {
                        bxxk = new bxve(f46322h);
                        f46323i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
