package p000;

/* renamed from: bovo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bovo f135035c;

    /* renamed from: d */
    private static volatile bxxk f135036d;

    /* renamed from: a */
    public int f135037a;

    /* renamed from: b */
    public int f135038b;

    static {
        bovo bovo = new bovo();
        f135035c = bovo;
        GeneratedMessageLite.m124024a(bovo.class, bovo);
    }

    private bovo() {
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
            return GeneratedMessageLite.m124022a(f135035c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bovn.f135034a});
        } else if (i2 == 3) {
            return new bovo();
        } else {
            if (i2 == 4) {
                return new bxvd(f135035c);
            }
            if (i2 == 5) {
                return f135035c;
            }
            bxxk bxxk = f135036d;
            if (bxxk == null) {
                synchronized (bovo.class) {
                    bxxk = f135036d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135035c);
                        f135036d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
