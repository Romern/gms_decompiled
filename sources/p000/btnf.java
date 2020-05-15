package p000;

/* renamed from: btnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnf extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btnf f149600f;

    /* renamed from: g */
    private static volatile bxxk f149601g;

    /* renamed from: a */
    public int f149602a;

    /* renamed from: b */
    public String f149603b = "";

    /* renamed from: c */
    public String f149604c = "";

    /* renamed from: d */
    public bxwc f149605d = bxxn.f165040b;

    /* renamed from: e */
    public String f149606e = "";

    static {
        btnf btnf = new btnf();
        f149600f = btnf;
        bxvk.m124024a(btnf.class, btnf);
    }

    private btnf() {
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
            return bxvk.m124022a(f149600f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ", new Object[]{"a", "b", "c", "d", bxte.class, "e"});
        } else if (i2 == 3) {
            return new btnf();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149600f;
            }
            bxxk bxxk = f149601g;
            if (bxxk == null) {
                synchronized (btnf.class) {
                    bxxk = f149601g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149600f);
                        f149601g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
