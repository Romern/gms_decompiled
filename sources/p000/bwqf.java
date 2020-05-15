package p000;

/* renamed from: bwqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwqf f160655b;

    /* renamed from: c */
    public static final bxvj f160656c;

    /* renamed from: d */
    private static volatile bxxk f160657d;

    /* renamed from: a */
    public bxwc f160658a = bxxn.f165040b;

    static {
        bwqf bwqf = new bwqf();
        f160655b = bwqf;
        bxvk.m124024a(bwqf.class, bwqf);
        bwog bwog = bwog.f160437f;
        bwqf bwqf2 = f160655b;
        f160656c = bxvk.m124006a(bwog, bwqf2, bwqf2, 268311950, bxzf.MESSAGE);
    }

    private bwqf() {
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
            return bxvk.m124022a(f160655b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwqg.class});
        } else if (i2 == 3) {
            return new bwqf();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f160655b;
            }
            bxxk bxxk = f160657d;
            if (bxxk == null) {
                synchronized (bwqf.class) {
                    bxxk = f160657d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160655b);
                        f160657d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
