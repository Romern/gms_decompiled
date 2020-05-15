package p000;

/* renamed from: brcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcv extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final brcv f142434g;

    /* renamed from: h */
    private static volatile bxxk f142435h;

    /* renamed from: a */
    public int f142436a;

    /* renamed from: b */
    public brak f142437b;

    /* renamed from: c */
    public int f142438c;

    /* renamed from: d */
    public brct f142439d;

    /* renamed from: e */
    public brcs f142440e;

    /* renamed from: f */
    public brcu f142441f;

    static {
        brcv brcv = new brcv();
        f142434g = brcv;
        GeneratedMessageLite.m124024a(brcv.class, brcv);
    }

    private brcv() {
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
            return GeneratedMessageLite.m124022a(f142434g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", brec.f142589a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new brcv();
        } else {
            if (i2 == 4) {
                return new bxvd(f142434g);
            }
            if (i2 == 5) {
                return f142434g;
            }
            bxxk bxxk = f142435h;
            if (bxxk == null) {
                synchronized (brcv.class) {
                    bxxk = f142435h;
                    if (bxxk == null) {
                        bxxk = new bxve(f142434g);
                        f142435h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
