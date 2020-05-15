package p000;

/* renamed from: brk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brk extends bxs {

    /* renamed from: a */
    public static final bzu f5463a;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Issuer Application Data";
        bzv.f6287b = "Contains proprietary application data for transmission to the Issuer in an online transaction.";
        bzv.f6293h = bxs.f6025d;
        bzv.f6294i = bxs.f6026e;
        bzv.f6290e = bxs.f6024c;
        bzv.f6288c = bxs.f6023b;
        bzv.f6289d = 32;
        bzv.f6295j = bxs.f6027f;
        bzv.f6296k = bxs.f6028g;
        bzv.f6298m = bxs.f6029h;
        f5463a = bzv.mo3629a();
    }

    public brk() {
        this(new byte[32]);
    }

    /* renamed from: a */
    public final byte mo3449a() {
        return this.f5930l[1];
    }

    /* renamed from: b */
    public final bye mo3454b() {
        return new bye(new byte[]{this.f5930l[2]}, null);
    }

    /* renamed from: c */
    public final bya mo3455c() {
        throw new UnsupportedOperationException("Not supported");
    }

    /* renamed from: d */
    public final bwz mo3456d() {
        byte[] bArr = new byte[5];
        System.arraycopy(this.f5930l, 3, bArr, 0, 5);
        return new brj(bArr);
    }

    /* renamed from: e */
    public final int mo3457e() {
        return this.f5930l[17];
    }

    /* renamed from: f */
    public final byte mo3458f() {
        return this.f5930l[26];
    }

    /* renamed from: g */
    public final void mo3459g() {
        byte[] bArr = this.f5930l;
        bArr[0] = 15;
        bArr[16] = 15;
        for (int i = 0; i < 8; i++) {
            this.f5930l[i + 8] = 0;
        }
    }

    public brk(byte[] bArr) {
        super(bArr, f5463a, null);
    }

    /* renamed from: a */
    public final void mo3450a(bre bre) {
        System.arraycopy(bre.mo3563i(), 0, this.f5930l, 1, 1);
    }

    /* renamed from: a */
    public final void mo3451a(brh brh) {
        System.arraycopy(brh.mo3563i(), 0, this.f5930l, 26, 1);
    }

    /* renamed from: a */
    public final void mo3452a(brj brj) {
        System.arraycopy(brj.mo3563i(), 0, this.f5930l, 3, 5);
    }

    /* renamed from: a */
    public final void mo3453a(bye bye) {
        System.arraycopy(bye.mo3563i(), 0, this.f5930l, 2, 1);
    }
}
