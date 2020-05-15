package p000;

/* renamed from: byxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byxo f168769e;

    /* renamed from: f */
    private static volatile bxxk f168770f;

    /* renamed from: a */
    public int f168771a;

    /* renamed from: b */
    public int f168772b;

    /* renamed from: c */
    public int f168773c;

    /* renamed from: d */
    public int f168774d;

    static {
        byxo byxo = new byxo();
        f168769e = byxo;
        GeneratedMessageLite.m124024a(byxo.class, byxo);
    }

    private byxo() {
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
            return GeneratedMessageLite.m124022a(f168769e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bzae.f169214a, "c", bzam.f169218a, "d", bzbx.f169277a});
        } else if (i2 == 3) {
            return new byxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f168769e);
            }
            if (i2 == 5) {
                return f168769e;
            }
            bxxk bxxk = f168770f;
            if (bxxk == null) {
                synchronized (byxo.class) {
                    bxxk = f168770f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168769e);
                        f168770f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
