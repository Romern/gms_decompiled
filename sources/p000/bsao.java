package p000;

/* renamed from: bsao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsao extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsao f143882a;

    /* renamed from: f */
    private static volatile bxxk f143883f;

    /* renamed from: b */
    private int f143884b;

    /* renamed from: c */
    private bsal f143885c;

    /* renamed from: d */
    private bsal f143886d;

    /* renamed from: e */
    private byte f143887e = 2;

    static {
        bsao bsao = new bsao();
        f143882a = bsao;
        bxvk.m124024a(bsao.class, bsao);
    }

    private bsao() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143887e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143887e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f143882a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bsao();
        } else {
            if (i2 == 4) {
                return new bxvd(f143882a);
            }
            if (i2 == 5) {
                return f143882a;
            }
            bxxk bxxk = f143883f;
            if (bxxk == null) {
                synchronized (bsao.class) {
                    bxxk = f143883f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143882a);
                        f143883f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
