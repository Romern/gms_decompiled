package p000;

import android.app.AlertDialog;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.trustagent.trustlet.device.p073ui.GoogleTrustAgentTrustedDevicesChimeraSettings;

/* renamed from: autx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class autx implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ GoogleTrustAgentTrustedDevicesChimeraSettings f92526a;

    public autx(GoogleTrustAgentTrustedDevicesChimeraSettings googleTrustAgentTrustedDevicesChimeraSettings) {
        this.f92526a = googleTrustAgentTrustedDevicesChimeraSettings;
    }

    /* renamed from: a */
    private final void m77823a(BluetoothDevice bluetoothDevice, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f92526a);
        if (bluetoothDevice.getName() == null) {
            bluetoothDevice.getAddress();
        }
        builder.setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton("OK", new autw());
        builder.create().show();
        this.f92526a.mo59568a(15, 5);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new aumg(this.f92526a, 2, bundle);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str;
        String str2;
        aume aume = (aume) obj;
        boolean z = false;
        GoogleTrustAgentTrustedDevicesChimeraSettings.f109200c.mo50711a("loader finish", new Object[0]);
        if (!this.f92526a.isDestroyed()) {
            this.f92526a.mo59571h().mo50937f();
            GoogleTrustAgentTrustedDevicesChimeraSettings googleTrustAgentTrustedDevicesChimeraSettings = this.f92526a;
            googleTrustAgentTrustedDevicesChimeraSettings.f109201d = null;
            googleTrustAgentTrustedDevicesChimeraSettings.getSupportLoaderManager().destroyLoader(1);
            Bundle bundle = aume.f92072b;
            if (aume.f92071a.f30115i == 0) {
                boolean z2 = bundle.getBoolean("trustagent.AddBluetoothDeviceOperation.eid_support");
                BluetoothDevice bluetoothDevice = (BluetoothDevice) bundle.getParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device");
                if (z2) {
                    if (((BluetoothDevice) bundle.getParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device")) == null || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.eik_key") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.on_body") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.user_auth") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.initial_onbody_state") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.initial_userauth_state") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.initial_counter") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.initial_timestamp") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.system_time") || !bundle.containsKey("trustagent.addbluetoothdeviceoperation.is_user_presence")) {
                        String a = auuj.m77854a(bluetoothDevice);
                        m77823a(bluetoothDevice, this.f92526a.getString(C0126R.string.auth_trust_agent_bt_device_error_title_adding_eid), this.f92526a.getString(C0126R.string.auth_trust_agent_bt_device_error_content_adding_eid, new Object[]{a}));
                    }
                    boolean z3 = bundle.getBoolean("trustagent.addbluetoothdeviceoperation.on_body");
                    boolean z4 = bundle.getBoolean("trustagent.addbluetoothdeviceoperation.user_auth");
                    aunx aunx = GoogleTrustAgentTrustedDevicesChimeraSettings.f109200c;
                    String name = bluetoothDevice.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 71);
                    sb.append("Provisioned device ");
                    sb.append(name);
                    sb.append(" has onBodyCapable: ");
                    sb.append(z3);
                    sb.append(" and userAuthCapable: ");
                    sb.append(z4);
                    aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
                    GoogleTrustAgentTrustedDevicesChimeraSettings googleTrustAgentTrustedDevicesChimeraSettings2 = this.f92526a;
                    if (z3) {
                        z = true;
                    } else if (z4) {
                        z = true;
                    }
                    googleTrustAgentTrustedDevicesChimeraSettings2.mo59569a(bluetoothDevice, z, bundle, true);
                    return;
                }
                this.f92526a.mo59569a(bluetoothDevice, false, null, bundle.getBoolean("trustagent.AddBluetoothDeviceOperation.is_connection_secure", false));
                return;
            }
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) new Bundle(((aumg) loader).f92075a).getParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device");
            int i = bundle.getInt("trustagent.AddBluetoothDeviceOperation.error_code", 1);
            String a2 = auuj.m77854a(bluetoothDevice2);
            if (i == 2) {
                str = this.f92526a.getString(C0126R.string.title_error_bt_not_added);
                str2 = this.f92526a.getString(C0126R.string.content_error_bt_not_connected, new Object[]{a2});
            } else if (i != 5) {
                str = this.f92526a.getString(C0126R.string.auth_trust_agent_bt_device_error_title_adding_eid);
                str2 = this.f92526a.getString(C0126R.string.auth_trust_agent_bt_device_error_content_adding_eid, new Object[]{a2});
            } else {
                str = this.f92526a.getString(C0126R.string.title_error_bt_not_added);
                str2 = this.f92526a.getString(C0126R.string.content_error_bt_already_added, new Object[]{a2});
            }
            m77823a(bluetoothDevice2, str, str2);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
