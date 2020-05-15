package p000;

import android.util.Log;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: bili */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bili implements rkl {

    /* renamed from: a */
    final /* synthetic */ bilk f120825a;

    public bili(bilk bilk) {
        this.f120825a = bilk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        PlacePhotoResult placePhotoResult = (PlacePhotoResult) rkk;
        this.f120825a.f120840k = null;
        if (placePhotoResult.f79483a.mo17710c()) {
            bilk bilk = this.f120825a;
            bilk.f120839j = placePhotoResult.f79485c;
            bilh bilh = bilk.f120835f;
            if (bilh != null) {
                bilh.mo64732a(bilk.f120839j);
            }
        } else if (Log.isLoggable("Places", 6)) {
            String valueOf = String.valueOf(placePhotoResult.f79483a.toString());
            Log.e("Places", valueOf.length() == 0 ? new String("Failed to retrieve place photo: ") : "Failed to retrieve place photo: ".concat(valueOf));
        }
    }
}
