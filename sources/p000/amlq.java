package p000;

/* renamed from: amlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final amlq f75203f;

    /* renamed from: g */
    private static volatile bxxk f75204g;

    /* renamed from: a */
    public int f75205a;

    /* renamed from: b */
    public int f75206b;

    /* renamed from: c */
    public int f75207c;

    /* renamed from: d */
    public bxwc f75208d = bxxn.f165040b;

    /* renamed from: e */
    public amlo f75209e;

    static {
        amlq amlq = new amlq();
        f75203f = amlq;
        GeneratedMessageLite.m124024a(amlq.class, amlq);
    }

    private amlq() {
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
            return GeneratedMessageLite.m124022a(f75203f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"a", "b", "c", amlp.f75202a, "d", amln.class, "e"});
        } else if (i2 == 3) {
            return new amlq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f75203f;
            }
            bxxk bxxk = f75204g;
            if (bxxk == null) {
                synchronized (amlq.class) {
                    bxxk = f75204g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75203f);
                        f75204g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
