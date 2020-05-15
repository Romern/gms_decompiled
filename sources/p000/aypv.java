package p000;

/* renamed from: aypv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypv extends aypt {

    /* renamed from: c */
    private final byte[] f98216c;

    public aypv(aypu aypu) {
        super(aypu);
        this.f98216c = aypu.f98215a;
    }

    /* renamed from: a */
    public final byte[] mo54206a() {
        byte[] b = mo54208b();
        byte[] bArr = this.f98216c;
        if (bArr != null) {
            System.arraycopy(bArr, 0, b, 8, 6);
        }
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypv", "a", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68407a("Handshake Message: type (%02X), flag (%02X).", b[0], b[1]);
        return b;
    }
}
