package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.places.p095ui.placepicker.PlacePickerChimeraActivity;

/* renamed from: bina */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bina implements rkl {

    /* renamed from: a */
    final /* synthetic */ PlacePickerChimeraActivity f120956a;

    public bina(PlacePickerChimeraActivity placePickerChimeraActivity) {
        this.f120956a = placePickerChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        if (biik.m102446a(status)) {
            if (Log.isLoggable("Places", 6)) {
                String valueOf = String.valueOf(aemj.m52156a(status.f30115i));
                Log.e("Places", valueOf.length() == 0 ? new String("Place Picker closing due to ") : "Place Picker closing due to ".concat(valueOf));
            }
            this.f120956a.finishActivity(2);
            this.f120956a.setResult(2);
            this.f120956a.finish();
            return;
        }
        this.f120956a.f151433b = true;
    }
}
