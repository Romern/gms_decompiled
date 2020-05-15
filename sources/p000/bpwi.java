package p000;

/* renamed from: bpwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwi extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bpwi f139493h;

    /* renamed from: i */
    private static volatile bxxk f139494i;

    /* renamed from: a */
    public int f139495a;

    /* renamed from: b */
    public boolean f139496b;

    /* renamed from: c */
    public boolean f139497c;

    /* renamed from: d */
    public bpwg f139498d;

    /* renamed from: e */
    public boolean f139499e;

    /* renamed from: f */
    public bpwd f139500f;

    /* renamed from: g */
    public bxwc f139501g = bxxn.f165040b;

    static {
        bpwi bpwi = new bpwi();
        f139493h = bpwi;
        bxvk.m124024a(bpwi.class, bpwi);
    }

    private bpwi() {
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
            return bxvk.m124022a(f139493h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", bpwh.class});
        } else if (i2 == 3) {
            return new bpwi();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f139493h;
            }
            bxxk bxxk = f139494i;
            if (bxxk == null) {
                synchronized (bpwi.class) {
                    bxxk = f139494i;
                    if (bxxk == null) {
                        bxxk = new bxve(f139493h);
                        f139494i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
