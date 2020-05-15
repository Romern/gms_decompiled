package p000;

/* renamed from: byms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byms extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final byms f167065g;

    /* renamed from: h */
    private static volatile bxxk f167066h;

    /* renamed from: a */
    public int f167067a;

    /* renamed from: b */
    public int f167068b = 0;

    /* renamed from: c */
    public Object f167069c;

    /* renamed from: d */
    public bymq f167070d;

    /* renamed from: e */
    public bli f167071e;

    /* renamed from: f */
    public int f167072f;

    static {
        byms byms = new byms();
        f167065g = byms;
        GeneratedMessageLite.m124024a(byms.class, byms);
    }

    private byms() {
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
            return GeneratedMessageLite.m124022a(f167065g, "\u0001\b\u0001\u0001\u0001f\b\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000\u0003ြ\u0000\u0004ွ\u0000\u0005ြ\u0000dဉ\u0006eဉ\u0007fဌ\b", new Object[]{"c", "b", "a", bymr.class, bymn.class, "d", "e", "f", blg.f5092a});
        } else if (i2 == 3) {
            return new byms();
        } else {
            if (i2 == 4) {
                return new bxvd(f167065g);
            }
            if (i2 == 5) {
                return f167065g;
            }
            bxxk bxxk = f167066h;
            if (bxxk == null) {
                synchronized (byms.class) {
                    bxxk = f167066h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167065g);
                        f167066h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
