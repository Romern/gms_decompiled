package p000;

/* renamed from: booc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final booc f133888c;

    /* renamed from: d */
    private static volatile bxxk f133889d;

    /* renamed from: a */
    public int f133890a;

    /* renamed from: b */
    public boolean f133891b;

    static {
        booc booc = new booc();
        f133888c = booc;
        GeneratedMessageLite.m124024a(booc.class, booc);
    }

    private booc() {
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
            return GeneratedMessageLite.m124022a(f133888c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new booc();
        } else {
            if (i2 == 4) {
                return new bxvd(f133888c);
            }
            if (i2 == 5) {
                return f133888c;
            }
            bxxk bxxk = f133889d;
            if (bxxk == null) {
                synchronized (booc.class) {
                    bxxk = f133889d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133888c);
                        f133889d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
