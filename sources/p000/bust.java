package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;

/* renamed from: bust */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bust implements busx {

    /* renamed from: a */
    final /* synthetic */ Context f154821a;

    /* renamed from: b */
    final /* synthetic */ busy f154822b;

    public bust(busy busy, Context context) {
        this.f154822b = busy;
        this.f154821a = context;
    }

    /* renamed from: a */
    public final void mo37228a() {
    }

    /* renamed from: a */
    public final void mo37230a(int i, BluetoothProfile bluetoothProfile) {
    }

    /* renamed from: a */
    public final void mo37229a(int i, int i2, int i3, BluetoothDevice bluetoothDevice) {
        Object obj;
        synchronized (this.f154822b) {
            busy busy = this.f154822b;
            int i4 = busy.f154828h;
            obj = busy.f154832d.get(i);
        }
        if (obj == null) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
            bnsl.mo68432a("bust", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("BTConnStateMgr: Receive device status change with profile %d but profileProxy is not connected! Try reconnect.", i);
            busy busy2 = this.f154822b;
            busy2.f154830b.getProfileProxy(this.f154821a, busy2.f154834g, i);
        }
    }
}
