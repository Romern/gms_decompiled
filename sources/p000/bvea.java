package p000;

/* renamed from: bvea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvea implements bvda {

    /* renamed from: a */
    final /* synthetic */ bved f155689a;

    public bvea(bved bved) {
        this.f155689a = bved;
    }

    /* renamed from: a */
    public final void mo73126a() {
        srn srn = bvcm.f155598a;
        this.f155689a.f155700f.countDown();
    }

    /* renamed from: b */
    public final void mo73127b() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
        bnsl.mo68432a("bvea", "b", 271, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Fail to revert Bluetooth.");
        this.f155689a.f155700f.countDown();
    }
}
