package p000;

/* renamed from: btnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btnp f149670e;

    /* renamed from: f */
    private static volatile bxxk f149671f;

    /* renamed from: a */
    public String f149672a = "";

    /* renamed from: b */
    public int f149673b;

    /* renamed from: c */
    public int f149674c;

    /* renamed from: d */
    public String f149675d = "";

    static {
        btnp btnp = new btnp();
        f149670e = btnp;
        GeneratedMessageLite.m124024a(btnp.class, btnp);
    }

    private btnp() {
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
            return GeneratedMessageLite.m124022a(f149670e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f149670e);
            }
            if (i2 == 5) {
                return f149670e;
            }
            bxxk bxxk = f149671f;
            if (bxxk == null) {
                synchronized (btnp.class) {
                    bxxk = f149671f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149670e);
                        f149671f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
