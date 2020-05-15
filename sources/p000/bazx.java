package p000;

/* renamed from: bazx */
final /* synthetic */ class bazx implements bqeh {

    /* renamed from: a */
    private final bavr f102185a;

    public bazx(bavr bavr) {
        this.f102185a = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavr bavr = this.f102185a;
        bavd bavd = (bavd) obj;
        if (bavd != null) {
            return bqga.m112775a(bavd);
        }
        bauo a = bauq.m87573a();
        a.f101791a = baup.GROUP_NOT_FOUND_ERROR;
        String valueOf = String.valueOf(bavr.f101919b);
        a.f101792b = valueOf.length() == 0 ? new String("Nothing to download for file group: ") : "Nothing to download for file group: ".concat(valueOf);
        return bqga.m112777a((Throwable) a.mo55987a());
    }
}
