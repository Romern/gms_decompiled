package p000;

/* renamed from: abto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abto extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final abto f58276i;

    /* renamed from: j */
    private static volatile bxxk f58277j;

    /* renamed from: a */
    public int f58278a;

    /* renamed from: b */
    public long f58279b;

    /* renamed from: c */
    public String f58280c = "";

    /* renamed from: d */
    public int f58281d;

    /* renamed from: e */
    public int f58282e;

    /* renamed from: f */
    public int f58283f = -1;

    /* renamed from: g */
    public boolean f58284g;

    /* renamed from: h */
    public int f58285h;

    static {
        abto abto = new abto();
        f58276i = abto;
        GeneratedMessageLite.m124024a(abto.class, abto);
    }

    private abto() {
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
            return GeneratedMessageLite.m124022a(f58276i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0004ဋ\u0003\u0005ဌ\u0004\u0007င\u0006\bဇ\u0007\tဌ\b", new Object[]{"a", "b", "c", "d", "e", abuy.m48300b(), "f", "g", "h", abtc.m48242b()});
        } else if (i2 == 3) {
            return new abto();
        } else {
            if (i2 == 4) {
                return new bxvd(f58276i);
            }
            if (i2 == 5) {
                return f58276i;
            }
            bxxk bxxk = f58277j;
            if (bxxk == null) {
                synchronized (abto.class) {
                    bxxk = f58277j;
                    if (bxxk == null) {
                        bxxk = new bxve(f58276i);
                        f58277j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
