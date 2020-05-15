package p000;

/* renamed from: bxfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxfg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxfg f163172e;

    /* renamed from: f */
    private static volatile bxxk f163173f;

    /* renamed from: a */
    public int f163174a;

    /* renamed from: b */
    public int f163175b;

    /* renamed from: c */
    public String f163176c = "";

    /* renamed from: d */
    public String f163177d = "";

    static {
        bxfg bxfg = new bxfg();
        f163172e = bxfg;
        GeneratedMessageLite.m124024a(bxfg.class, bxfg);
    }

    private bxfg() {
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
            return GeneratedMessageLite.m124022a(f163172e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bxfe.f163171a, "c", "d"});
        } else if (i2 == 3) {
            return new bxfg();
        } else {
            if (i2 == 4) {
                return new bxvd(f163172e);
            }
            if (i2 == 5) {
                return f163172e;
            }
            bxxk bxxk = f163173f;
            if (bxxk == null) {
                synchronized (bxfg.class) {
                    bxxk = f163173f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163172e);
                        f163173f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
