package p000;

/* renamed from: bpaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpaq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpaq f135525e;

    /* renamed from: f */
    private static volatile bxxk f135526f;

    /* renamed from: a */
    public int f135527a;

    /* renamed from: b */
    public int f135528b;

    /* renamed from: c */
    public boxg f135529c;

    /* renamed from: d */
    public int f135530d;

    static {
        bpaq bpaq = new bpaq();
        f135525e = bpaq;
        GeneratedMessageLite.m124024a(bpaq.class, bpaq);
    }

    private bpaq() {
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
            return GeneratedMessageLite.m124022a(f135525e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bpap.f135524a, "c", "d", bpao.f135523a});
        } else if (i2 == 3) {
            return new bpaq();
        } else {
            if (i2 == 4) {
                return new bxvd(f135525e);
            }
            if (i2 == 5) {
                return f135525e;
            }
            bxxk bxxk = f135526f;
            if (bxxk == null) {
                synchronized (bpaq.class) {
                    bxxk = f135526f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135525e);
                        f135526f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
