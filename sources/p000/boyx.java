package p000;

/* renamed from: boyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boyx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boyx f135353e;

    /* renamed from: f */
    private static volatile bxxk f135354f;

    /* renamed from: a */
    public int f135355a;

    /* renamed from: b */
    public int f135356b;

    /* renamed from: c */
    public int f135357c;

    /* renamed from: d */
    public int f135358d;

    static {
        boyx boyx = new boyx();
        f135353e = boyx;
        GeneratedMessageLite.m124024a(boyx.class, boyx);
    }

    private boyx() {
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
            return GeneratedMessageLite.m124022a(f135353e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", boyw.f135352a, "c", boyv.f135351a, "d", boyu.f135350a});
        } else if (i2 == 3) {
            return new boyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f135353e);
            }
            if (i2 == 5) {
                return f135353e;
            }
            bxxk bxxk = f135354f;
            if (bxxk == null) {
                synchronized (boyx.class) {
                    bxxk = f135354f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135353e);
                        f135354f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
