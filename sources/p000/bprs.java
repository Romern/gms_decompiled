package p000;

/* renamed from: bprs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprs extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bprs f138894c;

    /* renamed from: d */
    private static volatile bxxk f138895d;

    /* renamed from: a */
    public bxwc f138896a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f138897b = bxxn.f165040b;

    static {
        bprs bprs = new bprs();
        f138894c = bprs;
        GeneratedMessageLite.m124024a(bprs.class, bprs);
    }

    private bprs() {
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
            return GeneratedMessageLite.m124022a(f138894c, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"a", bprt.class, "b", bpov.class});
        } else if (i2 == 3) {
            return new bprs();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138894c;
            }
            bxxk bxxk = f138895d;
            if (bxxk == null) {
                synchronized (bprs.class) {
                    bxxk = f138895d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138894c);
                        f138895d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
