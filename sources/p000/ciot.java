package p000;

/* renamed from: ciot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciot extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ciot f191135d;

    /* renamed from: e */
    private static volatile bxxk f191136e;

    /* renamed from: a */
    public int f191137a;

    /* renamed from: b */
    public long f191138b;

    /* renamed from: c */
    public int f191139c;

    static {
        ciot ciot = new ciot();
        f191135d = ciot;
        bxvk.m124024a(ciot.class, ciot);
    }

    private ciot() {
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
            return bxvk.m124022a(f191135d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", cins.f190980a});
        } else if (i2 == 3) {
            return new ciot();
        } else {
            if (i2 == 4) {
                return new bxvd(f191135d);
            }
            if (i2 == 5) {
                return f191135d;
            }
            bxxk bxxk = f191136e;
            if (bxxk == null) {
                synchronized (ciot.class) {
                    bxxk = f191136e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191135d);
                        f191136e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
