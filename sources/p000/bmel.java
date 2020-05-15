package p000;

/* renamed from: bmel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmel extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmel f128957f;

    /* renamed from: g */
    private static volatile bxxk f128958g;

    /* renamed from: a */
    public int f128959a;

    /* renamed from: b */
    public long f128960b;

    /* renamed from: c */
    public bxwc f128961c = bxxn.f165040b;

    /* renamed from: d */
    public bmei f128962d;

    /* renamed from: e */
    public boolean f128963e;

    static {
        bmel bmel = new bmel();
        f128957f = bmel;
        GeneratedMessageLite.m124024a(bmel.class, bmel);
    }

    private bmel() {
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
            return GeneratedMessageLite.m124022a(f128957f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဉ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", "c", bmek.class, "d", "e"});
        } else if (i2 == 3) {
            return new bmel();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f128957f;
            }
            bxxk bxxk = f128958g;
            if (bxxk == null) {
                synchronized (bmel.class) {
                    bxxk = f128958g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128957f);
                        f128958g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
