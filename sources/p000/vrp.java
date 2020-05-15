package p000;

import android.os.RemoteException;
import android.util.Log;
import androidx.preference.Preference;

/* renamed from: vrp */
final /* synthetic */ class vrp implements anz {

    /* renamed from: a */
    private final vrr f49863a;

    public vrp(vrr vrr) {
        this.f49863a = vrr;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        vrr vrr = this.f49863a;
        vrr.f49865c.mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING);
        vsi vsi = vrr.f49866d;
        try {
            vsi.f49901c.mo28881e(((Boolean) obj).booleanValue());
            return true;
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return true;
        }
    }
}
