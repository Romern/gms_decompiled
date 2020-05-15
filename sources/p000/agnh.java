package p000;

/* renamed from: agnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final agnh f66059d;

    /* renamed from: e */
    private static volatile bxxk f66060e;

    /* renamed from: a */
    public int f66061a;

    /* renamed from: b */
    public int f66062b;

    /* renamed from: c */
    public long f66063c;

    static {
        agnh agnh = new agnh();
        f66059d = agnh;
        GeneratedMessageLite.m124024a(agnh.class, agnh);
    }

    private agnh() {
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
            return GeneratedMessageLite.m124022a(f66059d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new agnh();
        } else {
            if (i2 == 4) {
                return new bxvd(f66059d);
            }
            if (i2 == 5) {
                return f66059d;
            }
            bxxk bxxk = f66060e;
            if (bxxk == null) {
                synchronized (agnh.class) {
                    bxxk = f66060e;
                    if (bxxk == null) {
                        bxxk = new bxve(f66059d);
                        f66060e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
