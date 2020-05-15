package p000;

/* renamed from: bmnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnu extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmnu f130170g;

    /* renamed from: i */
    private static volatile bxxk f130171i;

    /* renamed from: a */
    public int f130172a;

    /* renamed from: b */
    public int f130173b;

    /* renamed from: c */
    public int f130174c;

    /* renamed from: d */
    public int f130175d;

    /* renamed from: e */
    public int f130176e;

    /* renamed from: f */
    public int f130177f;

    /* renamed from: h */
    private int f130178h;

    static {
        bmnu bmnu = new bmnu();
        f130170g = bmnu;
        GeneratedMessageLite.m124024a(bmnu.class, bmnu);
    }

    private bmnu() {
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
            return GeneratedMessageLite.m124022a(f130170g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"h", "a", bmns.f130169a, "b", bmns.f130169a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bmnu();
        } else {
            if (i2 == 4) {
                return new bxvd(f130170g);
            }
            if (i2 == 5) {
                return f130170g;
            }
            bxxk bxxk = f130171i;
            if (bxxk == null) {
                synchronized (bmnu.class) {
                    bxxk = f130171i;
                    if (bxxk == null) {
                        bxxk = new bxve(f130170g);
                        f130171i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
