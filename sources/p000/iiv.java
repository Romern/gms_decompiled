package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: iiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iiv extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        iiw.f21076a.mo25414c("Creating database %s...", "auth.proximity.permit_store");
        imu.m15735a(sQLiteDatabase, "permit", ija.f21081a, ija.f21082b);
        imu.m15735a(sQLiteDatabase, "permit__requester_access", ijb.f21084a, ijb.f21085b);
        for (String[] strArr : ija.f21083c) {
            imu.m15734a(sQLiteDatabase, "permit", strArr);
        }
        for (String[] strArr2 : ijb.f21086c) {
            imu.m15734a(sQLiteDatabase, "permit__requester_access", strArr2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        iiw.f21076a.mo25414c("Opening database %s...", "auth.proximity.permit_store");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        iiw.f21076a.mo25416d("Downgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2));
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type IN ('table','view') AND name NOT LIKE 'sqlite_%'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN ('table','view')  ORDER BY 1 ", null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    String valueOf = String.valueOf(rawQuery.getString(0));
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                } finally {
                    rawQuery.close();
                }
            }
        }
        onCreate(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        iiw.f21076a.mo25414c("Upgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            imu.m15733a(sQLiteDatabase, "permit", "license__name", "STRING", "''");
            imu.m15733a(sQLiteDatabase, "permit", "license__is_unlockable", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit", "license__is_unlock_key", "INTEGER", "1");
            imu.m15733a(sQLiteDatabase, "permit", "license__is_mobile_hotspot_supported", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "name", "STRING", "''");
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "is_unlockable", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "is_unlock_key", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "is_mobile_hotspot_supported", "INTEGER", "0");
            i++;
        }
        if (i < 3) {
            imu.m15733a(sQLiteDatabase, "permit", "license__bt_mac_address", "STRING", (String) null);
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "bt_mac_address", "STRING", (String) null);
            i++;
        }
        if (i < 4) {
            imu.m15733a(sQLiteDatabase, "permit", "license__device_type", "STRING", (String) null);
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "device_type", "STRING", (String) null);
            imu.m15733a(sQLiteDatabase, "permit", "license__beacon_seeds", "BLOB", (String) null);
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "beacon_seeds", "BLOB", (String) null);
            i++;
        }
        if (i < 5) {
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "last_update_time", "INTEGER", "0");
            i++;
        }
        if (i < 6) {
            imu.m15733a(sQLiteDatabase, "permit", "license__is_pixel_phone", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit", "license__is_arc_plus_plus", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "is_pixel_phone", "INTEGER", "0");
            imu.m15733a(sQLiteDatabase, "permit__requester_access", "is_arc_plus_plus", "INTEGER", "0");
        }
    }

    public iiv(Context context, String str) {
        super(context, str, str, 6);
    }
}
