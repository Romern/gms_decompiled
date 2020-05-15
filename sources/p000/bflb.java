package p000;

import android.net.wifi.ScanResult;
import java.util.Iterator;
import java.util.List;

/* renamed from: bflb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bflb implements bflc {

    /* renamed from: a */
    public static final bflb f114329a = new bflb();

    private bflb() {
    }

    /* renamed from: a */
    public final void mo61853a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            if (!(scanResult == null || scanResult.SSID == null || !bebi.m91718a(scanResult.BSSID, scanResult.SSID))) {
                it.remove();
            }
        }
    }
}
