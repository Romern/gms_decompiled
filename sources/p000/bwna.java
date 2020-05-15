package p000;

/* renamed from: bwna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwna extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwna f160331d;

    /* renamed from: e */
    public static final bxvj f160332e;

    /* renamed from: g */
    private static volatile bxxk f160333g;

    /* renamed from: a */
    public int f160334a = 0;

    /* renamed from: b */
    public Object f160335b;

    /* renamed from: c */
    public int f160336c;

    /* renamed from: f */
    private int f160337f;

    static {
        bwna bwna = new bwna();
        f160331d = bwna;
        GeneratedMessageLite.m124024a(bwna.class, bwna);
        bwoq bwoq = bwoq.f160480d;
        bwna bwna2 = f160331d;
        f160332e = GeneratedMessageLite.m124006a(bwoq, bwna2, bwna2, 260216777, bxzf.MESSAGE);
    }

    private bwna() {
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
            return GeneratedMessageLite.m124022a(f160331d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwmy.f160330a, bwmx.class});
        } else if (i2 == 3) {
            return new bwna();
        } else {
            if (i2 == 4) {
                return new bxvd(f160331d);
            }
            if (i2 == 5) {
                return f160331d;
            }
            bxxk bxxk = f160333g;
            if (bxxk == null) {
                synchronized (bwna.class) {
                    bxxk = f160333g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160331d);
                        f160333g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
