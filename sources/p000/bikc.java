package p000;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bikc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bikc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bikf f120767a;

    public bikc(bikf bikf) {
        this.f120767a = bikf;
    }

    public final void run() {
        LatLng c = this.f120767a.f120771c.mo64619c();
        if (c != null) {
            this.f120767a.f120770b.mo64647a(c);
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Alias Editor is skipping reverse geocode because the map was not ready.");
        }
    }
}
