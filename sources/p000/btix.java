package p000;

/* renamed from: btix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btix extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btix f149049d;

    /* renamed from: e */
    private static volatile bxxk f149050e;

    /* renamed from: a */
    public String f149051a = "";

    /* renamed from: b */
    public String f149052b = "";

    /* renamed from: c */
    public String f149053c = "";

    static {
        btix btix = new btix();
        f149049d = btix;
        GeneratedMessageLite.m124024a(btix.class, btix);
    }

    private btix() {
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
            return GeneratedMessageLite.m124022a(f149049d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btix();
        } else {
            if (i2 == 4) {
                return new bxvd(f149049d);
            }
            if (i2 == 5) {
                return f149049d;
            }
            bxxk bxxk = f149050e;
            if (bxxk == null) {
                synchronized (btix.class) {
                    bxxk = f149050e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149049d);
                        f149050e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
