package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: ahxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxf implements ahxh {
    /* renamed from: a */
    public final void mo37254a(Context context, BluetoothDevice bluetoothDevice) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo37255a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str;
        if (i != 1 || !cfoj.f184966a.mo6606a().mo82086aJ() || bArr == null) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
            if (bArr != null) {
                str = boan.f132472f.mo68794a(bArr);
            } else {
                str = null;
            }
            bnsl.mo68413a("DeviceActionEvent: Ignoring action %s with data %s.", i, (Object) str);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("DeviceActionEvent: Received ring action change from %s: %s", bluetoothDevice, boan.f132472f.mo68794a(bArr));
        ahhd.m55768a(context, new Intent("com.google.location.nearby.common.fastpair.EVENT_STREAM_DEVICE_ACTION_RECEIVED").putExtra("com.google.location.nearby.common.fastpair.EXTRA_DEVICE_ACTION_ADDITIONAL_DATA", bArr));
        ahxk ahxk = (ahxk) ((ahxj) ahgz.m55754a(context, ahxj.class)).f68288b.get(bluetoothDevice);
        if (ahxk == null || !ahxk.mo37265b()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("EventStreamManager: sendAck: Medium is null or not connected.");
        } else {
            ahxk.mo37263a(255, 1, new byte[]{4, 1});
        }
    }
}
