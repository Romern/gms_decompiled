package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.PowerManager;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.Locale;

/* renamed from: ovv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovv {

    /* renamed from: a */
    public static final bnsn f38507a = odk.m28481a("CAR.BT");

    /* renamed from: a */
    public final void mo22709a(Intent intent, Context context) {
        PackageInfo packageInfo;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            bnsi c = f38507a.mo68388c();
            c.mo68432a("ovv", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("PreSetupLaunchHelper: Bluetooth device is null");
        } else if (ovu.m29894a(intent) == 2 && ovu.m29896b(intent) && ovu.m29895a(bluetoothDevice.getUuids())) {
            ovs ovs = new ovs(context);
            if (ccwp.m131939b() && ccwv.f180128a.mo6606a().mo76960a()) {
                bnic a = bnic.m109488a(bmyx.m108640a(',').mo66918a((CharSequence) ccwv.f180128a.mo6606a().mo76961b()));
                String a2 = pcm.m30205a(ovs.f38500b);
                if (!bmxx.m108577a(a2) && !a.contains(a2.toUpperCase(Locale.getDefault())) && !a.contains("*")) {
                    bnsi d = pcm.f38841a.mo68390d();
                    d.mo68432a("pcm", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("Wireless disabled in country");
                } else if (oyh.f38613a.mo22779a(ovs.f38500b)) {
                } else {
                    if (((long) Build.VERSION.SDK_INT) < ccwp.f180112a.mo6606a().mo76947b()) {
                        bnsi c2 = ovs.f38499a.mo68388c();
                        c2.mo68432a("ovs", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c2.mo68405a("SDK version below wifi enabled version");
                        return;
                    }
                    try {
                        packageInfo = ovs.f38501c.getPackageInfo("com.google.android.projection.gearhead", 4096);
                    } catch (PackageManager.NameNotFoundException e) {
                        packageInfo = null;
                    }
                    if (packageInfo == null && ccwp.f180112a.mo6606a().mo76951f()) {
                        bnsi c3 = ovs.f38499a.mo68388c();
                        c3.mo68432a("ovs", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c3.mo68405a("Gearhead not installed; update flow only enabled");
                    } else if (packageInfo != null && ovs.f38501c.checkPermission("android.permission.ACCESS_COARSE_LOCATION", "com.google.android.projection.gearhead") != 0 && !ccwp.f180112a.mo6606a().mo76950e()) {
                        bnsi c4 = ovs.f38499a.mo68388c();
                        c4.mo68432a("ovs", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c4.mo68405a("Location permission denied on Android Auto");
                    } else if (!((LocationManager) ovs.f38500b.getSystemService("location")).isProviderEnabled("gps") && !ccwp.f180112a.mo6606a().mo76949d()) {
                        bnsi c5 = ovs.f38499a.mo68388c();
                        c5.mo68432a("ovs", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c5.mo68405a("Location Services disabled");
                    } else if (!((PowerManager) ovs.f38500b.getSystemService("power")).isPowerSaveMode() || ccwp.f180112a.mo6606a().mo76948c()) {
                        int a3 = new ovr(context).mo22703a();
                        oza oza = new oza();
                        oza.f38643a = 2;
                        oza.f38644b = a3;
                        oza.f38645c = new Intent().setClassName("com.google.android.projection.gearhead", ccwp.f180112a.mo6606a().mo76946a());
                        oza.mo22798a(context);
                    } else {
                        bnsi c6 = ovs.f38499a.mo68388c();
                        c6.mo68432a("ovs", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c6.mo68405a("Device in battery saver mode");
                    }
                }
            }
        }
    }
}
