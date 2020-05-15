package p000;

/* renamed from: eio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eio extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final eio f15067h;

    /* renamed from: i */
    private static volatile bxxk f15068i;

    /* renamed from: a */
    public int f15069a = 0;

    /* renamed from: b */
    public Object f15070b;

    /* renamed from: c */
    public long f15071c;

    /* renamed from: d */
    public int f15072d;

    /* renamed from: e */
    public long f15073e;

    /* renamed from: f */
    public long f15074f;

    /* renamed from: g */
    public eir f15075g;

    static {
        eio eio = new eio();
        f15067h = eio;
        GeneratedMessageLite.m124024a(eio.class, eio);
    }

    private eio() {
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
            return GeneratedMessageLite.m124022a(f15067h, "\u0000\u0007\u0001\u0000\u0001\u001d\u0007\u0000\u0000\u0000\u0001\u0002\u0006=\u0000\u000b\u0004\u000f\u0010\u0011\u0002\u0017\t\u001dȻ\u0000", new Object[]{"b", "a", "c", "d", "f", "e", "g"});
        } else if (i2 == 3) {
            return new eio();
        } else {
            if (i2 == 4) {
                return new bxvd(f15067h);
            }
            if (i2 == 5) {
                return f15067h;
            }
            bxxk bxxk = f15068i;
            if (bxxk == null) {
                synchronized (eio.class) {
                    bxxk = f15068i;
                    if (bxxk == null) {
                        bxxk = new bxve(f15067h);
                        f15068i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
