package p000;

/* renamed from: cbmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmg extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbmg f177616d;

    /* renamed from: e */
    private static volatile bxxk f177617e;

    /* renamed from: a */
    public String f177618a = "";

    /* renamed from: b */
    public long f177619b;

    /* renamed from: c */
    public int f177620c;

    static {
        cbmg cbmg = new cbmg();
        f177616d = cbmg;
        GeneratedMessageLite.m124024a(cbmg.class, cbmg);
    }

    private cbmg() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f177616d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f177616d);
            }
            if (i2 == 5) {
                return f177616d;
            }
            bxxk bxxk = f177617e;
            if (bxxk == null) {
                synchronized (cbmg.class) {
                    bxxk = f177617e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177616d);
                        f177617e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
