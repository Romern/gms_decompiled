package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.ExecutionException;

/* renamed from: auln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auln extends aulp {

    /* renamed from: a */
    public static final aunx f92041a = new aunx("TrustAgent", "AddBluetoothDeviceOperation");

    /* renamed from: d */
    public Bundle f92042d;

    /* renamed from: e */
    final ause f92043e = new aulm(this);

    /* renamed from: h */
    private final Bundle f92044h = new Bundle();

    /* renamed from: i */
    private final aupn f92045i;

    public auln(aupn aupn, auqe auqe, Bundle bundle) {
        super(auqe, bundle);
        this.f92045i = aupn;
    }

    /* renamed from: a */
    private final Bundle m77269a(BluetoothDevice bluetoothDevice) {
        boolean z;
        f92041a.mo50711a("Add device %s(%s) as a regular trusted device", bluetoothDevice.getName(), bluetoothDevice.getAddress());
        if (!auuj.m77862c(bluetoothDevice)) {
            String k = auuj.m77872k(bluetoothDevice.getAddress());
            if (this.f92045i.mo50729a(k)) {
                z = this.f92045i.mo50736c(k);
            } else {
                this.f92044h.putInt("trustagent.AddBluetoothDeviceOperation.error_code", 2);
                throw new sju("Adding a non-connected regular device");
            }
        } else {
            z = auuj.m77860b(bluetoothDevice);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("trustagent.AddBluetoothDeviceOperation.eid_support", false);
        bundle.putBoolean("trustagent.AddBluetoothDeviceOperation.is_connection_secure", z);
        bundle.putParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device", bluetoothDevice);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50661a() {
    }

    /* renamed from: a */
    private static final void m77270a(bede bede) {
        try {
            bede.close();
        } catch (BluetoothException e) {
            f92041a.mo50710a("Ignore gatt close exception", e, new Object[0]).mo50706a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo50660a(Bundle bundle) {
        Bundle bundle2;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) bundle.getParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device");
        f92041a.mo50711a("Adding Bluetooth device %s", bluetoothDevice).mo50708c();
        if (this.f92045i.mo50729a(auuj.m77863d(bluetoothDevice))) {
            this.f92044h.putInt("trustagent.AddBluetoothDeviceOperation.error_code", 5);
            throw new sju("Bluetooth device is already added as a trusted device");
        } else if (bluetoothDevice != null) {
            try {
                if (!ausp.m77772b(bluetoothDevice)) {
                    return m77269a(bluetoothDevice);
                }
                ausf a = ausf.m77753a();
                try {
                    bede a2 = a.mo50865a(bluetoothDevice);
                    try {
                        if (a.mo50868a(a2)) {
                            f92041a.mo50711a("Adding device %s(%s) as an EID device", a2.mo58565a().mo54353d(), a2.mo58565a().mo54351b());
                            a.mo50867a(a2, this.f92043e);
                            if (this.f92042d != null) {
                                rpr b = rpr.m34216b();
                                aurj a3 = aurj.m77699a();
                                a3.getClass();
                                this.f92042d.putBoolean("trustagent.addbluetoothdeviceoperation.is_user_presence", ((Boolean) new auoq(b, new aull(a3)).mo50741a().get()).booleanValue());
                                bundle2 = new Bundle(this.f92042d);
                            } else {
                                this.f92044h.putInt("trustagent.AddBluetoothDeviceOperation.error_code", 3);
                                throw new sju("provision device fail");
                            }
                        } else {
                            bundle2 = m77269a(bluetoothDevice);
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        f92041a.mo50710a("failed to get isUserPresent()", e, new Object[0]).mo50706a();
                    } catch (Throwable th) {
                        m77270a(a2);
                        throw th;
                    }
                    m77270a(a2);
                    return bundle2;
                } catch (BluetoothException e2) {
                    return m77269a(bluetoothDevice);
                }
            } catch (BluetoothException e3) {
                throw new sju("bluetooth exception.", e3);
            }
        } else {
            this.f92044h.putInt("trustagent.AddBluetoothDeviceOperation.error_code", 4);
            throw new sju("Bluetooth device is missing");
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f92048f.mo50793a(status, this.f92044h);
    }
}
