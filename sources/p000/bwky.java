package p000;

/* renamed from: bwky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwky extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwky f160063f;

    /* renamed from: g */
    public static final bxvx f160064g = bxwb.m124074a(blwg.f127941q, blwg.UNKNOWN_CARD_TYPE);

    /* renamed from: h */
    private static volatile bxxk f160065h;

    /* renamed from: a */
    public int f160066a;

    /* renamed from: b */
    public bmav f160067b;

    /* renamed from: c */
    public bmaq f160068c;

    /* renamed from: d */
    public bxww f160069d = bxww.f165013b;

    /* renamed from: e */
    public bmjf f160070e;

    static {
        bwky bwky = new bwky();
        f160063f = bwky;
        GeneratedMessageLite.m124024a(bwky.class, bwky);
    }

    private bwky() {
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
            return GeneratedMessageLite.m124022a(f160063f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003࠲\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d", bwkx.f160062a, blwg.m107711b(), "e"});
        } else if (i2 == 3) {
            return new bwky();
        } else {
            if (i2 == 4) {
                return new bxvd(f160063f);
            }
            if (i2 == 5) {
                return f160063f;
            }
            bxxk bxxk = f160065h;
            if (bxxk == null) {
                synchronized (bwky.class) {
                    bxxk = f160065h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160063f);
                        f160065h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
