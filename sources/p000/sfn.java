package p000;

/* renamed from: sfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final sfn f44130e;

    /* renamed from: f */
    private static volatile bxxk f44131f;

    /* renamed from: a */
    public int f44132a;

    /* renamed from: b */
    public sfo f44133b;

    /* renamed from: c */
    public String f44134c = "";

    /* renamed from: d */
    public int f44135d = 1;

    static {
        sfn sfn = new sfn();
        f44130e = sfn;
        GeneratedMessageLite.m124024a(sfn.class, sfn);
    }

    private sfn() {
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
            return GeneratedMessageLite.m124022a(f44130e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", sfp.f44141a});
        } else if (i2 == 3) {
            return new sfn();
        } else {
            if (i2 == 4) {
                return new bxvd(f44130e);
            }
            if (i2 == 5) {
                return f44130e;
            }
            bxxk bxxk = f44131f;
            if (bxxk == null) {
                synchronized (sfn.class) {
                    bxxk = f44131f;
                    if (bxxk == null) {
                        bxxk = new bxve(f44130e);
                        f44131f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
