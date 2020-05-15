package p000;

/* renamed from: bbee */
final /* synthetic */ class bbee implements bqeh {

    /* renamed from: a */
    private final bavt f102468a;

    public bbee(bavt bavt) {
        this.f102468a = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavt bavt = this.f102468a;
        if (((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) null);
        }
        bbev.m87906a("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", bavt);
        bauo a = bauq.m87573a();
        a.f101791a = baup.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
        return bqga.m112777a((Throwable) a.mo55987a());
    }
}
