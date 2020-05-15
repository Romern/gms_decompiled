package p000;

/* renamed from: bptf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bptf f139104b;

    /* renamed from: c */
    private static volatile bxxk f139105c;

    /* renamed from: a */
    public bxwc f139106a = bxxn.f165040b;

    static {
        bptf bptf = new bptf();
        f139104b = bptf;
        GeneratedMessageLite.m124024a(bptf.class, bptf);
    }

    private bptf() {
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
            return GeneratedMessageLite.m124022a(f139104b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpte.class});
        } else if (i2 == 3) {
            return new bptf();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f139104b;
            }
            bxxk bxxk = f139105c;
            if (bxxk == null) {
                synchronized (bptf.class) {
                    bxxk = f139105c;
                    if (bxxk == null) {
                        bxxk = new bxve(f139104b);
                        f139105c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
