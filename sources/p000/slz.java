package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: slz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class slz extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry_androidN (_id INTEGER PRIMARY KEY, datetime_updated_androidN INTEGER, from_datetime_updated_androidN INTEGER, to_datetime_updated_androidN INTEGER, tag_androidN INTEGER, uid_androidN INTEGER, device_state_androidN INTEGER, transport_type_androidN INTEGER, rxbytes_androidN INTEGER, rxpackets_androidN INTEGER, txbytes_androidN INTEGER, txpackets_androidN INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network_raw_entry_androidN");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry_androidN (_id INTEGER PRIMARY KEY, datetime_updated_androidN INTEGER, from_datetime_updated_androidN INTEGER, to_datetime_updated_androidN INTEGER, tag_androidN INTEGER, uid_androidN INTEGER, device_state_androidN INTEGER, transport_type_androidN INTEGER, rxbytes_androidN INTEGER, rxpackets_androidN INTEGER, txbytes_androidN INTEGER, txpackets_androidN INTEGER)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 > i) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network_raw_entry_androidN");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS network_raw_entry_androidN (_id INTEGER PRIMARY KEY, datetime_updated_androidN INTEGER, from_datetime_updated_androidN INTEGER, to_datetime_updated_androidN INTEGER, tag_androidN INTEGER, uid_androidN INTEGER, device_state_androidN INTEGER, transport_type_androidN INTEGER, rxbytes_androidN INTEGER, rxpackets_androidN INTEGER, txbytes_androidN INTEGER, txpackets_androidN INTEGER)");
        }
    }

    public slz(Context context) {
        super(context, "NetworkUsageAndroidNPlus.db", "NetworkUsageAndroidNPlus.db", 2);
    }
}
