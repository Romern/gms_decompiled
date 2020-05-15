package p000;

/* renamed from: bvtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvtt f157618b;

    /* renamed from: c */
    private static volatile bxxk f157619c;

    /* renamed from: a */
    public bxwc f157620a = bxxn.f165040b;

    static {
        bvtt bvtt = new bvtt();
        f157618b = bvtt;
        GeneratedMessageLite.m124024a(bvtt.class, bvtt);
    }

    private bvtt() {
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
            return GeneratedMessageLite.m124022a(f157618b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bvuk.class});
        } else if (i2 == 3) {
            return new bvtt();
        } else {
            if (i2 == 4) {
                return new bxvd(f157618b);
            }
            if (i2 == 5) {
                return f157618b;
            }
            bxxk bxxk = f157619c;
            if (bxxk == null) {
                synchronized (bvtt.class) {
                    bxxk = f157619c;
                    if (bxxk == null) {
                        bxxk = new bxve(f157618b);
                        f157619c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
