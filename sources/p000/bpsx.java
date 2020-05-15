package p000;

/* renamed from: bpsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpsx f139032c;

    /* renamed from: d */
    private static volatile bxxk f139033d;

    /* renamed from: a */
    public int f139034a;

    /* renamed from: b */
    public int f139035b;

    static {
        bpsx bpsx = new bpsx();
        f139032c = bpsx;
        GeneratedMessageLite.m124024a(bpsx.class, bpsx);
    }

    private bpsx() {
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
            return GeneratedMessageLite.m124022a(f139032c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpen.m111835b()});
        } else if (i2 == 3) {
            return new bpsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f139032c);
            }
            if (i2 == 5) {
                return f139032c;
            }
            bxxk bxxk = f139033d;
            if (bxxk == null) {
                synchronized (bpsx.class) {
                    bxxk = f139033d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139032c);
                        f139033d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
