package p000;

/* renamed from: bvbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvbn implements bvda {

    /* renamed from: a */
    final /* synthetic */ bvbq f155546a;

    public bvbn(bvbq bvbq) {
        this.f155546a = bvbq;
    }

    /* renamed from: a */
    public final void mo73126a() {
        srn srn = bvcm.f155598a;
        bvbq bvbq = this.f155546a;
        int i = bvbq.f155550i;
        String str = bvbq.f155552b;
        bvcu bvcu = bvbq.f155553c;
        if (bvcu.f155608a == bvac.OPERATION_STATUS_PENDING || bvcu.f155608a == bvac.OPERATION_STATUS_STARTING || bvcu.f155608a == bvac.OPERATION_STATUS_ACTIVE) {
            this.f155546a.f155553c.mo73318b();
        } else {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("bvbn", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bvbq bvbq2 = this.f155546a;
            bnsl.mo68424a("%s cannot be active, in state: %s", bvbq2.f155552b, bvbq2.f155553c.f155608a);
        }
        this.f155546a.f155554d.set(2);
    }

    /* renamed from: b */
    public final void mo73127b() {
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68432a("bvbn", "b", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bvbq bvbq = this.f155546a;
        int i = bvbq.f155550i;
        bnsl.mo68420a("%s ERROR starting operation!", bvbq.f155552b);
        this.f155546a.f155553c.mo73321e();
        this.f155546a.f155554d.set(2);
    }
}
