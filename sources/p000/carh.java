package p000;

/* renamed from: carh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class carh implements cari {

    /* renamed from: a */
    private final caox f175661a;

    /* renamed from: b */
    private final carj f175662b;

    public carh(caox caox, carj carj) {
        this.f175661a = caox;
        this.f175662b = carj;
    }

    /* renamed from: a */
    public final caru mo74786a(caro caro) {
        throw new capt("Invalid state for createRemoteCryptogram");
    }

    /* renamed from: b */
    public final void mo74790b() {
        throw new capt("Invalid state for cancelPayment");
    }

    /* renamed from: a */
    public final void mo74787a() {
        if (this.f175662b.f175671i.mo74795a() != null) {
            this.f175662b.f175670h = new carl(this.f175661a, this.f175662b);
            return;
        }
        throw new capi("The profile does not support DSRP");
    }

    /* renamed from: a */
    public final void mo74788a(carn carn) {
        this.f175662b.f175670h = new C1707card(this.f175661a, this.f175662b, carn);
    }

    /* renamed from: a */
    public final byte[] mo74789a(byte[] bArr) {
        return caor.m126887a();
    }
}
