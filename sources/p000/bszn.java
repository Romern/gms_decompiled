package p000;

/* renamed from: bszn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszn extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bszn f147859i;

    /* renamed from: j */
    private static volatile bxxk f147860j;

    /* renamed from: a */
    public int f147861a;

    /* renamed from: b */
    public String f147862b = "";

    /* renamed from: c */
    public String f147863c = "";

    /* renamed from: d */
    public String f147864d = "";

    /* renamed from: e */
    public String f147865e = "";

    /* renamed from: f */
    public String f147866f = "";

    /* renamed from: g */
    public boolean f147867g;

    /* renamed from: h */
    public bxwc f147868h = bxxn.f165040b;

    static {
        bszn bszn = new bszn();
        f147859i = bszn;
        GeneratedMessageLite.m124024a(bszn.class, bszn);
    }

    private bszn() {
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
            return GeneratedMessageLite.m124022a(f147859i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", btbh.class});
        } else if (i2 == 3) {
            return new bszn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f147859i;
            }
            bxxk bxxk = f147860j;
            if (bxxk == null) {
                synchronized (bszn.class) {
                    bxxk = f147860j;
                    if (bxxk == null) {
                        bxxk = new bxve(f147859i);
                        f147860j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
