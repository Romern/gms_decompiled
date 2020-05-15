package p000;

/* renamed from: bywu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bywu f168664f;

    /* renamed from: g */
    private static volatile bxxk f168665g;

    /* renamed from: a */
    public int f168666a;

    /* renamed from: b */
    public String f168667b = "";

    /* renamed from: c */
    public String f168668c = "";

    /* renamed from: d */
    public int f168669d;

    /* renamed from: e */
    public String f168670e = "";

    static {
        bywu bywu = new bywu();
        f168664f = bywu;
        GeneratedMessageLite.m124024a(bywu.class, bywu);
    }

    private bywu() {
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
            return GeneratedMessageLite.m124022a(f168664f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", bzbl.f169258a, "e"});
        } else if (i2 == 3) {
            return new bywu();
        } else {
            if (i2 == 4) {
                return new bxvd(f168664f);
            }
            if (i2 == 5) {
                return f168664f;
            }
            bxxk bxxk = f168665g;
            if (bxxk == null) {
                synchronized (bywu.class) {
                    bxxk = f168665g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168664f);
                        f168665g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
