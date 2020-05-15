package p000;

/* renamed from: bzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bzy extends bwz {

    /* renamed from: a */
    public static final byte[] f6303a = {-97, 2};

    /* renamed from: b */
    public static final bzx f6304b = bzx.BOTH;

    /* renamed from: c */
    public static final bzu f6305c;

    /* renamed from: d */
    public static final int f6306d = 3;

    /* renamed from: e */
    public static final int f6307e = 2;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Amount, Authorized";
        bzv.f6287b = "Authorized amount of the transaction (including Amount, Other and excluding adjustments).";
        bzv.f6293h = f6306d;
        bzv.f6294i = f6307e;
        bzv.f6290e = f6304b;
        bzv.f6288c = f6303a;
        bzv.f6289d = 6;
        f6305c = bzv.mo3629a();
    }

    public bzy(byte[] bArr) {
        super(bArr, true, f6305c);
    }

    /* renamed from: b */
    public boolean mo3454b() {
        for (byte b : mo3563i()) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    protected bzy(byte[] bArr, bzu bzu) {
        super(bArr, true, bzu);
    }
}
