package com.google.android.gms.trustagent.trustlet.device.connectionlessble.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConnectionlessBleTrustletChimeraService extends auot {

    /* renamed from: h */
    public static final aunx f109190h = new aunx("TrustAgent", "ConnectionlessBleTrustletChimeraService");

    /* renamed from: i */
    public aupn f109191i;

    /* renamed from: j */
    public autn f109192j;

    /* renamed from: k */
    public autr f109193k = null;

    /* renamed from: l */
    private SharedPreferences f109194l;

    /* renamed from: m */
    private SharedPreferences.OnSharedPreferenceChangeListener f109195m;

    /* renamed from: n */
    private ausf f109196n;

    /* renamed from: o */
    private ausi f109197o;

    /* renamed from: p */
    private auts f109198p;

    /* renamed from: q */
    private boolean f109199q;

    /* renamed from: z */
    private final List m93467z() {
        BluetoothDevice bluetoothDevice;
        auts auts = this.f109198p;
        ArrayList arrayList = new ArrayList();
        for (String str : auts.f92522a.mo50735c()) {
            String a = auuj.m77855a(str);
            if (a != null) {
                try {
                    bluetoothDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(a);
                } catch (IllegalArgumentException e) {
                    Log.e("Coffee-TrustedBtDeviceStore", a.length() == 0 ? new String("Illegal Bluetooth address.") : "Illegal Bluetooth address.".concat(a));
                    bluetoothDevice = null;
                }
                if (bluetoothDevice != null && auts.f92522a.mo50736c(str)) {
                    arrayList.add(autr.m77810a(bluetoothDevice, auts.f92522a));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            autr autr = (autr) arrayList.get(i);
            if (autr.mo50913a(this.f109191i)) {
                arrayList2.add(autr.mo50914b(this.f109191i));
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo50759a(bogj bogj) {
        super.mo50759a(bogj);
        if (this.f109193k != null) {
            bxvd da = bogi.f132990f.mo74144da();
            String str = this.f109193k.f92509b;
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bogi bogi = (bogi) da.f164949b;
                str.getClass();
                bogi.f132992a |= 1;
                bogi.f132993b = str;
            }
            boolean c = this.f109193k.mo50916c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogi bogi2 = (bogi) da.f164949b;
            bogi2.f132992a |= 2;
            bogi2.f132994c = c;
            boolean d = this.f109193k.mo50917d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogi bogi3 = (bogi) da.f164949b;
            int i = bogi3.f132992a | 4;
            bogi3.f132992a = i;
            bogi3.f132995d = d;
            bogi3.f132996e = 1;
            bogi3.f132992a = i | 8;
            if (bogj.f164950c) {
                bogj.mo74035c();
                bogj.f164950c = false;
            }
            bohi bohi = (bohi) bogj.f164949b;
            bogi bogi4 = (bogi) da.mo74062i();
            bohi bohi2 = bohi.f133070z;
            bogi4.getClass();
            bohi.mo68912b();
            bohi.f133086p.add(bogi4);
        }
    }

    /* renamed from: b */
    public final void mo50747b() {
        f109190h.mo50711a("Stopping authenticating user.", new Object[0]);
        ausi ausi = this.f109197o;
        if (ausi != null) {
            try {
                ausi.f92419b.mo58596a();
            } catch (bedp e) {
                Log.w("Eid-EidDataScanner", e.getMessage());
            }
        }
        this.f109199q = false;
        mo50778u("connectionless_ble_stops_authenticating_user");
    }

    /* renamed from: d */
    public final void mo50752d() {
        super.mo50752d();
        this.f109194l = aupo.m77578a(this);
        this.f109191i = new aupj(this.f109194l);
        this.f109196n = ausf.m77753a();
        this.f109192j = autn.m77804a(this);
        this.f109198p = new auts(this.f109191i);
        mo59567y();
        autu autu = new autu(this);
        this.f109195m = autu;
        this.f109194l.registerOnSharedPreferenceChangeListener(autu);
        mo50778u("trustlet_created");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50753e() {
        this.f109194l.unregisterOnSharedPreferenceChangeListener(this.f109195m);
        super.mo50753e();
        mo50778u("trustlet_destroyed");
    }

    /* renamed from: l */
    public final void mo50757l(boolean z) {
        super.mo50757l(true);
        this.f109193k = null;
    }

    /* renamed from: o */
    public final String mo50770o() {
        return "Connectionless-BLE";
    }

    /* renamed from: p */
    public final boolean mo50771p() {
        return aupq.m77579a().f92275a;
    }

    /* renamed from: q */
    public final boolean mo50772q() {
        return BluetoothAdapter.getDefaultAdapter() != null && cgzt.m147780e();
    }

    /* renamed from: r */
    public final Bundle mo50773r() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name", "Connectionless-BLE");
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_is_user_initiated", false);
        bundle.putBoolean("com.google.android.gms.trustagent.api.trustlet.key_dismiss_keyguard", false);
        return bundle;
    }

    /* renamed from: t */
    public final void mo50776t(String str) {
        super.mo50776t(str);
        this.f109193k = null;
    }

    /* renamed from: x */
    public final int mo50781x() {
        return 9;
    }

    /* renamed from: y */
    public final void mo59567y() {
        boolean z;
        boolean z2 = true;
        if (m93467z().size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || BluetoothAdapter.getDefaultAdapter() == null) {
            z2 = false;
        } else if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            z2 = false;
        }
        mo50763a(z, z2);
    }

    /* renamed from: b */
    public final void mo50764b(bogj bogj) {
        bohf bohf = ((bohi) bogj.f164949b).f133089s;
        if (bohf == null) {
            bohf = bohf.f133058h;
        }
        bxvd bxvd = (bxvd) bohf.mo74142c(5);
        bxvd.mo73625a((bxvk) bohf);
        boolean k = mo50766k();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bohf bohf2 = (bohf) bxvd.f164949b;
        bohf2.f133060a |= 64;
        bohf2.f133066g = k;
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
    }

    /* renamed from: a */
    public final void mo50762a(String str, JSONObject jSONObject) {
        if (cgzt.m147783h()) {
            mo50761a("ConnectionlessBle", str, jSONObject, this.f109199q, mo50772q(), mo50771p(), true, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df A[Catch:{ bedp | BluetoothException -> 0x0132 }, LOOP:1: B:34:0x00d9->B:36:0x00df, LOOP_END] */
    /* renamed from: a */
    public final boolean mo50746a() {
        ArrayList<bedt> arrayList;
        ayst ayst = null;
        this.f109193k = null;
        this.f109199q = true;
        mo50778u("connectionless_ble_starts_authenticating_user");
        f109190h.mo50711a("start authenticating", new Object[0]).mo50708c();
        try {
            ausf ausf = this.f109196n;
            List<autq> z = m93467z();
            long b = cgzt.f188132a.mo6606a().mo84817b();
            autv autv = new autv(this);
            aysk b2 = aysk.m84701b();
            if (b2 == null || !b2.mo54348a()) {
                throw new BluetoothException("bluetooth is not available");
            }
            BluetoothLeScanner bluetoothLeScanner = b2.f98418a.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                ayst = new ayst(bluetoothLeScanner);
            }
            if (ayst != null) {
                ausi ausi = new ausi(new aysh(ayst), new auss(ausf.f92411g));
                ArrayList arrayList2 = new ArrayList();
                for (autq autq : z) {
                    arrayList2.add(autq.mo50910b());
                    arrayList2 = arrayList2;
                }
                beee beee = ausi.f92419b;
                ausg ausg = new ausg(autv);
                synchronized (beee.f107016d) {
                    if (beee.f107021i == null) {
                        aysh aysh = beee.f107018f;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new ScanFilter.Builder().setServiceUuid(beee.f107014b).setServiceData(beee.f107014b, beee.f107015c).build());
                        String valueOf = String.valueOf(arrayList3.toString());
                        if (valueOf.length() == 0) {
                            new String("Setting scanFilters for EID scanning: ");
                        } else {
                            "Setting scanFilters for EID scanning: ".concat(valueOf);
                        }
                        beed beed = beee.f107020h;
                        try {
                            arrayList = arrayList2;
                            try {
                                aysh.f98414b.mo54415b(new ayse(aysh, new Object[]{aysg.START_SCANNING}, arrayList3), 200);
                            } catch (BluetoothOperationExecutor$BluetoothOperationTimeoutException e) {
                            }
                        } catch (BluetoothOperationExecutor$BluetoothOperationTimeoutException e2) {
                            arrayList = arrayList2;
                            aysh.f98417e = beed;
                            while (r0.hasNext()) {
                            }
                            beee.f107021i = ausg;
                            ausi.f92418a.mo50886a(new aush(ausi, autv), b);
                            this.f109197o = ausi;
                            return true;
                        }
                        for (bedt bedt : arrayList) {
                            beee.f107019g.put(bedt.f106988b.f106984c.f106972a, bedt);
                        }
                        beee.f107021i = ausg;
                    } else {
                        throw new bedp("Already scanning!");
                    }
                }
                ausi.f92418a.mo50886a(new aush(ausi, autv), b);
                this.f109197o = ausi;
                return true;
            }
            throw new BluetoothException("LeScanner is not available");
        } catch (bedp | BluetoothException e3) {
            f109190h.mo50710a("Scan for EID data fails: ", e3, new Object[0]).mo50706a();
            return false;
        }
    }
}
