package p000;

/* renamed from: azpn */
final /* synthetic */ class azpn implements bdaq {

    /* renamed from: a */
    private final azpw f99836a;

    /* renamed from: b */
    private final bcoh f99837b;

    public azpn(azpw azpw, bcoh bcoh) {
        this.f99836a = azpw;
        this.f99837b = bcoh;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azpw azpw = this.f99836a;
        bcoh bcoh = this.f99837b;
        bngx bngx = (bngx) obj;
        int size = bngx.size();
        for (int i = 0; i < size; i++) {
            azpw.mo55199a(bcoh, ((bcsp) bngx.get(i)).mo57317a());
        }
    }
}
