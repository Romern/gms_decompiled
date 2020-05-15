package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import java.util.regex.Pattern;

/* renamed from: ahxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahxg implements ahxh {

    /* renamed from: a */
    private static final Pattern f68284a = Pattern.compile("^([0-9A-F]){6}$");

    /* renamed from: b */
    private ahwk f68285b;

    /* renamed from: c */
    private ahxj f68286c;

    /* renamed from: a */
    public final void mo37254a(Context context, BluetoothDevice bluetoothDevice) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    public final void mo37255a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        String str;
        String str2 = "na";
        if (i == 1) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
            if (bArr != null) {
                str2 = boan.f132472f.mo68794a(bArr);
            }
            bnsl.mo68424a("DeviceInfoGroupListener: The device send model id to seeker: %s, %s", bluetoothDevice, str2);
            if (bArr != null) {
                String a = boan.f132472f.mo68794a(bArr);
                if (f68284a.matcher(a).matches()) {
                    ahwb ahwb = (ahwb) ahgz.m55754a(context, ahwb.class);
                    ahwb.f68208c.execute(new ahvu(ahwb, bluetoothDevice, a));
                    return;
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68422a("DeviceInfoGroupListener: invalid model id length (%s, %s)", (Object) a, a.length());
            }
        } else if (i == 2) {
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68390d();
            if (bArr != null) {
                str2 = boan.f132472f.mo68794a(bArr);
            }
            bnsl2.mo68424a("DeviceInfoGroupListener: The device send ble address to seeker: %s, %s", bluetoothDevice, str2);
            if (bArr != null) {
                String a2 = aynj.m84357a(bArr);
                if (BluetoothAdapter.checkBluetoothAddress(a2)) {
                    ahwb ahwb2 = (ahwb) ahgz.m55754a(context, ahwb.class);
                    ahwb2.f68208c.execute(new ahvt(ahwb2, bluetoothDevice, a2));
                    return;
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("DeviceInfoGroupListener: invalid address (%s)", a2);
            }
        } else if (i == 3) {
            boolean G = cfoj.m141526G();
            bnsl bnsl3 = (bnsl) ahsd.f67925a.mo68390d();
            if (!G) {
                str = "";
            } else {
                str = "handle";
            }
            if (bArr != null) {
                str2 = boan.f132472f.mo68794a(bArr);
            }
            bnsl3.mo68425a("DeviceInfoGroupListener: The device pass battery info to seeker: %s, %s battery=%s", bluetoothDevice, str, str2);
            if (G) {
                if (this.f68285b == null) {
                    this.f68285b = (ahwk) ahgz.m55754a(context, ahwk.class);
                }
                if (bArr != null && bArr.length != 0) {
                    ahyz a3 = ((ahst) ahgz.m55754a(context, ahst.class)).mo37033a(bluetoothDevice.getAddress());
                    if (a3 == null) {
                        BatteryAdvertisement.m67329a(bluetoothDevice.getAddress(), null, bArr);
                        return;
                    }
                    ahwk ahwk = this.f68285b;
                    BatteryAdvertisement batteryAdvertisement = new BatteryAdvertisement();
                    batteryAdvertisement.f80509f = a3.f68429c;
                    batteryAdvertisement.f80504a = bluetoothDevice.getAddress();
                    batteryAdvertisement.mo44197a(bArr);
                    batteryAdvertisement.f80506c = true;
                    aiaa aiaa = a3.f68439n;
                    if (aiaa == null) {
                        aiaa = aiaa.f68501K;
                    }
                    batteryAdvertisement.mo44196a(aiaa);
                    batteryAdvertisement.f80522s = 2;
                    ahwk.mo37237b(batteryAdvertisement);
                }
            }
        } else if (i == 6) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68409a("DeviceInfoGroupListener: check which component is available, event code = %d", i);
            if (this.f68286c == null) {
                this.f68286c = (ahxj) ahgz.m55754a(context, ahxj.class);
            }
            if (bArr != null && bArr.length != 0) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68406a("DeviceInfoGroupListener: check active component response %s", bArr[0]);
                this.f68286c.mo37259a(bluetoothDevice, 3, 6, bArr[0]);
            }
        }
    }
}
