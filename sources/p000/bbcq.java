package p000;

/* renamed from: bbcq */
final /* synthetic */ class bbcq implements bqeh {

    /* renamed from: a */
    private final bavt f102358a;

    public bbcq(bavt bavt) {
        this.f102358a = bavt;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavt bavt = this.f102358a;
        if (((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) true);
        }
        bbev.m87906a("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", bavt);
        return bqga.m112775a((Object) false);
    }
}
