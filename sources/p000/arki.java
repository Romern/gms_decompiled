package p000;

/* renamed from: arki */
public final /* synthetic */ class arki implements aubq {

    /* renamed from: a */
    private final String f87813a;

    /* renamed from: b */
    private final arba f87814b;

    public arki(arba arba, String str) {
        this.f87814b = arba;
        this.f87813a = str;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        arba arba = this.f87814b;
        rod a = arba.f87260a.mo48606a(arba, this.f87813a);
        rob rob = a.f43429b;
        sdo.m34966a(rob, "Key must not be null");
        arba.f87260a.mo48608a(arba, new arkv(a), new arkw(rob));
    }
}
