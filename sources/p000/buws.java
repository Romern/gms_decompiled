package p000;

import android.bluetooth.BluetoothAdapter;
import android.os.SystemClock;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper$1;

/* renamed from: buws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buws extends buqn {

    /* renamed from: a */
    final /* synthetic */ BluetoothAdapterWrapper$1 f155182a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buws(BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$1, String str) {
        super(str);
        this.f155182a = bluetoothAdapterWrapper$1;
    }

    public final void run() {
        BluetoothAdapter bluetoothAdapter = this.f155182a.f191760b.f155185c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            this.f155182a.f191760b.f155189g = Long.valueOf(SystemClock.elapsedRealtime());
            srn srn = bvcm.f155598a;
            BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$1 = this.f155182a;
            buwt buwt = bluetoothAdapterWrapper$1.f191760b;
            Long l = buwt.f155189g;
            buqh buqh = buwt.f155187e;
            buqn buqn = bluetoothAdapterWrapper$1.f191759a;
            byyb byyb = buwt.f155184b.f155567b.f168924g;
            if (byyb == null) {
                byyb = byyb.f168875j;
            }
            buqh.mo72983a(buqn, byyb.f168885i);
            return;
        }
        BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$12 = this.f155182a;
        buwt buwt2 = bluetoothAdapterWrapper$12.f191760b;
        buwt2.f155189g = null;
        buwt2.f155187e.mo72989e(bluetoothAdapterWrapper$12.f191759a);
    }
}
