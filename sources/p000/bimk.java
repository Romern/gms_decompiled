package p000;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.concurrent.TimeUnit;

/* renamed from: bimk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimk implements afck {

    /* renamed from: a */
    final /* synthetic */ bimo f120907a;

    public bimk(bimo bimo) {
        this.f120907a = bimo;
    }

    /* renamed from: a */
    public final void mo34743a() {
        this.f120907a.f120915d.mo34759e();
        try {
            LatLngBounds latLngBounds = this.f120907a.f120915d.mo34759e().f64187a.mo34825a().f79953e;
            bimy bimy = this.f120907a.f120912a;
            bimy.f120944k = latLngBounds;
            bimw bimw = bimy.f120941h;
            if (bimw != null) {
                ((binb) bimw).f120960d = latLngBounds;
            }
            LatLngBounds latLngBounds2 = bimy.f120943j;
            if (latLngBounds2 != null) {
                float a = bimy.m102577a(latLngBounds.f79897b, latLngBounds2.f79897b);
                float a2 = bimy.m102577a(latLngBounds.f79896a, latLngBounds2.f79896a);
                if (a < 50.0f && a2 < 50.0f) {
                    return;
                }
            }
            bimy.f120943j = latLngBounds;
            rke rke = bimy.f120942i;
            if (rke != null) {
                rke.mo9460b();
                bimy.f120942i = null;
            }
            if (bimy.f120947n) {
                aenc aenc = bimy.f120949p;
                bimy.f120942i = aenc.m52183a(bimy.f120935b, latLngBounds, (int) cggj.m145236c(), "*", null);
                bimy.f120942i.mo9459a(new bims(bimy), cggj.m145237d(), TimeUnit.MILLISECONDS);
            }
            bimx bimx = bimy.f120938e;
            bimu bimu = bimy.f120939f;
            if (bimu != null) {
                bilz bilz = ((bime) bimu).f120886b;
                bilz.f120878e = true;
                bilz.mo171aJ();
            }
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
