package p000;

/* renamed from: bipg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxvu f121155c = new bipf();

    /* renamed from: d */
    public static final bipg f121156d;

    /* renamed from: g */
    private static volatile bxxk f121157g;

    /* renamed from: a */
    public String f121158a = "";

    /* renamed from: b */
    public bxvt f121159b = bxvm.f164965b;

    /* renamed from: e */
    private int f121160e;

    /* renamed from: f */
    private byte f121161f = 2;

    static {
        bipg bipg = new bipg();
        f121156d = bipg;
        GeneratedMessageLite.m124024a(bipg.class, bipg);
    }

    private bipg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121161f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121161f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121156d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0002,", new Object[]{"e", "a", "b", bipc.m102688b()});
        } else if (i2 == 3) {
            return new bipg();
        } else {
            if (i2 == 4) {
                return new bxvd(f121156d);
            }
            if (i2 == 5) {
                return f121156d;
            }
            bxxk bxxk = f121157g;
            if (bxxk == null) {
                synchronized (bipg.class) {
                    bxxk = f121157g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121156d);
                        f121157g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
