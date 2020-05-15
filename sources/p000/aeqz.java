package p000;

import android.content.DialogInterface;
import com.google.android.gms.location.settings.LocationOffWarningChimeraActivity;

/* renamed from: aeqz */
public final /* synthetic */ class aeqz implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final LocationOffWarningChimeraActivity f63652a;

    public aeqz(LocationOffWarningChimeraActivity locationOffWarningChimeraActivity) {
        this.f63652a = locationOffWarningChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        LocationOffWarningChimeraActivity locationOffWarningChimeraActivity = this.f63652a;
        if (!locationOffWarningChimeraActivity.isFinishing()) {
            locationOffWarningChimeraActivity.finish();
        }
    }
}
