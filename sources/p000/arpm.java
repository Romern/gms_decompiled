package p000;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: arpm */
final /* synthetic */ class arpm implements aubw {

    /* renamed from: a */
    private final arps f88081a;

    public arpm(arps arps) {
        this.f88081a = arps;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        arps arps = this.f88081a;
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
        arps.f88093d = advertisingInfo.f107794b;
        String str = advertisingInfo.f107796d;
        String str2 = advertisingInfo.f107795c;
        arps.f88090a.logVerbose("Retrieved advertising info.", new Object[0]);
        Logger Logger = arps.f88090a;
        String valueOf = String.valueOf(arps.f88093d);
        Logger.logVerbose(valueOf.length() == 0 ? new String("mDeviceName fetched: ") : "mDeviceName fetched: ".concat(valueOf), new Object[0]);
        Logger logger2 = arps.f88090a;
        String valueOf2 = String.valueOf(str);
        logger2.logVerbose(valueOf2.length() == 0 ? new String("Pairing code: ") : "Pairing code: ".concat(valueOf2), new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString("deviceName", arps.f88093d);
        bundle.putString("pairingCode", str);
        bundle.putString("encodedKey", str2);
        arps.f88096g.mo48707b(116, bundle);
    }
}
