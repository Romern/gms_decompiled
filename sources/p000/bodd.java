package p000;

/* renamed from: bodd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodd extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bodd f132660m;

    /* renamed from: n */
    private static volatile bxxk f132661n;

    /* renamed from: a */
    public int f132662a;

    /* renamed from: b */
    public int f132663b;

    /* renamed from: c */
    public int f132664c;

    /* renamed from: d */
    public boolean f132665d;

    /* renamed from: e */
    public long f132666e;

    /* renamed from: f */
    public boolean f132667f;

    /* renamed from: g */
    public boolean f132668g;

    /* renamed from: h */
    public boolean f132669h;

    /* renamed from: i */
    public long f132670i;

    /* renamed from: j */
    public long f132671j;

    /* renamed from: k */
    public int f132672k;

    /* renamed from: l */
    public int f132673l;

    static {
        bodd bodd = new bodd();
        f132660m = bodd;
        bxvk.m124024a(bodd.class, bodd);
    }

    private bodd() {
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
            return bxvk.m124022a(f132660m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဂ\u0007\nစ\t\u000bဌ\n\fဌ\u000b", new Object[]{"a", "b", bodc.f132659a, "c", bocz.f132656a, "d", "e", "f", "g", "h", "i", "j", "k", boda.f132657a, "l", bodb.f132658a});
        } else if (i2 == 3) {
            return new bodd();
        } else {
            if (i2 == 4) {
                return new bxvd(f132660m);
            }
            if (i2 == 5) {
                return f132660m;
            }
            bxxk bxxk = f132661n;
            if (bxxk == null) {
                synchronized (bodd.class) {
                    bxxk = f132661n;
                    if (bxxk == null) {
                        bxxk = new bxve(f132660m);
                        f132661n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
