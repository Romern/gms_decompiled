package p000;

/* renamed from: ajii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajii extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ajii f70710d;

    /* renamed from: e */
    private static volatile bxxk f70711e;

    /* renamed from: a */
    public int f70712a;

    /* renamed from: b */
    public long f70713b;

    /* renamed from: c */
    public String f70714c = "";

    static {
        ajii ajii = new ajii();
        f70710d = ajii;
        GeneratedMessageLite.m124024a(ajii.class, ajii);
    }

    private ajii() {
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
            return GeneratedMessageLite.m124022a(f70710d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ajii();
        } else {
            if (i2 == 4) {
                return new bxvd(f70710d);
            }
            if (i2 == 5) {
                return f70710d;
            }
            bxxk bxxk = f70711e;
            if (bxxk == null) {
                synchronized (ajii.class) {
                    bxxk = f70711e;
                    if (bxxk == null) {
                        bxxk = new bxve(f70710d);
                        f70711e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
