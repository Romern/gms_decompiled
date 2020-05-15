package p000;

/* renamed from: byzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byzz f169196e;

    /* renamed from: f */
    private static volatile bxxk f169197f;

    /* renamed from: a */
    public int f169198a;

    /* renamed from: b */
    public int f169199b;

    /* renamed from: c */
    public int f169200c;

    /* renamed from: d */
    public long f169201d;

    static {
        byzz byzz = new byzz();
        f169196e = byzz;
        GeneratedMessageLite.m124024a(byzz.class, byzz);
    }

    private byzz() {
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
            return GeneratedMessageLite.m124022a(f169196e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bzbu.m125628b(), "c", "d"});
        } else if (i2 == 3) {
            return new byzz();
        } else {
            if (i2 == 4) {
                return new bxvd(f169196e);
            }
            if (i2 == 5) {
                return f169196e;
            }
            bxxk bxxk = f169197f;
            if (bxxk == null) {
                synchronized (byzz.class) {
                    bxxk = f169197f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169196e);
                        f169197f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
