package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ovt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovt {

    /* renamed from: a */
    public static volatile ovt f38502a;

    /* renamed from: b */
    public final bnsn f38503b;

    /* renamed from: c */
    public final AtomicBoolean f38504c = new AtomicBoolean(false);

    /* renamed from: d */
    public boolean f38505d;

    /* renamed from: e */
    private final Context f38506e;

    public ovt(Context context, String str) {
        this.f38506e = context;
        this.f38503b = odk.m28481a(str);
    }

    /* renamed from: b */
    public static boolean m29890b(Intent intent) {
        if (ccvx.f180056a.mo6606a().mo76908m()) {
            return ovu.m29896b(intent);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo22706a(Intent intent) {
        this.f38505d = ccwa.m131880b();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        intent.getAction();
        if (bluetoothDevice == null) {
            bnsi d = this.f38503b.mo68390d();
            d.mo68432a("ovt", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Received bluetooth connected event but device details missing");
        } else if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
            int a = ovu.m29894a(intent);
            if (a == 2) {
                boolean a2 = ovu.m29895a(bluetoothDevice.getUuids());
                boolean b = m29890b(intent);
                if (a2) {
                    mo22707a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, true, false);
                } else if (this.f38505d && mo22708a(bluetoothDevice, false) && b) {
                    mo22707a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, false, true);
                }
            } else if (a == 0) {
                this.f38504c.set(false);
                boolean b2 = m29890b(intent);
                if (this.f38505d && mo22708a(bluetoothDevice, true) && b2) {
                    mo22707a("android.bluetooth.device.action.ACL_DISCONNECTED", bluetoothDevice, false, true);
                }
            }
        } else if (!ccwa.m131881c() && ovu.m29895a(intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID"))) {
            mo22707a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, true, false);
        }
    }

    /* renamed from: a */
    public final void mo22707a(String str, BluetoothDevice bluetoothDevice, boolean z, boolean z2) {
        Intent intent = new Intent(str);
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        intent.putExtra("car_startup.HAS_WIFI", z);
        intent.putExtra("car_setup.SUPPORTS_ANDROID_AUTO", z2);
        intent.setComponent(nzg.f37004f);
        int i = Build.VERSION.SDK_INT;
        if (!ccwa.m131881c()) {
            this.f38506e.startService(intent);
        } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str) && ((UsbManager) this.f38506e.getSystemService("usb")).getAccessoryList() == null && this.f38504c.compareAndSet(false, true)) {
            bnsi d = this.f38503b.mo68390d();
            d.mo68432a("ovt", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("StartForegroundService");
            this.f38506e.startForegroundService(intent);
        }
    }

    /* renamed from: a */
    public final boolean mo22708a(BluetoothDevice bluetoothDevice, boolean z) {
        pbp pbp;
        String str;
        String address = bluetoothDevice.getAddress();
        if (!new orb(this.f38506e, "bluetooth_addresses_prefs").mo22530a(address).isEmpty()) {
            if (pbp.m30149a(this.f38506e).exists()) {
                pbp = new pbp(this.f38506e);
            } else {
                pbp = null;
            }
            if (pbp != null) {
                List<CarInfoInternal> a = pbp.mo22881a();
                pbp.close();
                if (a != null) {
                    for (CarInfoInternal carInfoInternal : a) {
                        if (carInfoInternal != null && (str = carInfoInternal.f29544f) != null && str.equals(address)) {
                            if (z || TextUtils.isEmpty(carInfoInternal.f29545g)) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }
}
