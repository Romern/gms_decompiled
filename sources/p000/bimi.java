package p000;

import android.util.Log;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bimi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimi implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bimo f120905a;

    public bimi(bimo bimo) {
        this.f120905a = bimo;
    }

    public void onClick(View view) {
        bimy bimy = this.f120905a.f120912a;
        LatLngBounds latLngBounds = bimy.f120944k;
        if (latLngBounds == null) {
            if (Log.isLoggable("Places", 5)) {
                Log.w("Places", "Tried to select marker location before the map loaded. Falling back to using the current location.");
            }
            LatLng b = bimy.mo64778b();
            if (b != null) {
                bimy.f120934a.mo64789a(b);
            } else if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Failed to fall back to current location. Giving up.");
            }
        } else {
            bimy.f120934a.mo64789a(latLngBounds.mo43870a());
        }
    }
}
