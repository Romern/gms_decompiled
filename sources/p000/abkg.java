package p000;

/* renamed from: abkg */
final /* synthetic */ class abkg implements aubq {

    /* renamed from: a */
    private final abkj f57607a;

    /* renamed from: b */
    private final String f57608b;

    public abkg(abkj abkj, String str) {
        this.f57607a = abkj;
        this.f57608b = str;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        this.f57607a.mo32154a(this.f57608b, aucb.mo50384b());
        if (!aucb.mo50384b()) {
            bnsl bnsl = (bnsl) abkj.f57613a.mo68388c();
            bnsl.mo68437a(aucb.mo50387e());
            bnsl.mo68432a("abkj", "b", 441, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to restore contacts");
        }
    }
}
