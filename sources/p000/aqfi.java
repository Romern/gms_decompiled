package p000;

import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: aqfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfi {
    /* renamed from: a */
    static aqfh m71484a() {
        aqfh aqfh = new aqfh();
        String property = System.getProperty("http.proxyHost");
        if (!TextUtils.isEmpty(property)) {
            aqfh.f85960a = true;
            try {
                InetAddress[] allByName = Inet4Address.getAllByName(property);
                int length = allByName.length;
                int i = 0;
                while (i < length) {
                    if (!allByName[i].isSiteLocalAddress()) {
                        i++;
                    } else {
                        aqfh.f85961b = true;
                        return aqfh;
                    }
                }
            } catch (UnknownHostException e) {
            }
            aqfh.f85962c = property;
        }
        return aqfh;
    }
}
