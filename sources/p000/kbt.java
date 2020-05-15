package p000;

/* renamed from: kbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kbt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kbt f23714c;

    /* renamed from: d */
    private static volatile bxxk f23715d;

    /* renamed from: a */
    public String f23716a = "";

    /* renamed from: b */
    public String f23717b = "";

    static {
        kbt kbt = new kbt();
        f23714c = kbt;
        GeneratedMessageLite.m124024a(kbt.class, kbt);
    }

    private kbt() {
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
            return GeneratedMessageLite.m124022a(f23714c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f23714c);
            }
            if (i2 == 5) {
                return f23714c;
            }
            bxxk bxxk = f23715d;
            if (bxxk == null) {
                synchronized (kbt.class) {
                    bxxk = f23715d;
                    if (bxxk == null) {
                        bxxk = new bxve(f23714c);
                        f23715d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
