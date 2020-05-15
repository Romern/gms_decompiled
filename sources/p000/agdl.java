package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: agdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agdl extends agmg {

    /* renamed from: a */
    public static final String[] f65302a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: b */
    public static final String[] f65303b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: c */
    public static final String[] f65304c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: d */
    public static final String[] f65305d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: e */
    public static final String[] f65306e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: f */
    public static final String[] f65307f = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: g */
    public static final String[] f65308g = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: h */
    public static final String[] f65309h = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: i */
    public final agmc f65310i = new agmc(mo35534A());

    /* renamed from: k */
    private final agdk f65311k = new agdk(this, mo35542z(), mo35361f());

    public agdl(agmn agmn) {
        super(agmn);
    }

    /* renamed from: a */
    static final void m54061a(ContentValues contentValues, String str, Object obj) {
        sdo.m34977c(str);
        sdo.m34959a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final agcv mo35349b(String str) {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        long j3;
        String str2 = str;
        sdo.m34977c(str);
        mo35241h();
        mo35659q();
        try {
            cursor2 = mo35360e().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new String[]{str2}, null, null, null);
            try {
                if (cursor2.moveToFirst()) {
                    try {
                        agcv agcv = new agcv(this.f65930j.f65953g, str2);
                        agcv.mo35250a(cursor2.getString(0));
                        agcv.mo35254b(cursor2.getString(1));
                        agcv.mo35262d(cursor2.getString(2));
                        agcv.mo35270g(cursor2.getLong(3));
                        agcv.mo35249a(cursor2.getLong(4));
                        agcv.mo35253b(cursor2.getLong(5));
                        agcv.mo35268f(cursor2.getString(6));
                        agcv.mo35271g(cursor2.getString(7));
                        agcv.mo35261d(cursor2.getLong(8));
                        agcv.mo35264e(cursor2.getLong(9));
                        agcv.mo35251a(cursor2.isNull(10) || cursor2.getInt(10) != 0);
                        long j4 = cursor2.getLong(11);
                        agcv.f65240a.mo35512p();
                        agcv.f65250k |= agcv.f65243d != j4;
                        agcv.f65243d = j4;
                        long j5 = cursor2.getLong(12);
                        agcv.f65240a.mo35512p();
                        agcv.f65250k |= agcv.f65244e != j5;
                        agcv.f65244e = j5;
                        long j6 = cursor2.getLong(13);
                        agcv.f65240a.mo35512p();
                        agcv.f65250k |= agcv.f65245f != j6;
                        agcv.f65245f = j6;
                        long j7 = cursor2.getLong(14);
                        agcv.f65240a.mo35512p();
                        boolean z6 = agcv.f65250k;
                        if (agcv.f65246g != j7) {
                            z = true;
                        } else {
                            z = false;
                        }
                        agcv.f65250k = z6 | z;
                        agcv.f65246g = j7;
                        agcv.mo35273h(cursor2.getLong(15));
                        agcv.mo35276i(cursor2.getLong(16));
                        if (!cursor2.isNull(17)) {
                            j = (long) cursor2.getInt(17);
                        } else {
                            j = -2147483648L;
                        }
                        agcv.mo35257c(j);
                        agcv.mo35265e(cursor2.getString(18));
                        long j8 = cursor2.getLong(19);
                        agcv.f65240a.mo35512p();
                        boolean z7 = agcv.f65250k;
                        if (agcv.f65247h != j8) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        agcv.f65250k = z7 | z2;
                        agcv.f65247h = j8;
                        long j9 = cursor2.getLong(20);
                        agcv.f65240a.mo35512p();
                        boolean z8 = agcv.f65250k;
                        if (agcv.f65248i != j9) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        agcv.f65250k = z8 | z3;
                        agcv.f65248i = j9;
                        agcv.mo35274h(cursor2.getString(21));
                        if (!mo35538v().mo35314a(aghn.f65472aA)) {
                            if (!cursor2.isNull(22)) {
                                j3 = cursor2.getLong(22);
                            } else {
                                j3 = 0;
                            }
                            agcv.mo35278j(j3);
                        }
                        if (cursor2.isNull(23) || cursor2.getInt(23) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        agcv.mo35255b(z4);
                        if (cursor2.isNull(24) || cursor2.getInt(24) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        agcv.mo35259c(z5);
                        agcv.mo35258c(cursor2.getString(25));
                        if (!cursor2.isNull(26)) {
                            j2 = cursor2.getLong(26);
                        } else {
                            j2 = 0;
                        }
                        agcv.mo35267f(j2);
                        if (!cursor2.isNull(27)) {
                            List asList = Arrays.asList(cursor2.getString(27).split(",", -1));
                            agcv.f65240a.mo35512p();
                            List list = agcv.f65242c;
                            int i = agms.f65976a;
                            if (list != null || asList != null) {
                                if (list == null || !list.equals(asList)) {
                                    agcv.f65250k = true;
                                    agcv.f65242c = asList != null ? new ArrayList(asList) : null;
                                }
                            }
                        }
                        cfjt.m139846c();
                        agcv.f65240a.mo35512p();
                        agcv.f65250k = false;
                        if (cursor2.moveToNext()) {
                            mo35497E().f65564c.mo35436a("Got multiple records for app, expected one. appId", agid.m54288a(str));
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return agcv;
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            mo35497E().f65564c.mo35437a("Error querying app. appId", agid.m54288a(str), e);
                            if (cursor2 == null) {
                                return null;
                            }
                            cursor2.close();
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    if (cursor2 == null) {
                        return null;
                    }
                    cursor2.close();
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                mo35497E().f65564c.mo35437a("Error querying app. appId", agid.m54288a(str), e);
                if (cursor2 == null) {
                }
                cursor2.close();
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor2 = null;
            mo35497E().f65564c.mo35437a("Error querying app. appId", agid.m54288a(str), e);
            if (cursor2 == null) {
            }
            cursor2.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* renamed from: c */
    public final agmr mo35354c(String str, String str2) {
        Cursor cursor;
        String str3 = str2;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35659q();
        Cursor cursor2 = null;
        try {
            cursor = mo35360e().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (cursor.moveToFirst()) {
                    try {
                        agmr agmr = new agmr(str, cursor.getString(2), str2, cursor.getLong(0), mo35339a(cursor, 1));
                        if (cursor.moveToNext()) {
                            mo35497E().f65564c.mo35436a("Got multiple records for user property, expected one. appId", agid.m54288a(str));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return agmr;
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            mo35497E().f65564c.mo35438a("Error querying user property. appId", agid.m54288a(str), mo35541y().mo35426c(str3), e);
                            if (cursor != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                mo35497E().f65564c.mo35438a("Error querying user property. appId", agid.m54288a(str), mo35541y().mo35426c(str3), e);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            mo35497E().f65564c.mo35438a("Error querying user property. appId", agid.m54288a(str), mo35541y().mo35426c(str3), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    public final ConditionalUserPropertyParcel mo35357d(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        String str3 = str2;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35659q();
        try {
            cursor2 = mo35360e().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (cursor2.moveToFirst()) {
                    String string = cursor2.getString(0);
                    try {
                        Object a = mo35339a(cursor2, 1);
                        boolean z = cursor2.getInt(2) != 0;
                        String string2 = cursor2.getString(3);
                        long j = cursor2.getLong(4);
                        ConditionalUserPropertyParcel conditionalUserPropertyParcel = new ConditionalUserPropertyParcel(str, string, new UserAttributeParcel(str2, cursor2.getLong(8), a, string), cursor2.getLong(6), z, string2, (EventParcel) mo35657o().mo35708a(cursor2.getBlob(5), EventParcel.CREATOR), j, (EventParcel) mo35657o().mo35708a(cursor2.getBlob(7), EventParcel.CREATOR), cursor2.getLong(9), (EventParcel) mo35657o().mo35708a(cursor2.getBlob(10), EventParcel.CREATOR));
                        if (cursor2.moveToNext()) {
                            mo35497E().f65564c.mo35437a("Got multiple records for conditional property, expected one", agid.m54288a(str), mo35541y().mo35426c(str3));
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return conditionalUserPropertyParcel;
                    } catch (SQLiteException e) {
                        e = e;
                        try {
                            mo35497E().f65564c.mo35438a("Error querying conditional property", agid.m54288a(str), mo35541y().mo35426c(str3), e);
                            if (cursor2 == null) {
                            }
                            cursor2.close();
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    if (cursor2 == null) {
                        return null;
                    }
                    cursor2.close();
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                mo35497E().f65564c.mo35438a("Error querying conditional property", agid.m54288a(str), mo35541y().mo35426c(str3), e);
                if (cursor2 == null) {
                }
                cursor2.close();
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor2 = null;
            mo35497E().f65564c.mo35438a("Error querying conditional property", agid.m54288a(str), mo35541y().mo35426c(str3), e);
            if (cursor2 == null) {
                return null;
            }
            cursor2.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo35359e(String str, String str2) {
        long a;
        String str3 = str;
        String str4 = str2;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35659q();
        SQLiteDatabase e = mo35360e();
        e.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(str2.length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                a = mo35335a(sb.toString(), new String[]{str3}, -1);
                if (a == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (e.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        mo35497E().f65564c.mo35437a("Failed to insert column (got -1). appId", agid.m54288a(str), str4);
                        e.endTransaction();
                        return -1;
                    }
                    a = 0;
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo35497E().f65564c.mo35438a("Error inserting column. appId", agid.m54288a(str), str4, e);
                    e.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    e.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + a));
                if (((long) e.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    mo35497E().f65564c.mo35437a("Failed to update column (got 0). appId", agid.m54288a(str), str4);
                    e.endTransaction();
                    return -1;
                }
                e.setTransactionSuccessful();
                e.endTransaction();
                return a;
            } catch (SQLiteException e3) {
                e = e3;
                j = a;
                mo35497E().f65564c.mo35438a("Error inserting column. appId", agid.m54288a(str), str4, e);
                e.endTransaction();
                return j;
            }
        } catch (SQLiteException e4) {
            e = e4;
            mo35497E().f65564c.mo35438a("Error inserting column. appId", agid.m54288a(str), str4, e);
            e.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            e.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo35361f() {
        mo35538v();
        return "google_app_measurement.db";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* renamed from: g */
    public final String mo35363g() {
        Throwable th;
        SQLiteException e;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = mo35360e().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo35497E().f65564c.mo35436a("Database error getting next bundle app id", e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    cursor2 = cursor;
                    th = th2;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            mo35497E().f65564c.mo35436a("Database error getting next bundle app id", e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo35364k() {
        mo35241h();
        mo35659q();
        if (mo35365l()) {
            long a = mo35539w().f65622g.mo35458a();
            long b = mo35534A().mo20506b();
            long abs = Math.abs(b - a);
            mo35538v();
            if (abs > ((Long) aghn.f65523x.mo35389a()).longValue()) {
                mo35539w().f65622g.mo35459a(b);
                mo35241h();
                mo35659q();
                if (mo35365l()) {
                    SQLiteDatabase e = mo35360e();
                    mo35538v();
                    int delete = e.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo35534A().mo20505a()), String.valueOf(agdi.m54040o())});
                    if (delete > 0) {
                        mo35497E().f65572k.mo35436a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo35365l() {
        return mo35542z().getDatabasePath(mo35361f()).exists();
    }

    /* renamed from: f */
    public final void mo35362f(String str, String str2) {
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35659q();
        try {
            mo35360e().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35438a("Error deleting conditional property", agid.m54288a(str), mo35541y().mo35426c(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* renamed from: a */
    public final long mo35334a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo35360e().rawQuery(str, strArr);
            try {
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo35497E().f65564c.mo35437a("Database error", str, e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            mo35497E().f65564c.mo35437a("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* renamed from: a */
    public final long mo35335a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = mo35360e().rawQuery(str, strArr);
            try {
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return j2;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo35497E().f65564c.mo35437a("Database error", str, e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            mo35497E().f65564c.mo35437a("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo35355c() {
        mo35659q();
        mo35360e().setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35356c(String str) {
        mo35659q();
        mo35241h();
        sdo.m34977c(str);
        try {
            SQLiteDatabase e = mo35360e();
            String[] strArr = {str};
            int delete = e.delete("events", "app_id=?", strArr) + e.delete("user_attributes", "app_id=?", strArr) + e.delete("conditional_properties", "app_id=?", strArr) + e.delete("apps", "app_id=?", strArr) + e.delete("raw_events", "app_id=?", strArr) + e.delete("raw_events_metadata", "app_id=?", strArr) + e.delete("event_filters", "app_id=?", strArr) + e.delete("property_filters", "app_id=?", strArr) + e.delete("audience_filter_values", "app_id=?", strArr);
            if (delete > 0) {
                mo35497E().f65572k.mo35437a("Deleted application data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            mo35497E().f65564c.mo35437a("Error deleting application data. appId, error", agid.m54288a(str), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* renamed from: a */
    public final agdj mo35336a(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor cursor;
        sdo.m34977c(str);
        mo35241h();
        mo35659q();
        String[] strArr = {str};
        agdj agdj = new agdj();
        try {
            SQLiteDatabase e = mo35360e();
            SQLiteDatabase sQLiteDatabase = e;
            cursor = e.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    mo35497E().f65567f.mo35436a("Not updating daily counts, app is not known. appId", agid.m54288a(str));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return agdj;
                }
                if (cursor.getLong(0) == j) {
                    agdj.f65297b = cursor.getLong(1);
                    agdj.f65296a = cursor.getLong(2);
                    agdj.f65298c = cursor.getLong(3);
                    agdj.f65299d = cursor.getLong(4);
                    agdj.f65300e = cursor.getLong(5);
                }
                if (z) {
                    agdj.f65297b += j2;
                }
                if (z2) {
                    agdj.f65296a += j2;
                }
                if (z3) {
                    agdj.f65298c += j2;
                }
                if (z4) {
                    agdj.f65299d += j2;
                }
                if (z5) {
                    agdj.f65300e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(agdj.f65296a));
                contentValues.put("daily_events_count", Long.valueOf(agdj.f65297b));
                contentValues.put("daily_conversions_count", Long.valueOf(agdj.f65298c));
                contentValues.put("daily_error_events_count", Long.valueOf(agdj.f65299d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(agdj.f65300e));
                sQLiteDatabase.update("apps", contentValues, "app_id=?", strArr);
                if (cursor != null) {
                    cursor.close();
                }
                return agdj;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo35497E().f65564c.mo35437a("Error updating daily counts. appId", agid.m54288a(str), e);
                    if (cursor != null) {
                    }
                    return agdj;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            mo35497E().f65564c.mo35437a("Error updating daily counts. appId", agid.m54288a(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return agdj;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final SQLiteDatabase mo35360e() {
        mo35241h();
        try {
            return this.f65311k.getWritableDatabase();
        } catch (SQLiteException e) {
            mo35497E().f65567f.mo35436a("Error opening database", e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void mo35358d() {
        mo35659q();
        mo35360e().endTransaction();
    }

    /* renamed from: b */
    public final List mo35350b(String str, String str2, String str3) {
        sdo.m34977c(str);
        mo35241h();
        mo35659q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo35351b(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: a */
    public final agdj mo35337a(long j, String str, boolean z, boolean z2) {
        return mo35336a(j, str, 1, false, false, z, false, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016e  */
    /* renamed from: a */
    public final agdr mo35338a(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        long j;
        Long l;
        Long l2;
        Long l3;
        Boolean bool;
        long j2;
        String str3 = str2;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35659q();
        boolean z = false;
        Cursor cursor3 = null;
        try {
            Cursor query = mo35360e().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    long j3 = query.getLong(0);
                    long j4 = query.getLong(1);
                    long j5 = query.getLong(2);
                    if (!query.isNull(3)) {
                        j = query.getLong(3);
                    } else {
                        j = 0;
                    }
                    if (!query.isNull(4)) {
                        l = Long.valueOf(query.getLong(4));
                    } else {
                        l = null;
                    }
                    if (!query.isNull(5)) {
                        l2 = Long.valueOf(query.getLong(5));
                    } else {
                        l2 = null;
                    }
                    if (!query.isNull(6)) {
                        l3 = Long.valueOf(query.getLong(6));
                    } else {
                        l3 = null;
                    }
                    if (!query.isNull(7)) {
                        if (query.getLong(7) == 1) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } else {
                        bool = null;
                    }
                    if (!query.isNull(8)) {
                        j2 = query.getLong(8);
                    } else {
                        j2 = 0;
                    }
                    long j6 = j5;
                    cursor2 = query;
                    try {
                        agdr agdr = new agdr(str, str2, j3, j4, j2, j6, j, l, l2, l3, bool);
                        if (cursor2.moveToNext()) {
                            mo35497E().f65564c.mo35436a("Got multiple records for event aggregates, expected one. appId", agid.m54288a(str));
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return agdr;
                    } catch (SQLiteException e) {
                        e = e;
                        cursor = cursor2;
                        try {
                            mo35497E().f65564c.mo35438a("Error querying events. appId", agid.m54288a(str), mo35541y().mo35422a(str2), e);
                            if (cursor != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor3 = cursor;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor3 = cursor2;
                        if (cursor3 != null) {
                        }
                        throw th;
                    }
                } else {
                    Cursor cursor4 = query;
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = query;
                cursor = cursor2;
                mo35497E().f65564c.mo35438a("Error querying events. appId", agid.m54288a(str), mo35541y().mo35422a(str2), e);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                cursor3 = cursor2;
                if (cursor3 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            mo35497E().f65564c.mo35438a("Error querying events. appId", agid.m54288a(str), mo35541y().mo35422a(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0177  */
    /* renamed from: b */
    public final List mo35351b(String str, String[] strArr) {
        Cursor cursor;
        mo35241h();
        mo35659q();
        ArrayList arrayList = new ArrayList();
        try {
            mo35538v();
            Cursor query = mo35360e().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            try {
                if (query.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        mo35538v();
                        if (size >= 1000) {
                            agib agib = mo35497E().f65564c;
                            mo35538v();
                            agib.mo35436a("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        try {
                            Object a = mo35339a(query, 3);
                            boolean z = query.getInt(4) != 0;
                            String string4 = query.getString(5);
                            long j = query.getLong(6);
                            arrayList.add(new ConditionalUserPropertyParcel(string, string2, new UserAttributeParcel(string3, query.getLong(10), a, string2), query.getLong(8), z, string4, (EventParcel) mo35657o().mo35708a(query.getBlob(7), EventParcel.CREATOR), j, (EventParcel) mo35657o().mo35708a(query.getBlob(9), EventParcel.CREATOR), query.getLong(11), (EventParcel) mo35657o().mo35708a(query.getBlob(12), EventParcel.CREATOR)));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            cursor = query;
                            try {
                                mo35497E().f65564c.mo35436a("Error querying conditional user property value", e);
                                List emptyList = Collections.emptyList();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return emptyList;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                mo35497E().f65564c.mo35436a("Error querying conditional user property value", e);
                List emptyList2 = Collections.emptyList();
                if (cursor != null) {
                }
                return emptyList2;
            } catch (Throwable th3) {
                th = th3;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            mo35497E().f65564c.mo35436a("Error querying conditional user property value", e);
            List emptyList22 = Collections.emptyList();
            if (cursor != null) {
            }
            return emptyList22;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo35339a(Cursor cursor, int i) {
        int i2 = Build.VERSION.SDK_INT;
        int type = cursor.getType(i);
        if (type == 0) {
            mo35497E().f65564c.mo35435a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo35497E().f65564c.mo35436a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo35497E().f65564c.mo35435a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo35352b() {
        mo35659q();
        mo35360e().beginTransaction();
    }

    /* renamed from: b */
    public final void mo35353b(String str, String str2) {
        sdo.m34977c(str);
        sdo.m34977c(str2);
        mo35241h();
        mo35659q();
        try {
            mo35360e().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35438a("Error deleting user property. appId", agid.m54288a(str), mo35541y().mo35426c(str2), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* renamed from: a */
    public final List mo35340a(String str) {
        Cursor cursor;
        String str2;
        sdo.m34977c(str);
        mo35241h();
        mo35659q();
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            mo35538v();
            cursor = mo35360e().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            try {
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 != null) {
                            str2 = string2;
                        } else {
                            str2 = "";
                        }
                        long j = cursor.getLong(2);
                        try {
                            Object a = mo35339a(cursor, 3);
                            if (a != null) {
                                arrayList.add(new agmr(str, str2, string, j, a));
                            } else {
                                mo35497E().f65564c.mo35436a("Read invalid user property value, ignoring it. appId", agid.m54288a(str));
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            try {
                                mo35497E().f65564c.mo35437a("Error querying user properties. appId", agid.m54288a(str), e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                throw th;
                            }
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                mo35497E().f65564c.mo35437a("Error querying user properties. appId", agid.m54288a(str), e);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            mo35497E().f65564c.mo35437a("Error querying user properties. appId", agid.m54288a(str), e);
            if (cursor != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010c, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0129, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final List mo35341a(String str, String str2, String str3) {
        Cursor cursor;
        Cursor cursor2;
        String str4;
        sdo.m34977c(str);
        mo35241h();
        mo35659q();
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(str);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                str4 = str2;
                arrayList2.add(str4);
                sb.append(" and origin=?");
            } else {
                str4 = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(String.valueOf(str3).concat("*"));
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb2 = sb.toString();
            mo35538v();
            int i = 2;
            cursor2 = mo35360e().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
            try {
                if (cursor2.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        mo35538v();
                        if (size >= 1000) {
                            agib agib = mo35497E().f65564c;
                            mo35538v();
                            agib.mo35436a("Read more than the max allowed user properties, ignoring excess", 1000);
                            break;
                        }
                        String string = cursor2.getString(0);
                        long j = cursor2.getLong(1);
                        try {
                            Object a = mo35339a(cursor2, i);
                            str4 = cursor2.getString(3);
                            if (a != null) {
                                arrayList.add(new agmr(str, str4, string, j, a));
                            } else {
                                mo35497E().f65564c.mo35438a("(2)Read invalid user property value, ignoring it", agid.m54288a(str), str4, str3);
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            i = 2;
                        } catch (SQLiteException e) {
                            e = e;
                            try {
                                mo35497E().f65564c.mo35438a("(2)Error querying user properties", agid.m54288a(str), str4, e);
                                if (cursor2 != null) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursor2;
                                if (cursor != null) {
                                }
                                throw th;
                            }
                        }
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return arrayList;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                mo35497E().f65564c.mo35438a("(2)Error querying user properties", agid.m54288a(str), str4, e);
                if (cursor2 != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str4 = str2;
            cursor2 = null;
            mo35497E().f65564c.mo35438a("(2)Error querying user properties", agid.m54288a(str), str4, e);
            if (cursor2 != null) {
            }
        } catch (Throwable th3) {
        }
    }

    /* renamed from: a */
    public final void mo35342a(agcv agcv) {
        sdo.m34959a(agcv);
        mo35241h();
        mo35659q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", agcv.mo35248a());
        contentValues.put("app_instance_id", agcv.mo35252b());
        contentValues.put("gmp_app_id", agcv.mo35256c());
        contentValues.put("resettable_device_id_hash", agcv.mo35263e());
        contentValues.put("last_bundle_index", Long.valueOf(agcv.mo35284p()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(agcv.mo35269g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(agcv.mo35272h()));
        contentValues.put("app_version", agcv.mo35275i());
        contentValues.put("app_store", agcv.mo35279k());
        contentValues.put("gmp_version", Long.valueOf(agcv.mo35280l()));
        contentValues.put("dev_cert_hash", Long.valueOf(agcv.mo35281m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(agcv.mo35283o()));
        agcv.f65240a.mo35512p();
        contentValues.put("day", Long.valueOf(agcv.f65243d));
        agcv.f65240a.mo35512p();
        contentValues.put("daily_public_events_count", Long.valueOf(agcv.f65244e));
        agcv.f65240a.mo35512p();
        contentValues.put("daily_events_count", Long.valueOf(agcv.f65245f));
        agcv.f65240a.mo35512p();
        contentValues.put("daily_conversions_count", Long.valueOf(agcv.f65246g));
        contentValues.put("config_fetched_time", Long.valueOf(agcv.mo35285q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(agcv.mo35286r()));
        contentValues.put("app_version_int", Long.valueOf(agcv.mo35277j()));
        contentValues.put("firebase_instance_id", agcv.mo35266f());
        agcv.f65240a.mo35512p();
        contentValues.put("daily_error_events_count", Long.valueOf(agcv.f65247h));
        agcv.f65240a.mo35512p();
        contentValues.put("daily_realtime_events_count", Long.valueOf(agcv.f65248i));
        contentValues.put("health_monitor_sample", agcv.mo35288t());
        contentValues.put("android_id", Long.valueOf(agcv.mo35289u()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(agcv.mo35290v()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(agcv.mo35291w()));
        contentValues.put("admob_app_id", agcv.mo35260d());
        contentValues.put("dynamite_version", Long.valueOf(agcv.mo35282n()));
        if (agcv.mo35293y() != null) {
            if (agcv.mo35293y().size() == 0) {
                mo35497E().f65567f.mo35436a("Safelisted events should not be an empty list. appId", agcv.mo35248a());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", agcv.mo35293y()));
            }
        }
        cfjt.m139846c();
        try {
            SQLiteDatabase e = mo35360e();
            if (((long) e.update("apps", contentValues, "app_id = ?", new String[]{agcv.mo35248a()})) == 0 && e.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo35497E().f65564c.mo35436a("Failed to insert/update app (got -1). appId", agid.m54288a(agcv.mo35248a()));
            }
        } catch (SQLiteException e2) {
            mo35497E().f65564c.mo35437a("Error storing app. appId", agid.m54288a(agcv.mo35248a()), e2);
        }
    }

    /* renamed from: a */
    public final void mo35343a(agdr agdr) {
        long j;
        sdo.m34959a(agdr);
        mo35241h();
        mo35659q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", agdr.f65330a);
        contentValues.put("name", agdr.f65331b);
        contentValues.put("lifetime_count", Long.valueOf(agdr.f65332c));
        contentValues.put("current_bundle_count", Long.valueOf(agdr.f65333d));
        contentValues.put("last_fire_timestamp", Long.valueOf(agdr.f65335f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(agdr.f65336g));
        contentValues.put("last_bundled_day", agdr.f65337h);
        contentValues.put("last_sampled_complex_event_id", agdr.f65338i);
        contentValues.put("last_sampling_rate", agdr.f65339j);
        contentValues.put("current_session_count", Long.valueOf(agdr.f65334e));
        Boolean bool = agdr.f65340k;
        if (bool == null || !bool.booleanValue()) {
            j = null;
        } else {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (mo35360e().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo35497E().f65564c.mo35436a("Failed to insert/update event aggregates (got -1). appId", agid.m54288a(agdr.f65330a));
            }
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35437a("Error storing event aggregates. appId", agid.m54288a(agdr.f65330a), e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxxb, byte[]):bxxb
     arg types: [bxvd, byte[]]
     candidates:
      agmp.a(bxvd, java.lang.String):int
      agmp.a(java.lang.StringBuilder, int):void
      agmp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):boolean
      agmp.a(java.util.List, int):boolean
      agmp.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable
      agmp.a(agni, java.lang.String):java.lang.Object
      agmp.a(java.util.List, java.util.List):java.util.List
      agmp.a(bxvd, java.lang.Object):void
      agmp.a(long, long):boolean
      agmp.a(bxxb, byte[]):bxxb */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02eb, code lost:
        r12 = r2;
        r2 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:35:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo35344a(String str, long j, long j2, agmm agmm) {
        Cursor cursor;
        String str2;
        String str3;
        Cursor cursor2;
        Cursor query;
        String[] strArr;
        String str4;
        String string;
        agmm agmm2 = agmm;
        sdo.m34959a(agmm);
        mo35241h();
        mo35659q();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase e = mo35360e();
            String str5 = "";
            if (!TextUtils.isEmpty(str)) {
                String[] strArr2 = j2 != -1 ? new String[]{str, String.valueOf(j2)} : new String[]{str};
                if (j2 != -1) {
                    str5 = " and rowid <= ?";
                }
                StringBuilder sb = new StringBuilder(str5.length() + 84);
                sb.append("select metadata_fingerprint from raw_events where app_id = ?");
                sb.append(str5);
                sb.append(" order by rowid limit 1;");
                cursor3 = e.rawQuery(sb.toString(), strArr2);
                try {
                    if (cursor3.moveToFirst()) {
                        String string2 = cursor3.getString(0);
                        cursor3.close();
                        cursor2 = cursor3;
                        str3 = string2;
                        str2 = str;
                    } else if (cursor3 != null) {
                        cursor3.close();
                        return;
                    } else {
                        return;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursor3;
                    str2 = str;
                    try {
                        mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
                        if (cursor == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } else {
                String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                if (j2 != -1) {
                    str5 = "rowid <= ? and ";
                }
                StringBuilder sb2 = new StringBuilder(str5.length() + 148);
                sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                sb2.append(str5);
                sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor3 = e.rawQuery(sb2.toString(), strArr3);
                try {
                    if (cursor3.moveToFirst()) {
                        string = cursor3.getString(0);
                        String string3 = cursor3.getString(1);
                        cursor3.close();
                        cursor2 = cursor3;
                        str2 = string;
                        str3 = string3;
                    } else if (cursor3 != null) {
                        cursor3.close();
                        return;
                    } else {
                        return;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor = cursor3;
                    str2 = string;
                    mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
                    if (cursor == null) {
                    }
                } catch (Throwable th3) {
                }
            }
            try {
                query = e.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str3}, null, null, "rowid", "2");
            } catch (SQLiteException e4) {
                e = e4;
                cursor = cursor2;
                mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
                if (cursor == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                cursor3 = cursor2;
                if (cursor3 != null) {
                }
                throw th;
            }
            try {
                if (!query.moveToFirst()) {
                    mo35497E().f65564c.mo35436a("Raw event metadata record is missing. appId", agid.m54288a(str2));
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                try {
                    agnm agnm = (agnm) ((bxvd) agmp.m54563a((bxxb) agnm.f66088P.mo74144da(), query.getBlob(0))).mo74062i();
                    if (query.moveToNext()) {
                        mo35497E().f65567f.mo35436a("Get multiple raw event metadata records, expected one. appId", agid.m54288a(str2));
                    }
                    query.close();
                    sdo.m34959a(agnm);
                    agmm2.f65941a = agnm;
                    if (j2 != -1) {
                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr = new String[]{str2, str3, String.valueOf(j2)};
                    } else {
                        str4 = "app_id = ? and metadata_fingerprint = ?";
                        strArr = new String[]{str2, str3};
                    }
                    cursor = query;
                    try {
                        Cursor query2 = e.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str4, strArr, null, null, "rowid", null);
                        try {
                            if (query2.moveToFirst()) {
                                do {
                                    long j3 = query2.getLong(0);
                                    try {
                                        bxvd bxvd = (bxvd) agmp.m54563a((bxxb) agni.f66064g.mo74144da(), query2.getBlob(3));
                                        String string4 = query2.getString(1);
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        agni agni = (agni) bxvd.f164949b;
                                        string4.getClass();
                                        agni.f66066a |= 1;
                                        agni.f66068c = string4;
                                        long j4 = query2.getLong(2);
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        agni agni2 = (agni) bxvd.f164949b;
                                        agni2.f66066a |= 2;
                                        agni2.f66069d = j4;
                                        agni agni3 = (agni) bxvd.mo74062i();
                                        sdo.m34959a(agni3);
                                        if (agmm2.f65943c == null) {
                                            agmm2.f65943c = new ArrayList();
                                        }
                                        if (agmm2.f65942b == null) {
                                            agmm2.f65942b = new ArrayList();
                                        }
                                        if (agmm2.f65943c.size() <= 0 || agmm.m54504a((agni) agmm2.f65943c.get(0)) == agmm.m54504a(agni3)) {
                                            long j5 = agmm2.f65944d;
                                            int i = agni3.f164961ai;
                                            if (i == -1) {
                                                i = bxxm.f165037a.mo74228a(agni3).mo74223b(agni3);
                                                agni3.f164961ai = i;
                                            }
                                            long j6 = j5 + ((long) i);
                                            agmm2.f65945e.mo35680d();
                                            if (j6 < ((long) Math.max(0, ((Integer) aghn.f65508i.mo35389a()).intValue()))) {
                                                agmm2.f65944d = j6;
                                                agmm2.f65943c.add(agni3);
                                                agmm2.f65942b.add(Long.valueOf(j3));
                                                int size = agmm2.f65943c.size();
                                                agmm2.f65945e.mo35680d();
                                                if (size >= Math.max(1, ((Integer) aghn.f65509j.mo35389a()).intValue())) {
                                                }
                                            }
                                        }
                                        if (query2 != null) {
                                            query2.close();
                                            return;
                                        }
                                        return;
                                    } catch (IOException e5) {
                                        mo35497E().f65564c.mo35437a("Data loss. Failed to merge raw event. appId", agid.m54288a(str2), e5);
                                    }
                                } while (query2.moveToNext());
                                if (query2 != null) {
                                    query2.close();
                                    return;
                                }
                                return;
                            }
                            mo35497E().f65567f.mo35436a("Raw event data disappeared while in transaction. appId", agid.m54288a(str2));
                            if (query2 != null) {
                                query2.close();
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            cursor = query2;
                            mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
                            if (cursor == null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            cursor3 = query2;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
                        if (cursor == null) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    cursor = query;
                    mo35497E().f65564c.mo35437a("Data loss. Failed to merge raw event metadata. appId", agid.m54288a(str2), e8);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } catch (SQLiteException e9) {
                e = e9;
                cursor = query;
                mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
                if (cursor == null) {
                }
            } catch (Throwable th7) {
                th = th7;
                cursor = query;
                cursor3 = cursor;
                if (cursor3 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursor = null;
            str2 = str;
            mo35497E().f65564c.mo35437a("Data loss. Error selecting raw event. appId", agid.m54288a(str2), e);
            if (cursor == null) {
                cursor.close();
            }
        } catch (Throwable th8) {
            th = th8;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo35345a(String str, Long l, long j, agni agni) {
        mo35241h();
        mo35659q();
        sdo.m34959a(agni);
        sdo.m34977c(str);
        sdo.m34959a(l);
        byte[] k = agni.mo73642k();
        mo35497E().f65572k.mo35437a("Saving complex main event, appId, data size", mo35541y().mo35422a(str), Integer.valueOf(k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", k);
        try {
            if (mo35360e().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                mo35497E().f65564c.mo35436a("Failed to insert complex main event (got -1). appId", agid.m54288a(str));
            }
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35437a("Error storing complex main event. appId", agid.m54288a(str), e);
        }
    }

    /* renamed from: a */
    public final boolean mo35346a(agdq agdq, long j, boolean z) {
        mo35241h();
        mo35659q();
        sdo.m34959a(agdq);
        sdo.m34977c(agdq.f65324a);
        bxvd da = agni.f66064g.mo74144da();
        long j2 = agdq.f65328e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        agni agni = (agni) da.f164949b;
        agni.f66066a |= 4;
        agni.f66070e = j2;
        Iterator it = agdq.f65329f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bxvd da2 = agnk.f66077g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            agnk agnk = (agnk) da2.f164949b;
            str.getClass();
            agnk.f66079a = 1 | agnk.f66079a;
            agnk.f66080b = str;
            mo35657o().mo35716b(da2, agdq.f65329f.mo44008a(str));
            da.mo74100q(da2);
        }
        byte[] k = ((agni) da.mo74062i()).mo73642k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", agdq.f65324a);
        contentValues.put("name", agdq.f65325b);
        contentValues.put("timestamp", Long.valueOf(agdq.f65327d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", k);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo35360e().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo35497E().f65564c.mo35436a("Failed to insert raw event (got -1). appId", agid.m54288a(agdq.f65324a));
            return false;
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35437a("Error storing raw event. appId", agid.m54288a(agdq.f65324a), e);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo35347a(agmr agmr) {
        sdo.m34959a(agmr);
        mo35241h();
        mo35659q();
        if (mo35354c(agmr.f65971a, agmr.f65973c) == null) {
            if (agms.m54591a(agmr.f65973c)) {
                long a = mo35334a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{agmr.f65971a});
                agdi v = mo35538v();
                String str = agmr.f65971a;
                int i = 25;
                if (cfie.m139761b() && v.mo35314a(aghn.f65499ay)) {
                    i = v.mo35310a(str, aghn.f65450F, 25, 100);
                }
                if (a >= ((long) i)) {
                    return false;
                }
            } else if (!"_npa".equals(agmr.f65973c)) {
                long a2 = mo35334a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{agmr.f65971a, agmr.f65972b});
                mo35538v();
                if (a2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", agmr.f65971a);
        contentValues.put("origin", agmr.f65972b);
        contentValues.put("name", agmr.f65973c);
        contentValues.put("set_timestamp", Long.valueOf(agmr.f65974d));
        m54061a(contentValues, "value", agmr.f65975e);
        try {
            if (mo35360e().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo35497E().f65564c.mo35436a("Failed to insert/update user property (got -1). appId", agid.m54288a(agmr.f65971a));
            }
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35437a("Error storing user property. appId", agid.m54288a(agmr.f65971a), e);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo35348a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        sdo.m34959a(conditionalUserPropertyParcel);
        mo35241h();
        mo35659q();
        if (mo35354c(conditionalUserPropertyParcel.f80120a, conditionalUserPropertyParcel.f80122c.f80139b) == null) {
            long a = mo35334a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{conditionalUserPropertyParcel.f80120a});
            mo35538v();
            if (a >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", conditionalUserPropertyParcel.f80120a);
        contentValues.put("origin", conditionalUserPropertyParcel.f80121b);
        contentValues.put("name", conditionalUserPropertyParcel.f80122c.f80139b);
        m54061a(contentValues, "value", conditionalUserPropertyParcel.f80122c.mo44016a());
        contentValues.put("active", Boolean.valueOf(conditionalUserPropertyParcel.f80124e));
        contentValues.put("trigger_event_name", conditionalUserPropertyParcel.f80125f);
        contentValues.put("trigger_timeout", Long.valueOf(conditionalUserPropertyParcel.f80127h));
        contentValues.put("timed_out_event", mo35540x().mo35741a((Parcelable) conditionalUserPropertyParcel.f80126g));
        contentValues.put("creation_timestamp", Long.valueOf(conditionalUserPropertyParcel.f80123d));
        contentValues.put("triggered_event", mo35540x().mo35741a((Parcelable) conditionalUserPropertyParcel.f80128i));
        contentValues.put("triggered_timestamp", Long.valueOf(conditionalUserPropertyParcel.f80122c.f80140c));
        contentValues.put("time_to_live", Long.valueOf(conditionalUserPropertyParcel.f80129j));
        contentValues.put("expired_event", mo35540x().mo35741a((Parcelable) conditionalUserPropertyParcel.f80130k));
        try {
            if (mo35360e().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo35497E().f65564c.mo35436a("Failed to insert/update conditional user property (got -1)", agid.m54288a(conditionalUserPropertyParcel.f80120a));
            }
        } catch (SQLiteException e) {
            mo35497E().f65564c.mo35437a("Error storing conditional user property", agid.m54288a(conditionalUserPropertyParcel.f80120a), e);
        }
        return true;
    }
}
