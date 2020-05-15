package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.google.android.gms.smartdevice.fastpair.FastPairNotificationIntentOperation;
import java.util.concurrent.ExecutionException;

/* renamed from: arrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arrx extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ FastPairNotificationIntentOperation f88206a;

    public arrx(FastPairNotificationIntentOperation fastPairNotificationIntentOperation) {
        this.f88206a = fastPairNotificationIntentOperation;
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        Logger Logger = FastPairNotificationIntentOperation.f108064a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("onCharacteristicRead(): ");
        sb.append(i);
        Logger.mo25412b(sb.toString(), new Object[0]);
        if (i == 0 && bluetoothGattCharacteristic.getUuid().equals(arrv.f88189b)) {
            this.f88206a.f108066c.mo50391a(new String(bluetoothGattCharacteristic.getValue(), arrv.f88191d));
        }
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 0) {
            FastPairNotificationIntentOperation.f108064a.mo25412b("Disconnected from GATT server.", new Object[0]);
            this.f88206a.f108066c.mo50392b((Exception) new ExecutionException(new Exception("Disconnected from Gatt server.")));
        } else if (i2 != 2) {
            Logger Logger = FastPairNotificationIntentOperation.f108064a;
            StringBuilder sb = new StringBuilder(29);
            sb.append("connection state: ");
            sb.append(i2);
            Logger.mo25412b(sb.toString(), new Object[0]);
        } else {
            boolean discoverServices = bluetoothGatt.discoverServices();
            Logger logger2 = FastPairNotificationIntentOperation.f108064a;
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("Discovering services: ");
            sb2.append(discoverServices);
            logger2.mo25412b(sb2.toString(), new Object[0]);
        }
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCharacteristic characteristic;
        if (i != 0) {
            Logger Logger = FastPairNotificationIntentOperation.f108064a;
            StringBuilder sb = new StringBuilder(42);
            sb.append("onServicesDiscovered received: ");
            sb.append(i);
            Logger.mo25416d(sb.toString(), new Object[0]);
            return;
        }
        FastPairNotificationIntentOperation.f108064a.mo25412b("onServicesDiscovered()", new Object[0]);
        BluetoothGattService service = bluetoothGatt.getService(arrv.f88188a);
        if (service != null && (characteristic = service.getCharacteristic(arrv.f88189b)) != null) {
            bluetoothGatt.readCharacteristic(characteristic);
        }
    }
}
