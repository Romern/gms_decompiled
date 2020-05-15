package p000;

/* renamed from: btnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnm extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btnm f149652f;

    /* renamed from: g */
    private static volatile bxxk f149653g;

    /* renamed from: a */
    public String f149654a = "";

    /* renamed from: b */
    public String f149655b = "";

    /* renamed from: c */
    public String f149656c = "";

    /* renamed from: d */
    public int f149657d;

    /* renamed from: e */
    public String f149658e = "";

    static {
        btnm btnm = new btnm();
        f149652f = btnm;
        GeneratedMessageLite.m124024a(btnm.class, btnm);
    }

    private btnm() {
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
            return GeneratedMessageLite.m124022a(f149652f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btnm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149652f);
            }
            if (i2 == 5) {
                return f149652f;
            }
            bxxk bxxk = f149653g;
            if (bxxk == null) {
                synchronized (btnm.class) {
                    bxxk = f149653g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149652f);
                        f149653g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
