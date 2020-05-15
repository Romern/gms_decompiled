package com.google.android.gms.cast.discovery;

import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleDeviceScanner$BleScanCallback extends aacm {

    /* renamed from: a */
    public final /* synthetic */ plr f29868a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleDeviceScanner$BleScanCallback(plr plr, String str, String str2) {
        super(str, str2);
        this.f29868a = plr;
    }

    /* renamed from: a */
    public final void mo17580a() {
        plr plr = this.f29868a;
        if (!plr.f39645j) {
            ParcelUuid parcelUuid = plr.f39606a;
            plr.mo23385b();
        }
    }

    /* renamed from: a */
    public final void mo16719a(int i) {
        this.f29868a.f39642g.execute(new plq(this, i));
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        this.f29868a.f39642g.execute(new plo(this, scanResult));
    }

    /* renamed from: a */
    public final void mo16721a(List list) {
        this.f29868a.f39642g.execute(new plp(this, list));
    }
}
