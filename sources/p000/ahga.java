package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;

/* renamed from: ahga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahga {

    /* renamed from: b */
    private static ahga f67137b;

    /* renamed from: a */
    public final BluetoothLeAdvertiser f67138a;

    private ahga(BluetoothLeAdvertiser bluetoothLeAdvertiser) {
        this.f67138a = bluetoothLeAdvertiser;
    }

    /* renamed from: a */
    public static synchronized ahga m55680a() {
        ahga ahga;
        BluetoothLeAdvertiser bluetoothLeAdvertiser;
        synchronized (ahga.class) {
            if (f67137b == null) {
                ahga = null;
                try {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (!(defaultAdapter == null || (bluetoothLeAdvertiser = defaultAdapter.getBluetoothLeAdvertiser()) == null)) {
                        f67137b = new ahga(bluetoothLeAdvertiser);
                    }
                } catch (NullPointerException e) {
                }
            }
            ahga = f67137b;
        }
        return ahga;
    }

    /* renamed from: a */
    public final void mo36415a(AdvertiseCallback advertiseCallback) {
        try {
            this.f67138a.stopAdvertising(advertiseCallback);
        } catch (IllegalStateException | NullPointerException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo36416a(AdvertiseSettings advertiseSettings, AdvertiseData advertiseData, AdvertiseCallback advertiseCallback) {
        try {
            this.f67138a.startAdvertising(advertiseSettings, advertiseData, advertiseCallback);
            return true;
        } catch (IllegalStateException | NullPointerException e) {
            return false;
        }
    }
}
