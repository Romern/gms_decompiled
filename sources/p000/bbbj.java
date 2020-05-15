package p000;

/* renamed from: bbbj */
public final /* synthetic */ class bbbj implements bmxj {

    /* renamed from: a */
    private final bbch f102278a;

    public bbbj(bbch bbch) {
        this.f102278a = bbch;
    }

    public final Object apply(Object obj) {
        bbch bbch = this.f102278a;
        Void voidR = (Void) obj;
        bbbb.m87770b(bbch.f102315b);
        bbfh.m87928a(bbch.f102315b, "gms_icing_mdd_manager_metadata", bbch.f102326m).edit().clear().commit();
        bbch.f102314a = false;
        return null;
    }
}
