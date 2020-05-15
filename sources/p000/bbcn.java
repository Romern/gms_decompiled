package p000;

/* renamed from: bbcn */
final /* synthetic */ class bbcn implements bqeh {

    /* renamed from: a */
    private final bavt f102339a;

    public bbcn(bavt bavt) {
        this.f102339a = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavt bavt = this.f102339a;
        if (((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) true);
        }
        bbev.m87906a("%s: Unable to modify file subscription for key %s", "SharedFileManager", bavt);
        return bqga.m112775a((Object) false);
    }
}
