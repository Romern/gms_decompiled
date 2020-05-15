package p000;

/* renamed from: bznc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bznc f170696b;

    /* renamed from: c */
    private static volatile bxxk f170697c;

    /* renamed from: a */
    public bxwc f170698a = bxxn.f165040b;

    static {
        bznc bznc = new bznc();
        f170696b = bznc;
        GeneratedMessageLite.m124024a(bznc.class, bznc);
    }

    private bznc() {
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
            return GeneratedMessageLite.m124022a(f170696b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzlx.class});
        } else if (i2 == 3) {
            return new bznc();
        } else {
            if (i2 == 4) {
                return new bxvd(f170696b);
            }
            if (i2 == 5) {
                return f170696b;
            }
            bxxk bxxk = f170697c;
            if (bxxk == null) {
                synchronized (bznc.class) {
                    bxxk = f170697c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170696b);
                        f170697c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
