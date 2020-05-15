package p000;

/* renamed from: bbcv */
final /* synthetic */ class bbcv implements bqeh {

    /* renamed from: a */
    private final bavt f102383a;

    public bbcv(bavt bavt) {
        this.f102383a = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavt bavt = this.f102383a;
        bavu bavu = (bavu) obj;
        if (bavu == null) {
            bbev.m87906a("%s: getFileStatus called on file that doesn't exists! Key = %s", "SharedFileManager", bavt);
            return bqga.m112777a((Throwable) new bbdb());
        }
        bavq a = bavq.m87609a(bavu.f101939c);
        if (a == null) {
            a = bavq.NONE;
        }
        return bqga.m112775a(a);
    }
}
