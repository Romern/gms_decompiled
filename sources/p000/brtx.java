package p000;

/* renamed from: brtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brtx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final brtx f143361d;

    /* renamed from: e */
    public static final bxvj f143362e;

    /* renamed from: f */
    private static volatile bxxk f143363f;

    /* renamed from: a */
    public int f143364a;

    /* renamed from: b */
    public long f143365b;

    /* renamed from: c */
    public bxwc f143366c = bxxn.f165040b;

    static {
        brtx brtx = new brtx();
        f143361d = brtx;
        GeneratedMessageLite.m124024a(brtx.class, brtx);
        bygn bygn = bygn.f166357a;
        brtx brtx2 = f143361d;
        f143362e = GeneratedMessageLite.m124006a(bygn, brtx2, brtx2, 182135729, bxzf.MESSAGE);
    }

    private brtx() {
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
            return GeneratedMessageLite.m124022a(f143361d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brtx();
        } else {
            if (i2 == 4) {
                return new bxvd(f143361d);
            }
            if (i2 == 5) {
                return f143361d;
            }
            bxxk bxxk = f143363f;
            if (bxxk == null) {
                synchronized (brtx.class) {
                    bxxk = f143363f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143361d);
                        f143363f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
