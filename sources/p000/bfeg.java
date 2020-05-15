package p000;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* renamed from: bfeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfeg extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ bfei f113562a;

    public bfeg(bfei bfei) {
        this.f113562a = bfei;
    }

    public final void onCellLocationChanged(CellLocation cellLocation) {
        this.f113562a.mo61535a(cellLocation);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        CellLocation cellLocation;
        this.f113562a.f113565b = signalStrength.isGsm() ? signalStrength.getGsmSignalStrength() : signalStrength.getCdmaDbm();
        try {
            cellLocation = this.f113562a.f113564a.getCellLocation();
        } catch (SecurityException e) {
            bhdb bhdb = this.f113562a.f113804g;
            cellLocation = null;
        }
        if (cellLocation != null) {
            this.f113562a.mo61535a(cellLocation);
        }
    }
}
