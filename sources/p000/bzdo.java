package p000;

/* renamed from: bzdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzdo f169528f;

    /* renamed from: g */
    private static volatile bxxk f169529g;

    /* renamed from: a */
    public int f169530a;

    /* renamed from: b */
    public String f169531b = "";

    /* renamed from: c */
    public String f169532c = "";

    /* renamed from: d */
    public bxvw f169533d = bxwq.f165002b;

    /* renamed from: e */
    public boolean f169534e;

    static {
        bzdo bzdo = new bzdo();
        f169528f = bzdo;
        GeneratedMessageLite.m124024a(bzdo.class, bzdo);
    }

    private bzdo() {
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
            return GeneratedMessageLite.m124022a(f169528f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u0015\u0005ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzdo();
        } else {
            if (i2 == 4) {
                return new bzdn();
            }
            if (i2 == 5) {
                return f169528f;
            }
            bxxk bxxk = f169529g;
            if (bxxk == null) {
                synchronized (bzdo.class) {
                    bxxk = f169529g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169528f);
                        f169529g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
