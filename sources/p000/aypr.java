package p000;

/* renamed from: aypr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypr extends aypt {
    public aypr(aypq aypq) {
        super(aypq);
        byte b = aypq.f98206a;
        byte b2 = aypq.f98207b;
        byte[] bArr = aypq.f98208c;
    }

    /* renamed from: a */
    public final byte[] mo54206a() {
        byte[] b = mo54208b();
        if ((this.f98213b & aynx.DEVICE_ACTION.f98099c) != 0) {
            b[8] = 0;
            b[9] = 0;
        }
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("aypr", "a", 291, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68407a("Handshake Message: type (%02X), flag (%02X).", b[0], b[1]);
        return b;
    }
}
