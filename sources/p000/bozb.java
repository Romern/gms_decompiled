package p000;

/* renamed from: bozb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bozb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bozb f135362e;

    /* renamed from: f */
    private static volatile bxxk f135363f;

    /* renamed from: a */
    public int f135364a;

    /* renamed from: b */
    public int f135365b;

    /* renamed from: c */
    public int f135366c;

    /* renamed from: d */
    public int f135367d;

    static {
        bozb bozb = new bozb();
        f135362e = bozb;
        GeneratedMessageLite.m124024a(bozb.class, bozb);
    }

    private bozb() {
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
            return GeneratedMessageLite.m124022a(f135362e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", boyz.f135360a, "c", boyy.f135359a, "d", boza.f135361a});
        } else if (i2 == 3) {
            return new bozb();
        } else {
            if (i2 == 4) {
                return new bxvd(f135362e);
            }
            if (i2 == 5) {
                return f135362e;
            }
            bxxk bxxk = f135363f;
            if (bxxk == null) {
                synchronized (bozb.class) {
                    bxxk = f135363f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135362e);
                        f135363f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
