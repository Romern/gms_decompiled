package p000;

/* renamed from: bipz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bipz f121242e;

    /* renamed from: f */
    private static volatile bxxk f121243f;

    /* renamed from: a */
    public int f121244a;

    /* renamed from: b */
    public boolean f121245b;

    /* renamed from: c */
    public boolean f121246c;

    /* renamed from: d */
    public bxvn f121247d = bxtk.f164779b;

    static {
        bipz bipz = new bipz();
        f121242e = bipz;
        GeneratedMessageLite.m124024a(bipz.class, bipz);
    }

    private bipz() {
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
            return GeneratedMessageLite.m124022a(f121242e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u0019", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bipz();
        } else {
            if (i2 == 4) {
                return new bxvd(f121242e);
            }
            if (i2 == 5) {
                return f121242e;
            }
            bxxk bxxk = f121243f;
            if (bxxk == null) {
                synchronized (bipz.class) {
                    bxxk = f121243f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121242e);
                        f121243f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
