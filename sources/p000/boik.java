package p000;

/* renamed from: boik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boik extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final boik f133172k;

    /* renamed from: l */
    private static volatile bxxk f133173l;

    /* renamed from: a */
    public int f133174a;

    /* renamed from: b */
    public float f133175b;

    /* renamed from: c */
    public String f133176c = "";

    /* renamed from: d */
    public int f133177d;

    /* renamed from: e */
    public int f133178e;

    /* renamed from: f */
    public int f133179f;

    /* renamed from: g */
    public int f133180g;

    /* renamed from: h */
    public int f133181h;

    /* renamed from: i */
    public int f133182i;

    /* renamed from: j */
    public int f133183j;

    static {
        boik boik = new boik();
        f133172k = boik;
        GeneratedMessageLite.m124024a(boik.class, boik);
    }

    private boik() {
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
            return GeneratedMessageLite.m124022a(f133172k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b", new Object[]{"a", "b", "c", "d", boic.f133168a, "e", boie.f133169a, "f", boii.f133171a, "g", boig.f133170a, "h", bohy.f133166a, "i", bohw.f133165a, "j", boia.f133167a});
        } else if (i2 == 3) {
            return new boik();
        } else {
            if (i2 == 4) {
                return new bxvd(f133172k);
            }
            if (i2 == 5) {
                return f133172k;
            }
            bxxk bxxk = f133173l;
            if (bxxk == null) {
                synchronized (boik.class) {
                    bxxk = f133173l;
                    if (bxxk == null) {
                        bxxk = new bxve(f133172k);
                        f133173l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
