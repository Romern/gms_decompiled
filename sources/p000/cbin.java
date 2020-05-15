package p000;

/* renamed from: cbin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbin extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbin f177270f;

    /* renamed from: g */
    private static volatile bxxk f177271g;

    /* renamed from: a */
    public int f177272a = 0;

    /* renamed from: b */
    public Object f177273b;

    /* renamed from: c */
    public String f177274c = "";

    /* renamed from: d */
    public cbio f177275d;

    /* renamed from: e */
    public cbif f177276e;

    static {
        cbin cbin = new cbin();
        f177270f = cbin;
        GeneratedMessageLite.m124024a(cbin.class, cbin);
    }

    private cbin() {
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
            return GeneratedMessageLite.m124022a(f177270f, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003=\u0000\u0004\t\u0005=\u0000\u0006\t", new Object[]{"b", "a", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbin();
        } else {
            if (i2 == 4) {
                return new bxvd(f177270f);
            }
            if (i2 == 5) {
                return f177270f;
            }
            bxxk bxxk = f177271g;
            if (bxxk == null) {
                synchronized (cbin.class) {
                    bxxk = f177271g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177270f);
                        f177271g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
