package p000;

/* renamed from: ajnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnl extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ajnl f70979f;

    /* renamed from: g */
    private static volatile bxxk f70980g;

    /* renamed from: a */
    public int f70981a;

    /* renamed from: b */
    public bxwc f70982b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f70983c = bxxn.f165040b;

    /* renamed from: d */
    public String f70984d = "";

    /* renamed from: e */
    public bxwc f70985e = bxxn.f165040b;

    static {
        ajnl ajnl = new ajnl();
        f70979f = ajnl;
        bxvk.m124024a(ajnl.class, ajnl);
    }

    private ajnl() {
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
            return bxvk.m124022a(f70979f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000\u0004\u001b", new Object[]{"a", "b", ajnh.class, "c", ajnt.class, "d", "e", ajoa.class});
        } else if (i2 == 3) {
            return new ajnl();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f70979f;
            }
            bxxk bxxk = f70980g;
            if (bxxk == null) {
                synchronized (ajnl.class) {
                    bxxk = f70980g;
                    if (bxxk == null) {
                        bxxk = new bxve(f70979f);
                        f70980g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
