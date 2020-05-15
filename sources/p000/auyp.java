package p000;

import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesHomePreference;

/* renamed from: auyp */
public final /* synthetic */ class auyp implements Runnable {

    /* renamed from: a */
    private final TrustedPlacesHomePreference f92796a;

    public auyp(TrustedPlacesHomePreference trustedPlacesHomePreference) {
        this.f92796a = trustedPlacesHomePreference;
    }

    public final void run() {
        auyq auyq = this.f92796a.f109301d;
        if (auyq != null) {
            auyk auyk = (auyk) auyq;
            auyk.f92782j = true;
            if (auyk.f92781i) {
                auyk.mo17248d();
            }
        }
    }
}
