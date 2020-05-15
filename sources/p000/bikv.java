package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: bikv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikv implements rkl {

    /* renamed from: a */
    final /* synthetic */ AutocompleteChimeraActivity f120800a;

    public bikv(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.f120800a = autocompleteChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        if (biik.m102446a(status)) {
            if (Log.isLoggable("Places", 6)) {
                String valueOf = String.valueOf(aemj.m52156a(status.f30115i));
                Log.e("Places", valueOf.length() == 0 ? new String("Autocomplete widget closing due to ") : "Autocomplete widget closing due to ".concat(valueOf));
            }
            this.f120800a.mo71311a(2, null, status);
            return;
        }
        this.f120800a.f151407o = true;
    }
}
