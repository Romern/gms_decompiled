package p000;

/* renamed from: caa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caa extends bzy {

    /* renamed from: f */
    public static final bzu f6319f;

    /* renamed from: g */
    public static final int f6320g = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Amount, Authorized";
        bzv.f6287b = "Authorized amount of the transaction (including Amount, Other and excluding adjustments).";
        bzv.f6293h = f6320g;
        bzv.f6294i = bzy.f6307e;
        bzv.f6290e = bzy.f6304b;
        bzv.f6288c = bzy.f6303a;
        bzv.f6289d = 6;
        f6319f = bzv.mo3629a();
    }

    public caa(byte[] bArr) {
        super(bArr, f6319f);
    }

    /* renamed from: b */
    public final boolean mo3454b() {
        for (byte b : mo3563i()) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}
