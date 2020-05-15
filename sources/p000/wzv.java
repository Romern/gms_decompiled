package p000;

/* renamed from: wzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzv extends bxvk implements bxxd {

    /* renamed from: h */
    public static final wzv f51646h;

    /* renamed from: i */
    private static volatile bxxk f51647i;

    /* renamed from: a */
    public int f51648a;

    /* renamed from: b */
    public int f51649b;

    /* renamed from: c */
    public int f51650c;

    /* renamed from: d */
    public boolean f51651d;

    /* renamed from: e */
    public int f51652e;

    /* renamed from: f */
    public String f51653f = "";

    /* renamed from: g */
    public String f51654g = "";

    static {
        wzv wzv = new wzv();
        f51646h = wzv;
        bxvk.m124024a(wzv.class, wzv);
    }

    private wzv() {
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
            return bxvk.m124022a(f51646h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", wzs.m42539b(), "c", wzu.m42543b(), "d", "e", wzq.f51627a, "f", "g"});
        } else if (i2 == 3) {
            return new wzv();
        } else {
            if (i2 == 4) {
                return new bxvd(f51646h);
            }
            if (i2 == 5) {
                return f51646h;
            }
            bxxk bxxk = f51647i;
            if (bxxk == null) {
                synchronized (wzv.class) {
                    bxxk = f51647i;
                    if (bxxk == null) {
                        bxxk = new bxve(f51646h);
                        f51647i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
