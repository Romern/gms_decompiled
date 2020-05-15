package p000;

/* renamed from: absm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final absm f58115b;

    /* renamed from: c */
    private static volatile bxxk f58116c;

    /* renamed from: a */
    public bxwc f58117a = bxxn.f165040b;

    static {
        absm absm = new absm();
        f58115b = absm;
        GeneratedMessageLite.m124024a(absm.class, absm);
    }

    private absm() {
    }

    /* renamed from: a */
    public static absm m48222a(byte[] bArr) {
        GeneratedMessageLite a = GeneratedMessageLite.m124015a(f58115b, bArr, 0, bArr.length, bxus.m123743b());
        GeneratedMessageLite.m124027b(a);
        return (absm) a;
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
            return GeneratedMessageLite.m124022a(f58115b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", absl.class});
        } else if (i2 == 3) {
            return new absm();
        } else {
            if (i2 == 4) {
                return new bxvd(f58115b);
            }
            if (i2 == 5) {
                return f58115b;
            }
            bxxk bxxk = f58116c;
            if (bxxk == null) {
                synchronized (absm.class) {
                    bxxk = f58116c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58115b);
                        f58116c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
