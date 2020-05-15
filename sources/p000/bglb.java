package p000;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiScanner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bglb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglb implements WifiScanner.ScanListener {

    /* renamed from: a */
    public final WifiScanner f116744a;

    /* renamed from: b */
    public final List f116745b = new ArrayList();

    /* renamed from: c */
    private final bgkg f116746c;

    /* renamed from: d */
    private final boolean f116747d;

    static {
        bglb.class.getSimpleName();
    }

    public bglb(WifiScanner wifiScanner, bgkg bgkg, boolean z) {
        this.f116744a = wifiScanner;
        this.f116746c = bgkg;
        this.f116747d = z;
    }

    public final void onFailure(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("onFailure, c is ");
        sb.append(i);
        sb.append(" and s is ");
        sb.append(str);
        sb.toString();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new bgkf[0]);
        this.f116746c.mo62905a(arrayList, null);
    }

    public final void onFullResult(ScanResult scanResult) {
        String valueOf = String.valueOf(scanResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("onFullResult: returned ");
        sb.append(valueOf);
        sb.toString();
        if (this.f116747d && this.f116745b.size() < 150) {
            this.f116745b.add(scanResult);
        }
    }

    public final void onPeriodChanged(int i) {
        StringBuilder sb = new StringBuilder(35);
        sb.append("onPeriodChanged: new is ");
        sb.append(i);
        sb.toString();
    }

    public final void onResults(WifiScanner.ScanData[] scanDataArr) {
        bgkx bgkx = bgkx.f116729g;
        int length = scanDataArr.length;
        StringBuilder sb = new StringBuilder(47);
        sb.append("onResults: returned array of length ");
        sb.append(length);
        sb.toString();
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        if (this.f116747d) {
            bgkf[] bgkfArr = new bgkf[this.f116745b.size()];
            List list = this.f116745b;
            int size = list.size();
            int i2 = 0;
            while (i < size) {
                bgkfArr[i2] = bgkx.mo62951a((ScanResult) list.get(i));
                i++;
                i2++;
            }
            arrayList.add(bgkfArr);
            this.f116745b.clear();
        } else {
            for (WifiScanner.ScanData scanData : scanDataArr) {
                ScanResult[] results = scanData.getResults();
                int length2 = results.length;
                bgkf[] bgkfArr2 = new bgkf[length2];
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("onResults: ScanResult is of length ");
                sb2.append(length2);
                sb2.toString();
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    ScanResult scanResult = results[i3];
                    int i5 = i4 + 1;
                    bgkfArr2[i4] = bgkx.mo62951a(scanResult);
                    String valueOf = String.valueOf(scanResult);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    sb3.append("  onResults, one entry is ");
                    sb3.append(valueOf);
                    sb3.toString();
                    i3++;
                    i4 = i5;
                }
                arrayList.add(bgkfArr2);
            }
        }
        this.f116746c.mo62905a(arrayList, null);
    }

    public final void onSuccess() {
    }
}
