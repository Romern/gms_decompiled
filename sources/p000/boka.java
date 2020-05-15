package p000;

/* renamed from: boka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boka extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boka f133379e;

    /* renamed from: f */
    private static volatile bxxk f133380f;

    /* renamed from: a */
    public int f133381a;

    /* renamed from: b */
    public String f133382b = "";

    /* renamed from: c */
    public int f133383c;

    /* renamed from: d */
    public bojz f133384d;

    static {
        boka boka = new boka();
        f133379e = boka;
        GeneratedMessageLite.m124024a(boka.class, boka);
    }

    private boka() {
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
            return GeneratedMessageLite.m124022a(f133379e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boka();
        } else {
            if (i2 == 4) {
                return new bxvd(f133379e);
            }
            if (i2 == 5) {
                return f133379e;
            }
            bxxk bxxk = f133380f;
            if (bxxk == null) {
                synchronized (boka.class) {
                    bxxk = f133380f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133379e);
                        f133380f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
