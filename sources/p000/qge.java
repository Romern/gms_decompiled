package p000;

/* renamed from: qge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qge extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final qge f41150j;

    /* renamed from: k */
    private static volatile bxxk f41151k;

    /* renamed from: a */
    public int f41152a;

    /* renamed from: b */
    public qgd f41153b;

    /* renamed from: c */
    public long f41154c;

    /* renamed from: d */
    public long f41155d;

    /* renamed from: e */
    public boolean f41156e;

    /* renamed from: f */
    public boolean f41157f;

    /* renamed from: g */
    public boolean f41158g;

    /* renamed from: h */
    public long f41159h;

    /* renamed from: i */
    public long f41160i;

    static {
        qge qge = new qge();
        f41150j = qge;
        GeneratedMessageLite.m124024a(qge.class, qge);
    }

    private qge() {
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
            return GeneratedMessageLite.m124022a(f41150j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new qge();
        } else {
            if (i2 == 4) {
                return new bxvd(f41150j);
            }
            if (i2 == 5) {
                return f41150j;
            }
            bxxk bxxk = f41151k;
            if (bxxk == null) {
                synchronized (qge.class) {
                    bxxk = f41151k;
                    if (bxxk == null) {
                        bxxk = new bxve(f41150j);
                        f41151k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
