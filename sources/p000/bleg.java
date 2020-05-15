package p000;

@Deprecated
/* renamed from: bleg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bleg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bleg f126193e;

    /* renamed from: f */
    private static volatile bxxk f126194f;

    /* renamed from: a */
    public int f126195a;

    /* renamed from: b */
    public int f126196b = 0;

    /* renamed from: c */
    public Object f126197c;

    /* renamed from: d */
    public bleu f126198d;

    static {
        bleg bleg = new bleg();
        f126193e = bleg;
        GeneratedMessageLite.m124024a(bleg.class, bleg);
    }

    private bleg() {
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
            return GeneratedMessageLite.m124022a(f126193e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new bleg();
        } else {
            if (i2 == 4) {
                return new bxvd(f126193e);
            }
            if (i2 == 5) {
                return f126193e;
            }
            bxxk bxxk = f126194f;
            if (bxxk == null) {
                synchronized (bleg.class) {
                    bxxk = f126194f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126193e);
                        f126194f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
