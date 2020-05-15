package p000;

/* renamed from: aapa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapa extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final aapa f28723i;

    /* renamed from: j */
    private static volatile bxxk f28724j;

    /* renamed from: a */
    public int f28725a;

    /* renamed from: b */
    public bxwc f28726b = bxxn.f165040b;

    /* renamed from: c */
    public int f28727c;

    /* renamed from: d */
    public int f28728d;

    /* renamed from: e */
    public int f28729e;

    /* renamed from: f */
    public int f28730f;

    /* renamed from: g */
    public int f28731g;

    /* renamed from: h */
    public int f28732h;

    static {
        aapa aapa = new aapa();
        f28723i = aapa;
        GeneratedMessageLite.m124024a(aapa.class, aapa);
    }

    private aapa() {
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
            return GeneratedMessageLite.m124022a(f28723i, "\u0001\u0007\u0000\u0001\u0004\n\u0007\u0000\u0001\u0000\u0004\u001a\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nဌ\b", new Object[]{"a", "b", "c", aaoy.f28722a, "d", aaou.f28720a, "e", aaoy.f28722a, "f", aaou.f28720a, "g", aaow.f28721a, "h", aaow.f28721a});
        } else if (i2 == 3) {
            return new aapa();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f28723i;
            }
            bxxk bxxk = f28724j;
            if (bxxk == null) {
                synchronized (aapa.class) {
                    bxxk = f28724j;
                    if (bxxk == null) {
                        bxxk = new bxve(f28723i);
                        f28724j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
