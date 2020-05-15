package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;

/* renamed from: ycq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ycq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f53607a;

    /* renamed from: b */
    final /* synthetic */ ycr f53608b;

    public ycq(ycr ycr, int i) {
        this.f53608b = ycr;
        this.f53607a = i;
    }

    public void onClick(View view) {
        BleDeviceIdentifier bleDeviceIdentifier = (BleDeviceIdentifier) this.f53608b.f53609a.get(this.f53607a);
        sdo.m34959a(this.f53608b.f53610b);
        if (bleDeviceIdentifier.f31956c) {
            xic xic = this.f53608b.f53610b;
            ycj ycj = new ycj();
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEVICE_ID", bleDeviceIdentifier);
            ycj.setArguments(bundle);
            xic.mo29791a(ycj);
            return;
        }
        this.f53608b.f53610b.mo29787a(bleDeviceIdentifier);
    }
}
