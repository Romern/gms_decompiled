package p000;

/* renamed from: kzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kzy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final kzy f25499e;

    /* renamed from: f */
    private static volatile bxxk f25500f;

    /* renamed from: a */
    public int f25501a;

    /* renamed from: b */
    public long f25502b;

    /* renamed from: c */
    public int f25503c;

    /* renamed from: d */
    public int f25504d;

    static {
        kzy kzy = new kzy();
        f25499e = kzy;
        GeneratedMessageLite.m124024a(kzy.class, kzy);
    }

    private kzy() {
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
            return GeneratedMessageLite.m124022a(f25499e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0004\u0003\u0002\u0004\u000f\u0005\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new kzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f25499e);
            }
            if (i2 == 5) {
                return f25499e;
            }
            bxxk bxxk = f25500f;
            if (bxxk == null) {
                synchronized (kzy.class) {
                    bxxk = f25500f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25499e);
                        f25500f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
