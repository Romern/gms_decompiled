package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import com.google.android.gms.carsetup.CarStartupServiceImpl;

/* renamed from: otc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class otc {

    /* renamed from: a */
    final /* synthetic */ CarStartupServiceImpl f38375a;

    public otc(CarStartupServiceImpl carStartupServiceImpl) {
        this.f38375a = carStartupServiceImpl;
    }

    /* renamed from: a */
    public final void mo22598a() {
        dcm dcm;
        CarStartupServiceImpl carStartupServiceImpl = this.f38375a;
        pec pec = carStartupServiceImpl.f29623k;
        synchronized (((pdz) pec).f38925b) {
            dcm = ((pdz) pec).f38927d;
        }
        if (dcm.SHUTDOWN.equals(dcm) || dcm.IDLE.equals(dcm)) {
            bnsi d = CarStartupServiceImpl.f29613a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Startup service stopping");
            carStartupServiceImpl.mo17440b();
            carStartupServiceImpl.stopSelf();
        }
    }

    /* renamed from: a */
    public final void mo22599a(String str, int i, WifiInfo wifiInfo, int i2, int i3) {
        Intent intent = new Intent("com.google.android.gms.car.START_WIFI");
        if (ccrv.m131380d()) {
            intent.setComponent((ComponentName) nzg.f37001c.mo6606a());
        } else {
            intent.setComponent(npp.f36341c);
        }
        intent.setFlags(268435456);
        intent.putExtra("ip_address", str);
        intent.putExtra("port", i);
        intent.putExtra("wifi_info", wifiInfo);
        intent.putExtra("wifi_version_major", i2);
        intent.putExtra("wifi_version_minor", i3);
        ouz.m29833a(intent);
        this.f38375a.startActivity(intent);
    }
}
