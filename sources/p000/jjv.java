package p000;

import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;

/* renamed from: jjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjv implements jir {

    /* renamed from: a */
    final /* synthetic */ BlePeripheralChimeraService f22661a;

    public jjv(BlePeripheralChimeraService blePeripheralChimeraService) {
        this.f22661a = blePeripheralChimeraService;
    }

    /* renamed from: a */
    public final void mo13767a() {
        this.f22661a.mo7778c();
    }

    /* renamed from: a */
    public final void mo13768a(String str) {
        BlePeripheralChimeraService.f11114a.mo25418e("Failed to start advertising: %s", str);
        this.f22661a.mo7779d();
    }
}
