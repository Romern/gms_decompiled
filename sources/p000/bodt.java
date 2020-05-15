package p000;

/* renamed from: bodt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodt extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bodt f132731j;

    /* renamed from: k */
    private static volatile bxxk f132732k;

    /* renamed from: a */
    public int f132733a;

    /* renamed from: b */
    public long f132734b;

    /* renamed from: c */
    public bxwc f132735c = bxxn.f165040b;

    /* renamed from: d */
    public int f132736d;

    /* renamed from: e */
    public int f132737e;

    /* renamed from: f */
    public int f132738f;

    /* renamed from: g */
    public int f132739g = 1;

    /* renamed from: h */
    public int f132740h = 1;

    /* renamed from: i */
    public long f132741i;

    static {
        bodt bodt = new bodt();
        f132731j = bodt;
        GeneratedMessageLite.m124024a(bodt.class, bodt);
    }

    private bodt() {
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
            return GeneratedMessageLite.m124022a(f132731j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002\u0005င\u0003\u0006ဌ\u0004\u0007ဌ\u0005\bဂ\u0006", new Object[]{"a", "b", "c", body.class, "d", "e", "f", "g", bods.f132730a, "h", bodr.f132729a, "i"});
        } else if (i2 == 3) {
            return new bodt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f132731j;
            }
            bxxk bxxk = f132732k;
            if (bxxk == null) {
                synchronized (bodt.class) {
                    bxxk = f132732k;
                    if (bxxk == null) {
                        bxxk = new bxve(f132731j);
                        f132732k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
