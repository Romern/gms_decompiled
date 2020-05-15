package p000;

/* renamed from: byje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byje extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byje f166642e;

    /* renamed from: f */
    private static volatile bxxk f166643f;

    /* renamed from: a */
    public int f166644a;

    /* renamed from: b */
    public bxwc f166645b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f166646c;

    /* renamed from: d */
    public int f166647d;

    static {
        byje byje = new byje();
        f166642e = byje;
        GeneratedMessageLite.m124024a(byje.class, byje);
    }

    private byje() {
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
            return GeneratedMessageLite.m124022a(f166642e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003င\u0001", new Object[]{"a", "b", byjd.class, "c", "d"});
        } else if (i2 == 3) {
            return new byje();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166642e;
            }
            bxxk bxxk = f166643f;
            if (bxxk == null) {
                synchronized (byje.class) {
                    bxxk = f166643f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166642e);
                        f166643f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
