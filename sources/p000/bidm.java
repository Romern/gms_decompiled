package p000;

import com.google.android.places.service.PlaceDetectionAsyncChimeraService;

/* renamed from: bidm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PlaceDetectionAsyncChimeraService f120312a;

    public bidm(PlaceDetectionAsyncChimeraService placeDetectionAsyncChimeraService) {
        this.f120312a = placeDetectionAsyncChimeraService;
    }

    public final void run() {
        bhsi bhsi = (bhsi) this.f120312a.f151368a.f120331f.f119380b.f119280b.f120271d;
        if (bhsi.f119449d) {
            int i = bhsi.f119454i;
            if (i == -1 || i == 0) {
                bhuj.m101555a();
                return;
            }
            for (bhro bhro : bhsi.f119448c.values()) {
                bhro.mo64196c();
            }
            return;
        }
        bhuj.m101555a();
    }
}
