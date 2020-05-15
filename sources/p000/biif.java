package p000;

import com.google.android.chimera.Fragment;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* renamed from: biif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biif extends bihy {

    /* renamed from: a */
    final /* synthetic */ biij f120646a;

    public biif(biij biij) {
        this.f120646a = biij;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64637b(rkk rkk) {
        PlaceEntity placeEntity;
        aeli aeli = (aeli) rkk;
        biie biie = this.f120646a.f120658e;
        if (biie != null) {
            if (aeli.mo24660a() != 0) {
                placeEntity = ((aeoj) aeli.mo24661a(0)).mo7556bF();
            } else {
                placeEntity = null;
            }
            ((Fragment) biie).getActivity().runOnUiThread(new bikb((bikf) biie, placeEntity));
        }
    }
}
