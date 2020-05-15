package p000;

/* renamed from: byuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byuw extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final byuw f168380j;

    /* renamed from: l */
    private static volatile bxxk f168381l;

    /* renamed from: a */
    public int f168382a;

    /* renamed from: b */
    public byyg f168383b;

    /* renamed from: c */
    public byyg f168384c;

    /* renamed from: d */
    public byyg f168385d;

    /* renamed from: e */
    public byyg f168386e;

    /* renamed from: f */
    public byyg f168387f;

    /* renamed from: g */
    public byux f168388g;

    /* renamed from: h */
    public byux f168389h;

    /* renamed from: i */
    public byux f168390i;

    /* renamed from: k */
    private byte f168391k = 2;

    static {
        byuw byuw = new byuw();
        f168380j = byuw;
        GeneratedMessageLite.m124024a(byuw.class, byuw);
    }

    private byuw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168391k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168391k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168380j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new byuw();
        } else {
            if (i2 == 4) {
                return new bxvd(f168380j);
            }
            if (i2 == 5) {
                return f168380j;
            }
            bxxk bxxk = f168381l;
            if (bxxk == null) {
                synchronized (byuw.class) {
                    bxxk = f168381l;
                    if (bxxk == null) {
                        bxxk = new bxve(f168380j);
                        f168381l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
