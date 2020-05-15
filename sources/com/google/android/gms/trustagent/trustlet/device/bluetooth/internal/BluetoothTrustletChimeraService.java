package com.google.android.gms.trustagent.trustlet.device.bluetooth.internal;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothTrustletChimeraService extends auou implements ausw, autc, auny {

    /* renamed from: a */
    public static final aunx f109169a = new aunx("TrustAgent", "BluetoothTrustletChimeraService");

    /* renamed from: b */
    public static final Object f109170b = new Object();

    /* renamed from: c */
    public ConcurrentMap f109171c;

    /* renamed from: d */
    public SharedPreferences f109172d;

    /* renamed from: h */
    public aupn f109173h;

    /* renamed from: i */
    public final ConcurrentMap f109174i = new ConcurrentHashMap();

    /* renamed from: j */
    public autn f109175j;

    /* renamed from: k */
    private volatile boolean f109176k;

    /* renamed from: l */
    private ausz f109177l;

    /* renamed from: m */
    private aurw f109178m;

    /* renamed from: n */
    private final Set f109179n = new HashSet();

    /* renamed from: o */
    private final Map f109180o = new HashMap();

    /* renamed from: p */
    private Set f109181p;

    /* renamed from: q */
    private autd f109182q;

    /* renamed from: r */
    private KeyguardManager f109183r;

    /* renamed from: s */
    private ScreenOnOffReceiver f109184s;

    /* renamed from: t */
    private SharedPreferences.Editor f109185t;

    /* renamed from: u */
    private SharedPreferences.OnSharedPreferenceChangeListener f109186u;

    /* renamed from: v */
    private autf f109187v;

    /* renamed from: w */
    private aute f109188w = new aute(this);

    /* renamed from: a */
    public static boolean m93431a() {
        return BluetoothAdapter.getDefaultAdapter() != null && cgzt.m147779d();
    }

    /* renamed from: b */
    private static final bogi m93432b(autr autr, boolean z) {
        bxvd da = bogi.f132990f.mo74144da();
        String str = autr.f92509b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bogi bogi = (bogi) da.f164949b;
        str.getClass();
        bogi.f132992a |= 1;
        bogi.f132993b = str;
        boolean c = autr.mo50916c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bogi bogi2 = (bogi) da.f164949b;
        bogi2.f132992a |= 2;
        bogi2.f132994c = c;
        boolean d = autr.mo50917d();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bogi bogi3 = (bogi) da.f164949b;
        int i = bogi3.f132992a | 4;
        bogi3.f132992a = i;
        bogi3.f132995d = d;
        if (z) {
            bogi3.f132996e = 0;
            bogi3.f132992a = i | 8;
        }
        return (bogi) da.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.b(autr, boolean):bogi
     arg types: [autr, int]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.b(java.lang.String, org.json.JSONObject):void
      auou.b(java.lang.String, java.lang.String):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.b(autr, boolean):bogi */
    /* renamed from: c */
    private final void m93433c(bogj bogj) {
        Set<autr> set;
        synchronized (f109170b) {
            set = this.f109181p;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (autr autr : set) {
            if (autr.mo50913a(this.f109173h)) {
                arrayList2.add(m93432b(autr, true));
            } else if (autr.f92510c.getBluetoothClass() != null) {
                bxvd da = bogh.f132984e.mo74144da();
                boolean b = auuj.m77860b(autr.f92510c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogh bogh = (bogh) da.f164949b;
                bogh.f132986a = 1 | bogh.f132986a;
                bogh.f132987b = b;
                int majorDeviceClass = autr.f92510c.getBluetoothClass().getMajorDeviceClass();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogh bogh2 = (bogh) da.f164949b;
                bogh2.f132986a |= 2;
                bogh2.f132988c = majorDeviceClass;
                int deviceClass = autr.f92510c.getBluetoothClass().getDeviceClass();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogh bogh3 = (bogh) da.f164949b;
                bogh3.f132986a |= 4;
                bogh3.f132989d = deviceClass;
                arrayList.add((bogh) da.mo74062i());
            }
        }
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = bohi.f133070z;
        ((bohi) bogj.f164949b).f133086p = GeneratedMessageLite.m124030de();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi2 = (bohi) bogj.f164949b;
        bohi2.mo68912b();
        bxsy.m123078a(arrayList2, bohi2.f133086p);
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        ((bohi) bogj.f164949b).f133083m = GeneratedMessageLite.m124030de();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi3 = (bohi) bogj.f164949b;
        if (!bohi3.f133083m.mo73666a()) {
            bohi3.f133083m = GeneratedMessageLite.m124021a(bohi3.f133083m);
        }
        bxsy.m123078a(arrayList, bohi3.f133083m);
    }

    /* renamed from: d */
    private final void m93434d(autr autr) {
        bnrd a = autr.mo50915b().iterator();
        while (a.hasNext()) {
            autp autp = (autp) a.next();
            autn autn = this.f109175j;
            aute aute = this.f109188w;
            synchronized (autn.f92497a) {
                if (autn.f92500d.containsKey(autp)) {
                    List list = (List) autn.f92500d.get(autp);
                    list.remove(aute);
                    if (list.isEmpty()) {
                        autn.f92500d.remove(autp);
                    }
                    if (autn.f92500d.isEmpty()) {
                        autn.f92501e.mo50743b(autn.f92502f);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static boolean m93435f() {
        return aupq.m77579a().f92275a;
    }

    /* renamed from: j */
    protected static final boolean m93436j() {
        return BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void
     arg types: [autr, int]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void */
    /* renamed from: y */
    private final void m93437y() {
        for (autr autr : this.f109171c.values()) {
            synchronized (f109170b) {
                if (auuj.m77860b(autr.f92510c)) {
                    this.f109180o.put(autr.f92510c, true);
                } else if (auuj.m77862c(autr.f92510c)) {
                    this.f109180o.put(autr.f92510c, false);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.f109179n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo59558a((autr) arrayList.get(i), false);
        }
    }

    /* renamed from: z */
    private final void m93438z() {
        synchronized (f109170b) {
            boolean z = true;
            boolean z2 = !this.f109171c.isEmpty();
            if (!z2 || !m93436j()) {
                z = false;
            }
            mo50763a(z2, z);
        }
    }

    /* renamed from: bO */
    public final void mo50642bO() {
    }

    /* renamed from: c */
    public final void mo50643c() {
    }

    /* renamed from: e */
    public final void mo50753e() {
        synchronized (f109170b) {
            autd autd = this.f109182q;
            BroadcastReceiver broadcastReceiver = autd.f92477c;
            if (broadcastReceiver != null) {
                autd.f92475a.unregisterReceiver(broadcastReceiver);
                autd.f92477c = null;
            }
            this.f109182q = null;
            this.f109184s.mo59553b();
            for (autr autr : this.f109171c.values()) {
                m93434d(autr);
            }
            for (autr autr2 : this.f109171c.values()) {
                if (autr2.mo50913a(this.f109173h)) {
                    this.f109178m.mo50857a(autr2.f92510c, this.f109187v);
                }
            }
            this.f109172d.unregisterOnSharedPreferenceChangeListener(this.f109186u);
            this.f109177l.mo50896b();
            this.f109177l.mo50896b();
            this.f109176k = false;
        }
        super.mo50753e();
        mo50778u("trustlet_destroyed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        return;
     */
    /* renamed from: g */
    public final void mo59564g() {
        synchronized (f109170b) {
            if (this.f109176k) {
                HashSet hashSet = new HashSet();
                autr autr = null;
                for (autr autr2 : this.f109171c.values()) {
                    BluetoothDevice bluetoothDevice = autr2.f92510c;
                    if (!autr2.mo50913a(this.f109173h) || autr2.mo50915b().size() <= 0) {
                        if (!auuj.m77860b(bluetoothDevice)) {
                            if (!auuj.m77862c(bluetoothDevice)) {
                                if (this.f109177l.f92463e.mo50894d(bluetoothDevice.getAddress())) {
                                    if (this.f109180o.containsKey(bluetoothDevice)) {
                                        if (((Boolean) this.f109180o.get(bluetoothDevice)).booleanValue()) {
                                            if (!cgzt.m147778c() && mo59565h()) {
                                            }
                                        }
                                    }
                                    if (this.f109180o.containsKey(bluetoothDevice) && !((Boolean) this.f109180o.get(bluetoothDevice)).booleanValue() && cgzq.m147772b() && !cgzt.m147777b() && mo59565h()) {
                                    }
                                }
                            } else if (cgzq.m147772b()) {
                                if (!cgzt.m147777b()) {
                                    if (mo59565h()) {
                                    }
                                }
                            }
                        } else if (!cgzt.m147778c() && !mo59565h()) {
                        }
                        f109169a.mo50711a("Regular device %s can grant trust.", bluetoothDevice.getName()).mo50707b();
                        hashSet.add(autr2);
                    } else if (auuj.m77862c(autr2.f92510c)) {
                        bnrd a = autr2.mo50915b().iterator();
                        while (true) {
                            if (!a.hasNext()) {
                                break;
                            }
                            autp autp = (autp) a.next();
                            autj autj = (autj) this.f109178m.f92383c.get(autp);
                            if (autj != null && autj.f92490c != -1 && this.f109175j.mo50905a(autp)) {
                                f109169a.mo50711a("EID device %s with capability %s can grant trust.", bluetoothDevice.getName(), autr2.mo50915b()).mo50707b();
                                hashSet.add(autr2);
                                break;
                            }
                        }
                    }
                    autr = autr2;
                }
                this.f109181p = hashSet;
                if (mo50768m()) {
                    if (autr == null) {
                        aunw a2 = f109169a.mo50711a("No trusted connected device, revoking trust.", new Object[0]);
                        a2.mo50708c();
                        a2.mo50707b();
                        mo50776t(null);
                        return;
                    }
                }
                if (!mo50768m()) {
                    if (autr != null) {
                        String string = getString(C0126R.string.auth_trust_agent_connected_to_bt_device, autr.f92510c.getName());
                        aunx aunx = f109169a;
                        String valueOf = String.valueOf(autr.f92510c.getName());
                        aunw a3 = aunx.mo50711a(valueOf.length() == 0 ? new String("Granting trust, connected to trusted device: ") : "Granting trust, connected to trusted device: ".concat(valueOf), new Object[0]);
                        a3.mo50708c();
                        a3.mo50707b();
                        mo50760a(string, autr.f92510c.getName());
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo59565h() {
        return mo50769n() || !this.f109183r.isKeyguardLocked();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void
     arg types: [autr, int]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo59566i() {
        BluetoothDevice bluetoothDevice;
        for (String str : this.f109172d.getAll().keySet()) {
            String a = auuj.m77855a(str);
            if (a != null) {
                try {
                    bluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a);
                } catch (IllegalArgumentException e) {
                    f109169a.mo50711a(a.length() == 0 ? new String("Illegal Bluetooth address.") : "Illegal Bluetooth address.".concat(a), new Object[0]).mo50706a();
                    bluetoothDevice = null;
                }
                if (bluetoothDevice != null && this.f109172d.getBoolean(str, false)) {
                    autr a2 = autr.m77810a(bluetoothDevice, this.f109173h);
                    if (a2.mo50912a()) {
                        mo59558a(a2, false);
                    } else {
                        mo59562c(a2);
                    }
                }
            }
        }
        m93438z();
        mo59564g();
    }

    /* renamed from: o */
    public final String mo50770o() {
        return "Bluetooth";
    }

    /* renamed from: p */
    public final boolean mo50771p() {
        return m93435f();
    }

    /* renamed from: q */
    public final boolean mo50772q() {
        return m93431a();
    }

    /* renamed from: r */
    public final Bundle mo50773r() {
        int i;
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Bluetooth");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        bundle.putBoolean("key_trustlet_is_suppored", m93431a());
        bundle.putBoolean("key_trustlet_is_enabled_by_device_policy", m93435f());
        bundle.putString("key_trustlet_pref_key", "auth_trust_agent_pref_trusted_devices_key");
        bundle.putString("key_trustlet_pref_title", getString(C0126R.string.auth_trust_agent_pref_trusted_devices_title));
        StringBuilder sb = new StringBuilder();
        if (m93431a()) {
            SharedPreferences a = aupo.m77578a(this);
            i = 0;
            for (String str2 : a.getAll().keySet()) {
                if (str2.startsWith("auth_trust_agent_pref_trusted_bluetooth_title")) {
                    String string = a.getString(str2, "");
                    if (TextUtils.isEmpty(string)) {
                        string = str2.substring(45);
                    }
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(string);
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            str = getString(C0126R.string.auth_trust_agent_pref_trusted_devices_default_summary);
        } else if (i != 1) {
            str = getString(C0126R.string.f7387xbb3682a1, sb.toString());
        } else {
            str = getString(C0126R.string.auth_trust_agent_pref_trusted_devices_one_device_setup_summary, sb.toString());
        }
        bundle.putString("key_trustlet_pref_summary", str);
        bundle.putInt("key_trustlet_icon_res_id", C0126R.C0127drawable.quantum_ic_devices_other_black_24);
        bundle.putString("key_trustlet_settings_activity_class_name", "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings");
        bundle.putString("key_trustlet_settings_activity_package_name", "com.google.android.gms");
        return bundle;
    }

    /* renamed from: x */
    public final int mo50781x() {
        return 2;
    }

    /* renamed from: a */
    public final void mo50850a(BluetoothDevice bluetoothDevice) {
        autr autr = (autr) this.f109171c.get(bluetoothDevice.getAddress());
        if (autr != null) {
            mo59562c(autr);
        } else {
            this.f109173h.mo50731b(auuj.m77872k(bluetoothDevice.getAddress()));
            this.f109173h.mo50737d();
        }
        mo59564g();
        if (autr != null) {
            mo59561b("bt_device_bond_state_changed", aumv.m77340a("trustlet_id", autr.f92510c.getAddress(), "bt_bound_state_key", String.valueOf(autr.mo50912a())));
        }
    }

    /* renamed from: d */
    public final void mo50752d() {
        super.mo50752d();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        synchronized (f109170b) {
            this.f109171c = concurrentHashMap;
        }
        this.f109172d = aupo.m77578a(this);
        this.f109173h = new aupj(this.f109172d);
        autg autg = new autg(this);
        this.f109186u = autg;
        this.f109172d.registerOnSharedPreferenceChangeListener(autg);
        this.f109185t = this.f109172d.edit();
        this.f109183r = (KeyguardManager) getSystemService("keyguard");
        ScreenOnOffReceiver screenOnOffReceiver = new ScreenOnOffReceiver(this, this);
        this.f109184s = screenOnOffReceiver;
        screenOnOffReceiver.mo59552a();
        ausz ausz = new ausz(this, this);
        this.f109177l = ausz;
        ausz.mo50895a();
        this.f109178m = new aurw(this);
        this.f109175j = autn.m77804a(this);
        this.f109187v = new autf(this);
        this.f109181p = new HashSet();
        this.f109182q = new autd(this, this);
        if (auuj.m77857a()) {
            autd autd = this.f109182q;
            autd.f92477c = new BluetoothLure$1(autd, "trustagent");
            autd.f92475a.registerReceiver(autd.f92477c, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        }
        mo59566i();
        if (cgzt.f188132a.mo6606a().mo84834s()) {
            boolean a = auuj.m77857a();
            boolean z = this.f109172d.getBoolean("auth_trust_agent_pref_bluetooth_device_has_been_disabled_key", false);
            if (a || z) {
                if (a && z) {
                    String string = getString(C0126R.string.auth_trust_agent_notification_title_bluetooth_reenabled);
                    String string2 = getString(C0126R.string.auth_trust_agent_notification_content_bluetooth_reenabled);
                    int a2 = qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_lock_outline_white_24);
                    aupf aupf = new aupf(this);
                    aupf.f92248a = string;
                    aupf.f92250c = string2;
                    aupf.mo50788c();
                    aupf.f92258k = 268435456;
                    aupf.f92255h = "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings";
                    aupf.f92254g = a2;
                    aupf.f92257j = "com.google.android.gms.auth.trustagent.trustlet.BluetoothTrustlet.reenable_bt_notification";
                    aupf.mo50787b();
                    this.f109185t.remove("auth_trust_agent_pref_bluetooth_device_has_been_disabled_key");
                }
            } else if (this.f109171c.size() > 0) {
                String string3 = getString(C0126R.string.auth_trust_agent_notification_title_disable_bluetooth);
                String string4 = getString(C0126R.string.auth_trust_agent_notification_content_disable_bluetooth);
                PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent("android.intent.action.VIEW", Uri.parse(getString(C0126R.string.auth_trust_agent_bluetooth_disabled_help_link))), 134217728);
                Intent intent = new Intent();
                intent.setClassName(this, "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings");
                PendingIntent activity2 = PendingIntent.getActivity(this, 0, intent, 134217728);
                String string5 = getString(C0126R.string.auth_trust_agent_notification_action_settings_bluetooth);
                Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C0126R.C0127drawable.ic_lock);
                aupf aupf2 = new aupf(this);
                aupf2.f92248a = string3;
                aupf2.f92250c = string4;
                aupf2.mo50788c();
                aupf2.f92251d = activity;
                aupf2.f92260m = decodeResource;
                aupf2.f92254g = 17301642;
                aupf2.f92263p.add(new C1099jb(0, string5, activity2));
                aupf2.f92259l = getResources().getColor(C0126R.color.auth_coffee_notification_warning_background);
                aupf2.f92257j = "com.google.android.gms.auth.trustagent.trustlet.BluetoothTrustlet.disable_bt_notification";
                aupf2.mo50787b();
                this.f109185t.putBoolean("auth_trust_agent_pref_bluetooth_device_has_been_disabled_key", true);
            }
            this.f109185t.apply();
        }
        synchronized (f109170b) {
            this.f109176k = true;
        }
        mo59564g();
        mo59561b("trustlet_created", (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo59557a(autr autr) {
        f109169a.mo50711a("track EID device %s", autr.f92510c);
        autq b = autr.mo50914b(this.f109173h);
        if (autr.mo50913a(this.f109173h)) {
            aurw aurw = this.f109178m;
            autf autf = this.f109187v;
            aunx aunx = aurw.f92381a;
            String valueOf = String.valueOf(b.mo50909a().getName());
            aunx.mo50711a(valueOf.length() == 0 ? new String("register device ") : "register device ".concat(valueOf), new Object[0]);
            synchronized (aurw.f92382b) {
                BluetoothDevice a = b.mo50909a();
                aurw.f92385e.put(a, b);
                if (aurw.f92384d.isEmpty()) {
                    aurw.f92386f.mo50895a();
                    aurw.f92387g.mo50742a(aurw.f92388h);
                }
                if (!aurw.f92384d.containsKey(a)) {
                    aurw.f92384d.put(a, new HashSet());
                }
                ((Set) aurw.f92384d.get(b.mo50909a())).add(autf);
            }
            aurw.mo50855a();
            List a2 = autj.m77801a(autr.f92510c, b.mo50910b());
            HashMap hashMap = new HashMap();
            for (autp autp : b.f92507b.f92511d) {
                hashMap.put(autp, Boolean.valueOf(b.f92506a.mo50736c(auuj.m77859b(autp.f92505b, b.f92507b.f92508a))));
            }
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                autj autj = (autj) a2.get(i);
                autn autn = this.f109175j;
                boolean booleanValue = ((Boolean) hashMap.get(autj.f92488a)).booleanValue();
                aute aute = this.f109188w;
                synchronized (autn.f92497a) {
                    if (autn.f92500d.isEmpty()) {
                        autn.f92501e.mo50742a(autn.f92502f);
                    }
                    autp autp2 = autj.f92488a;
                    if (!autn.f92500d.containsKey(autp2)) {
                        autn.f92500d.put(autp2, new ArrayList());
                        autn.f92499c.put(autp2, autj);
                        autn.f92498b.put(autp2, Boolean.valueOf(booleanValue));
                    }
                    ((List) autn.f92500d.get(autp2)).add(aute);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo50747b() {
        mo59564g();
        mo59561b("validate_trust_when_screen_unlocked", (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59560b(autr autr) {
        autb autb = new autb(autr, this.f109173h);
        if (autr != null && auuj.m77862c(autr.f92510c)) {
            auti auti = new auti(this, autr);
            if (cgzt.m147781f() && !autb.f92472b.mo50913a(autb.f92473c)) {
                long a = autb.f92473c.mo50724a(autb.f92472b.mo50918e(), -1);
                if (a != -1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= a && TimeUnit.MILLISECONDS.toDays(currentTimeMillis - a) <= cgzt.f188132a.mo6606a().mo84820e()) {
                        return;
                    }
                }
                try {
                    bede a2 = autb.f92474d.mo50865a(autb.f92472b.f92510c);
                    if (!autb.f92474d.mo50868a(a2)) {
                        aunx aunx = autb.f92471a;
                        String valueOf = String.valueOf(a2.mo58565a());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                        sb.append("No need to migrate device ");
                        sb.append(valueOf);
                        sb.append(": not support EID");
                        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
                    } else {
                        autb.f92474d.mo50867a(a2, new auta(autb, auti));
                    }
                    a2.close();
                } catch (BluetoothException e) {
                    autb.f92471a.mo50710a("Fail to migrate device", e, new Object[0]).mo50706a();
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                autr autr2 = autb.f92472b;
                aupn aupn = autb.f92473c;
                aupn.mo50732b(autr2.mo50918e(), currentTimeMillis2);
                aupn.mo50737d();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void
     arg types: [int, autr]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r4.f92462d.mo50894d(r5.getAddress()) == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r9.f109177l.f92461c == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r3 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r0 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r3 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c5 A[RETURN] */
    /* renamed from: a */
    public final void mo59558a(autr autr, boolean z) {
        boolean z2;
        boolean z3;
        boolean containsKey;
        if (autr != null) {
            if (auuj.m77860b(autr.f92510c) || autr.mo50913a(this.f109173h)) {
                z3 = true;
            } else {
                z3 = !this.f109172d.getBoolean(auuj.m77870i(autr.f92510c.getAddress()), true);
                if (!auuj.m77862c(autr.f92510c)) {
                    z2 = false;
                } else if (cgzq.m147772b()) {
                    boolean contains = this.f109172d.contains(auuj.m77870i(autr.f92510c.getAddress()));
                    ausz ausz = this.f109177l;
                    BluetoothDevice bluetoothDevice = autr.f92510c;
                    if (auuj.m77862c(bluetoothDevice)) {
                        ausy ausy = ausz.f92462d;
                        String address = bluetoothDevice.getAddress();
                        synchronized (ausy.f92448a) {
                            containsKey = ausy.f92449b.containsKey(address);
                        }
                        if (!containsKey) {
                        }
                    }
                    if (ausz.f92461c != null) {
                    }
                }
                if (z3) {
                    f109169a.mo50711a("Device is not allowed because it is either insecure or of unknown security and needs user confirmation", autr.f92510c.getName()).mo50708c();
                    this.f109179n.add(autr);
                } else {
                    f109169a.mo50711a("adding %s to trusted devices", autr.f92510c);
                    synchronized (f109170b) {
                        String address2 = autr.f92510c.getAddress();
                        if (!autr.mo50912a()) {
                            aunx aunx = f109169a;
                            StringBuilder sb = new StringBuilder(String.valueOf(address2).length() + 47);
                            sb.append("Adding a non bonded Bluetooth device ");
                            sb.append(address2);
                            sb.append(", ignored.");
                            aunx.mo50711a(sb.toString(), new Object[0]).mo50706a();
                        } else {
                            if (!this.f109171c.containsKey(address2)) {
                                this.f109171c.put(address2, autr);
                            } else {
                                this.f109171c.replace(address2, autr);
                            }
                            this.f109173h.mo50731b(auuj.m77871j(address2));
                            this.f109173h.mo50737d();
                            m93438z();
                            mo59557a(autr);
                            if (z) {
                                mo59559a(true, autr);
                            }
                            mo59564g();
                            if (z) {
                                mo59561b("add_a_bluetooth_device_to_trusted_devices", aumv.m77340a("trustlet_id", autr.f92510c.getAddress(), "trustlet_source", autr.f92509b));
                            }
                            mo59560b(autr);
                        }
                    }
                    this.f109179n.remove(autr);
                }
                if (!z2) {
                    String string = getString(C0126R.string.auth_trust_agent_trusted_bt_device_review_security_notice, auuj.m77854a(autr.f92510c));
                    String address3 = autr.f92510c.getAddress();
                    Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C0126R.C0127drawable.ic_lock);
                    Bundle bundle = new Bundle();
                    bundle.putString("bluetooth_device_address", address3);
                    aupf aupf = new aupf(this);
                    aupf.f92250c = string;
                    aupf.mo50788c();
                    aupf.f92255h = "com.google.android.gms.trustagent.GoogleTrustAgentTrustedDevicesSettings";
                    aupf.f92256i = "com.google.android.gms.auth.trustagent.SHOW_DEVICE_SECURITY_NOTICE";
                    aupf.f92262o = address3;
                    aupf.f92261n = bundle;
                    aupf.f92260m = decodeResource;
                    aupf.f92254g = 17301642;
                    aupf.f92259l = getResources().getColor(C0126R.color.auth_coffee_notification_warning_background);
                    String valueOf = String.valueOf(address3);
                    aupf.f92257j = valueOf.length() == 0 ? new String("com.google.android.gms.auth.trustagent.trustlet.BluetoothTrustlet.accept_policy_notification_prefix_") : "com.google.android.gms.auth.trustagent.trustlet.BluetoothTrustlet.accept_policy_notification_prefix_".concat(valueOf);
                    aupf.mo50787b();
                    this.f109185t.putBoolean(auuj.m77870i(autr.f92510c.getAddress()), true).apply();
                    return;
                }
                return;
            }
            z2 = false;
            if (z3) {
            }
            if (!z2) {
            }
        }
    }

    /* renamed from: b */
    public final void mo50764b(bogj bogj) {
        bohf bohf = ((bohi) bogj.f164949b).f133089s;
        if (bohf == null) {
            bohf = bohf.f133058h;
        }
        bxvd bxvd = (bxvd) bohf.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bohf);
        boolean k = mo50766k();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bohf bohf2 = (bohf) bxvd.f164949b;
        bohf2.f133060a |= 1;
        bohf2.f133061b = k;
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohf bohf3 = (bohf) bxvd.mo74062i();
        bohi bohi2 = bohi.f133070z;
        bohf3.getClass();
        bohi.f133089s = bohf3;
        bohi.f133071a |= 8192;
        if (mo50766k()) {
            long size = (long) this.f109171c.size();
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi3 = (bohi) bogj.f164949b;
            bohi3.f133071a |= 16;
            bohi3.f133075e = size;
            m93433c(bogj);
            if (BluetoothAdapter.getDefaultAdapter() != null) {
                Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
                bxvd da = bogr.f133020d.mo74144da();
                long size2 = (long) bondedDevices.size();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogr bogr = (bogr) da.f164949b;
                bogr.f133022a |= 1;
                bogr.f133023b = size2;
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    long deviceClass = (long) bluetoothDevice.getBluetoothClass().getDeviceClass();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bogr bogr2 = (bogr) da.f164949b;
                    if (!bogr2.f133024c.mo73666a()) {
                        bogr2.f133024c = GeneratedMessageLite.m124020a(bogr2.f133024c);
                    }
                    bogr2.f133024c.mo74161a(deviceClass);
                }
                if (bogj.f164950c) {
                    bogj.mo74035c();
                    bogj.f164950c = false;
                }
                bohi bohi4 = (bohi) bogj.f164949b;
                bogr bogr3 = (bogr) da.mo74062i();
                bogr3.getClass();
                bohi4.f133090t = bogr3;
                bohi4.f133071a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo59562c(autr autr) {
        if (m93436j() && !autr.mo50912a()) {
            aunw a = f109169a.mo50711a("The device %s has been unbonded. Removed it from trusted devices", autr.f92510c);
            a.mo50708c();
            a.mo50707b();
            mo59563c(autr.f92510c.getAddress());
            aupn aupn = this.f109173h;
            autr.m77811a(aupn, autr.f92512e);
            autr.m77811a(aupn, autr.f92513f);
            autr.m77811a(aupn, autr.f92521n);
            autr.m77811a(aupn, autr.f92515h);
            autr.m77811a(aupn, autr.f92514g);
            autr.m77811a(aupn, autr.f92518k);
            autr.m77811a(aupn, autr.f92519l);
            autr.m77811a(aupn, auuj.m77859b("on_body", autr.f92508a));
            autr.m77811a(aupn, auuj.m77859b("user_authenticated", autr.f92508a));
            autr.m77811a(aupn, autr.f92516i);
            autr.m77811a(aupn, autr.f92517j);
            autr.m77811a(aupn, autr.f92520m);
            aupn.mo50737d();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void
     arg types: [int, autr]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(autr, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(java.lang.String, org.json.JSONObject):void
      auou.a(java.lang.String, java.lang.String):void
      auou.a(java.lang.String, org.json.JSONObject):void
      auou.a(boolean, boolean):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.a(boolean, autr):void */
    /* renamed from: c */
    public final void mo59563c(String str) {
        synchronized (f109170b) {
            autr autr = (autr) this.f109171c.remove(str);
            if (autr != null) {
                mo59559a(false, autr);
                this.f109178m.mo50857a(autr.f92510c, this.f109187v);
                m93434d(autr);
                m93438z();
                mo59564g();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo50897c(BluetoothDevice bluetoothDevice) {
        return this.f109171c.containsKey(bluetoothDevice.getAddress());
    }

    /* renamed from: b */
    public final void mo59561b(String str, JSONObject jSONObject) {
        Set<autr> set;
        if (cgzt.m147783h()) {
            ArrayList arrayList = new ArrayList();
            synchronized (f109170b) {
                set = this.f109181p;
            }
            for (autr autr : set) {
                arrayList.add(autr.f92509b);
            }
            if (jSONObject == null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("blessing_bt_set_key", new JSONArray((Collection) arrayList));
                } catch (JSONException e) {
                    jSONObject = null;
                }
            } else {
                jSONObject.put("blessing_bt_set_key", new JSONArray((Collection) arrayList));
            }
            mo50762a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public final boolean mo50853b(BluetoothDevice bluetoothDevice) {
        return mo50897c(bluetoothDevice);
    }

    /* renamed from: a */
    public final void mo50759a(bogj bogj) {
        super.mo50759a(bogj);
        m93433c(bogj);
    }

    /* renamed from: a */
    public final void mo50851a(String str) {
        m93437y();
        mo59564g();
        autr autr = (autr) this.f109171c.get(str);
        mo59560b(autr);
        if (autr != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("trustlet_id", autr.f92510c.getAddress());
            hashMap.put("trustlet_source", autr.f92509b);
            hashMap.put("bt_connection_state_key", String.valueOf(auuj.m77862c(autr.f92510c)));
            hashMap.put("bt_secure_connection_key", String.valueOf(auuj.m77860b(autr.f92510c)));
            mo59561b("bt_device_connection_state_changed", aumv.m77341a(hashMap));
            return;
        }
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        if (auuj.m77862c(remoteDevice) && this.f109174i.putIfAbsent(remoteDevice, Boolean.TRUE) == null) {
            new adzt().postDelayed(new C1659auth(this, remoteDevice, System.currentTimeMillis()), cgzt.f188132a.mo6606a().mo84823h());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50762a(String str, JSONObject jSONObject) {
        boolean z;
        if (cgzt.m147783h()) {
            synchronized (f109170b) {
                z = this.f109176k;
            }
            mo50761a("Bluetooth", str, jSONObject, z, m93431a(), m93435f(), true, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo50852a(boolean z) {
        if (z && this.f109171c.isEmpty()) {
            mo59566i();
        } else if (z) {
            for (autr autr : this.f109171c.values()) {
                mo59562c(autr);
            }
        }
        m93437y();
        m93438z();
        mo59564g();
        mo59561b("bluetooth_adapter_state_changed", aumv.m77339a("bt_adapter_state_key", String.valueOf(z)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.b(autr, boolean):bogi
     arg types: [autr, int]
     candidates:
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.b(java.lang.String, org.json.JSONObject):void
      auou.b(java.lang.String, java.lang.String):void
      com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService.b(autr, boolean):bogi */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59559a(boolean z, autr autr) {
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133072b = 1;
        int i = bohi.f133071a | 1;
        bohi.f133071a = i;
        if (!z) {
            bohi.f133074d = 2;
            bohi.f133071a = i | 8;
        } else {
            bohi.f133074d = 1;
            bohi.f133071a = i | 8;
        }
        long size = (long) this.f109171c.size();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi2 = (bohi) bogj.f164949b;
        bohi2.f133071a |= 16;
        bohi2.f133075e = size;
        if (autr.mo50913a(this.f109173h)) {
            bogi b = m93432b(autr, false);
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi3 = (bohi) bogj.f164949b;
            b.getClass();
            bohi3.mo68912b();
            bohi3.f133086p.add(b);
        }
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }
}
