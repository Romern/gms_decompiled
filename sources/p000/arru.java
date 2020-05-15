package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.os.Build;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: arru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arru extends BluetoothGattServerCallback {

    /* renamed from: a */
    final /* synthetic */ arrv f88187a;

    public arru(arrv arrv) {
        this.f88187a = arrv;
    }

    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        arrv arrv = this.f88187a;
        UUID uuid = arrv.f88188a;
        BluetoothGattServer bluetoothGattServer = arrv.f88196h;
        if (bluetoothGattServer == null) {
            arrv.f88192j.mo25416d("Bluetooth Gatt Server is null.", new Object[0]);
            return;
        }
        arrv.f88192j.mo25412b("onCharacteristicReadRequest()", new Object[0]);
        if (arrv.f88189b.equals(bluetoothGattCharacteristic.getUuid())) {
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, 0, Build.MODEL.getBytes(arrv.f88191d));
            Logger Logger = arrv.f88192j;
            String valueOf = String.valueOf(Arrays.toString(Build.MODEL.getBytes()));
            Logger.mo25412b(valueOf.length() == 0 ? new String("Device Name: ") : "Device Name: ".concat(valueOf), new Object[0]);
            return;
        }
        Logger logger2 = arrv.f88192j;
        String valueOf2 = String.valueOf(bluetoothGattCharacteristic.getUuid());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 29);
        sb.append("Invalid Characteristic Read: ");
        sb.append(valueOf2);
        logger2.mo25416d(sb.toString(), new Object[0]);
        bluetoothGattServer.sendResponse(bluetoothDevice, i, 257, 0, new byte[0]);
    }

    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        if (i2 == 0) {
            arrv.f88192j.mo25412b("Disconnected from GATT server.", new Object[0]);
        } else if (i2 != 2) {
            Logger Logger = arrv.f88192j;
            StringBuilder sb = new StringBuilder(29);
            sb.append("connection state: ");
            sb.append(i2);
            Logger.mo25412b(sb.toString(), new Object[0]);
        } else {
            arrv.f88192j.mo25412b("Connected to GATT server.", new Object[0]);
        }
    }
}
