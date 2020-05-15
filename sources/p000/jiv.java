package p000;

import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import com.google.android.gms.beacon.BleSighting;

/* renamed from: jiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jiv extends nej {

    /* renamed from: a */
    final /* synthetic */ jiw f22581a;

    public jiv(jiw jiw) {
        this.f22581a = jiw;
    }

    /* renamed from: a */
    public final void mo13773a(int i) {
        jja jja = this.f22581a.f22582a.f22586b;
        BleCentralChimeraService.f11094a.mo25418e("Failed to initiate BLE scanning; killing service. Error code: %s", Integer.valueOf(i));
        jja.f22603b.f11097d.mo14043a("start_ble_scan_result", i);
        jja.f22603b.stopSelf();
    }

    /* renamed from: a */
    public final void mo13774a(int i, BleSighting bleSighting) {
        jja jja = this.f22581a.f22582a.f22586b;
        jja.f22603b.mo7772a(bleSighting.f29271a.getAddress(), bleSighting.f29272b.mo20526a(jiy.f22589b), jja.f22602a);
    }
}
