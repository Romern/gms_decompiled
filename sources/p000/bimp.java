package p000;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bimp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimp implements aehz {

    /* renamed from: a */
    final /* synthetic */ bimy f120930a;

    public bimp(bimy bimy) {
        this.f120930a = bimy;
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        afcj afcj;
        bimx bimx = this.f120930a.f120938e;
        if (bimx != null && (afcj = ((bimo) bimx).f120921j) != null) {
            try {
                affk affk = afcj.f64180a;
                Parcel bj = affk.mo8529bj();
                dcl.m8165a(bj, location);
                affk.mo8528b(2, bj);
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        }
    }
}
