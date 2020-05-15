package p000;

/* renamed from: abdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final abdp f57112g;

    /* renamed from: h */
    private static volatile bxxk f57113h;

    /* renamed from: a */
    public int f57114a;

    /* renamed from: b */
    public String f57115b = "";

    /* renamed from: c */
    public String f57116c = "";

    /* renamed from: d */
    public String f57117d = "";

    /* renamed from: e */
    public bxwc f57118e = bxxn.f165040b;

    /* renamed from: f */
    public abea f57119f;

    static {
        abdp abdp = new abdp();
        f57112g = abdp;
        bxvk.m124024a(abdp.class, abdp);
    }

    private abdp() {
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
            return bxvk.m124022a(f57112g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", bzoy.class, "f"});
        } else if (i2 == 3) {
            return new abdp();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f57112g;
            }
            bxxk bxxk = f57113h;
            if (bxxk == null) {
                synchronized (abdp.class) {
                    bxxk = f57113h;
                    if (bxxk == null) {
                        bxxk = new bxve(f57112g);
                        f57113h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
