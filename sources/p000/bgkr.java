package p000;

import android.net.wifi.RttManager;
import android.net.wifi.ScanResult;
import android.net.wifi.rtt.RangingRequest;
import android.net.wifi.rtt.WifiRttManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bgkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bgkr extends bgko {

    /* renamed from: e */
    public static final /* synthetic */ int f116716e = 0;

    /* renamed from: b */
    final ddh f116717b = new ddh(Math.min(6, RangingRequest.getMaxPeers()), SystemClock.elapsedRealtime(), this.f116718c);

    /* renamed from: c */
    final bhcs f116718c = new bhcs(null);

    /* renamed from: d */
    bfnb f116719d;

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0300  */
    /* renamed from: a */
    public final void mo62957a(WifiRttManager wifiRttManager, List list, RttManager.RttListener rttListener, bfor bfor, Executor executor) {
        List list2;
        List list3;
        int i;
        String str;
        bfmz bfmz;
        RttManager.RttListener rttListener2 = rttListener;
        Executor executor2 = executor;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -15000 + elapsedRealtime;
        bfnb bfnb = this.f116719d;
        bfni bfni = null;
        if (!(bfnb == null || (bfmz = bfnb.f114456a) == null)) {
            bfns bfns = bfnb.f114457b;
            if (bfmz != bfns || bfns.f114451e < j) {
                this.f116719d = null;
            } else {
                bfni = bfns.f114449c;
            }
        }
        int j2 = (int) ceze.m138465j();
        this.f116718c.mo63556a();
        int i2 = 1;
        if (bfni != null) {
            if ((j2 & 4) != 0) {
                ddh ddh = this.f116717b;
                List list4 = ddh.f12931c;
                int size = list4.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ddg ddg = (ddg) list4.get(i3);
                    buje a = ddh.f12930b.mo62698a(Long.valueOf(bupz.m120219a(ddg.mo8538a())));
                    if (a != null) {
                        int[] iArr = new int[2];
                        ayvd.m84904a(a.f154009b, iArr);
                        ddg.f12928c = ayuo.m84843a(bfni.f114480b, bfni.f114481c, iArr[0], iArr[1]);
                    }
                }
                Collections.sort(ddh.f12931c, ddf.f12925a);
                list2 = ddh.mo8539a(ddh.f12929a);
                if (!list2.isEmpty() || !wifiRttManager.isAvailable()) {
                    executor2.execute(new bgkp(rttListener2));
                } else {
                    wifiRttManager.startRanging(new RangingRequest.Builder().addAccessPoints(list2).build(), executor2, new bgkq(rttListener2, bfor));
                    return;
                }
            } else {
                list3 = list;
            }
        } else if ((2 & j2) != 0) {
            ddh ddh2 = this.f116717b;
            if (elapsedRealtime > ddh2.f12933e + 60000) {
                ddh2.f12931c.clear();
            }
            ddh2.f12933e = elapsedRealtime;
            Iterator it = ddh2.f12931c.iterator();
            while (it.hasNext()) {
                ddg ddg2 = (ddg) it.next();
                int i4 = ddg2.f12927b - 5;
                ddg2.f12927b = i4;
                if (i4 <= -100) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                list2 = ddh2.mo8539a(ddh2.f12929a);
            } else {
                ArrayList arrayList = new ArrayList();
                int size2 = list.size();
                int i5 = 0;
                while (i5 < size2) {
                    ScanResult scanResult = (ScanResult) list.get(i5);
                    if (ddh2.f12930b.mo62698a(Long.valueOf(bupz.m120219a(scanResult.BSSID))) != null) {
                        arrayList.add(scanResult);
                    }
                    i5++;
                    i2 = 1;
                }
                int size3 = arrayList.size();
                StringBuilder sb = new StringBuilder(44);
                sb.append("SIZE (known RTT WiFi Scan List): ");
                sb.append(size3);
                sb.toString();
                if (!ddh2.f12931c.isEmpty()) {
                    int size4 = arrayList.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        ScanResult scanResult2 = (ScanResult) arrayList.get(i6);
                        List list5 = ddh2.f12931c;
                        int size5 = list5.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size5) {
                                ddh2.f12931c.add(new ddg(scanResult2));
                                break;
                            }
                            ddg ddg3 = (ddg) list5.get(i7);
                            i7++;
                            if (ddg3.mo8538a().equals(scanResult2.BSSID)) {
                                ddg3.f12927b = scanResult2.level;
                                break;
                            }
                        }
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = arrayList.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        arrayList2.add(new ddg((ScanResult) arrayList.get(i8)));
                    }
                    ddh2.f12931c = arrayList2;
                    ddh2.f12932d = arrayList;
                }
                Collections.sort(ddh2.f12931c, dde.f12924a);
                List list6 = ddh2.f12931c;
                int size7 = list6.size();
                int i9 = 0;
                while (i9 < size7) {
                    ddg ddg4 = (ddg) list6.get(i9);
                    String a2 = ddg4.mo8538a();
                    int size8 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size8) {
                            str = "";
                            break;
                        }
                        int i11 = i10 + 1;
                        if (((ScanResult) arrayList.get(i10)).BSSID.equals(a2)) {
                            str = " *";
                            break;
                        }
                        i10 = i11;
                    }
                    String a3 = ddg4.mo8538a();
                    int i12 = ddg4.f12926a.level;
                    int i13 = ddg4.f12927b;
                    double d = ddg4.f12928c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 91 + str.length());
                    sb2.append("RTT-AP in AGGREGATE: ");
                    sb2.append(a3);
                    sb2.append(" RSSI: ");
                    sb2.append(i12);
                    sb2.append(" Weight: ");
                    sb2.append(i13);
                    sb2.append(" Range: ");
                    sb2.append(d);
                    sb2.append(str);
                    sb2.toString();
                    i9++;
                    size7 = size7;
                    i2 = 1;
                }
                int size9 = ddh2.f12931c.size();
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("SIZE (AP Aggregate List): ");
                sb3.append(size9);
                sb3.toString();
                list2 = ddh2.mo8539a(ddh2.f12929a);
                int size10 = list2.size();
                StringBuilder sb4 = new StringBuilder(42);
                sb4.append("SIZE (Ranging candidate List): ");
                sb4.append(size10);
                sb4.toString();
                int size11 = list2.size();
                int i14 = 0;
                int i15 = 0;
                while (i14 < size11) {
                    ScanResult scanResult3 = (ScanResult) list2.get(i14);
                    String str2 = scanResult3.BSSID;
                    int i16 = scanResult3.level;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 36);
                    sb5.append("SCAN SUBSET USED: ");
                    sb5.append(str2);
                    sb5.append(" RSSI: ");
                    sb5.append(i16);
                    sb5.toString();
                    List list7 = ddh2.f12932d;
                    int size12 = list7.size();
                    int i17 = 0;
                    while (true) {
                        i = i14 + 1;
                        if (i17 >= size12) {
                            break;
                        }
                        if (scanResult3.BSSID.equals(((ScanResult) list7.get(i17)).BSSID)) {
                            i15++;
                        }
                        i17++;
                    }
                    i14 = i;
                }
                ddh2.f12932d = list2;
                int[] iArr2 = ddh2.f12934f;
                iArr2[i15] = iArr2[i15] + i2;
                int i18 = ddh2.f12935g + i2;
                ddh2.f12935g = i18;
                StringBuilder sb6 = new StringBuilder(30);
                sb6.append("SAME=");
                sb6.append(i15);
                sb6.append(" N=");
                sb6.append(i18);
                sb6.toString();
                for (int i19 = 0; i19 <= ddh2.f12929a; i19++) {
                    int i20 = ddh2.f12934f[i19];
                    int i21 = ddh2.f12935g;
                    StringBuilder sb7 = new StringBuilder(68);
                    sb7.append("COUNT[");
                    sb7.append(i19);
                    sb7.append("]=");
                    sb7.append(i20);
                    sb7.append(" PERCENT [");
                    sb7.append(i19);
                    sb7.append("]=");
                    sb7.append((((float) i20) * 100.0f) / ((float) i21));
                    sb7.toString();
                }
            }
            if (!list2.isEmpty()) {
            }
            executor2.execute(new bgkp(rttListener2));
        } else {
            list3 = list;
        }
        list2 = list3;
        if (!list2.isEmpty()) {
        }
        executor2.execute(new bgkp(rttListener2));
    }
}
