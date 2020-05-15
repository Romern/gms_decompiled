package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aoup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoup extends srp {

    /* renamed from: a */
    public static volatile aoup f83643a;

    /* renamed from: b */
    public static final Object f83644b = new Object();

    public aoup(Context context, String str) {
        super(context, str, str, 42, cdnd.m134166b());
    }

    /* renamed from: a */
    private static final boolean m69537a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z;
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            if (rawQuery.getColumnIndex(str2) >= 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    private static final void m69538b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 7 + str2.length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_index");
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP INDEX IF EXISTS ") : "DROP INDEX IF EXISTS ".concat(valueOf));
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 21 + str.length() + str2.length());
        sb3.append("CREATE INDEX ");
        sb3.append(sb2);
        sb3.append(" ON ");
        sb3.append(str);
        sb3.append(" (");
        sb3.append(str2);
        sb3.append(");");
        sQLiteDatabase.execSQL(sb3.toString());
    }

    /* renamed from: c */
    private static final void m69539c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS notification_update_fire_trigger;");
        StringBuilder sb = new StringBuilder(178);
        sb.append("CREATE TRIGGER notification_update_fire_trigger AFTER UPDATE  ON reminders BEGIN  UPDATE notification SET state = 0 WHERE (_id =  NEW._id AND state = 2 AND NEW. pinned != 1) ;END");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: d */
    private static final void m69541d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS notification_create_trigger;");
        sQLiteDatabase.execSQL("CREATE TRIGGER notification_create_trigger AFTER INSERT  ON reminders BEGIN  INSERT INTO notification ( _id) VALUES ( NEW._id); END");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS notification_delete_trigger;");
        sQLiteDatabase.execSQL("CREATE TRIGGER notification_delete_trigger AFTER DELETE  ON reminders BEGIN  DELETE FROM notification WHERE _id =  OLD._id; END");
    }

    /* renamed from: e */
    private static final void m69542e(SQLiteDatabase sQLiteDatabase) {
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
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m69542e(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        int i4 = i2;
        StringBuilder sb = new StringBuilder(74);
        sb.append("onUpgrade comparing oldVersion: ");
        sb.append(i3);
        sb.append(" to: 28 newVersion: ");
        sb.append(i4);
        sb.toString();
        if (i3 < 28) {
            m69542e(sQLiteDatabase);
            onCreate(sQLiteDatabase);
            return;
        }
        if (i3 == 28) {
            sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN morning_customized_time INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN afternoon_customized_time INTEGER");
            sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN evening_customized_time INTEGER");
            i3 = 29;
        }
        if (i3 == 29) {
            if (!m69537a(sQLiteDatabase2, "reminders", "link_application")) {
                sQLiteDatabase2.execSQL("ALTER TABLE reminders ADD COLUMN link_application INTEGER");
                sQLiteDatabase2.execSQL("ALTER TABLE reminders ADD COLUMN link_id TEXT");
            }
            if (!m69537a(sQLiteDatabase2, "account", "account_state")) {
                sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN account_state INTEGER");
                i3 = 30;
            } else {
                i3 = 30;
            }
        }
        if (i3 == 30) {
            sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN need_sync_snooze_preset INTEGER NOT NULL DEFAULT 1");
            i3 = 31;
        }
        if (i3 == 31) {
            int i5 = 0;
            int i6 = 1;
            String str2 = "evening_customized_time";
            String str3 = "afternoon_customized_time";
            Cursor query = sQLiteDatabase.query("account", new String[]{"_id", "morning_customized_time", "afternoon_customized_time", "evening_customized_time"}, null, null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        long j = query.getLong(i5);
                        ContentValues contentValues = new ContentValues();
                        if (query.isNull(i6)) {
                            contentValues.put("morning_customized_time", Long.valueOf(((long) ((Integer) aoss.f83553l.mo58455c()).intValue()) * 3600000));
                        }
                        if (query.isNull(2)) {
                            str = str3;
                            contentValues.put(str, Long.valueOf(((long) ((Integer) aoss.f83554m.mo58455c()).intValue()) * 3600000));
                        } else {
                            str = str3;
                        }
                        if (query.isNull(3)) {
                            str3 = str;
                            contentValues.put(str2, Long.valueOf(((long) ((Integer) aoss.f83555n.mo58455c()).intValue()) * 3600000));
                        } else {
                            str3 = str;
                        }
                        if (contentValues.size() > 0) {
                            sQLiteDatabase2.update("account", contentValues, "_id=?", new String[]{String.valueOf(j)});
                            i5 = 0;
                            i6 = 1;
                        } else {
                            i5 = 0;
                            i6 = 1;
                        }
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                i3 = 32;
            } else {
                i3 = 32;
            }
        }
        if (i3 == 32) {
            sQLiteDatabase2.execSQL("ALTER TABLE reminders ADD COLUMN fired_time_millis INTEGER");
            i3 = 33;
        }
        if (i3 == 33) {
            sQLiteDatabase2.execSQL("CREATE TABLE place_alias (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,alias_id INTEGER,alias_name TEXT NOT NULL,place_id TEXT NOT NULL);");
            i3 = 34;
        }
        if (i3 == 34) {
            m69539c(sQLiteDatabase);
            i3 = 35;
        }
        if (i3 == 35) {
            m69540c(sQLiteDatabase2, "reminders", "server_assigned_id");
            i3 = 36;
        }
        if (i3 == 36) {
            m69540c(sQLiteDatabase2, "notification", "is_stale");
            sQLiteDatabase2.execSQL("DROP TRIGGER IF EXISTS notification_update_trigger;");
            m69541d(sQLiteDatabase);
            i3 = 37;
        }
        if (i3 == 37) {
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS package");
            i3 = 38;
        }
        if (i3 == 38) {
            sQLiteDatabase2.execSQL("ALTER TABLE reminders ADD COLUMN dirty_sync_bit INTEGER");
            i3 = 39;
        }
        if (i3 == 39) {
            sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN was_last_sync_error INTEGER NOT NULL DEFAULT 0");
            i3 = 40;
        }
        if (i3 == 40) {
            if (!m69537a(sQLiteDatabase2, "reminders", "place_types")) {
                sQLiteDatabase2.execSQL("ALTER TABLE reminders ADD COLUMN place_types TEXT");
                i3 = 41;
            } else {
                i3 = 41;
            }
        }
        if (i3 == 41) {
            sQLiteDatabase2.execSQL("ALTER TABLE account ADD COLUMN sync_status BLOB");
            i3 = 42;
        }
        if (i3 != i4) {
            StringBuilder sb2 = new StringBuilder(46);
            sb2.append("Fail to upgrade database to version");
            sb2.append(i4);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: c */
    private static final void m69540c(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 7 + str2.length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_index");
        String valueOf = String.valueOf(sb.toString());
        sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP INDEX IF EXISTS ") : "DROP INDEX IF EXISTS ".concat(valueOf));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE account (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_name TEXT NOT NULL,storage_version TEXT,sync_status TEXT,morning_customized_time INTEGER,afternoon_customized_time INTEGER,evening_customized_time INTEGER,account_state INTEGER,need_sync_snooze_preset INTEGER NOT NULL DEFAULT 1,was_last_sync_error INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE reminders (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,reminder_type INTEGER NOT NULL,client_assigned_id TEXT,server_assigned_id INTEGER,client_assigned_thread_id TEXT,task_list INTEGER,title TEXT,created_time_millis INTEGER,archived_time_ms INTEGER,archived INTEGER NOT NULL DEFAULT 0,deleted INTEGER NOT NULL DEFAULT 0,pinned INTEGER NOT NULL DEFAULT 0,snoozed INTEGER NOT NULL DEFAULT 0,snoozed_time_millis INTEGER,location_snoozed_until_ms INTEGER,due_date_year INTEGER,due_date_month INTEGER,due_date_day INTEGER,due_date_hour INTEGER,due_date_minute INTEGER,due_date_second INTEGER,due_date_period INTEGER,due_date_absolute_time_ms INTEGER,due_date_date_range INTEGER,due_date_unspecified_future_time INTEGER,due_date_all_day INTEGER,due_date_millis INTEGER,event_date_year INTEGER,event_date_month INTEGER,event_date_day INTEGER,event_date_hour INTEGER,event_date_minute INTEGER,event_date_second INTEGER,event_date_period INTEGER,event_date_absolute_time_ms INTEGER,event_date_date_range INTEGER,event_date_unspecified_future_time INTEGER,event_date_all_day INTEGER,lat REAL,lng REAL,name TEXT,radius_meters INTEGER,location_type INTEGER,display_address TEXT,address_country TEXT,address_locality TEXT,address_region TEXT,address_street_address TEXT,address_street_number TEXT,address_street_name TEXT,address_postal_code TEXT,address_name TEXT,location_cell_id INTEGER,location_fprint INTEGER,location_alias_id TEXT,location_query TEXT,location_query_type INTEGER,chain_name TEXT,chain_id_cell_id INTEGER,chain_id_fprint INTEGER,category_id TEXT,display_name TEXT,recurrence_id TEXT,recurrence_master INTEGER,recurrence_exceptional INTEGER,recurrence_frequency INTEGER,recurrence_every INTEGER,recurrence_start_year INTEGER,recurrence_start_month INTEGER,recurrence_start_day INTEGER,recurrence_start_hour INTEGER,recurrence_start_minute INTEGER,recurrence_start_second INTEGER,recurrence_start_period INTEGER,recurrence_start_absolute_time_ms INTEGER,recurrence_start_date_range INTEGER,recurrence_start_unspecified_future_time INTEGER,recurrence_start_all_day INTEGER,recurrence_end_year INTEGER,recurrence_end_month INTEGER,recurrence_end_day INTEGER,recurrence_end_hour INTEGER,recurrence_end_minute INTEGER,recurrence_end_second INTEGER,recurrence_end_period INTEGER,recurrence_end_absolute_time_ms INTEGER,recurrence_end_num_occurrences INTEGER,recurrence_end_auto_renew INTEGER,recurrence_end_date_range INTEGER,recurrence_end_unspecified_future_time INTEGER,recurrence_end_all_day INTEGER,recurrence_end_auto_renew_until_year INTEGER,recurrence_end_auto_renew_until_month INTEGER,recurrence_end_auto_renew_until_day INTEGER,recurrence_end_auto_renew_until_hour INTEGER,recurrence_end_auto_renew_until_minute INTEGER,recurrence_end_auto_renew_until_second INTEGER,recurrence_end_auto_renew_until_period INTEGER,recurrence_end_auto_renew_until_absolute_time_ms INTEGER,recurrence_end_auto_renew_until_date_range INTEGER,recurrence_end_auto_renew_until_unspecified_future_time INTEGER,recurrence_end_auto_renew_until_all_day INTEGER,daily_pattern_hour INTEGER,daily_pattern_minute INTEGER,daily_pattern_second INTEGER,daily_pattern_period INTEGER,daily_pattern_all_day INTEGER,weekly_pattern_weekday TEXT,monthly_pattern_month_day TEXT,monthly_pattern_week_day INTEGER,monthly_pattern_week_day_number INTEGER,yearly_pattern_year_month TEXT,yearly_pattern_monthly_pattern_month_day TEXT,yearly_pattern_monthly_pattern_week_day INTEGER,yearly_pattern_monthly_pattern_week_day_number INTEGER,experiment INTEGER,assistance BLOB,extensions BLOB,link_application INTEGER,link_id TEXT,fired_time_millis INTEGER,dirty_sync_bit INTEGER NOT NULL DEFAULT 0,place_types TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY AUTOINCREMENT,state INTEGER NOT NULL DEFAULT 0,trigger_time INTEGER,create_time INTEGER,schedule_time INTEGER,fire_time INTEGER,snooze_time INTEGER,dismiss_time INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE operation (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,operation_api INTEGER NOT NULL,operation_request BLOB,error_count INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE TABLE place_alias (_id INTEGER PRIMARY KEY AUTOINCREMENT,account_id INTEGER NOT NULL,alias_id INTEGER,alias_name TEXT NOT NULL,place_id TEXT NOT NULL);");
        m69538b(sQLiteDatabase, "reminders", "account_id");
        m69538b(sQLiteDatabase, "reminders", "reminder_type");
        m69538b(sQLiteDatabase, "reminders", "due_date_millis");
        m69538b(sQLiteDatabase, "reminders", "client_assigned_id");
        m69538b(sQLiteDatabase, "reminders", "task_list");
        m69538b(sQLiteDatabase, "reminders", "created_time_millis");
        m69538b(sQLiteDatabase, "reminders", "archived");
        m69538b(sQLiteDatabase, "reminders", "deleted");
        m69538b(sQLiteDatabase, "reminders", "recurrence_id");
        m69538b(sQLiteDatabase, "reminders", "recurrence_master");
        m69538b(sQLiteDatabase, "reminders", "recurrence_exceptional");
        m69538b(sQLiteDatabase, "notification", "state");
        m69538b(sQLiteDatabase, "operation", "account_id");
        m69541d(sQLiteDatabase);
        m69539c(sQLiteDatabase);
    }
}
