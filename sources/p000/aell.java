package p000;

import com.google.android.gms.location.places.PlacesClientIdentifier;

/* renamed from: aell */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aell extends rpa {

    /* renamed from: a */
    final /* synthetic */ PlacesClientIdentifier f63493a;

    public aell(PlacesClientIdentifier placesClientIdentifier) {
        this.f63493a = placesClientIdentifier;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        aeoa aeoa = (aeoa) rjd;
        try {
            sdo.checkIfNull(this.f63493a, "clientIdentifier == null.");
            aelk aelk = new aelk(aucf);
            PlacesClientIdentifier placesClientIdentifier = this.f63493a;
            sdo.checkIfNull(aelk, "callback == null");
            ((aeni) aeoa.mo25289B()).mo34354a(placesClientIdentifier, aeoa.f63545a, aelk);
        } catch (NullPointerException e) {
            aucf.mo50392b((Exception) e);
        }
    }
}
