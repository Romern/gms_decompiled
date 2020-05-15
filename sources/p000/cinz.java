package p000;

/* renamed from: cinz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinz extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final cinz f191015m;

    /* renamed from: n */
    private static volatile bxxk f191016n;

    /* renamed from: a */
    public int f191017a;

    /* renamed from: b */
    public long f191018b;

    /* renamed from: c */
    public long f191019c;

    /* renamed from: d */
    public long f191020d;

    /* renamed from: e */
    public long f191021e;

    /* renamed from: f */
    public long f191022f;

    /* renamed from: g */
    public long f191023g;

    /* renamed from: h */
    public long f191024h;

    /* renamed from: i */
    public long f191025i;

    /* renamed from: j */
    public boolean f191026j;

    /* renamed from: k */
    public ciny f191027k;

    /* renamed from: l */
    public ciny f191028l;

    static {
        cinz cinz = new cinz();
        f191015m = cinz;
        GeneratedMessageLite.m124024a(cinz.class, cinz);
    }

    private cinz() {
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
            return GeneratedMessageLite.m124022a(f191015m, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0005\u0005ဂ\u0006\tဂ\u0007\nဂ\b\u000bဇ\t\fဉ\n\rဉ\u000b\u000eဂ\u0001\u000fဂ\u0002", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", "k", "l", "c", "d"});
        } else if (i2 == 3) {
            return new cinz();
        } else {
            if (i2 == 4) {
                return new bxvd(f191015m);
            }
            if (i2 == 5) {
                return f191015m;
            }
            bxxk bxxk = f191016n;
            if (bxxk == null) {
                synchronized (cinz.class) {
                    bxxk = f191016n;
                    if (bxxk == null) {
                        bxxk = new bxve(f191015m);
                        f191016n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
