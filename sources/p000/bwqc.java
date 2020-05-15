package p000;

/* renamed from: bwqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwqc f160636b;

    /* renamed from: c */
    public static final bxvj f160637c;

    /* renamed from: d */
    private static volatile bxxk f160638d;

    /* renamed from: a */
    public bxwc f160639a = bxxn.f165040b;

    static {
        bwqc bwqc = new bwqc();
        f160636b = bwqc;
        GeneratedMessageLite.m124024a(bwqc.class, bwqc);
        bwny bwny = bwny.f160414k;
        bwqc bwqc2 = f160636b;
        f160637c = GeneratedMessageLite.m124006a(bwny, bwqc2, bwqc2, 275110909, bxzf.MESSAGE);
    }

    private bwqc() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f160636b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bwpz.class});
        } else if (i2 == 3) {
            return new bwqc();
        } else {
            if (i2 == 4) {
                return new bxvd(f160636b);
            }
            if (i2 == 5) {
                return f160636b;
            }
            bxxk bxxk = f160638d;
            if (bxxk == null) {
                synchronized (bwqc.class) {
                    bxxk = f160638d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160636b);
                        f160638d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
