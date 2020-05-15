package p000;

/* renamed from: bspx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bspx f146596d;

    /* renamed from: e */
    private static volatile bxxk f146597e;

    /* renamed from: a */
    public int f146598a;

    /* renamed from: b */
    public String f146599b = "";

    /* renamed from: c */
    public boolean f146600c;

    static {
        bspx bspx = new bspx();
        f146596d = bspx;
        GeneratedMessageLite.m124024a(bspx.class, bspx);
    }

    private bspx() {
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
            return GeneratedMessageLite.m124022a(f146596d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bspx();
        } else {
            if (i2 == 4) {
                return new bxvd(f146596d);
            }
            if (i2 == 5) {
                return f146596d;
            }
            bxxk bxxk = f146597e;
            if (bxxk == null) {
                synchronized (bspx.class) {
                    bxxk = f146597e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146596d);
                        f146597e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
