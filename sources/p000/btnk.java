package p000;

/* renamed from: btnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnk extends bxvk implements bxxd {

    /* renamed from: j */
    public static final btnk f149635j;

    /* renamed from: k */
    private static volatile bxxk f149636k;

    /* renamed from: a */
    public String f149637a = "";

    /* renamed from: b */
    public String f149638b = "";

    /* renamed from: c */
    public String f149639c = "";

    /* renamed from: d */
    public String f149640d = "";

    /* renamed from: e */
    public int f149641e;

    /* renamed from: f */
    public int f149642f;

    /* renamed from: g */
    public String f149643g = "";

    /* renamed from: h */
    public String f149644h = "";

    /* renamed from: i */
    public String f149645i = "";

    static {
        btnk btnk = new btnk();
        f149635j = btnk;
        bxvk.m124024a(btnk.class, btnk);
    }

    private btnk() {
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
            return bxvk.m124022a(f149635j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004\u0007Ȉ\bȈ\tȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new btnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f149635j);
            }
            if (i2 == 5) {
                return f149635j;
            }
            bxxk bxxk = f149636k;
            if (bxxk == null) {
                synchronized (btnk.class) {
                    bxxk = f149636k;
                    if (bxxk == null) {
                        bxxk = new bxve(f149635j);
                        f149636k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
