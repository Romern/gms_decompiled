package p000;

/* renamed from: bwin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwin extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxvu f159651d = new bwik();

    /* renamed from: e */
    public static final bwin f159652e;

    /* renamed from: h */
    private static volatile bxxk f159653h;

    /* renamed from: a */
    public bxwc f159654a = bxxn.f165040b;

    /* renamed from: b */
    public long f159655b;

    /* renamed from: c */
    public bxvt f159656c = bxvm.f164965b;

    /* renamed from: f */
    private int f159657f;

    /* renamed from: g */
    private byte f159658g = 2;

    static {
        bwin bwin = new bwin();
        f159652e = bwin;
        GeneratedMessageLite.m124024a(bwin.class, bwin);
    }

    private bwin() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159658g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159658g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159652e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0002\u0001\u0001Л\u0003ဂ\u0001\t\u001e", new Object[]{"f", "a", bwij.class, "b", "c", bwim.m121994b()});
        } else if (i2 == 3) {
            return new bwin();
        } else {
            if (i2 == 4) {
                return new bxvd(f159652e);
            }
            if (i2 == 5) {
                return f159652e;
            }
            bxxk bxxk = f159653h;
            if (bxxk == null) {
                synchronized (bwin.class) {
                    bxxk = f159653h;
                    if (bxxk == null) {
                        bxxk = new bxve(f159652e);
                        f159653h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
