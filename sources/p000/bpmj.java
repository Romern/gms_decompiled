package p000;

/* renamed from: bpmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bpmj f138268h;

    /* renamed from: i */
    private static volatile bxxk f138269i;

    /* renamed from: a */
    public int f138270a;

    /* renamed from: b */
    public String f138271b = "";

    /* renamed from: c */
    public int f138272c;

    /* renamed from: d */
    public int f138273d;

    /* renamed from: e */
    public float f138274e;

    /* renamed from: f */
    public float f138275f;

    /* renamed from: g */
    public float f138276g;

    static {
        bpmj bpmj = new bpmj();
        f138268h = bpmj;
        bxvk.m124024a(bpmj.class, bpmj);
    }

    private bpmj() {
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
            return bxvk.m124022a(f138268h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", bpms.m112074b(), "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpmj();
        } else {
            if (i2 == 4) {
                return new bxvd(f138268h);
            }
            if (i2 == 5) {
                return f138268h;
            }
            bxxk bxxk = f138269i;
            if (bxxk == null) {
                synchronized (bpmj.class) {
                    bxxk = f138269i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138268h);
                        f138269i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
