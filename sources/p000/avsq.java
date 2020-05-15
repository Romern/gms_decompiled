package p000;

/* renamed from: avsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avsq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final avsq f93848d;

    /* renamed from: e */
    private static volatile bxxk f93849e;

    /* renamed from: a */
    public String f93850a = "";

    /* renamed from: b */
    public long f93851b;

    /* renamed from: c */
    public long f93852c;

    static {
        avsq avsq = new avsq();
        f93848d = avsq;
        GeneratedMessageLite.m124024a(avsq.class, avsq);
    }

    private avsq() {
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
            return GeneratedMessageLite.m124022a(f93848d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new avsq();
        } else {
            if (i2 == 4) {
                return new bxvd(f93848d);
            }
            if (i2 == 5) {
                return f93848d;
            }
            bxxk bxxk = f93849e;
            if (bxxk == null) {
                synchronized (avsq.class) {
                    bxxk = f93849e;
                    if (bxxk == null) {
                        bxxk = new bxve(f93848d);
                        f93849e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
