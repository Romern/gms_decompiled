package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.List;
import java.util.Locale;

/* renamed from: ayrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrm extends ayso {

    /* renamed from: a */
    final /* synthetic */ ayrp f98355a;

    public ayrm(ayrp ayrp) {
        this.f98355a = ayrp;
    }

    /* renamed from: a */
    public final void mo54323a(aysm aysm, int i) {
        ayrp ayrp = this.f98355a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54411a(new aysz(ayro.DISCOVER_SERVICES_INTERNAL, aysm), i);
    }

    /* renamed from: b */
    public final void mo54328b(aysm aysm, int i) {
        ayrp ayrp = this.f98355a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54411a(new aysz(ayro.WRITE_RELIABLE, aysm), i);
    }

    /* renamed from: c */
    public final void mo54332c(aysm aysm, int i, int i2) {
        ayrp ayrp = this.f98355a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54412a(new aysz(ayro.READ_RSSI, aysm), i2, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo54324a(aysm aysm, int i, int i2) {
        aysl a = aysm.mo54358a();
        if (i2 == 0) {
            ayri ayri = (ayri) this.f98355a.f98373c.remove(aysm);
            if (ayri == null) {
                Log.w(ayrp.f98371a, String.format("Received unexpected disconnection for device %s! Ignoring.", a));
            } else if (ayri.f98340h) {
                if (ayri.f98340h) {
                    ayri.f98340h = false;
                    List list = ayri.f98342j;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((aypo) list.get(i3)).mo54202a();
                    }
                    ayri.f98336d.mo54370f();
                }
                ayrp ayrp = this.f98355a;
                String str = ayrp.f98371a;
                ayrp.f98375e.mo54411a(new aysz(ayro.DISCONNECT, a), i);
            } else {
                if (i == 0) {
                    Log.w(ayrp.f98371a, String.format("Received a success for a failed connection attempt for device %s! Ignoring.", a));
                    i = 257;
                }
                ayrp ayrp2 = this.f98355a;
                String str2 = ayrp.f98371a;
                ayrp2.f98375e.mo54412a(new aysz(ayro.CONNECT, a), i, null);
                aysm.mo54368e();
                aysm.mo54370f();
            }
        } else if (i2 != 2) {
            String str3 = ayrp.f98371a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected connection state: ");
            sb.append(i2);
            Log.e(str3, sb.toString());
        } else {
            ayri ayri2 = (ayri) this.f98355a.f98373c.get(aysm);
            if (ayri2 == null) {
                Log.w(ayrp.f98371a, String.format("Received unexpected successful connection for device %s! Ignoring.", a));
                return;
            }
            aysz aysz = new aysz(ayro.CONNECT, a);
            if (i == 0) {
                bmxv d = ayri2.f98338f.mo54303d();
                if (!d.mo66813a()) {
                    ayri2.mo54317c();
                    ayrp ayrp3 = this.f98355a;
                    String str4 = ayrp.f98371a;
                    ayrp3.f98375e.mo54412a(aysz, 0, ayri2);
                } else if (!aysm.mo54364b(((Integer) d.mo66814b()).intValue())) {
                    ayrp ayrp4 = this.f98355a;
                    String str5 = ayrp.f98371a;
                    ayrp4.f98375e.mo54413a(aysz, new BluetoothException(String.format(Locale.US, "Failed to request MTU of %d for device %s: returned false.", d.mo66814b(), a)));
                    this.f98355a.f98373c.remove(aysm);
                    aysm.mo54368e();
                    aysm.mo54370f();
                }
            } else {
                this.f98355a.f98373c.remove(aysm);
                aysm.mo54368e();
                aysm.mo54370f();
                ayrp ayrp5 = this.f98355a;
                String str6 = ayrp.f98371a;
                ayrp5.f98375e.mo54412a(aysz, i, null);
            }
        }
    }

    /* renamed from: b */
    public final void mo54329b(aysm aysm, int i, int i2) {
        ayri ayri = (ayri) this.f98355a.f98373c.get(aysm);
        aysl a = aysm.mo54358a();
        if (ayri == null) {
            Log.w(ayrp.f98371a, String.format("Received unexpected MTU change for device %s! Ignoring.", a));
        } else if (ayri.f98340h) {
            ayrp ayrp = this.f98355a;
            String str = ayrp.f98371a;
            ayrp.f98375e.mo54412a(new aysz(ayro.CHANGE_MTU, aysm), i2, Integer.valueOf(i));
        } else {
            ayri.mo54317c();
            ayrp ayrp2 = this.f98355a;
            String str2 = ayrp.f98371a;
            ayrp2.f98375e.mo54412a(new aysz(ayro.CONNECT, a), i2, ayri);
        }
    }

    /* renamed from: b */
    public final void mo54330b(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        ayrp ayrp = this.f98355a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54411a(new aysz(ayro.WRITE_CHARACTERISTIC, aysm, bluetoothGattCharacteristic), i);
    }

    /* renamed from: b */
    public final void mo54331b(aysm aysm, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        String str = ayrp.f98371a;
        Object[] objArr = {aysm.mo54358a(), bluetoothGattDescriptor.getUuid(), Integer.valueOf(i)};
        this.f98355a.f98375e.mo54411a(new aysz(ayro.WRITE_DESCRIPTOR, aysm, bluetoothGattDescriptor), i);
    }

    /* renamed from: a */
    public final void mo54325a(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            value = new byte[0];
        }
        String str = ayrp.f98371a;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), aysm.mo54358a()};
        try {
            ayri ayri = (ayri) this.f98355a.f98373c.get(aysm);
            if (ayri != null) {
                ayrh ayrh = (ayrh) ayri.f98341i.get(bluetoothGattCharacteristic);
                if (ayrh != null) {
                    synchronized (ayrh.f98331a) {
                        aype aype = ayrh.f98332b;
                        if (aype == null) {
                            ayrh.f98331a.add(value);
                        } else {
                            aype.mo54187a(value);
                        }
                    }
                    return;
                }
                return;
            }
            String valueOf = String.valueOf(aysm);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Receive callback on unexpected device: ");
            sb.append(valueOf);
            throw new BluetoothException(sb.toString());
        } catch (BluetoothException e) {
            Log.e(ayrp.f98371a, "Error in onCharacteristicChanged", e);
        }
    }

    /* renamed from: a */
    public final void mo54326a(aysm aysm, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        ayrp ayrp = this.f98355a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54412a(new aysz(ayro.READ_CHARACTERISTIC, aysm, bluetoothGattCharacteristic), i, bluetoothGattCharacteristic.getValue());
    }

    /* renamed from: a */
    public final void mo54327a(aysm aysm, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        ayrp ayrp = this.f98355a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54412a(new aysz(ayro.READ_DESCRIPTOR, aysm, bluetoothGattDescriptor), i, bluetoothGattDescriptor.getValue());
    }
}
