package com.google.android.gms.carsetup;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.os.PowerManager;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarBluetoothReceiverOperation extends IntentOperation {

    /* renamed from: a */
    private static final bnsn f29536a = odk.m28481a("CAR.BTOP");

    public final void onHandleIntent(Intent intent) {
        ovt ovt;
        PackageInfo packageInfo;
        if (!nzi.m28224a()) {
            if (ovt.f38502a == null) {
                synchronized (ovt.class) {
                    if (ovt.f38502a == null) {
                        ovt.f38502a = new ovt(getApplicationContext(), "CAR.BTOP");
                    }
                }
                ovt = ovt.f38502a;
            } else {
                ovt = ovt.f38502a;
            }
            ovt.f38505d = ccwa.m131880b();
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            intent.getAction();
            if (bluetoothDevice == null) {
                bnsi d = ovt.f38503b.mo68390d();
                d.mo68432a("ovt", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Received bluetooth connected event but device details missing");
            } else if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
                int a = ovu.m29894a(intent);
                if (a == 2) {
                    boolean a2 = ovu.m29895a(bluetoothDevice.getUuids());
                    boolean b = ovt.m29890b(intent);
                    if (a2) {
                        ovt.mo22707a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, true, false);
                    } else if (ovt.f38505d && ovt.mo22708a(bluetoothDevice, false) && b) {
                        ovt.mo22707a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, false, true);
                    }
                } else if (a == 0) {
                    ovt.f38504c.set(false);
                    boolean b2 = ovt.m29890b(intent);
                    if (ovt.f38505d && ovt.mo22708a(bluetoothDevice, true) && b2) {
                        ovt.mo22707a("android.bluetooth.device.action.ACL_DISCONNECTED", bluetoothDevice, false, true);
                    }
                }
            } else if (!ccwa.m131881c() && ovu.m29895a(intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID"))) {
                ovt.mo22707a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice, true, false);
            }
            if (ccwp.m131939b()) {
                bnsn bnsn = ovv.f38507a;
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice2 == null) {
                    bnsi c = ovv.f38507a.mo68388c();
                    c.mo68432a("ovv", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("PreSetupLaunchHelper: Bluetooth device is null");
                } else if (ovu.m29894a(intent) == 2 && ovu.m29896b(intent) && ovu.m29895a(bluetoothDevice2.getUuids())) {
                    ovs ovs = new ovs(this);
                    if (ccwp.m131939b() && ccwv.f180128a.mo6606a().mo76960a()) {
                        bnic a3 = bnic.m109488a(bmyx.m108640a(',').mo66918a((CharSequence) ccwv.f180128a.mo6606a().mo76961b()));
                        String a4 = pcm.m30205a(ovs.f38500b);
                        if (!bmxx.m108577a(a4) && !a3.contains(a4.toUpperCase(Locale.getDefault())) && !a3.contains("*")) {
                            bnsi d2 = pcm.f38841a.mo68390d();
                            d2.mo68432a("pcm", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d2.mo68405a("Wireless disabled in country");
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
                                int a5 = new ovr(this).mo22703a();
                                oza oza = new oza();
                                oza.f38643a = 2;
                                oza.f38644b = a5;
                                oza.f38645c = new Intent().setClassName("com.google.android.projection.gearhead", ccwp.f180112a.mo6606a().mo76946a());
                                oza.mo22798a(this);
                            } else {
                                bnsi c6 = ovs.f38499a.mo68388c();
                                c6.mo68432a("ovs", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c6.mo68405a("Device in battery saver mode");
                            }
                        }
                    }
                }
            }
        } else {
            bnsi d3 = f29536a.mo68390d();
            d3.mo68432a("com.google.android.gms.carsetup.CarBluetoothReceiverOperation", "onHandleIntent", 24, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68405a("Escape Pod is enabled, so ignoring intent.");
        }
    }
}
