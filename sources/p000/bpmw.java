package p000;

/* renamed from: bpmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpmw f138362d;

    /* renamed from: e */
    private static volatile bxxk f138363e;

    /* renamed from: a */
    public int f138364a;

    /* renamed from: b */
    public boolean f138365b;

    /* renamed from: c */
    public boolean f138366c;

    static {
        bpmw bpmw = new bpmw();
        f138362d = bpmw;
        bxvk.m124024a(bpmw.class, bpmw);
    }

    private bpmw() {
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
            return bxvk.m124022a(f138362d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f138362d);
            }
            if (i2 == 5) {
                return f138362d;
            }
            bxxk bxxk = f138363e;
            if (bxxk == null) {
                synchronized (bpmw.class) {
                    bxxk = f138363e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138362d);
                        f138363e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
