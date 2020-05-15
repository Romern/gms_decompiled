package p000;

import android.content.Intent;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper$1;

/* renamed from: buwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwr extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothAdapterWrapper$1 f155181a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buwr(BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$1, String str) {
        super(str);
        this.f155181a = bluetoothAdapterWrapper$1;
    }

    public final void run() {
        this.f155181a.f191760b.f155183a.sendBroadcast(new Intent("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED"));
    }
}
