package com.google.android.gms.common.stats.net.contentprovider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkUsageChimeraContentProvider extends ContentProvider {

    /* renamed from: a */
    public static final Uri f30374a;

    /* renamed from: b */
    public static final Uri f30375b = Uri.withAppendedPath(f30384k, "networkrawreportAndroidN");

    /* renamed from: c */
    public static final Uri f30376c = Uri.withAppendedPath(f30384k, "networksummaryrangereport");

    /* renamed from: d */
    public static final Uri f30377d = Uri.withAppendedPath(f30384k, "networkentriessummaryreportAndroidN");

    /* renamed from: e */
    public static final Uri f30378e = Uri.withAppendedPath(f30384k, "networktypefortags");

    /* renamed from: f */
    public static final Uri f30379f = Uri.withAppendedPath(f30384k, "networktypefortagsAndroidN");

    /* renamed from: g */
    public static final Uri f30380g = Uri.withAppendedPath(f30384k, "insertorupdatebulk");

    /* renamed from: h */
    public static final Uri f30381h = Uri.withAppendedPath(f30384k, "insertorupdatebulkAndroidN");

    /* renamed from: i */
    public static final Uri f30382i = Uri.withAppendedPath(f30384k, "groupusageinrange");

    /* renamed from: j */
    public static final Uri f30383j = Uri.withAppendedPath(f30384k, "groupusageinrangeAndroidN");

    /* renamed from: k */
    private static final Uri f30384k;

    /* renamed from: l */
    private static final UriMatcher f30385l;

    /* renamed from: m */
    private srp f30386m;

    static {
        Uri parse = Uri.parse("content://com.google.android.gms.common.stats.net.contentprovider");
        f30384k = parse;
        f30374a = Uri.withAppendedPath(parse, "networkrawreport");
        Uri.withAppendedPath(f30384k, "networkentriessummaryreport");
        UriMatcher uriMatcher = new UriMatcher(-1);
        f30385l = uriMatcher;
        uriMatcher.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkrawreport", 10);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkrawreportAndroidN", 11);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "networksummaryrangereport", 20);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkentriessummaryreport", 30);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "networkentriessummaryreportAndroidN", 31);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "networktypefortags", 40);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "networktypefortagsAndroidN", 41);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "insertorupdatebulk", 60);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "insertorupdatebulkAndroidN", 61);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "groupusageinrange", 70);
        f30385l.addURI("com.google.android.gms.common.stats.net.contentprovider", "groupusageinrangeAndroidN", 71);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0100  */
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        String str;
        ContentValues contentValues;
        ContentValues[] contentValuesArr2 = contentValuesArr;
        int match = f30385l.match(uri);
        if (match == 60) {
            str = "network_raw_entry";
        } else if (match == 61) {
            int i = Build.VERSION.SDK_INT;
            if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                return -1;
            }
            str = "network_raw_entry_androidN";
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = this.f30386m.getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                int i2 = 0;
                int i3 = 0;
                while (i2 < contentValuesArr2.length && (contentValues = contentValuesArr2[i2]) != null) {
                    Boolean asBoolean = contentValues.getAsBoolean("is_update");
                    if (asBoolean == null) {
                        Log.e("NetworkUsageCP", "Error bulkInsert: IS_UPDATE_KEY is not set");
                        if (writableDatabase != null) {
                            writableDatabase.endTransaction();
                        }
                        return -1;
                    }
                    long j = -1;
                    if (!asBoolean.booleanValue()) {
                        contentValues.remove("is_update");
                        if (contentValues.containsKey("id_update_row")) {
                            contentValues.remove("id_update_row");
                        }
                        if (writableDatabase.insert(str, null, contentValues) > -1) {
                            i3++;
                        }
                    } else {
                        Long asLong = contentValues.getAsLong("id_update_row");
                        if (asLong != null) {
                            j = asLong.longValue();
                        }
                        if (j >= 0) {
                            String[] strArr = {String.valueOf(j)};
                            contentValues.remove("is_update");
                            contentValues.remove("id_update_row");
                            i3 += writableDatabase.update(str, contentValues, "_id = ?", strArr);
                        } else {
                            Log.e("NetworkUsageCP", "Error bulkInsert: invalid ID_UPDATE_ROW");
                            if (writableDatabase != null) {
                                writableDatabase.endTransaction();
                            }
                            return -1;
                        }
                    }
                    i2++;
                }
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase != null) {
                    writableDatabase.endTransaction();
                }
                return i3;
            } catch (SQLiteException e) {
                e = e;
                sQLiteDatabase = writableDatabase;
                try {
                    Log.e("NetworkUsageCP", String.valueOf(e.getMessage()));
                    if (sQLiteDatabase != null) {
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = writableDatabase;
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("NetworkUsageCP", String.valueOf(e.getMessage()));
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            throw th;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        int match = f30385l.match(uri);
        if (match == 10) {
            str2 = "network_raw_entry";
            sQLiteDatabase = this.f30386m.getWritableDatabase();
        } else if (match == 11) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                    return -1;
                }
                str2 = "network_raw_entry_androidN";
                sQLiteDatabase = this.f30386m.getWritableDatabase();
            } catch (SQLiteException e) {
                Log.e("NetworkUsageCP", String.valueOf(e.getMessage()));
                return -1;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
        }
        int delete = sQLiteDatabase.delete(str2, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return delete;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = f30385l.match(uri);
        if (match == 10) {
            Cursor query = this.f30386m.getWritableDatabase().query("network_raw_entry", strArr, str, strArr2, null, null, str2);
            query.setNotificationUri(getContext().getContentResolver(), uri);
            return query;
        } else if (match == 11) {
            int i = Build.VERSION.SDK_INT;
            if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                return null;
            }
            Cursor query2 = this.f30386m.getWritableDatabase().query("network_raw_entry_androidN", strArr, str, strArr2, null, null, str2);
            query2.setNotificationUri(getContext().getContentResolver(), uri);
            return query2;
        } else if (match == 20) {
            Cursor rawQuery = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, SUM(rxbytes) AS rxbytes, SUM(rxpackets) AS rxpackets, SUM(txbytes) AS txbytes, SUM(txpackets) AS txpackets FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND iface = ? AND tag = ? AND uid = ? AND counter_set = ? AND device_state = ? AND transport_type = ? GROUP BY iface, transport_type, tag, uid", strArr2);
            rawQuery.setNotificationUri(getContext().getContentResolver(), uri);
            return rawQuery;
        } else if (match == 30) {
            Cursor rawQuery2 = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, iface, tag, uid, device_state, transport_type, MIN(datetime_updated) AS from_datetime_updated, MAX(datetime_updated) AS to_datetime_updated, TOTAL(CASE WHEN counter_set = 0 THEN rxbytes ELSE 0 END) AS background_rxbytes, TOTAL(CASE WHEN counter_set = 0 THEN rxpackets ELSE 0 END) AS background_rxpackets, TOTAL(CASE WHEN counter_set = 0 THEN txbytes ELSE 0 END) AS background_txbytes, TOTAL(CASE WHEN counter_set = 0 THEN txpackets ELSE 0 END) AS background_txpackets, TOTAL(CASE WHEN counter_set = 1 THEN rxbytes ELSE 0 END) AS foreground_rxbytes, TOTAL(CASE WHEN counter_set = 1 THEN rxpackets ELSE 0 END) AS foreground_rxpackets, TOTAL(CASE WHEN counter_set = 1 THEN txbytes ELSE 0 END) AS foreground_txbytes, TOTAL(CASE WHEN counter_set = 1 THEN txpackets ELSE 0 END) AS foreground_txpackets, TOTAL(rxbytes + txbytes) AS total_bytes FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? GROUP BY iface, tag, uid, device_state, transport_type ORDER BY total_bytes DESC , tag DESC", strArr2);
            rawQuery2.setNotificationUri(getContext().getContentResolver(), uri);
            return rawQuery2;
        } else if (match == 31) {
            int i2 = Build.VERSION.SDK_INT;
            if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                return null;
            }
            Cursor rawQuery3 = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, rxbytes_androidN, txbytes_androidN, rxpackets_androidN, txpackets_androidN, TOTAL(rxbytes_androidN + txbytes_androidN) AS total_bytes_androidN, rxpackets_androidN, txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? GROUP BY tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN ORDER BY total_bytes_androidN DESC , tag_androidN DESC", strArr2);
            rawQuery3.setNotificationUri(getContext().getContentResolver(), uri);
            return rawQuery3;
        } else if (match == 40) {
            Cursor rawQuery4 = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, transport_type, tag, uid, device_state, MIN(datetime_updated) AS from_datetime_updated, MAX(datetime_updated) AS to_datetime_updated, TOTAL(CASE WHEN counter_set = 0 THEN rxbytes ELSE 0 END) AS background_rxbytes, TOTAL(CASE WHEN counter_set = 0 THEN rxpackets ELSE 0 END) AS background_rxpackets, TOTAL(CASE WHEN counter_set = 0 THEN txbytes ELSE 0 END) AS background_txbytes, TOTAL(CASE WHEN counter_set = 0 THEN txpackets ELSE 0 END) AS background_txpackets, TOTAL(CASE WHEN counter_set = 1 THEN rxbytes ELSE 0 END) AS foreground_rxbytes, TOTAL(CASE WHEN counter_set = 1 THEN rxpackets ELSE 0 END) AS foreground_rxpackets, TOTAL(CASE WHEN counter_set = 1 THEN txbytes ELSE 0 END) AS foreground_txbytes, TOTAL(CASE WHEN counter_set = 1 THEN txpackets ELSE 0 END) AS foreground_txpackets, TOTAL(rxbytes + txbytes) AS total_bytes FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? AND transport_type = ? AND tag != 0 GROUP BY transport_type, tag ORDER BY total_bytes DESC , tag DESC", strArr2);
            rawQuery4.setNotificationUri(getContext().getContentResolver(), uri);
            return rawQuery4;
        } else if (match == 41) {
            int i3 = Build.VERSION.SDK_INT;
            if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                return null;
            }
            Cursor rawQuery5 = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, transport_type_androidN, tag_androidN, uid_androidN, device_state_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, rxbytes_androidN, txbytes_androidN, TOTAL(rxbytes_androidN + txbytes_androidN) AS total_bytes_androidN, rxpackets_androidN, txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? AND transport_type_androidN = ? AND tag_androidN != 0 GROUP BY transport_type_androidN, tag_androidN ORDER BY total_bytes_androidN DESC , tag_androidN DESC", strArr2);
            rawQuery5.setNotificationUri(getContext().getContentResolver(), uri);
            return rawQuery5;
        } else if (match == 70) {
            Cursor rawQuery6 = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, iface, tag, uid, counter_set, device_state, transport_type, MAX(datetime_updated) AS datetime_updated, COUNT(*) AS row_group_count, SUM(rxbytes) AS rxbytes, SUM(rxpackets) AS rxpackets, SUM(txbytes) AS txbytes, SUM(txpackets) AS txpackets FROM network_raw_entry WHERE datetime_updated BETWEEN ? AND ? GROUP BY iface, tag, uid, counter_set, device_state, transport_type ORDER BY datetime_updated DESC ", strArr2);
            rawQuery6.setNotificationUri(getContext().getContentResolver(), uri);
            return rawQuery6;
        } else if (match == 71) {
            try {
                int i4 = Build.VERSION.SDK_INT;
                if (!((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                    return null;
                }
                Cursor rawQuery7 = this.f30386m.getWritableDatabase().rawQuery("SELECT MAX(_id) AS _id, tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN, MAX(datetime_updated_androidN) AS datetime_updated_androidN, from_datetime_updated_androidN, to_datetime_updated_androidN, COUNT(*) AS row_group_count_AndroidN, SUM(rxbytes_androidN) AS rxbytes_androidN, SUM(rxpackets_androidN) AS rxpackets_androidN, SUM(txbytes_androidN) AS txbytes_androidN, SUM(txpackets_androidN) AS txpackets_androidN FROM network_raw_entry_androidN WHERE from_datetime_updated_androidN >= ? AND to_datetime_updated_androidN <= ? GROUP BY tag_androidN, uid_androidN, device_state_androidN, transport_type_androidN ORDER BY datetime_updated_androidN DESC ", strArr2);
                rawQuery7.setNotificationUri(getContext().getContentResolver(), uri);
                return rawQuery7;
            } catch (SQLiteException e) {
                Log.e("NetworkUsageCP", String.valueOf(e.getMessage()));
                return null;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
        }
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            return null;
        }
        if (f30385l.match(uri) == 10) {
            try {
                long insert = this.f30386m.getWritableDatabase().insert("network_raw_entry", null, contentValues);
                getContext().getContentResolver().notifyChange(uri, null);
                StringBuilder sb = new StringBuilder(37);
                sb.append("networkrawreport");
                sb.append("/");
                sb.append(insert);
                return Uri.parse(sb.toString());
            } catch (SQLiteException e) {
                Log.e("NetworkUsageCP", String.valueOf(e.getMessage()));
                return null;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb2.append("Unknown URI: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(String.format(sb2.toString(), new Object[0]));
        }
    }

    public final boolean onCreate() {
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            this.f30386m = new slz(getContext());
            return true;
        }
        this.f30386m = new sma(getContext());
        return true;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            return -1;
        }
        if (f30385l.match(uri) == 10) {
            try {
                int update = this.f30386m.getWritableDatabase().update("network_raw_entry", contentValues, str, strArr);
                getContext().getContentResolver().notifyChange(uri, null);
                return update;
            } catch (SQLiteException e) {
                Log.e("NetworkUsageCP", String.valueOf(e.getMessage()));
                return -1;
            }
        } else {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Unknown URI: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(String.format(sb.toString(), new Object[0]));
        }
    }
}
