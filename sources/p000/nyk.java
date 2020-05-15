package p000;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;

/* renamed from: nyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyk implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ nyl f36951a;

    public nyk(nyl nyl) {
        this.f36951a = nyl;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        nyl nyl = this.f36951a;
        bnsn bnsn = nyl.f36952a;
        if (nyl.f36958g && nyl.f36953b) {
            return;
        }
        if (i == 1) {
            nyl.f36957f = new nyi((BluetoothHeadset) bluetoothProfile);
            nyl nyl2 = this.f36951a;
            if (nyl2.f36957f != null) {
                nyl2.f36956e.run();
                return;
            }
            return;
        }
        bnsi c = nyl.f36952a.mo68388c();
        c.mo68432a("nyk", "onServiceConnected", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68409a("hfp onServiceConnected: wrong profile=%d", i);
    }

    public final void onServiceDisconnected(int i) {
        bnsn bnsn = nyl.f36952a;
    }
}
