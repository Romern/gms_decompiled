package p000;

import android.bluetooth.BluetoothProfile;

/* renamed from: pcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pcd implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ pce f38810a;

    public pcd(pce pce) {
        this.f38810a = pce;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            pce pce = this.f38810a;
            int[] iArr = pce.f38811a;
            pce.f38813c.post(new pca(this, bluetoothProfile));
        }
    }

    public final void onServiceDisconnected(int i) {
        if (i == 1) {
            pce pce = this.f38810a;
            int[] iArr = pce.f38811a;
            pce.f38813c.post(new pcb(this));
        }
    }
}
