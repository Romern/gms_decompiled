package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: aijv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aijv extends airo {

    /* renamed from: a */
    private final Context f68992a;

    /* renamed from: b */
    private final BluetoothManager f68993b;

    /* renamed from: c */
    private final ayrr f68994c;

    /* renamed from: d */
    private aysc f68995d;

    public aijv(Context context, BluetoothManager bluetoothManager, ayrr ayrr) {
        super(34);
        this.f68992a = context;
        this.f68993b = bluetoothManager;
        this.f68994c = ayrr;
    }

    /* renamed from: a */
    public final void mo37566a() {
        aysc aysc = this.f68995d;
        if (aysc != null) {
            synchronized (aysc.f98398c) {
                aysp aysp = aysc.f98405j;
                if (aysp != null) {
                    aysp.mo54382a();
                    aysc.f98405j = null;
                }
            }
            this.f68995d = null;
            aikx.m57353e();
            return;
        }
        srn srn = ailf.f69111a;
    }

    /* renamed from: b */
    public final int mo37568b() {
        aysc aysc = new aysc(this.f68992a, new ayss(this.f68993b));
        try {
            ayrr ayrr = this.f68994c;
            synchronized (aysc.f98398c) {
                bmxy.m108601b(aysc.f98405j == null, "Gatt server is already open.");
                aysp a = aysp.m84734a(aysc.f98402g.f98426a.openGattServer(aysc.f98401f, aysc.f98399d.f98425c));
                if (a != null) {
                    try {
                        ArrayList<BluetoothGattService> arrayList = new ArrayList();
                        for (Map.Entry entry : ayrr.f98377a.entrySet()) {
                            UUID uuid = (UUID) entry.getKey();
                            ayrq ayrq = (ayrq) entry.getValue();
                            if (uuid == null || ayrq == null) {
                                throw new IllegalStateException();
                            }
                            BluetoothGattService bluetoothGattService = new BluetoothGattService(uuid, 0);
                            for (Map.Entry entry2 : ayrq.f98376a.entrySet()) {
                                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) entry2.getKey();
                                if (bluetoothGattCharacteristic != null) {
                                    bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            arrayList.add(bluetoothGattService);
                        }
                        for (BluetoothGattService bluetoothGattService2 : arrayList) {
                            if (bluetoothGattService2 != null) {
                                aysc.f98400e.mo54415b(new ayry(new Object[]{aysb.ADD_SERVICE, bluetoothGattService2}, a, bluetoothGattService2), aysc.f98397b);
                            }
                        }
                        aysc.f98405j = a;
                        aysc.f98404i = ayrr;
                    } catch (BluetoothException e) {
                        a.mo54382a();
                        throw e;
                    }
                } else {
                    throw new BluetoothException("Failed to open the GATT server, openGattServer returned null.");
                }
            }
            this.f68995d = aysc;
            aikx.m57353e();
            return 2;
        } catch (BluetoothException e2) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("aijv", "b", 2437, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to start an advertisement GATT server due to a Bluetooth exception.");
            return 4;
        }
    }
}
