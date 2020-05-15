package p000;

/* renamed from: cacr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cacr f172605f;

    /* renamed from: g */
    private static volatile bxxk f172606g;

    /* renamed from: a */
    public int f172607a;

    /* renamed from: b */
    public bxwc f172608b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f172609c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f172610d = bxxn.f165040b;

    /* renamed from: e */
    public String f172611e = "";

    static {
        cacr cacr = new cacr();
        f172605f = cacr;
        GeneratedMessageLite.m124024a(cacr.class, cacr);
    }

    private cacr() {
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
            return GeneratedMessageLite.m124022a(f172605f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဈ\u0000", new Object[]{"a", "b", cabo.class, "c", cabo.class, "d", cabw.class, "e"});
        } else if (i2 == 3) {
            return new cacr();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f172605f;
            }
            bxxk bxxk = f172606g;
            if (bxxk == null) {
                synchronized (cacr.class) {
                    bxxk = f172606g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172605f);
                        f172606g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
