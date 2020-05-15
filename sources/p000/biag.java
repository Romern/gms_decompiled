package p000;

import android.util.Log;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: biag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biag {
    /* renamed from: a */
    public static List m101850a(UserLocationNearbyAlertFilter userLocationNearbyAlertFilter) {
        ArrayList arrayList = new ArrayList();
        String str = userLocationNearbyAlertFilter.f109590c;
        if (str != null) {
            arrayList.add(str);
        } else if (userLocationNearbyAlertFilter.f109591d) {
            arrayList.add("_beacon_");
        } else if (!userLocationNearbyAlertFilter.f109589b.isEmpty()) {
            for (Integer num : userLocationNearbyAlertFilter.f109589b) {
                String a = bhqm.m101334a(num.intValue());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 7);
                sb.append("_type_");
                sb.append(a);
                sb.append("_");
                arrayList.add(sb.toString());
            }
        } else if (Log.isLoggable("Places", 6)) {
            Log.e("Places", "The NearbyAlertFilter is invalid!");
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map m101851a(Map map, Map map2) {
        Set set;
        Integer num;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            bhyw bhyw = (bhyw) entry.getKey();
            hashMap.put(bhyw, new ArrayList());
            List<String> list = (List) entry.getValue();
            String str = bhyw.f119920b;
            if (!m101853a(str)) {
                set = Collections.emptySet();
            } else {
                if (str.equals("_transit_stations_")) {
                    num = Integer.valueOf(bhqm.m101333a("transit_station"));
                } else {
                    num = Integer.valueOf(bhqm.m101333a(str.substring(6, str.length() - 1)));
                }
                set = Collections.singleton(num);
            }
            for (String str2 : list) {
                if (map2.containsKey(str2)) {
                    bhzl bhzl = (bhzl) map2.get(str2);
                    ((List) hashMap.get(bhyw)).add(new bhzs(str2, bhzl.f119959a, bhzl.f119960b, bhzl.f119961c, set));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m101852a(List list, float f) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bhzs) it.next()).f119988d = f;
        }
    }

    /* renamed from: a */
    public static boolean m101853a(String str) {
        return str.equals("_transit_stations_") || str.startsWith("_type_");
    }
}
