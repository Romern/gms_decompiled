package p000;

/* renamed from: brzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brzk f143748c;

    /* renamed from: d */
    private static volatile bxxk f143749d;

    /* renamed from: a */
    public int f143750a = 0;

    /* renamed from: b */
    public Object f143751b;

    static {
        brzk brzk = new brzk();
        f143748c = brzk;
        GeneratedMessageLite.m124024a(brzk.class, brzk);
    }

    private brzk() {
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
            return GeneratedMessageLite.m124022a(f143748c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000\u0003်\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new brzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f143748c);
            }
            if (i2 == 5) {
                return f143748c;
            }
            bxxk bxxk = f143749d;
            if (bxxk == null) {
                synchronized (brzk.class) {
                    bxxk = f143749d;
                    if (bxxk == null) {
                        bxxk = new bxve(f143748c);
                        f143749d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
