package p000;

/* renamed from: bofi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofi extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bofi f132904k;

    /* renamed from: l */
    private static volatile bxxk f132905l;

    /* renamed from: a */
    public int f132906a;

    /* renamed from: b */
    public int f132907b;

    /* renamed from: c */
    public long f132908c;

    /* renamed from: d */
    public long f132909d;

    /* renamed from: e */
    public boolean f132910e;

    /* renamed from: f */
    public boolean f132911f;

    /* renamed from: g */
    public boolean f132912g;

    /* renamed from: h */
    public bogg f132913h;

    /* renamed from: i */
    public long f132914i;

    /* renamed from: j */
    public int f132915j;

    static {
        bofi bofi = new bofi();
        f132904k = bofi;
        GeneratedMessageLite.m124024a(bofi.class, bofi);
    }

    private bofi() {
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
            return GeneratedMessageLite.m124022a(f132904k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဉ\u0006\bဂ\u0007\u000bဌ\n", new Object[]{"a", "b", bofh.f132903a, "c", "d", "e", "f", "g", "h", "i", "j", bofq.f132935a});
        } else if (i2 == 3) {
            return new bofi();
        } else {
            if (i2 == 4) {
                return new bxvd(f132904k);
            }
            if (i2 == 5) {
                return f132904k;
            }
            bxxk bxxk = f132905l;
            if (bxxk == null) {
                synchronized (bofi.class) {
                    bxxk = f132905l;
                    if (bxxk == null) {
                        bxxk = new bxve(f132904k);
                        f132905l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
