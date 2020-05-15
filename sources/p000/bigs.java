package p000;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: bigs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bigs extends aehy {

    /* renamed from: a */
    final /* synthetic */ bigx f120544a;

    public bigs(bigx bigx) {
        this.f120544a = bigx;
    }

    /* renamed from: a */
    public final void mo34164a(LocationAvailability locationAvailability) {
        locationAvailability.mo43544a();
    }

    /* renamed from: a */
    public final void mo9910a(LocationResult locationResult) {
        bhwr bhwr;
        ActivityRecognitionResult activityRecognitionResult;
        bhwr bhwr2;
        ScanResult[] scanResultArr;
        this.f120544a.f120565o++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bigx bigx = this.f120544a;
        if ((!bigx.f120570t || elapsedRealtime - bigx.f120572v > bigx.f120571u) && locationResult.mo43561a() != null) {
            bigx bigx2 = this.f120544a;
            bigx2.f120570t = true;
            bigx2.f120572v = elapsedRealtime;
            bigx2.f120566p++;
            Location a = locationResult.mo43561a();
            bigj bigj = this.f120544a.f120558h;
            List<ScanResult> scanResults = bigj.f120523a.getScanResults();
            if (scanResults != null) {
                ScanResult[] scanResultArr2 = (ScanResult[]) scanResults.toArray(new ScanResult[scanResults.size()]);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (bigj.f120524b.f120294b.mo64542a(elapsedRealtime2, scanResultArr2)) {
                    int length = scanResultArr2.length;
                    HashSet hashSet = new HashSet(length);
                    ArrayList arrayList = new ArrayList(length);
                    long j = Long.MIN_VALUE;
                    int i = 0;
                    while (i < length) {
                        ScanResult scanResult = scanResultArr2[i];
                        if (scanResult != null) {
                            long a2 = bidg.m101997a(scanResult.BSSID);
                            if (bidg.m101999a(a2, scanResult)) {
                                scanResultArr = scanResultArr2;
                                long j2 = scanResult.timestamp / 1000;
                                j = Math.max(j2, j);
                                if (elapsedRealtime2 - j2 <= bidg.f120293a && hashSet.add(Long.valueOf(a2))) {
                                    arrayList.add(bidg.m101998a(scanResult, a2, j2));
                                }
                                i++;
                                scanResultArr2 = scanResultArr;
                            }
                        }
                        scanResultArr = scanResultArr2;
                        i++;
                        scanResultArr2 = scanResultArr;
                    }
                    bhwr2 = new bhwr(j, arrayList);
                } else {
                    int length2 = scanResultArr2.length;
                    ArrayList arrayList2 = new ArrayList(length2);
                    HashSet hashSet2 = new HashSet();
                    for (ScanResult scanResult2 : scanResultArr2) {
                        if (scanResult2 != null) {
                            long a3 = bidg.m101997a(scanResult2.BSSID);
                            if (bidg.m101999a(a3, scanResult2) && hashSet2.add(Long.valueOf(a3))) {
                                arrayList2.add(bidg.m101998a(scanResult2, a3, elapsedRealtime2));
                            }
                        }
                    }
                    bhwr2 = new bhwr(elapsedRealtime2, arrayList2);
                }
                if (Log.isLoggable("Places", 4)) {
                    int a4 = bhwr2.mo64366a();
                    int length3 = scanResultArr2.length;
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Converted ");
                    sb.append(a4);
                    sb.append(" out of ");
                    sb.append(length3);
                    sb.append(" WiFi scans");
                    Log.i("Places", sb.toString());
                }
                bhwr = bhwr2;
            } else {
                bhwr = null;
            }
            WifiInfo connectionInfo = this.f120544a.f120558h.f120523a.getConnectionInfo();
            boolean z = connectionInfo != null ? !"<unknown ssid>".equals(connectionInfo.getSSID()) : false;
            bigb bigb = this.f120544a.f120559i;
            if (bigb.f120491a.mo24805i()) {
                try {
                    activityRecognitionResult = aefo.m51796a(bigb.f120491a).mo34259n();
                } catch (Exception e) {
                    activityRecognitionResult = null;
                }
                if (activityRecognitionResult != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (DetectedActivity detectedActivity : activityRecognitionResult.f79300a) {
                        arrayList3.add(new bhtw(detectedActivity.mo43513a(), ((float) detectedActivity.f79320e) / 100.0f));
                    }
                    bigb.f120492b = new bhtr(arrayList3, activityRecognitionResult.f79301b);
                }
            }
            bhtr bhtr = bigb.f120492b;
            bigx bigx3 = this.f120544a;
            if (bigx.m102369c()) {
                List list = bigx3.f120555e;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bigv) list.get(i2)).mo64457a(a, bhwr, z, bhtr);
                }
            }
        }
    }
}
