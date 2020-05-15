package p000;

/* renamed from: byha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byha extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byha f166414f;

    /* renamed from: g */
    private static volatile bxxk f166415g;

    /* renamed from: a */
    public int f166416a;

    /* renamed from: b */
    public int f166417b;

    /* renamed from: c */
    public int f166418c;

    /* renamed from: d */
    public long f166419d;

    /* renamed from: e */
    public byir f166420e;

    static {
        byha byha = new byha();
        f166414f = byha;
        GeneratedMessageLite.m124024a(byha.class, byha);
    }

    private byha() {
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
            return GeneratedMessageLite.m124022a(f166414f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byha();
        } else {
            if (i2 == 4) {
                return new bxvd(f166414f);
            }
            if (i2 == 5) {
                return f166414f;
            }
            bxxk bxxk = f166415g;
            if (bxxk == null) {
                synchronized (byha.class) {
                    bxxk = f166415g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166414f);
                        f166415g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
