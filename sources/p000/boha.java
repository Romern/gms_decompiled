package p000;

/* renamed from: boha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boha extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boha f133044e;

    /* renamed from: f */
    private static volatile bxxk f133045f;

    /* renamed from: a */
    public int f133046a;

    /* renamed from: b */
    public boolean f133047b;

    /* renamed from: c */
    public long f133048c;

    /* renamed from: d */
    public boolean f133049d;

    static {
        boha boha = new boha();
        f133044e = boha;
        GeneratedMessageLite.m124024a(boha.class, boha);
    }

    private boha() {
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
            return GeneratedMessageLite.m124022a(f133044e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boha();
        } else {
            if (i2 == 4) {
                return new bxvd(f133044e);
            }
            if (i2 == 5) {
                return f133044e;
            }
            bxxk bxxk = f133045f;
            if (bxxk == null) {
                synchronized (boha.class) {
                    bxxk = f133045f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133044e);
                        f133045f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
