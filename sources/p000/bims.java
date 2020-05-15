package p000;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: bims */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bims extends rkm {

    /* renamed from: a */
    final /* synthetic */ bimy f120933a;

    public bims(bimy bimy) {
        this.f120933a = bimy;
    }

    /* renamed from: a */
    public final void mo24826a(Status status) {
        bimy bimy = this.f120933a;
        bimx bimx = bimy.f120938e;
        bimu bimu = bimy.f120939f;
        if (bimu != null) {
            bilz bilz = ((bime) bimu).f120886b;
            bilz.f120878e = false;
            bilz.mo171aJ();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo24827b(rkk rkk) {
        aeli<rty> aeli = (aeli) rkk;
        ArrayList arrayList = new ArrayList(aeli.mo24660a());
        try {
            for (rty rty : aeli) {
                arrayList.add(rty.mo7556bF());
            }
            aeli.mo12460c();
            bimy bimy = this.f120933a;
            bimy.f120945l = arrayList;
            bimx bimx = bimy.f120938e;
            if (bimx != null) {
                ((bimo) bimx).f120913b.mo64751a(arrayList);
            }
            bimu bimu = bimy.f120939f;
            if (bimu != null) {
                ((bime) bimu).f120886b.mo64751a(arrayList);
            }
        } catch (Throwable th) {
            aeli.mo12460c();
            throw th;
        }
    }
}
