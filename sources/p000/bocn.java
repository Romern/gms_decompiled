package p000;

/* renamed from: bocn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocn extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bocn f132573g;

    /* renamed from: h */
    private static volatile bxxk f132574h;

    /* renamed from: a */
    public int f132575a;

    /* renamed from: b */
    public int f132576b;

    /* renamed from: c */
    public int f132577c;

    /* renamed from: d */
    public int f132578d;

    /* renamed from: e */
    public String f132579e = "";

    /* renamed from: f */
    public int f132580f;

    static {
        bocn bocn = new bocn();
        f132573g = bocn;
        GeneratedMessageLite.m124024a(bocn.class, bocn);
    }

    private bocn() {
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
            return GeneratedMessageLite.m124022a(f132573g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", bocm.f132572a, "c", "d", "e", "f", bofq.f132935a});
        } else if (i2 == 3) {
            return new bocn();
        } else {
            if (i2 == 4) {
                return new bxvd(f132573g);
            }
            if (i2 == 5) {
                return f132573g;
            }
            bxxk bxxk = f132574h;
            if (bxxk == null) {
                synchronized (bocn.class) {
                    bxxk = f132574h;
                    if (bxxk == null) {
                        bxxk = new bxve(f132573g);
                        f132574h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
