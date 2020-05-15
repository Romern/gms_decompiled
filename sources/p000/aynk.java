package p000;

import android.bluetooth.BluetoothProfile;

/* renamed from: aynk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aynk implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    final /* synthetic */ bqgy f98067a;

    public aynk(bqgy bqgy) {
        this.f98067a = bqgy;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        this.f98067a.mo69138b(bluetoothProfile);
    }

    public final void onServiceDisconnected(int i) {
        bnsp bnsp = aypn.f98194a;
    }
}
