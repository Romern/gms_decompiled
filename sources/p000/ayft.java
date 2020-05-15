package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ayft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayft {

    /* renamed from: a */
    public static final String[] f97497a = {"event_type", "path", "data", "tags", "asset_key", "asset_id"};

    /* renamed from: a */
    private static HashMap m83939a(axxf axxf, Map.Entry entry) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", 1);
        hashMap.put("path", axxf.f96641c.toString());
        hashMap.put("data", axxf.f96642d);
        hashMap.put("tags", "");
        if (entry != null) {
            hashMap.put("asset_id", ((axuh) entry.getValue()).f96387b);
            hashMap.put("asset_key", entry.getKey());
        }
        if (Log.isLoggable("EventHolderBuilder", 3)) {
            String valueOf = String.valueOf(hashMap);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("buildRowForChangedDataItem: ");
            sb.append(valueOf);
            Log.d("EventHolderBuilder", sb.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m83940a(rtu rtu, axxf axxf) {
        if (Log.isLoggable("EventHolderBuilder", 3)) {
            String valueOf = String.valueOf(axxf);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("addRowToHolder: ");
            sb.append(valueOf);
            Log.d("EventHolderBuilder", sb.toString());
        }
        Map.Entry entry = null;
        for (Map.Entry entry2 : axxf.mo53710a().entrySet()) {
            if (entry == null) {
                rtu.mo25161a(m83939a(axxf, entry2));
                entry = entry2;
            } else if (entry2.getKey() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("path", axxf.f96641c.toString());
                hashMap.put("asset_key", entry2.getKey());
                hashMap.put("asset_id", ((axuh) entry2.getValue()).f96387b);
                if (Log.isLoggable("EventHolderBuilder", 3)) {
                    String valueOf2 = String.valueOf(hashMap);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb2.append("buildRowForAsset: ");
                    sb2.append(valueOf2);
                    Log.d("EventHolderBuilder", sb2.toString());
                }
                rtu.mo25161a(hashMap);
            } else {
                String valueOf3 = String.valueOf(axxf);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 49);
                sb3.append("Cannot construct an asset row with null key for: ");
                sb3.append(valueOf3);
                throw new IllegalStateException(sb3.toString());
            }
        }
        if (entry == null) {
            rtu.mo25161a(m83939a(axxf, (Map.Entry) null));
        }
    }
}
