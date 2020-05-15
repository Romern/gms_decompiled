package p000;

/* renamed from: ahmb */
final /* synthetic */ class ahmb implements Runnable {

    /* renamed from: a */
    private final ahmn f67509a;

    /* renamed from: b */
    private final String f67510b;

    /* renamed from: c */
    private final ahna f67511c;

    public ahmb(ahmn ahmn, String str, ahna ahna) {
        this.f67509a = ahmn;
        this.f67510b = str;
        this.f67511c = ahna;
    }

    public final void run() {
        ahmn ahmn = this.f67509a;
        String str = this.f67510b;
        ahna ahna = this.f67511c;
        ahmj ahmj = (ahmj) ahmn.f67551h.get(str);
        if (ahmj == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("onEncryptionFailure() for endpoint %s, but the connection was already removed.", str);
            return;
        }
        ahna ahna2 = ahmj.f67530c;
        if (!ahna2.mo36795a().equals(ahna.mo36795a()) || !ahna2.mo36800b().equals(ahna.mo36800b()) || ahna2.mo36865l() != ahna.mo36865l()) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("onEncryptionFailure() for endpoint %s, but for a previous connection. Ignoring.", str);
        } else {
            ahmn.mo36842a(ahmj.f67528a, ahmj.f67530c.mo36865l(), str, ahmj.f67530c, ahmj.f67532e, ahmj.f67533f, 8012, ahmj.f67538k);
        }
    }
}
