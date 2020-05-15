package p000;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import com.google.android.gms.trustagent.trustlet.device.p073ui.TrustedDevicesFragment$DisabledViewPreference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: auui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auui extends aupa implements aoa {

    /* renamed from: c */
    public static final aunx f92542c = new aunx("TrustAgent", "TrustedDevicesFragment");

    /* renamed from: h */
    private static final Object f92543h = new Object();

    /* renamed from: d */
    public PreferenceScreen f92544d;

    /* renamed from: e */
    public auol f92545e;

    /* renamed from: f */
    public final Map f92546f = new HashMap();

    /* renamed from: i */
    private String f92547i;

    /* renamed from: j */
    private boolean f92548j;

    /* renamed from: k */
    private ProgressDialog f92549k;

    /* renamed from: l */
    static final boolean m77840l() {
        return BluetoothTrustletChimeraService.m93431a() && BluetoothTrustletChimeraService.m93435f();
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        return false;
    }

    /* renamed from: b */
    public final void mo50933b(String str) {
        boolean z;
        int i;
        String a = auuj.m77855a(str);
        auol auol = this.f92545e;
        boolean z2 = true;
        if (auol != null) {
            boolean c = auol.mo50736c(auuj.m77870i(a));
            auol auol2 = this.f92545e;
            String c2 = auuj.m77861c(a);
            Set emptySet = Collections.emptySet();
            synchronized (auol2.f92195b) {
                ArrayList<String> stringArrayList = auol2.f92197d.getStringArrayList(c2);
                if (stringArrayList != null) {
                    emptySet = new HashSet(stringArrayList);
                }
            }
            if (!emptySet.isEmpty()) {
                z2 = c;
                z = true;
            } else {
                z2 = c;
                z = false;
            }
        } else {
            z = false;
        }
        String c3 = mo50934c(a);
        if (!z2) {
            i = 2;
        } else {
            i = 3;
        }
        auug.m77830a(str, c3, i, z, false).show(getFragmentManager(), "Coffee-TrustedDevicesFragment");
    }

    /* renamed from: c */
    public final String mo50934c(String str) {
        try {
            autr autr = new autr(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str));
            String a = auuj.m77854a(autr.f92510c);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            auol auol = this.f92545e;
            if (auol == null) {
                return str;
            }
            return auol.mo50725a(auuj.m77865e(autr.f92510c), str);
        } catch (IllegalArgumentException | NullPointerException e) {
            aunx aunx = f92542c;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Exception in creating BluetoothDevice: ");
            sb.append(valueOf);
            aunx.mo50711a(sb.toString(), new Object[0]).mo50706a();
            return str;
        }
    }

    /* renamed from: d */
    public final void mo17248d() {
        synchronized (f92543h) {
            if (this.f92549k == null) {
                ProgressDialog progressDialog = new ProgressDialog(getActivity(), 0);
                progressDialog.setMessage(getString(C0126R.string.auth_trust_agent_bt_device_configuring_eid_progress_message));
                progressDialog.setCancelable(false);
                progressDialog.show();
                synchronized (f92543h) {
                    this.f92549k = progressDialog;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo50626e() {
        this.f92545e = mo50786g();
        mo9318a((int) C0126R.xml.trusted_devices_preferences);
        this.f92544d = (PreferenceScreen) mo2204a((CharSequence) "auth_trust_agent_pref_trusted_devices_list_key");
        String str = this.f92547i;
        if (str != null) {
            mo50936e(str);
            mo50938f(this.f92547i);
            this.f92547i = null;
        }
        mo50940j();
        Loader loader = getActivity().getSupportLoaderManager().getLoader(1);
        if (loader != null && loader.isStarted()) {
            mo17248d();
        }
    }

    /* renamed from: f */
    public final void mo50937f() {
        synchronized (f92543h) {
            ProgressDialog progressDialog = this.f92549k;
            if (progressDialog == null) {
                f92542c.mo50711a("not found progress dialog", new Object[0]);
                return;
            }
            progressDialog.dismiss();
            this.f92549k = null;
        }
    }

    /* renamed from: i */
    public final void mo50939i() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("TrustedDevicesIntroFragment");
        if (findFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
        if (m77840l() && this.f92548j) {
            Intent intent = new Intent();
            intent.setClassName(getActivity(), "com.google.android.gms.trustagent.BluetoothDeviceSelectionActivity");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f92544d.mo2023g(); i++) {
                String str = this.f92544d.mo2024g(i).f1603s;
                if (str.startsWith("auth_trust_agent_pref_trusted_bluetooth_address")) {
                    arrayList.add(str.substring(47));
                }
            }
            intent.putExtra("bluetooth_addresses_to_exclude", (String[]) arrayList.toArray(new String[arrayList.size()]));
            getActivity().startActivityForResult(intent, 1002);
        }
    }

    /* renamed from: j */
    public final void mo50940j() {
        Set<String> c;
        this.f92544d.mo2025v();
        if (mo50786g() != null && (c = mo50786g().mo50735c()) != null) {
            if (m77840l()) {
                for (String str : c) {
                    if (str.startsWith("auth_trust_agent_pref_trusted_bluetooth_address")) {
                        mo50936e(auuj.m77855a(str));
                    }
                }
            }
            if (this.f92544d.mo2023g() != 0) {
                Preference preference = new Preference(getActivity());
                preference.f1571A = C0126R.C0128layout.preference_material;
                preference.mo1990c("auth_trust_agent_pref_trusted_devices_add_trusted_device_key");
                preference.mo1986b((CharSequence) getString(C0126R.string.auth_trust_agent_pref_trusted_devices_add_trusted_device_title));
                preference.mo1989c((int) C0126R.C0127drawable.auth_btn_add_trusted);
                preference.f1607w = false;
                this.f92544d.mo2019a(preference);
            }
            mo50941k();
        }
    }

    /* renamed from: k */
    public final void mo50941k() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("TrustedDevicesIntroFragment");
        if (this.f92544d.mo2023g() == 0 && findFragmentByTag == null) {
            aukp aukp = new aukp();
            aukp.mo50617a((int) C0126R.C0127drawable.auth_ic_trusted_device_unlock);
            aukp.mo50620c(getString(C0126R.string.auth_trust_agent_trusted_devices_prompt_title));
            aukp.f91987a.putString("subtitle", getString(C0126R.string.auth_trust_agent_trusted_bluetooth_prompt_subtitle));
            aukp.mo50619b(getString(C0126R.string.auth_trust_agent_trusted_bluetooth_prompt_content));
            aukp.mo50618a(getString(C0126R.string.auth_trust_agent_add_trusted_device_prompt));
            findFragmentByTag = aukp.mo50616a();
            getFragmentManager().beginTransaction().add(16908290, findFragmentByTag, "TrustedDevicesIntroFragment").commit();
        }
        if (this.f92544d.mo2023g() != 0) {
            ((deu) getActivity()).mo8628aW().mo15859d();
            if (findFragmentByTag != null) {
                getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f92542c.mo50711a("onCreate", new Object[0]);
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("TrustedDevicesIntroFragment");
        if (findFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
        this.f92548j = getArguments().getBoolean("bluetooth_enabled_by_security");
        setHasOptionsMenu(true);
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (str.startsWith("bluetooth_device_eid_provision_data_")) {
                    this.f92546f.put(str.substring(36), bundle.getBundle(str));
                }
            }
            this.f92547i = bundle.getString("bluetooth_device_to_be_added");
        }
    }

    public final void onDestroy() {
        f92542c.mo50711a("on destroy", new Object[0]);
        mo50937f();
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
        String str = this.f92547i;
        if (str != null) {
            aunx aunx = f92542c;
            String valueOf = String.valueOf(str);
            aunx.mo50711a(valueOf.length() == 0 ? new String("Pending device to add to trusted device, ignored. ") : "Pending device to add to trusted device, ignored. ".concat(valueOf), new Object[0]).mo50709d();
            this.f92547i = null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        for (String str : this.f92546f.keySet()) {
            String valueOf = String.valueOf(str);
            bundle.putBundle(valueOf.length() == 0 ? new String("bluetooth_device_eid_provision_data_") : "bluetooth_device_eid_provision_data_".concat(valueOf), (Bundle) this.f92546f.get(str));
        }
        bundle.putString("bluetooth_device_to_be_added", this.f92547i);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: f */
    public final void mo50938f(String str) {
        String str2;
        String str3 = str;
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str3);
        if (remoteDevice == null) {
            aunx aunx = f92542c;
            String valueOf = String.valueOf(str);
            aunx.mo50711a(valueOf.length() == 0 ? new String("Failed to store trusted device information, invalid Bluetooth address : ") : "Failed to store trusted device information, invalid Bluetooth address : ".concat(valueOf), new Object[0]).mo50706a();
        } else if (mo50786g() != null) {
            String b = auuj.m77858b(str);
            if (mo50786g().mo50729a(b)) {
                aunx aunx2 = f92542c;
                String valueOf2 = String.valueOf(remoteDevice);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb.append("device ");
                sb.append(valueOf2);
                sb.append(" is already saved");
                aunx2.mo50711a(sb.toString(), new Object[0]);
                return;
            }
            String valueOf3 = String.valueOf(str);
            String str4 = valueOf3.length() == 0 ? new String("auth_trust_agent_pref_trusted_bluetooth_title") : "auth_trust_agent_pref_trusted_bluetooth_title".concat(valueOf3);
            String a = auuj.m77854a(remoteDevice);
            if (this.f92546f.containsKey(str3)) {
                Bundle bundle = (Bundle) this.f92546f.get(str3);
                mo50786g().mo50733b(auuj.m77864d(str), bundle.getString("trustagent.addbluetoothdeviceoperation.eik_key"));
                HashSet<String> hashSet = new HashSet();
                if (bundle.getBoolean("trustagent.addbluetoothdeviceoperation.on_body", false)) {
                    hashSet.add("on_body");
                }
                if (bundle.getBoolean("trustagent.addbluetoothdeviceoperation.user_auth", false)) {
                    hashSet.add("user_authenticated");
                }
                if (hashSet.size() > 0) {
                    auol g = mo50786g();
                    String c = auuj.m77861c(str);
                    ArrayList arrayList = new ArrayList(hashSet);
                    synchronized (g.f92195b) {
                        g.f92197d.putStringArrayList(c, arrayList);
                    }
                    g.mo50727a(c, hashSet);
                }
                long j = bundle.getLong("trustagent.addbluetoothdeviceoperation.initial_counter", 0);
                mo50786g().mo50732b(auuj.m77866e(str), j);
                long j2 = bundle.getLong("trustagent.addbluetoothdeviceoperation.initial_timestamp", 0);
                mo50786g().mo50732b(auuj.m77867f(str), j2);
                boolean z = bundle.getBoolean("trustagent.addbluetoothdeviceoperation.initial_onbody_state", false);
                mo50786g().mo50728a(auuj.m77856a("on_body", str3), z);
                boolean z2 = bundle.getBoolean("trustagent.addbluetoothdeviceoperation.initial_userauth_state", false);
                mo50786g().mo50728a(auuj.m77856a("user_authenticated", str3), z2);
                str2 = b;
                long j3 = bundle.getLong("trustagent.addbluetoothdeviceoperation.system_time", 0);
                mo50786g().mo50732b(auuj.m77868g(str), j3);
                boolean z3 = bundle.getBoolean("trustagent.addbluetoothdeviceoperation.is_user_presence", false);
                for (String str5 : hashSet) {
                    mo50786g().mo50728a(auuj.m77859b(str5, str3), z3);
                }
                f92542c.mo50711a("Init eid: counter %d, timestamp %d, local time: %d, on body %b, user auth %b ", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), Boolean.valueOf(z2));
            } else {
                str2 = b;
            }
            mo50786g().mo50731b(auuj.m77872k(str));
            mo50786g().mo50733b(str4, a);
            mo50786g().mo50728a(str2, true);
            this.f92546f.remove(str3);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    /* renamed from: d */
    public final void mo50935d(String str) {
        String a = auuj.m77855a(str);
        if (mo50786g() != null) {
            mo50786g().mo50728a(auuj.m77870i(a), false);
            mo50940j();
        }
    }

    /* renamed from: c */
    public final boolean mo2233c(Preference preference) {
        if ("auth_trust_agent_pref_trusted_devices_add_trusted_device_key".equals(preference.f1603s)) {
            mo50939i();
            return false;
        }
        mo50933b(preference.f1603s);
        return false;
    }

    /* renamed from: e */
    public final boolean mo50936e(String str) {
        if (((aupa) this).f92243g) {
            String b = auuj.m77858b(str);
            if (this.f92544d.mo2021c((CharSequence) b) != null) {
                return false;
            }
            TrustedDevicesFragment$DisabledViewPreference trustedDevicesFragment$DisabledViewPreference = new TrustedDevicesFragment$DisabledViewPreference(getActivity());
            trustedDevicesFragment$DisabledViewPreference.mo1990c(b);
            trustedDevicesFragment$DisabledViewPreference.f1607w = false;
            if (BluetoothAdapter.getDefaultAdapter().getState() == 12) {
                BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
                if (remoteDevice == null) {
                    aunx aunx = f92542c;
                    String valueOf = String.valueOf(str);
                    aunx.mo50711a(valueOf.length() == 0 ? new String("Failed to add Bluetooth device as trusted device, invalid Bluetooth address specified: ") : "Failed to add Bluetooth device as trusted device, invalid Bluetooth address specified: ".concat(valueOf), new Object[0]).mo50706a();
                    return false;
                }
                trustedDevicesFragment$DisabledViewPreference.mo1986b((CharSequence) auuj.m77854a(remoteDevice));
                if (auuj.m77862c(remoteDevice)) {
                    auol auol = this.f92545e;
                    if (auol != null && auol.mo50736c(auuj.m77870i(str))) {
                        trustedDevicesFragment$DisabledViewPreference.mo1994d((int) C0126R.string.auth_trust_agent_bt_device_status_action_required);
                    } else {
                        trustedDevicesFragment$DisabledViewPreference.mo1966a((CharSequence) getString(C0126R.string.common_connected));
                    }
                } else if (!this.f92545e.mo50729a(auuj.m77864d(str))) {
                    trustedDevicesFragment$DisabledViewPreference.mo1966a((CharSequence) getString(C0126R.string.auth_trust_agent_pref_trusted_devices_not_connected));
                }
            } else {
                Iterator it = mo50786g().mo50735c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    if (str2.startsWith("auth_trust_agent_pref_trusted_bluetooth_title") && str.equals(str2.substring(45))) {
                        trustedDevicesFragment$DisabledViewPreference.mo1986b((CharSequence) mo50786g().mo50725a(str2, str));
                        break;
                    }
                }
                trustedDevicesFragment$DisabledViewPreference.mo1966a((CharSequence) getString(C0126R.string.auth_trust_agent_trusted_devices_bluetooth_turn_off_summary));
            }
            if (!this.f92548j) {
                trustedDevicesFragment$DisabledViewPreference.f109211a = false;
                trustedDevicesFragment$DisabledViewPreference.mo1966a((CharSequence) getString(C0126R.string.common_disabled));
            }
            this.f92544d.mo2019a((Preference) trustedDevicesFragment$DisabledViewPreference);
            mo50941k();
            return true;
        }
        String str3 = this.f92547i;
        if (str3 != null) {
            aunx aunx2 = f92542c;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
            sb.append("A device was added to the trusted device list while another is pending, the old one ");
            sb.append(str3);
            sb.append(" will not be added.");
            aunx2.mo50711a(sb.toString(), new Object[0]).mo50709d();
        }
        this.f92547i = str;
        return false;
    }
}
