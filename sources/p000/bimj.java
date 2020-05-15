package p000;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: bimj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimj implements afcs {

    /* renamed from: a */
    final /* synthetic */ bimo f120906a;

    public bimj(bimo bimo) {
        this.f120906a = bimo;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        bimo bimo = this.f120906a;
        bimo.mo64764a();
        afhb afhb = bimo.f120916e;
        if (afhb != null) {
            afhb.mo34841a();
        }
        bimo.f120915d = afcn;
        try {
            bimo.f120915d.f64181a.mo34799a(new afel(bimo));
            bimo.f120915d.mo34754a(true);
            afcw d = bimo.f120915d.mo34758d();
            d.mo34771c();
            d.mo34768a();
            d.mo34769a(false);
            d.mo34770b();
            d.mo34772d();
            bimy bimy = bimo.f120912a;
            List list = bimy.f120945l;
            if (list != null) {
                ((bimo) bimy.f120938e).f120913b.mo64751a(list);
            }
            if (!bimy.f120946m) {
                bimy.f120946m = true;
                LatLngBounds latLngBounds = bimy.f120937d;
                if (latLngBounds == null) {
                    bimy.f120936c.mo24790a((rjz) new bimq(bimy));
                } else {
                    bimx bimx = bimy.f120938e;
                    bimo bimo2 = (bimo) bimx;
                    if (bimo2.f120915d != null) {
                        if (bimo2.f120914c.getWidth() > 0) {
                            bimo2.f120915d.mo34749a(afci.m52840a(latLngBounds, bimo2.f120914c.getWidth(), bimo2.f120914c.getHeight()));
                        } else {
                            biix.m102464a((View) bimx, new bimn(bimo2, latLngBounds));
                        }
                    }
                    bimy.f120944k = bimy.f120937d;
                }
            }
            afcn.mo34750a(new bimk(bimo));
            try {
                afcn.f64181a.mo34802a(new affc(new biml(bimo)));
                try {
                    afcn.f64181a.mo34801a(new afex(new bimm(bimo)));
                    afcn.mo34752a(bimo.f120913b);
                } catch (RemoteException e) {
                    throw new afhl(e);
                }
            } catch (RemoteException e2) {
                throw new afhl(e2);
            }
        } catch (RemoteException e3) {
            throw new afhl(e3);
        }
    }
}
