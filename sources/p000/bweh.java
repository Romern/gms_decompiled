package p000;

/* renamed from: bweh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bweh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bweh f158979f;

    /* renamed from: g */
    private static volatile bxxk f158980g;

    /* renamed from: a */
    public int f158981a;

    /* renamed from: b */
    public int f158982b = 0;

    /* renamed from: c */
    public Object f158983c;

    /* renamed from: d */
    public int f158984d;

    /* renamed from: e */
    public blxe f158985e;

    static {
        bweh bweh = new bweh();
        f158979f = bweh;
        GeneratedMessageLite.m124024a(bweh.class, bweh);
    }

    private bweh() {
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
            return GeneratedMessageLite.m124022a(f158979f, "\u0001\u0003\u0001\u0001\u0001\f\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0004င\u0001\fဉ\u0002", new Object[]{"c", "b", "a", blxb.class, "d", "e"});
        } else if (i2 == 3) {
            return new bweh();
        } else {
            if (i2 == 4) {
                return new bxvd(f158979f);
            }
            if (i2 == 5) {
                return f158979f;
            }
            bxxk bxxk = f158980g;
            if (bxxk == null) {
                synchronized (bweh.class) {
                    bxxk = f158980g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158979f);
                        f158980g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
