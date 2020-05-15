package p000;

/* renamed from: quj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class quj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final quj f42147e;

    /* renamed from: f */
    private static volatile bxxk f42148f;

    /* renamed from: a */
    public int f42149a;

    /* renamed from: b */
    public qum f42150b;

    /* renamed from: c */
    public qup f42151c;

    /* renamed from: d */
    public quh f42152d;

    static {
        quj quj = new quj();
        f42147e = quj;
        GeneratedMessageLite.m124024a(quj.class, quj);
    }

    private quj() {
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
            return GeneratedMessageLite.m124022a(f42147e, "\u0001\u0003\u0000\u0001댱%\u0003\u0000\u0000\u0000댱ဉ\u0001﹡\u0013ဉ\u0002%ဉ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new quj();
        } else {
            if (i2 == 4) {
                return new bxvd(f42147e);
            }
            if (i2 == 5) {
                return f42147e;
            }
            bxxk bxxk = f42148f;
            if (bxxk == null) {
                synchronized (quj.class) {
                    bxxk = f42148f;
                    if (bxxk == null) {
                        bxxk = new bxve(f42147e);
                        f42148f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
