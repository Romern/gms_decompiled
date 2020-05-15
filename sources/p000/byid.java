package p000;

/* renamed from: byid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byid extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byid f166547e;

    /* renamed from: g */
    private static volatile bxxk f166548g;

    /* renamed from: a */
    public bxwc f166549a = bxxn.f165040b;

    /* renamed from: b */
    public byjj f166550b;

    /* renamed from: c */
    public int f166551c;

    /* renamed from: d */
    public long f166552d;

    /* renamed from: f */
    private int f166553f;

    static {
        byid byid = new byid();
        f166547e = byid;
        GeneratedMessageLite.m124024a(byid.class, byid);
    }

    private byid() {
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
            return GeneratedMessageLite.m124022a(f166547e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဌ\u0001\u0004ဂ\u0002", new Object[]{"f", "a", bygu.class, "b", "c", byib.f166546a, "d"});
        } else if (i2 == 3) {
            return new byid();
        } else {
            if (i2 == 4) {
                return new bxvd(f166547e);
            }
            if (i2 == 5) {
                return f166547e;
            }
            bxxk bxxk = f166548g;
            if (bxxk == null) {
                synchronized (byid.class) {
                    bxxk = f166548g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166547e);
                        f166548g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
