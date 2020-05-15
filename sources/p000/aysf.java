package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.trustagent.trustlet.device.connectionlessble.internal.ConnectionlessBleTrustletChimeraService;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aysf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aysf extends aysv {

    /* renamed from: a */
    final /* synthetic */ aysh f98409a;

    public aysf(aysh aysh) {
        this.f98409a = aysh;
    }

    /* renamed from: a */
    public final void mo54333a(int i) {
        String str;
        if (i == 1) {
            str = "SCAN_FAILED_ALREADY_STARTED";
        } else if (i == 2) {
            str = "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
        } else if (i == 3) {
            str = "SCAN_FAILED_INTERNAL_ERROR";
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknow error code: ");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "SCAN_FAILED_FEATURE_UNSUPPORTED";
        }
        aytb aytb = this.f98409a.f98414b;
        aysz aysz = new aysz(aysg.START_SCANNING);
        String valueOf = String.valueOf(str);
        aytb.mo54413a(aysz, new BluetoothException(valueOf.length() == 0 ? new String("Starting scanning failed: ") : "Starting scanning failed: ".concat(valueOf)));
    }

    /* renamed from: a */
    public final void mo54334a(aysw aysw) {
        aysw aysw2 = aysw;
        aysh aysh = this.f98409a;
        int i = aysh.f98413f;
        beed beed = aysh.f98417e;
        if (beed != null) {
            ScanRecord scanRecord = aysw2.f98430a.getScanRecord();
            if (scanRecord != null) {
                beee beee = beed.f107012a;
                long timestampNanos = aysw2.f98430a.getTimestampNanos();
                aysl a = aysw.mo54399a();
                synchronized (beee.f107016d) {
                    String valueOf = String.valueOf(boan.f132472f.mo68794a(scanRecord.getBytes()));
                    if (valueOf.length() == 0) {
                        new String("Received ScanRecord buffer (ADV data and Scan Response):\n         ");
                    } else {
                        "Received ScanRecord buffer (ADV data and Scan Response):\n         ".concat(valueOf);
                    }
                    ausg ausg = beee.f107021i;
                    bedt bedt = (bedt) beee.f107019g.get(a);
                    if (bedt != null) {
                        if (ausg != null) {
                            long currentTimeMillis = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + TimeUnit.NANOSECONDS.toMillis(timestampNanos);
                            try {
                                byte[] serviceData = scanRecord.getServiceData(beee.f107014b);
                                if (serviceData != null) {
                                    byte[] bArr = new byte[16];
                                    ByteBuffer wrap = ByteBuffer.wrap(serviceData);
                                    byte b = wrap.get();
                                    if (b == 80) {
                                        wrap.get(bArr);
                                        beds a2 = bedr.m91834a(bedt.f106988b.f106984c, bArr);
                                        bedt bedt2 = new bedt(currentTimeMillis, a2);
                                        String valueOf2 = String.valueOf(boan.f132472f.mo68784a(" ", 8).mo68794a(becu.m91798a(a2.f106984c.f106973b.f106977a, a2.mo58588a(), 1)));
                                        if (valueOf2.length() == 0) {
                                            new String("Encrypted EID: ");
                                        } else {
                                            "Encrypted EID: ".concat(valueOf2);
                                        }
                                        String valueOf3 = String.valueOf(boan.f132472f.mo68784a(" ", 8).mo68794a(a2.mo58588a()));
                                        if (valueOf3.length() == 0) {
                                            new String("Decrypted EID: ");
                                        } else {
                                            "Decrypted EID: ".concat(valueOf3);
                                        }
                                        beee.f107017e.mo58587a(bedt, bedt2);
                                        beee.f107019g.put(a, bedt2);
                                        autv autv = ausg.f92415a;
                                        BluetoothDevice bluetoothDevice = bedt2.f106988b.f106984c.f106972a.f98419a;
                                        List<autj> a3 = autj.m77801a(bluetoothDevice, bedt2);
                                        autr a4 = autr.m77810a(bluetoothDevice, autv.f92525a.f109191i);
                                        if (cgzt.m147783h()) {
                                            JSONObject jSONObject = new JSONObject();
                                            ArrayList arrayList = new ArrayList();
                                            for (int i2 = 0; i2 < a3.size(); i2++) {
                                                String valueOf4 = String.valueOf(((autj) a3.get(i2)).f92488a);
                                                boolean z = ((autj) a3.get(i2)).f92489b;
                                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 6);
                                                sb.append(valueOf4);
                                                sb.append(":");
                                                sb.append(z);
                                                arrayList.add(sb.toString());
                                            }
                                            try {
                                                jSONObject.put("trustlet_id", bluetoothDevice.getAddress());
                                                jSONObject.put("device_capability_state_key", new JSONArray((Collection) arrayList));
                                            } catch (JSONException e) {
                                                jSONObject = null;
                                            }
                                            autv.f92525a.mo50762a("receive_device_eid_result", jSONObject);
                                        }
                                        a4.mo50911a(autv.f92525a.f109191i, bedt2);
                                        bnic b2 = a4.mo50915b();
                                        if (b2.size() != 0) {
                                            for (autj autj : a3) {
                                                autv.f92525a.f109192j.mo50903a(autj);
                                            }
                                            Iterator it = a3.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                autj autj2 = (autj) it.next();
                                                if (b2.contains(autj2.f92488a)) {
                                                    if (autv.f92525a.f109192j.mo50905a(autj2.f92488a)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        autv.f92525a.f109193k = a4;
                                        aunx aunx = ConnectionlessBleTrustletChimeraService.f109190h;
                                        String valueOf5 = String.valueOf(bluetoothDevice);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf5).length() + 40);
                                        sb2.append("Granting trust, finding valid EID from  ");
                                        sb2.append(valueOf5);
                                        aunx.mo50711a(sb2.toString(), new Object[0]).mo50708c();
                                        autv.f92525a.mo50757l(true);
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(54);
                                        sb3.append("Received advertisement with incorrect frame type: ");
                                        sb3.append((int) b);
                                        throw new bedp(sb3.toString());
                                    }
                                } else {
                                    throw new bedp("Received advertisement with no EID service data.");
                                }
                            } catch (bedp e2) {
                                autv autv2 = ausg.f92415a;
                                BluetoothDevice bluetoothDevice2 = a.f98419a;
                                String str = ausf.f92406c;
                                aunx aunx2 = ConnectionlessBleTrustletChimeraService.f109190h;
                                String name = bluetoothDevice2.getName();
                                StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 71 + String.valueOf(str).length());
                                sb4.append("Received failure response for eid data for the device ");
                                sb4.append(name);
                                sb4.append(". The reason is: ");
                                sb4.append(str);
                                aunx2.mo50711a(sb4.toString(), new Object[0]);
                                HashMap hashMap = new HashMap();
                                hashMap.put("trustlet_id", bluetoothDevice2.getAddress());
                                hashMap.put("trustlet_source", bluetoothDevice2.getName());
                                hashMap.put("failure_reason_key", str);
                                autv2.f92525a.mo50762a("receive_failure_responses_for_eid_data", aumv.m77341a(hashMap));
                            }
                        }
                    }
                }
            } else {
                String str2 = beee.f107013a;
                String valueOf6 = String.valueOf(aysw);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 29);
                sb5.append("Received a null scan record: ");
                sb5.append(valueOf6);
                Log.w(str2, sb5.toString());
            }
        }
    }
}
