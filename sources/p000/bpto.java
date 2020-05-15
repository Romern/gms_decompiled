package p000;

/* renamed from: bpto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpto extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpto f139149e;

    /* renamed from: f */
    private static volatile bxxk f139150f;

    /* renamed from: a */
    public int f139151a;

    /* renamed from: b */
    public String f139152b = "";

    /* renamed from: c */
    public bxwc f139153c;

    /* renamed from: d */
    public boolean f139154d;

    static {
        bpto bpto = new bpto();
        f139149e = bpto;
        GeneratedMessageLite.m124024a(bpto.class, bpto);
    }

    private bpto() {
        bxxn bxxn = bxxn.f165040b;
        this.f139153c = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f139149e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဇ\u0001", new Object[]{"a", "b", "c", bptc.class, "d"});
        } else if (i2 == 3) {
            return new bpto();
        } else {
            if (i2 == 4) {
                return new bptn();
            }
            if (i2 == 5) {
                return f139149e;
            }
            bxxk bxxk = f139150f;
            if (bxxk == null) {
                synchronized (bpto.class) {
                    bxxk = f139150f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139149e);
                        f139150f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
