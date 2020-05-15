package p000;

/* renamed from: bpjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpjo f137894d;

    /* renamed from: e */
    private static volatile bxxk f137895e;

    /* renamed from: a */
    public int f137896a;

    /* renamed from: b */
    public int f137897b;

    /* renamed from: c */
    public int f137898c;

    static {
        bpjo bpjo = new bpjo();
        f137894d = bpjo;
        bxvk.m124024a(bpjo.class, bpjo);
    }

    private bpjo() {
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
            return bxvk.m124022a(f137894d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bpjm.f137893a, "c", bpka.f137934a});
        } else if (i2 == 3) {
            return new bpjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f137894d);
            }
            if (i2 == 5) {
                return f137894d;
            }
            bxxk bxxk = f137895e;
            if (bxxk == null) {
                synchronized (bpjo.class) {
                    bxxk = f137895e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137894d);
                        f137895e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
