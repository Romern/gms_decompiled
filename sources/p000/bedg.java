package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.List;

/* renamed from: bedg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bedg extends ayso {

    /* renamed from: a */
    final /* synthetic */ bedj f106950a;

    public bedg(bedj bedj) {
        this.f106950a = bedj;
    }

    /* renamed from: a */
    public final void mo54323a(aysm aysm, int i) {
        this.f106950a.f106968b.mo54411a(new aysz(bedi.DISCOVER_SERVICES_INTERNAL, aysm), i);
    }

    /* renamed from: b */
    public final void mo54328b(aysm aysm, int i) {
        this.f106950a.f106968b.mo54411a(new aysz(bedi.WRITE_RELIABLE, aysm), i);
    }

    /* renamed from: c */
    public final void mo54332c(aysm aysm, int i, int i2) {
        this.f106950a.f106968b.mo54412a(new aysz(bedi.READ_RSSI, aysm), i2, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo54324a(aysm aysm, int i, int i2) {
        aysl a = aysm.mo54358a();
        if (i2 == 0) {
            bede bede = (bede) this.f106950a.f106970d.remove(aysm);
            if (bede != null) {
                if (bede.f106938d) {
                    bede.f106938d = false;
                    List list = bede.f106941g;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((bedw) list.get(i3)).mo58594a();
                    }
                    bede.f106939e.mo54370f();
                }
                this.f106950a.f106968b.mo54411a(new aysz(bedi.DISCONNECT, a), i);
                return;
            }
            if (i == 0) {
                Log.w("Coffee-BluetoothGattHelper", String.format("Received a success on a failed connection attempt for device %s! Ignoring.", a));
                i = 257;
            }
            this.f106950a.f106968b.mo54411a(new aysz(bedi.CONNECT, a), i);
            aysm.mo54368e();
            aysm.mo54370f();
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected connection state: ");
            sb.append(i2);
            Log.e("Coffee-BluetoothGattHelper", sb.toString());
        } else if (i == 0) {
            bede bede2 = new bede(aysm, this.f106950a.f106968b);
            this.f106950a.f106970d.put(aysm, bede2);
            this.f106950a.f106968b.mo54412a(new aysz(bedi.CONNECT, a), 0, bede2);
        } else {
            this.f106950a.f106968b.mo54412a(new aysz(bedi.CONNECT, a), i, null);
        }
    }

    /* renamed from: b */
    public final void mo54329b(aysm aysm, int i, int i2) {
        this.f106950a.f106968b.mo54412a(new aysz(bedi.CHANGE_MTU, aysm), i2, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo54330b(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f106950a.f106968b.mo54411a(new aysz(bedi.WRITE_CHARACTERISTIC, aysm, bluetoothGattCharacteristic), i);
    }

    /* renamed from: b */
    public final void mo54331b(aysm aysm, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        Object[] objArr = {aysm.mo54358a(), bluetoothGattDescriptor.getUuid(), Integer.valueOf(i)};
        this.f106950a.f106968b.mo54411a(new aysz(bedi.WRITE_DESCRIPTOR, aysm, bluetoothGattDescriptor), i);
    }

    /* renamed from: a */
    public final void mo54325a(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            value = new byte[0];
        }
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), aysm.mo54358a()};
        try {
            bedj bedj = this.f106950a;
            int i = bedj.f106967f;
            bede bede = (bede) bedj.f106970d.get(aysm);
            if (bede != null) {
                bedd bedd = (bedd) bede.f106940f.get(bluetoothGattCharacteristic);
                if (bedd != null) {
                    synchronized (bedd.f106933a) {
                        bedx bedx = bedd.f106934b;
                        if (bedx == null) {
                            bedd.f106933a.add(value);
                        } else {
                            bedx.mo58595a(value);
                        }
                    }
                    return;
                }
                return;
            }
            String valueOf = String.valueOf(aysm);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Receive callback on unexepected device: ");
            sb.append(valueOf);
            throw new BluetoothException(sb.toString());
        } catch (BluetoothException e) {
            Log.e("Coffee-BluetoothGattHelper", "Error in onCharacteristicChanged", e);
        }
    }

    /* renamed from: a */
    public final void mo54326a(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.f106950a.f106968b.mo54412a(new aysz(bedi.READ_CHARACTERISTIC, aysm, bluetoothGattCharacteristic), i, bluetoothGattCharacteristic.getValue());
    }

    /* renamed from: a */
    public final void mo54327a(aysm aysm, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.f106950a.f106968b.mo54412a(new aysz(bedi.READ_DESCRIPTOR, aysm, bluetoothGattDescriptor), i, bluetoothGattDescriptor.getValue());
    }
}
