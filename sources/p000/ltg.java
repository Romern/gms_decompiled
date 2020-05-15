package p000;

/* renamed from: ltg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ltg f32908e;

    /* renamed from: f */
    private static volatile bxxk f32909f;

    /* renamed from: a */
    public int f32910a;

    /* renamed from: b */
    public String f32911b = "";

    /* renamed from: c */
    public bxwc f32912c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f32913d;

    static {
        ltg ltg = new ltg();
        f32908e = ltg;
        GeneratedMessageLite.m124024a(ltg.class, ltg);
    }

    private ltg() {
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
            return GeneratedMessageLite.m124022a(f32908e, "\u0001\u0003\u0000\u0001%)\u0003\u0000\u0001\u0000%ဈ\u0000(\u001b)ဇ\u0001", new Object[]{"a", "b", "c", ltf.class, "d"});
        } else if (i2 == 3) {
            return new ltg();
        } else {
            if (i2 == 4) {
                return new bxvd(f32908e);
            }
            if (i2 == 5) {
                return f32908e;
            }
            bxxk bxxk = f32909f;
            if (bxxk == null) {
                synchronized (ltg.class) {
                    bxxk = f32909f;
                    if (bxxk == null) {
                        bxxk = new bxve(f32908e);
                        f32909f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
