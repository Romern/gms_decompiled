package p000;

/* renamed from: zmg */
final /* synthetic */ class zmg implements Runnable {

    /* renamed from: a */
    private final zmi f55453a;

    /* renamed from: b */
    private final zuu f55454b;

    /* renamed from: c */
    private final String f55455c;

    public zmg(zmi zmi, zuu zuu, String str) {
        this.f55453a = zmi;
        this.f55454b = zuu;
        this.f55455c = str;
    }

    public final void run() {
        zmi zmi = this.f55453a;
        try {
            zmi.mo31257a(this.f55454b, this.f55455c, cdyl.f181915a.mo6606a().mo78458g());
        } catch (yqh e) {
            bnsl bnsl = (bnsl) zmi.f55459a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("%s cannot determine if account is supported", zmi.f55461b.mo31239b());
        }
    }
}
