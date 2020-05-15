package com.google.android.gms.trustagent.trustlet.device.p073ui;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: com.google.android.gms.trustagent.trustlet.device.ui.GoogleTrustAgentTrustedDevicesChimeraSettings */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleTrustAgentTrustedDevicesChimeraSettings extends aupg implements aukq, auue {

    /* renamed from: c */
    public static final aunx f109200c = new aunx("TrustAgent", "GoogleTrustAgentTrustedDevicesChimeraSettings");

    /* renamed from: d */
    public Bundle f109201d;

    /* renamed from: e */
    private bogq f109202e = bogq.PLACE_LURE;

    /* renamed from: f */
    private boolean f109203f;

    /* renamed from: g */
    private boolean f109204g = false;

    /* renamed from: h */
    private final autx f109205h = new autx(this);

    /* renamed from: i */
    private final BroadcastReceiver f109206i = new aacn("trustagent") {
        /* class com.google.android.gms.trustagent.trustlet.device.p073ui.GoogleTrustAgentTrustedDevicesChimeraSettings.C16711 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            boolean z;
            if (intent.getAction().equals("com.google.android.gms.auth.trustagent.action_show_add_trusted_device_dialog")) {
                GoogleTrustAgentTrustedDevicesChimeraSettings googleTrustAgentTrustedDevicesChimeraSettings = GoogleTrustAgentTrustedDevicesChimeraSettings.this;
                aunx aunx = GoogleTrustAgentTrustedDevicesChimeraSettings.f109200c;
                auui h = googleTrustAgentTrustedDevicesChimeraSettings.mo59571h();
                Bundle extras = intent.getExtras();
                String string = extras.getString("device_address");
                boolean z2 = false;
                if (string != null) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34974b(z);
                boolean z3 = extras.getBoolean("is_wearable", false);
                if (extras.containsKey("eid_result")) {
                    h.f92546f.put(string, extras.getBundle("eid_result"));
                }
                if (extras.containsKey("IS_CONNECTION_SECURE")) {
                    z2 = extras.getBoolean("IS_CONNECTION_SECURE");
                }
                auug.m77830a(auuj.m77858b(string), h.mo50934c(string), 1, z3, z2).show(h.getFragmentManager(), "Coffee-TrustedDevicesFragment");
            }
        }
    };

    /* renamed from: a */
    public final void mo50621a() {
        mo59571h().mo50939i();
    }

    /* renamed from: b */
    public final void mo59570b(Intent intent) {
        BluetoothDevice bluetoothDevice;
        if ("com.google.android.gms.auth.trustagent.ADD_DEVICE".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("bluetooth_device_address");
            if (stringExtra == null) {
                f109200c.mo50711a("Invalid intent to add Bluetooth device as trusted device, no address specified.", new Object[0]).mo50706a();
                return;
            }
            aunx aunx = f109200c;
            StringBuilder sb = new StringBuilder(stringExtra.length() + 23);
            sb.append("add device ");
            sb.append(stringExtra);
            sb.append(" from intent");
            aunx.mo50711a(sb.toString(), new Object[0]);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                this.f109202e = bogq.m111182a(extras.getInt("notification_type_key", -1));
            }
            try {
                bluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(stringExtra);
            } catch (IllegalArgumentException e) {
                f109200c.mo50711a(stringExtra.length() == 0 ? new String("Illegal Bluetooth address.") : "Illegal Bluetooth address.".concat(stringExtra), new Object[0]).mo50706a();
                bluetoothDevice = null;
            }
            if (bluetoothDevice != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("trustagent.AddBluetoothDeviceOperation.bluetooth_device", bluetoothDevice);
                Loader loader = getSupportLoaderManager().getLoader(1);
                if (loader == null || !loader.isStarted()) {
                    getSupportLoaderManager().restartLoader(1, bundle, this.f109205h);
                    this.f109201d = bundle;
                    mo59571h().mo17248d();
                    return;
                }
                f109200c.mo50711a("There is another devie under provisioning. Ignore this adding attempt.", new Object[0]).mo50706a();
                return;
            }
            f109200c.mo50711a("attempt to add invalid bluetooth address form intent", new Object[0]).mo50706a();
        }
    }

    /* renamed from: c */
    public final void mo50931c(String str) {
        mo59571h().mo50935d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final dns mo50789e() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("bluetooth_enabled_by_security", this.f109203f);
        Intent intent = getIntent();
        if (!(intent == null || intent.getExtras() == null || (i = intent.getExtras().getInt("notification_type_key", -1)) < 0)) {
            bundle.putInt("notification_type", i);
        }
        auui auui = new auui();
        auui.setArguments(bundle);
        return auui;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo50790g() {
        return "TrustedDevicesFragment";
    }

    /* renamed from: h */
    public final auui mo59571h() {
        return (auui) getSupportFragmentManager().findFragmentByTag("TrustedDevicesFragment");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i != 1001) {
            if (i != 1002) {
                f109200c.mo50711a("Unknown request code", new Object[0]).mo50709d();
            } else {
                mo59570b(intent);
            }
        } else if (intent.getStringExtra("bluetooth_device_address") != null) {
            mo59570b(intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        f109200c.mo50711a("onCreate", new Object[0]);
        this.f109203f = auuj.m77857a();
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.f109202e = bogq.m111182a(extras.getInt("notification_type_key", -1));
        }
        mo59568a(6, 5);
        if (bundle != null) {
            this.f109204g = bundle.getBoolean("TrustedDeviceDialogActionTakenKey", false);
            this.f109201d = bundle.getBundle("add_device_param");
            LoaderManager supportLoaderManager = getSupportLoaderManager();
            if (supportLoaderManager.getLoader(1) != null) {
                supportLoaderManager.initLoader(1, new Bundle(), this.f109205h);
            }
        }
        aki.m919a(this).mo873a(this.f109206i, new IntentFilter("com.google.android.gms.auth.trustagent.action_show_add_trusted_device_dialog"));
        mo8628aW().mo15862e();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!this.f109203f) {
            getMenuInflater().inflate(C0126R.C0130menu.trusted_devices_actions, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        aki.m919a(this).mo872a(this.f109206i);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0126R.C0129id.trusted_devices_actions_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(C0126R.string.auth_trust_agent_bluetooth_disabled_help_link))));
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        f109200c.mo50711a("onResume", new Object[0]);
        Intent intent = getIntent();
        if (intent != null) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            if (!"com.google.android.gms.auth.trustagent.ADD_DEVICE".equals(action)) {
                if ("com.google.android.gms.auth.trustagent.SHOW_DEVICE_SECURITY_NOTICE".equals(action) && !this.f109204g) {
                    auui h = mo59571h();
                    if ("com.google.android.gms.auth.trustagent.SHOW_DEVICE_SECURITY_NOTICE".equals(intent.getAction())) {
                        String stringExtra = intent.getStringExtra("bluetooth_device_address");
                        if (stringExtra == null) {
                            auui.f92542c.mo50711a("Invalid intent to show trusted device info.", new Object[0]).mo50706a();
                        } else {
                            h.mo50933b(auuj.m77858b(stringExtra));
                        }
                    }
                    this.f109204g = true;
                }
            } else if (extras == null || !extras.getBoolean("add_device_dialog_shown", false)) {
                mo59570b(intent);
                intent.putExtra("add_device_dialog_shown", true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        f109200c.mo50711a("save instance state", new Object[0]);
        bundle.putBoolean("TrustedDeviceDialogActionTakenKey", this.f109204g);
        Bundle bundle2 = this.f109201d;
        if (bundle2 != null) {
            bundle.putBundle("add_device_param", bundle2);
        }
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public final void mo59568a(int i, int i2) {
        f109200c.mo50711a("logging entering trusted devices settings.", new Object[0]);
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = i - 1;
        bohi.f133071a |= 4096;
        if (this.f109202e == bogq.BLUETOOTH_LURE) {
            f109200c.mo50711a("logging entering trusted devices settings with notification.", new Object[0]);
            bxvd da = bogm.f133003e.mo74144da();
            bogq bogq = this.f109202e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogm bogm = (bogm) da.f164949b;
            bogm.f133006b = bogq.f133019h;
            int i3 = bogm.f133005a | 1;
            bogm.f133005a = i3;
            bogm.f133007c = i2 - 1;
            bogm.f133005a = i3 | 2;
            bogj.mo68908a((bogm) da.mo74062i());
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    /* renamed from: a */
    public final void mo59569a(BluetoothDevice bluetoothDevice, boolean z, Bundle bundle, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings");
        intent.setAction("com.google.android.gms.auth.trustagent.action_show_add_trusted_device_dialog");
        intent.putExtra("device_address", bluetoothDevice.getAddress());
        intent.putExtra("is_wearable", z);
        if (bundle != null) {
            intent.putExtra("eid_result", bundle);
        } else {
            intent.putExtra("IS_CONNECTION_SECURE", z2);
        }
        aki.m919a(this).mo874a(intent);
        mo59568a(27, 5);
    }

    /* renamed from: b */
    public final void mo50930b(String str) {
        mo59568a(16, 3);
        auui h = mo59571h();
        String a = auuj.m77855a(str);
        if (h.mo50936e(a)) {
            h.mo50938f(a);
            h.mo50935d(str);
        }
    }

    /* renamed from: a */
    public final void mo50929a(String str) {
        auui h = mo59571h();
        h.f92545e = h.mo50786g();
        if (h.f92545e != null) {
            if (str.startsWith("auth_trust_agent_pref_trusted_bluetooth_address")) {
                int i = 0;
                while (true) {
                    if (i >= h.f92544d.mo2023g()) {
                        break;
                    }
                    Preference g = h.f92544d.mo2024g(i);
                    if (g.f1603s.equals(str)) {
                        h.f92544d.mo2020b(g);
                        break;
                    }
                    i++;
                }
                String a = auuj.m77855a(str);
                h.f92545e.mo50731b(auuj.m77858b(a));
                h.f92545e.mo50731b(auuj.m77869h(a));
                h.f92545e.mo50731b(auuj.m77870i(a));
                h.f92545e.mo50731b(auuj.m77864d(a));
                h.f92545e.mo50731b(auuj.m77861c(a));
                h.f92545e.mo50731b(auuj.m77856a("on_body", a));
                h.f92545e.mo50731b(auuj.m77856a("user_authenticated", a));
                h.f92545e.mo50731b(auuj.m77859b("on_body", a));
                h.f92545e.mo50731b(auuj.m77859b("user_authenticated", a));
                h.f92545e.mo50731b(auuj.m77866e(a));
                h.f92545e.mo50731b(auuj.m77867f(a));
                h.f92545e.mo50731b(auuj.m77868g(a));
            }
            h.mo50940j();
        }
    }
}
