package p000;

/* renamed from: bozp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bozp extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bozp f135396h;

    /* renamed from: i */
    private static volatile bxxk f135397i;

    /* renamed from: a */
    public int f135398a;

    /* renamed from: b */
    public boolean f135399b;

    /* renamed from: c */
    public int f135400c;

    /* renamed from: d */
    public int f135401d;

    /* renamed from: e */
    public boolean f135402e;

    /* renamed from: f */
    public int f135403f;

    /* renamed from: g */
    public boolean f135404g;

    static {
        bozp bozp = new bozp();
        f135396h = bozp;
        GeneratedMessageLite.m124024a(bozp.class, bozp);
    }

    private bozp() {
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
            return GeneratedMessageLite.m124022a(f135396h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", bozo.f135395a, "d", bozm.f135393a, "e", "f", bozn.f135394a, "g"});
        } else if (i2 == 3) {
            return new bozp();
        } else {
            if (i2 == 4) {
                return new bxvd(f135396h);
            }
            if (i2 == 5) {
                return f135396h;
            }
            bxxk bxxk = f135397i;
            if (bxxk == null) {
                synchronized (bozp.class) {
                    bxxk = f135397i;
                    if (bxxk == null) {
                        bxxk = new bxve(f135396h);
                        f135397i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
