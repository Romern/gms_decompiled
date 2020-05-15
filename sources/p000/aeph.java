package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aeph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeph implements rkl {

    /* renamed from: a */
    final /* synthetic */ int f63587a;

    /* renamed from: b */
    final /* synthetic */ aekw f63588b;

    /* renamed from: c */
    final /* synthetic */ aepm f63589c;

    public aeph(aepm aepm, int i, aekw aekw) {
        this.f63589c = aepm;
        this.f63587a = i;
        this.f63588b = aekw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status;
        aeli aeli = (aeli) rkk;
        this.f63589c.mo34424a((rke) null);
        aepm aepm = this.f63589c;
        aepm.mo34421a(aepd.m52334a(aepm.f63597b, aeli));
        aeli.mo12460c();
        aepd aepd = this.f63589c.f63597b;
        if (aepd.f63581a == 7 && (status = aepd.f63582b) != null && status.mo17710c()) {
            aepm aepm2 = this.f63589c;
            aepm2.mo34421a(aepd.m52333a(aepm2.f63597b, this.f63587a));
            aepm aepm3 = this.f63589c;
            aekw aekw = this.f63588b;
            LatLngBounds latLngBounds = aepm3.f63600e;
            if (latLngBounds == null) {
                latLngBounds = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
            }
            rke a = aenc.m52183a(aepm3.f63598c, latLngBounds, 1, aekw.mo34283f().toString(), null);
            aepm3.mo34424a(a);
            a.mo9458a(new aepi(aepm3));
            return;
        }
        aepm aepm4 = this.f63589c;
        bikt bikt = aepm4.f63602g;
        if (bikt != null) {
            aepd aepd2 = aepm4.f63597b;
            if (aepd2.f63581a == 8) {
                bikt.mo64715a(aepd2.f63585e);
            }
        }
    }
}
