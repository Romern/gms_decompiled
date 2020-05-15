package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: vmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vmu implements rkl {

    /* renamed from: a */
    final /* synthetic */ vmy f49535a;

    public vmu(vmy vmy) {
        this.f49535a = vmy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        if (!status.mo17710c()) {
            vmy.f49539a.mo25374b("SelectFileFragment", "Failed to authorize access (%s)", status.f30116j);
            this.f49535a.mo28650a(3);
            this.f49535a.getActivity().finish();
            return;
        }
        vmy vmy = this.f49535a;
        vmy.mo28651a(vmy.f49553i.f31200c);
    }
}
