package p000;

/* renamed from: bpxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxg extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bpxg f139698i;

    /* renamed from: j */
    private static volatile bxxk f139699j;

    /* renamed from: a */
    public int f139700a;

    /* renamed from: b */
    public String f139701b = "";

    /* renamed from: c */
    public int f139702c;

    /* renamed from: d */
    public int f139703d;

    /* renamed from: e */
    public int f139704e;

    /* renamed from: f */
    public int f139705f;

    /* renamed from: g */
    public int f139706g;

    /* renamed from: h */
    public bxvt f139707h = bxvm.f164965b;

    static {
        bpxg bpxg = new bpxg();
        f139698i = bpxg;
        GeneratedMessageLite.m124024a(bpxg.class, bpxg);
    }

    private bpxg() {
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
            return GeneratedMessageLite.m124022a(f139698i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u001e", new Object[]{"a", "b", "c", bpzo.m112439b(), "d", bpzq.m112443b(), "e", "f", "g", "h", bqbf.m112505b()});
        } else if (i2 == 3) {
            return new bpxg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f139698i;
            }
            bxxk bxxk = f139699j;
            if (bxxk == null) {
                synchronized (bpxg.class) {
                    bxxk = f139699j;
                    if (bxxk == null) {
                        bxxk = new bxve(f139698i);
                        f139699j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
