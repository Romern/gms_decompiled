package p000;

/* renamed from: bpht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpht extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpht f137702h;

    /* renamed from: i */
    private static volatile bxxk f137703i;

    /* renamed from: a */
    public int f137704a;

    /* renamed from: b */
    public int f137705b;

    /* renamed from: c */
    public int f137706c;

    /* renamed from: d */
    public long f137707d;

    /* renamed from: e */
    public int f137708e;

    /* renamed from: f */
    public bxvw f137709f = bxwq.f165002b;

    /* renamed from: g */
    public int f137710g;

    static {
        bpht bpht = new bpht();
        f137702h = bpht;
        GeneratedMessageLite.m124024a(bpht.class, bpht);
    }

    private bpht() {
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
            return GeneratedMessageLite.m124022a(f137702h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005\u0014\u0006ဌ\u0004", new Object[]{"a", "b", bpis.m111966b(), "c", bphr.f137701a, "d", "e", bphy.f137713a, "f", "g", bphy.f137713a});
        } else if (i2 == 3) {
            return new bpht();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f137702h;
            }
            bxxk bxxk = f137703i;
            if (bxxk == null) {
                synchronized (bpht.class) {
                    bxxk = f137703i;
                    if (bxxk == null) {
                        bxxk = new bxve(f137702h);
                        f137703i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
