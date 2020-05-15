package p000;

/* renamed from: bvny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvny extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvny f156984c;

    /* renamed from: e */
    private static volatile bxxk f156985e;

    /* renamed from: a */
    public int f156986a;

    /* renamed from: b */
    public long f156987b;

    /* renamed from: d */
    private int f156988d;

    static {
        bvny bvny = new bvny();
        f156984c = bvny;
        GeneratedMessageLite.m124024a(bvny.class, bvny);
    }

    private bvny() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m121305a(bvny bvny) {
        bvny.f156986a |= 2;
        bvny.f156988d = 2;
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
            return GeneratedMessageLite.m124022a(f156984c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001", new Object[]{"a", "b", "d"});
        } else if (i2 == 3) {
            return new bvny();
        } else {
            if (i2 == 4) {
                return new bxvd(f156984c);
            }
            if (i2 == 5) {
                return f156984c;
            }
            bxxk bxxk = f156985e;
            if (bxxk == null) {
                synchronized (bvny.class) {
                    bxxk = f156985e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156984c);
                        f156985e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
