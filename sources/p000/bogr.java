package p000;

/* renamed from: bogr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bogr f133020d;

    /* renamed from: e */
    private static volatile bxxk f133021e;

    /* renamed from: a */
    public int f133022a;

    /* renamed from: b */
    public long f133023b;

    /* renamed from: c */
    public bxvw f133024c = bxwq.f165002b;

    static {
        bogr bogr = new bogr();
        f133020d = bogr;
        GeneratedMessageLite.m124024a(bogr.class, bogr);
    }

    private bogr() {
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
            return GeneratedMessageLite.m124022a(f133020d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u0014", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bogr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133020d;
            }
            bxxk bxxk = f133021e;
            if (bxxk == null) {
                synchronized (bogr.class) {
                    bxxk = f133021e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133020d);
                        f133021e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
