package p000;

/* renamed from: cbjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbjp f177352b;

    /* renamed from: c */
    private static volatile bxxk f177353c;

    /* renamed from: a */
    public int f177354a;

    static {
        cbjp cbjp = new cbjp();
        f177352b = cbjp;
        GeneratedMessageLite.m124024a(cbjp.class, cbjp);
    }

    private cbjp() {
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
            return GeneratedMessageLite.m124022a(f177352b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbjp();
        } else {
            if (i2 == 4) {
                return new bxvd(f177352b);
            }
            if (i2 == 5) {
                return f177352b;
            }
            bxxk bxxk = f177353c;
            if (bxxk == null) {
                synchronized (cbjp.class) {
                    bxxk = f177353c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177352b);
                        f177353c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
