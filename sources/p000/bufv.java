package p000;

/* renamed from: bufv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufv extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bufv f153745i;

    /* renamed from: j */
    private static volatile bxxk f153746j;

    /* renamed from: a */
    public int f153747a;

    /* renamed from: b */
    public float f153748b;

    /* renamed from: c */
    public float f153749c;

    /* renamed from: d */
    public int f153750d;

    /* renamed from: e */
    public float f153751e;

    /* renamed from: f */
    public long f153752f;

    /* renamed from: g */
    public float f153753g;

    /* renamed from: h */
    public int f153754h;

    static {
        bufv bufv = new bufv();
        f153745i = bufv;
        GeneratedMessageLite.m124024a(bufv.class, bufv);
    }

    private bufv() {
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
            return GeneratedMessageLite.m124022a(f153745i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0006င\u0005\u0007ခ\u0006\bဃ\u0007\tခ\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bufv();
        } else {
            if (i2 == 4) {
                return new bxvd(f153745i);
            }
            if (i2 == 5) {
                return f153745i;
            }
            bxxk bxxk = f153746j;
            if (bxxk == null) {
                synchronized (bufv.class) {
                    bxxk = f153746j;
                    if (bxxk == null) {
                        bxxk = new bxve(f153745i);
                        f153746j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
