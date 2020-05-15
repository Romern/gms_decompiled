package p000;

/* renamed from: bokw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bokw f133464f;

    /* renamed from: g */
    private static volatile bxxk f133465g;

    /* renamed from: a */
    public int f133466a;

    /* renamed from: b */
    public String f133467b = "";

    /* renamed from: c */
    public boolean f133468c;

    /* renamed from: d */
    public bxwc f133469d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f133470e = bxxn.f165040b;

    static {
        bokw bokw = new bokw();
        f133464f = bokw;
        GeneratedMessageLite.m124024a(bokw.class, bokw);
    }

    private bokw() {
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
            return GeneratedMessageLite.m124022a(f133464f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"a", "b", "e", bolf.class, "d", bokv.class, "c"});
        } else if (i2 == 3) {
            return new bokw();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f133464f;
            }
            bxxk bxxk = f133465g;
            if (bxxk == null) {
                synchronized (bokw.class) {
                    bxxk = f133465g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133464f);
                        f133465g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
