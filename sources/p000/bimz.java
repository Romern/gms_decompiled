package p000;

import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.places.p095ui.placepicker.PlacePickerChimeraActivity;

/* renamed from: bimz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bimz implements rkl {

    /* renamed from: a */
    final /* synthetic */ PlacePickerChimeraActivity f120955a;

    public bimz(PlacePickerChimeraActivity placePickerChimeraActivity) {
        this.f120955a = placePickerChimeraActivity;
    }

    /* renamed from: a */
    public final void mo9454a(LocationSettingsResult locationSettingsResult) {
        PlacePickerChimeraActivity placePickerChimeraActivity = this.f120955a;
        placePickerChimeraActivity.f151434c = null;
        Status status = locationSettingsResult.f79366a;
        if (status.f30115i == 6) {
            try {
                status.mo17708a(placePickerChimeraActivity.getContainerActivity(), 3);
            } catch (IntentSender.SendIntentException e) {
            }
        }
    }
}
