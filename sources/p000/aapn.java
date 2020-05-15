package p000;

/* renamed from: aapn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aapn f28810f;

    /* renamed from: g */
    private static volatile bxxk f28811g;

    /* renamed from: a */
    public int f28812a;

    /* renamed from: b */
    public long f28813b;

    /* renamed from: c */
    public long f28814c;

    /* renamed from: d */
    public long f28815d;

    /* renamed from: e */
    public bxun f28816e;

    static {
        aapn aapn = new aapn();
        f28810f = aapn;
        bxvk.m124024a(aapn.class, aapn);
    }

    private aapn() {
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
            return bxvk.m124022a(f28810f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aapn();
        } else {
            if (i2 == 4) {
                return new bxvd(f28810f);
            }
            if (i2 == 5) {
                return f28810f;
            }
            bxxk bxxk = f28811g;
            if (bxxk == null) {
                synchronized (aapn.class) {
                    bxxk = f28811g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28810f);
                        f28811g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
