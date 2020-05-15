package p000;

import android.os.RemoteException;
import android.util.Log;
import androidx.preference.Preference;

/* renamed from: vrn */
final /* synthetic */ class vrn implements anz {

    /* renamed from: a */
    private final vrr f49861a;

    public vrn(vrr vrr) {
        this.f49861a = vrr;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        vrr vrr = this.f49861a;
        vrr.f49865c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH);
        vsi vsi = vrr.f49866d;
        try {
            vsi.f49901c.mo28879d(((Boolean) obj).booleanValue());
            return true;
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return true;
        }
    }
}
