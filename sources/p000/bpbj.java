package p000;

/* renamed from: bpbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpbj f135600d;

    /* renamed from: e */
    private static volatile bxxk f135601e;

    /* renamed from: a */
    public int f135602a;

    /* renamed from: b */
    public int f135603b;

    /* renamed from: c */
    public int f135604c;

    static {
        bpbj bpbj = new bpbj();
        f135600d = bpbj;
        GeneratedMessageLite.m124024a(bpbj.class, bpbj);
    }

    private bpbj() {
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
            return GeneratedMessageLite.m124022a(f135600d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bpbi.f135599a, "c", bpbs.f135623a});
        } else if (i2 == 3) {
            return new bpbj();
        } else {
            if (i2 == 4) {
                return new bxvd(f135600d);
            }
            if (i2 == 5) {
                return f135600d;
            }
            bxxk bxxk = f135601e;
            if (bxxk == null) {
                synchronized (bpbj.class) {
                    bxxk = f135601e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135600d);
                        f135601e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
