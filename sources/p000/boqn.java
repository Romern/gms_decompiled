package p000;

/* renamed from: boqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boqn f134292d;

    /* renamed from: e */
    private static volatile bxxk f134293e;

    /* renamed from: a */
    public int f134294a;

    /* renamed from: b */
    public int f134295b;

    /* renamed from: c */
    public int f134296c;

    static {
        boqn boqn = new boqn();
        f134292d = boqn;
        GeneratedMessageLite.m124024a(boqn.class, boqn);
    }

    private boqn() {
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
            return GeneratedMessageLite.m124022a(f134292d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", boqm.f134291a, "c", boql.f134290a});
        } else if (i2 == 3) {
            return new boqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f134292d);
            }
            if (i2 == 5) {
                return f134292d;
            }
            bxxk bxxk = f134293e;
            if (bxxk == null) {
                synchronized (boqn.class) {
                    bxxk = f134293e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134292d);
                        f134293e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
