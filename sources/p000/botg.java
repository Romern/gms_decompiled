package p000;

/* renamed from: botg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final botg f134774e;

    /* renamed from: f */
    private static volatile bxxk f134775f;

    /* renamed from: a */
    public int f134776a;

    /* renamed from: b */
    public int f134777b;

    /* renamed from: c */
    public int f134778c;

    /* renamed from: d */
    public int f134779d;

    static {
        botg botg = new botg();
        f134774e = botg;
        GeneratedMessageLite.m124024a(botg.class, botg);
    }

    private botg() {
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
            return GeneratedMessageLite.m124022a(f134774e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bote.f134772a, "c", botf.f134773a, "d", botd.f134771a});
        } else if (i2 == 3) {
            return new botg();
        } else {
            if (i2 == 4) {
                return new bxvd(f134774e);
            }
            if (i2 == 5) {
                return f134774e;
            }
            bxxk bxxk = f134775f;
            if (bxxk == null) {
                synchronized (botg.class) {
                    bxxk = f134775f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134774e);
                        f134775f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
