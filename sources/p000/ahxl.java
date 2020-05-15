package p000;

import android.bluetooth.BluetoothDevice;

/* renamed from: ahxl */
public final /* synthetic */ class ahxl implements bmxz {

    /* renamed from: a */
    private final busy f68291a;

    public ahxl(busy busy) {
        this.f68291a = busy;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.lang.Object, java.lang.Object):bngx
     arg types: [int, int]
     candidates:
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.lang.Object, java.lang.Object):bngx */
    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        busy busy = this.f68291a;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        if (busy == null || busy.mo73090a(bluetoothDevice.getAddress(), bngx.m109357a((Object) 2, (Object) 1)) == null) {
            return false;
        }
        return true;
    }
}
