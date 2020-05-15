package p000;

/* renamed from: boes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boes extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boes f132830d;

    /* renamed from: f */
    private static volatile bxxk f132831f;

    /* renamed from: a */
    public int f132832a;

    /* renamed from: b */
    public float f132833b;

    /* renamed from: c */
    public boolean f132834c;

    /* renamed from: e */
    private float f132835e;

    static {
        boes boes = new boes();
        f132830d = boes;
        GeneratedMessageLite.m124024a(boes.class, boes);
    }

    private boes() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m111127a(boes boes) {
        boes.f132832a |= 1;
        boes.f132835e = 80.0f;
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
            return GeneratedMessageLite.m124022a(f132830d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဇ\u0002", new Object[]{"a", "e", "b", "c"});
        } else if (i2 == 3) {
            return new boes();
        } else {
            if (i2 == 4) {
                return new bxvd(f132830d);
            }
            if (i2 == 5) {
                return f132830d;
            }
            bxxk bxxk = f132831f;
            if (bxxk == null) {
                synchronized (boes.class) {
                    bxxk = f132831f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132830d);
                        f132831f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
