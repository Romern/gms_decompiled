package p000;

/* renamed from: bipe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipe f121149c;

    /* renamed from: f */
    private static volatile bxxk f121150f;

    /* renamed from: a */
    public int f121151a = 1;

    /* renamed from: b */
    public boolean f121152b;

    /* renamed from: d */
    private int f121153d;

    /* renamed from: e */
    private byte f121154e = 2;

    static {
        bipe bipe = new bipe();
        f121149c = bipe;
        GeneratedMessageLite.m124024a(bipe.class, bipe);
    }

    private bipe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121154e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121154e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121149c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔇ\u0001", new Object[]{"d", "a", bisf.m102782b(), "b"});
        } else if (i2 == 3) {
            return new bipe();
        } else {
            if (i2 == 4) {
                return new bxvd(f121149c);
            }
            if (i2 == 5) {
                return f121149c;
            }
            bxxk bxxk = f121150f;
            if (bxxk == null) {
                synchronized (bipe.class) {
                    bxxk = f121150f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121149c);
                        f121150f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
