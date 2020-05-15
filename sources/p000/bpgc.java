package p000;

/* renamed from: bpgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bpgc f137471b;

    /* renamed from: c */
    private static volatile bxxk f137472c;

    /* renamed from: a */
    public bxvt f137473a = bxvm.f164965b;

    static {
        bpgc bpgc = new bpgc();
        f137471b = bpgc;
        GeneratedMessageLite.m124024a(bpgc.class, bpgc);
    }

    private bpgc() {
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
            return GeneratedMessageLite.m124022a(f137471b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bzzv.m126374b()});
        } else if (i2 == 3) {
            return new bpgc();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f137471b;
            }
            bxxk bxxk = f137472c;
            if (bxxk == null) {
                synchronized (bpgc.class) {
                    bxxk = f137472c;
                    if (bxxk == null) {
                        bxxk = new bxve(f137471b);
                        f137472c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
