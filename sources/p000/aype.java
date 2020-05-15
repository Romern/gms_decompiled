package p000;

/* renamed from: aype */
public final /* synthetic */ class aype {

    /* renamed from: a */
    private final aypf f98158a;

    public aype(aypf aypf) {
        this.f98158a = aypf;
    }

    /* renamed from: a */
    public final void mo54187a(byte[] bArr) {
        aypf aypf = this.f98158a;
        synchronized (aypf) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypf", "b", 1691, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("DeviceNameReceiver: device name response size = %d", bArr.length);
            aypf.f98159a = bArr;
        }
    }
}
