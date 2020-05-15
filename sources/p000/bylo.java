package p000;

/* renamed from: bylo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bylo f166896f;

    /* renamed from: g */
    private static volatile bxxk f166897g;

    /* renamed from: a */
    public int f166898a;

    /* renamed from: b */
    public float f166899b;

    /* renamed from: c */
    public float f166900c;

    /* renamed from: d */
    public float f166901d;

    /* renamed from: e */
    public float f166902e;

    static {
        bylo bylo = new bylo();
        f166896f = bylo;
        GeneratedMessageLite.m124024a(bylo.class, bylo);
    }

    private bylo() {
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
            return GeneratedMessageLite.m124022a(f166896f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bylo();
        } else {
            if (i2 == 4) {
                return new bxvd(f166896f);
            }
            if (i2 == 5) {
                return f166896f;
            }
            bxxk bxxk = f166897g;
            if (bxxk == null) {
                synchronized (bylo.class) {
                    bxxk = f166897g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166896f);
                        f166897g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
