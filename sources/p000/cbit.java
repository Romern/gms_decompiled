package p000;

/* renamed from: cbit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbit extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbit f177293e;

    /* renamed from: f */
    private static volatile bxxk f177294f;

    /* renamed from: a */
    public int f177295a = 0;

    /* renamed from: b */
    public Object f177296b;

    /* renamed from: c */
    public int f177297c;

    /* renamed from: d */
    public int f177298d;

    static {
        cbit cbit = new cbit();
        f177293e = cbit;
        GeneratedMessageLite.m124024a(cbit.class, cbit);
    }

    private cbit() {
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
            return GeneratedMessageLite.m124022a(f177293e, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003<\u0000", new Object[]{"b", "a", "c", "d", cbiw.class});
        } else if (i2 == 3) {
            return new cbit();
        } else {
            if (i2 == 4) {
                return new bxvd(f177293e);
            }
            if (i2 == 5) {
                return f177293e;
            }
            bxxk bxxk = f177294f;
            if (bxxk == null) {
                synchronized (cbit.class) {
                    bxxk = f177294f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177293e);
                        f177294f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
