package p000;

/* renamed from: btys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btys extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btys f152975e;

    /* renamed from: f */
    private static volatile bxxk f152976f;

    /* renamed from: a */
    public int f152977a;

    /* renamed from: b */
    public long f152978b;

    /* renamed from: c */
    public boolean f152979c;

    /* renamed from: d */
    public int f152980d;

    static {
        btys btys = new btys();
        f152975e = btys;
        bxvk.m124024a(btys.class, btys);
    }

    private btys() {
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
            return bxvk.m124022a(f152975e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0007ဌ\u0006", new Object[]{"a", "b", "c", "d", btyr.f152974a});
        } else if (i2 == 3) {
            return new btys();
        } else {
            if (i2 == 4) {
                return new bxvd(f152975e);
            }
            if (i2 == 5) {
                return f152975e;
            }
            bxxk bxxk = f152976f;
            if (bxxk == null) {
                synchronized (btys.class) {
                    bxxk = f152976f;
                    if (bxxk == null) {
                        bxxk = new bxve(f152975e);
                        f152976f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
