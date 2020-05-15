package p000;

/* renamed from: boov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boov extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final boov f134026c;

    /* renamed from: d */
    private static volatile bxxk f134027d;

    /* renamed from: a */
    public int f134028a;

    /* renamed from: b */
    public String f134029b = "";

    static {
        boov boov = new boov();
        f134026c = boov;
        GeneratedMessageLite.m124024a(boov.class, boov);
    }

    private boov() {
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
            return GeneratedMessageLite.m124022a(f134026c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new boov();
        } else {
            if (i2 == 4) {
                return new bxvd(f134026c);
            }
            if (i2 == 5) {
                return f134026c;
            }
            bxxk bxxk = f134027d;
            if (bxxk == null) {
                synchronized (boov.class) {
                    bxxk = f134027d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134026c);
                        f134027d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
