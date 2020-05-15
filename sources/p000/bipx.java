package p000;

/* renamed from: bipx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bipx f121233d;

    /* renamed from: e */
    private static volatile bxxk f121234e;

    /* renamed from: a */
    public int f121235a;

    /* renamed from: b */
    public int f121236b;

    /* renamed from: c */
    public bxvt f121237c = bxvm.f164965b;

    static {
        bipx bipx = new bipx();
        f121233d = bipx;
        GeneratedMessageLite.m124024a(bipx.class, bipx);
    }

    private bipx() {
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
            return GeneratedMessageLite.m124022a(f121233d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bipx();
        } else {
            if (i2 == 4) {
                return new bxvd(f121233d);
            }
            if (i2 == 5) {
                return f121233d;
            }
            bxxk bxxk = f121234e;
            if (bxxk == null) {
                synchronized (bipx.class) {
                    bxxk = f121234e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121233d);
                        f121234e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
