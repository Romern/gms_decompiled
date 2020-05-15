package p000;

import android.os.RemoteException;
import android.util.Log;
import androidx.preference.Preference;

/* renamed from: vro */
final /* synthetic */ class vro implements anz {

    /* renamed from: a */
    private final vrr f49862a;

    public vro(vrr vrr) {
        this.f49862a = vrr;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        vrr vrr = this.f49862a;
        vrr.f49865c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION);
        vsi vsi = vrr.f49866d;
        try {
            vsi.f49901c.mo28875b(((Boolean) obj).booleanValue());
            return true;
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return true;
        }
    }
}
