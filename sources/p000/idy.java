package p000;

/* renamed from: idy */
final /* synthetic */ class idy implements bqeh {

    /* renamed from: a */
    private final ied f20781a;

    /* renamed from: b */
    private final boolean f20782b;

    public idy(ied ied, boolean z) {
        this.f20781a = ied;
        this.f20782b = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        aaef aaef;
        boolean z;
        ied ied = this.f20781a;
        rkb rkb = (rkb) obj;
        if (!this.f20782b) {
            return ied.m15313a(rkb);
        }
        sdo.m34971a(rkb.mo24793a(aacw.f27970c), (Object) "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        if (rkb.mo24798b(aacw.f27970c)) {
            aaef = (aaef) rkb.mo24786a(aacw.f27973f);
        } else {
            aaef = null;
        }
        if (aaef != null) {
            z = aaef.f27991a;
        } else {
            z = false;
        }
        return bqdx.m112674a(adbb.m50101a(ied.mo12949a(false)), new idz(z), bqfb.INSTANCE);
    }
}
