package p000;

/* renamed from: kch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kch extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final kch f23752d;

    /* renamed from: e */
    private static volatile bxxk f23753e;

    /* renamed from: a */
    public String f23754a = "";

    /* renamed from: b */
    public String f23755b = "";

    /* renamed from: c */
    public String f23756c = "";

    static {
        kch kch = new kch();
        f23752d = kch;
        GeneratedMessageLite.m124024a(kch.class, kch);
    }

    private kch() {
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
            return GeneratedMessageLite.m124022a(f23752d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kch();
        } else {
            if (i2 == 4) {
                return new bxvd(f23752d);
            }
            if (i2 == 5) {
                return f23752d;
            }
            bxxk bxxk = f23753e;
            if (bxxk == null) {
                synchronized (kch.class) {
                    bxxk = f23753e;
                    if (bxxk == null) {
                        bxxk = new bxve(f23752d);
                        f23753e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
