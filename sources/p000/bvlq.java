package p000;

/* renamed from: bvlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvlq f156585c;

    /* renamed from: d */
    private static volatile bxxk f156586d;

    /* renamed from: a */
    public int f156587a;

    /* renamed from: b */
    public bvov f156588b;

    static {
        bvlq bvlq = new bvlq();
        f156585c = bvlq;
        GeneratedMessageLite.m124024a(bvlq.class, bvlq);
    }

    private bvlq() {
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
            return GeneratedMessageLite.m124022a(f156585c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvlq();
        } else {
            if (i2 == 4) {
                return new bxvd(f156585c);
            }
            if (i2 == 5) {
                return f156585c;
            }
            bxxk bxxk = f156586d;
            if (bxxk == null) {
                synchronized (bvlq.class) {
                    bxxk = f156586d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156585c);
                        f156586d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
