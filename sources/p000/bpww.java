package p000;

/* renamed from: bpww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpww extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bpww f139580b;

    /* renamed from: c */
    private static volatile bxxk f139581c;

    /* renamed from: a */
    public bxwc f139582a = bxxn.f165040b;

    static {
        bpww bpww = new bpww();
        f139580b = bpww;
        GeneratedMessageLite.m124024a(bpww.class, bpww);
    }

    private bpww() {
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
            return GeneratedMessageLite.m124022a(f139580b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpyl.class});
        } else if (i2 == 3) {
            return new bpww();
        } else {
            if (i2 == 4) {
                return new bpwv();
            }
            if (i2 == 5) {
                return f139580b;
            }
            bxxk bxxk = f139581c;
            if (bxxk == null) {
                synchronized (bpww.class) {
                    bxxk = f139581c;
                    if (bxxk == null) {
                        bxxk = new bxve(f139580b);
                        f139581c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
