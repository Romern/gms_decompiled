package p000;

/* renamed from: buff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buff extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final buff f153686e;

    /* renamed from: f */
    private static volatile bxxk f153687f;

    /* renamed from: a */
    public int f153688a;

    /* renamed from: b */
    public int f153689b;

    /* renamed from: c */
    public int f153690c;

    /* renamed from: d */
    public int f153691d;

    static {
        buff buff = new buff();
        f153686e = buff;
        GeneratedMessageLite.m124024a(buff.class, buff);
    }

    private buff() {
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
            return GeneratedMessageLite.m124022a(f153686e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဏ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new buff();
        } else {
            if (i2 == 4) {
                return new bxvd(f153686e);
            }
            if (i2 == 5) {
                return f153686e;
            }
            bxxk bxxk = f153687f;
            if (bxxk == null) {
                synchronized (buff.class) {
                    bxxk = f153687f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153686e);
                        f153687f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
