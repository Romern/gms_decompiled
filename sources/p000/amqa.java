package p000;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: amqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amqa {
    /* renamed from: a */
    public static void m63154a(Object[] objArr, Map map, String str, Object obj) {
        if (obj != null && map.containsKey(str)) {
            objArr[((Integer) map.get(str)).intValue()] = obj;
        }
    }

    /* renamed from: a */
    public static Object[] m63155a(Map map, ContentValues contentValues, long j) {
        if (contentValues == null) {
            return null;
        }
        Object[] objArr = new Object[map.size()];
        Long valueOf = Long.valueOf(j);
        m63154a(objArr, map, "contact_id", valueOf);
        m63154a(objArr, map, "raw_contact_id", valueOf);
        for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
            m63154a(objArr, map, entry.getKey(), entry.getValue());
        }
        return objArr;
    }
}
