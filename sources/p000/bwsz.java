package p000;

/* renamed from: bwsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwsz f160932c;

    /* renamed from: d */
    public static final bxvj f160933d;

    /* renamed from: e */
    private static volatile bxxk f160934e;

    /* renamed from: a */
    public int f160935a;

    /* renamed from: b */
    public String f160936b = "";

    static {
        bwsz bwsz = new bwsz();
        f160932c = bwsz;
        bxvk.m124024a(bwsz.class, bwsz);
        bwog bwog = bwog.f160437f;
        bwsz bwsz2 = f160932c;
        f160933d = bxvk.m124006a(bwog, bwsz2, bwsz2, 301214406, bxzf.MESSAGE);
    }

    private bwsz() {
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
            return bxvk.m124022a(f160932c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwsz();
        } else {
            if (i2 == 4) {
                return new bxvd(f160932c);
            }
            if (i2 == 5) {
                return f160932c;
            }
            bxxk bxxk = f160934e;
            if (bxxk == null) {
                synchronized (bwsz.class) {
                    bxxk = f160934e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160932c);
                        f160934e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
