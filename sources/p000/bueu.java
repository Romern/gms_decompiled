package p000;

/* renamed from: bueu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bueu extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bueu f153646k;

    /* renamed from: l */
    private static volatile bxxk f153647l;

    /* renamed from: a */
    public int f153648a;

    /* renamed from: b */
    public long f153649b;

    /* renamed from: c */
    public long f153650c;

    /* renamed from: d */
    public int f153651d;

    /* renamed from: e */
    public int f153652e;

    /* renamed from: f */
    public int f153653f;

    /* renamed from: g */
    public int f153654g;

    /* renamed from: h */
    public float f153655h;

    /* renamed from: i */
    public float f153656i;

    /* renamed from: j */
    public int f153657j;

    static {
        bueu bueu = new bueu();
        f153646k = bueu;
        GeneratedMessageLite.m124024a(bueu.class, bueu);
    }

    private bueu() {
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
            return GeneratedMessageLite.m124022a(f153646k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဏ\u0002\u0004ဏ\u0003\u0005ဏ\u0004\u0006ဏ\u0005\u0007ခ\u0006\bခ\u0007\tဋ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bueu();
        } else {
            if (i2 == 4) {
                return new bxvd(f153646k);
            }
            if (i2 == 5) {
                return f153646k;
            }
            bxxk bxxk = f153647l;
            if (bxxk == null) {
                synchronized (bueu.class) {
                    bxxk = f153647l;
                    if (bxxk == null) {
                        bxxk = new bxve(f153646k);
                        f153647l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
