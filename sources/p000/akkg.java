package p000;

import android.net.NetworkKey;
import android.net.WifiKey;
import java.util.List;

/* renamed from: akkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkg {
    /* renamed from: a */
    public static NetworkKey[] m59911a(List list) {
        NetworkKey[] networkKeyArr = new NetworkKey[list.size()];
        int i = 0;
        while (i < list.size()) {
            String str = (String) list.get(i);
            List c = akkd.f72145c.mo66925c((CharSequence) str);
            if (c.size() == 2) {
                networkKeyArr[i] = new NetworkKey(new WifiKey(aknk.m60086a((String) c.get(0)), (String) c.get(1)));
                i++;
            } else {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Expected a string in the form ssid|bssid, got ") : "Expected a string in the form ssid|bssid, got ".concat(valueOf));
            }
        }
        return networkKeyArr;
    }
}
