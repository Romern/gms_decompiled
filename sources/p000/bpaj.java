package p000;

/* renamed from: bpaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpaj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpaj f135486c;

    /* renamed from: d */
    private static volatile bxxk f135487d;

    /* renamed from: a */
    public int f135488a;

    /* renamed from: b */
    public int f135489b;

    static {
        bpaj bpaj = new bpaj();
        f135486c = bpaj;
        GeneratedMessageLite.m124024a(bpaj.class, bpaj);
    }

    private bpaj() {
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
            return GeneratedMessageLite.m124022a(f135486c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpah.f135485a});
        } else if (i2 == 3) {
            return new bpaj();
        } else {
            if (i2 == 4) {
                return new bxvd(f135486c);
            }
            if (i2 == 5) {
                return f135486c;
            }
            bxxk bxxk = f135487d;
            if (bxxk == null) {
                synchronized (bpaj.class) {
                    bxxk = f135487d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135486c);
                        f135487d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
