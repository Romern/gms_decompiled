package p000;

import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: jkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkv {

    /* renamed from: a */
    private static final Logger f22721a = jsy.m17256a("DeviceSyncV2DeviceBackfiller");

    /* renamed from: a */
    public static List m16857a(List list, List list2) {
        HashMap hashMap = new HashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DeviceMetadata deviceMetadata = (DeviceMetadata) list.get(i);
            try {
                hashMap.put(sqd.m35972d(((jtp) GeneratedMessageLite.m124014a(jtp.f23191d, deviceMetadata.f10526c)).f23193a.getKey()), jkq.m16849a(deviceMetadata));
            } catch (bxwf e) {
                f22721a.mo25418e("Couldn't decode BetterTogetherDeviceMetadata in device metadata", new Object[0]);
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) it.next();
            String d = sqd.m35972d(syncedCryptauthDevice.f11186a);
            if (!hashMap.containsKey(d)) {
                hashMap.put(d, syncedCryptauthDevice);
            }
        }
        return bnkn.m109663a(hashMap.values());
    }
}
