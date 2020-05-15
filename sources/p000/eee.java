package p000;

import android.content.ContentValues;

/* renamed from: eee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eee {
    /* renamed from: a */
    public static void m10220a(ContentValues contentValues, tju tju) {
        if (tju != null) {
            if (tju.mo26604a()) {
                contentValues.put("string_key1", tju.mo26605b());
            }
            if (tju.mo26606c()) {
                contentValues.put("string_key2", tju.mo26607d());
            }
            if (tju.mo26608e()) {
                contentValues.put("string_key3", tju.mo26610f());
            }
        }
    }

    /* renamed from: a */
    public static void m10221a(ContentValues contentValues, tka tka) {
        if (tka != null) {
            contentValues.put("time_type", Integer.valueOf(tka.mo26615a()));
            contentValues.put("start_time", Long.valueOf(tka.mo18096c()));
            contentValues.put("end_time", Long.valueOf(tka.mo18097d()));
        }
    }
}
