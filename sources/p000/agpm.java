package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;

/* renamed from: agpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpm extends srp {

    /* renamed from: a */
    public static final srn f66246a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final String f66247b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public agpm(Context context, String str) {
        super(context, str, str, r0);
        int i;
        if (!cfmj.m140163l()) {
            i = 4;
        } else {
            i = 5;
        }
        this.f66247b = str;
    }

    /* renamed from: c */
    private static final void m54768c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s BLOB, %s BLOB)", "DeviceTable", "version_index", "consent_record", "device_info"));
        } catch (SQLiteException e) {
            bnsl bnsl = (bnsl) f66246a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to create table %s", "DeviceTable");
        }
    }

    /* renamed from: a */
    public final agpw mo35863a(String str, String[] strArr) {
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        mo35864a("SimCardTable", "expiration_time");
        byte[] bArr3 = null;
        try {
            Cursor query = getReadableDatabase().query("SimCardTable", null, str, strArr, null, null, null);
            try {
                if (query.moveToNext()) {
                    agpv agpv = new agpv();
                    int columnIndex = query.getColumnIndex("iccid");
                    if (query.getType(columnIndex) != 0) {
                        str2 = query.getString(columnIndex);
                    } else {
                        str2 = null;
                    }
                    agpv.mo35908b(str2);
                    int columnIndex2 = query.getColumnIndex("carrier_id");
                    agpv.mo35904a(query.getType(columnIndex2) != 0 ? Long.valueOf(query.getLong(columnIndex2)) : null);
                    int columnIndex3 = query.getColumnIndex("sim_state");
                    agpv.mo35903a(query.getType(columnIndex3) != 0 ? Integer.valueOf(query.getInt(columnIndex3)) : null);
                    int columnIndex4 = query.getColumnIndex("cpid");
                    if (query.getType(columnIndex4) != 0) {
                        str3 = query.getString(columnIndex4);
                    } else {
                        str3 = null;
                    }
                    agpv.mo35905a(str3);
                    agpv.mo35907b(Long.valueOf(query.getLong(query.getColumnIndex("expiration_time"))));
                    int columnIndex5 = query.getColumnIndex("notification_stats");
                    if (query.getType(columnIndex5) != 0) {
                        bArr = query.getBlob(columnIndex5);
                    } else {
                        bArr = null;
                    }
                    agpv.mo35909b(bArr);
                    int columnIndex6 = query.getColumnIndex("consent_record");
                    if (query.getType(columnIndex6) != 0) {
                        bArr2 = query.getBlob(columnIndex6);
                    } else {
                        bArr2 = null;
                    }
                    agpv.mo35906a(bArr2);
                    int columnIndex7 = query.getColumnIndex("sim_extra");
                    if (query.getType(columnIndex7) != 0) {
                        bArr3 = query.getBlob(columnIndex7);
                    }
                    agpv.mo35910c(bArr3);
                    agpw a = agpv.mo35900a();
                    if (query != null) {
                        query.close();
                    }
                    return a;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            throw th;
        } catch (SQLiteException e) {
            bnsl bnsl = (bnsl) f66246a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Cannot get readable SQLite database");
            return null;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f66246a.mo26019b(agyt.m55307c()).mo68425a("downgrade MobileDataPlan database: %s, <%d> to <%d>", this.f66247b, Integer.valueOf(i), Integer.valueOf(i2));
        if (i >= 5 && i2 < 5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DeviceTable");
        }
        agrl.m54942a().mo36006a(bygd.DB_VERSION_DOWNGRADE, "Db", "MDP_Database");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f66246a.mo26019b(agyt.m55307c()).mo68425a("upgrade MobileDataPlan database: %s, <%d> to <%d>", this.f66247b, Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 4) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SimCardTable");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CarrierTable");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SubscriptionTable");
            onCreate(sQLiteDatabase);
        }
        if (i < 5 && i2 >= 5) {
            m54768c(sQLiteDatabase);
        }
        agrl.m54942a().mo36006a(bygd.DB_VERSION_UPGRADE, "Db", "MDP_Database");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        f66246a.mo26019b(agyt.m55307c()).mo68422a("create MobileDataPlan database: %s, <%d>", (Object) this.f66247b, 4);
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s (%s TEXT PRIMARY KEY, %s INTEGER, %s INTEGER,  %s TEXT, %s INTEGER NOT NULL, %s BLOB, %s BLOB, %s BLOB)", "SimCardTable", "iccid", "carrier_id", "sim_state", "cpid", "expiration_time", "notification_stats", "consent_record", "sim_extra"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s BLOB, %s TEXT, %s BLOB, %s BLOB, %s INTEGER NOT NULL, %s BLOB)", "CarrierTable", "carrier_id", "list_cpid_endpoints_resp", "mcc_mnc", "carrier_app_logo", "carrier_logo", "expiration_time", "carrier_extra"));
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %1$s (%2$s INTEGER, %3$s TEXT, %4$s TEXT, %5$s BLOB, %6$s BLOB, %7$s INTEGER NOT NULL, PRIMARY KEY(%2$s, %3$s))", "SubscriptionTable", "carrier_id", "cpid", "locale", "data_plan", "upsell_offer", "expiration_time"));
        if (cfmj.m140163l()) {
            m54768c(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public final void mo35864a(String str, String str2) {
        long j;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("SimCardTable")) {
                j = cflu.f184297a.mo6606a().mo81411b();
            } else if (str.equals("CarrierTable")) {
                j = cflu.f184297a.mo6606a().mo81410a();
            } else {
                j = str.equals("SubscriptionTable") ? cflu.f184297a.mo6606a().mo81412c() : 0;
            }
            try {
                writableDatabase.delete(str, str2.concat("-? <= 0"), new String[]{Long.toString(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j)});
            } catch (SQLiteDatabaseLockedException e) {
                bnsl bnsl = (bnsl) f66246a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Failed to acquire lock for db %s. Failed to delete.", str);
            } catch (SQLiteException e2) {
                bnsl bnsl2 = (bnsl) f66246a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68420a("Failed to delete from writable database %s.", str);
            }
        } catch (SQLiteDatabaseLockedException e3) {
            bnsl bnsl3 = (bnsl) f66246a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68420a("Failed to acquire lock for db %s.", str);
        } catch (SQLiteException e4) {
            bnsl bnsl4 = (bnsl) f66246a.mo68388c();
            bnsl4.mo68437a(e4);
            bnsl4.mo68405a("Cannot get writable SQLite database");
        }
    }

    /* renamed from: a */
    public final boolean mo35865a(long j) {
        try {
            try {
                return getWritableDatabase().delete("DeviceTable", "version_index = ?", new String[]{Long.toString(j)}) == 1;
            } catch (SQLiteDatabaseLockedException e) {
                bnsl bnsl = (bnsl) f66246a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to acquire lock for db. Failed to delete.");
                return false;
            } catch (SQLiteException e2) {
                bnsl bnsl2 = (bnsl) f66246a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Failed to delete from writable database.");
                return false;
            }
        } catch (SQLiteException e3) {
            bnsl bnsl3 = (bnsl) f66246a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68405a("Cannot get writable SQLite database");
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo35866a(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                if (writableDatabase.update(str, contentValues, str2, strArr) != 0) {
                    return true;
                }
                try {
                    if (writableDatabase.insert(str, null, contentValues) != -1) {
                        return true;
                    }
                    return false;
                } catch (SQLiteDatabaseLockedException e) {
                    bnsl bnsl = (bnsl) f66246a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Failed to acquire lock for db. Failed to insert.");
                    return false;
                } catch (SQLiteException e2) {
                    bnsl bnsl2 = (bnsl) f66246a.mo68388c();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68405a("Failed to insert into writable database.");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException e3) {
                bnsl bnsl3 = (bnsl) f66246a.mo68388c();
                bnsl3.mo68437a(e3);
                bnsl3.mo68405a("Failed to acquire lock for db. Failed to update.");
                return false;
            } catch (SQLiteException e4) {
                bnsl bnsl4 = (bnsl) f66246a.mo68388c();
                bnsl4.mo68437a(e4);
                bnsl4.mo68405a("Failed to update writable database.");
                return false;
            }
        } catch (SQLiteDatabaseLockedException e5) {
            bnsl bnsl5 = (bnsl) f66246a.mo68388c();
            bnsl5.mo68437a(e5);
            bnsl5.mo68405a("Failed to acquire lock for db. Failed to getWritableDatabase.");
            return false;
        } catch (SQLiteException e6) {
            bnsl bnsl6 = (bnsl) f66246a.mo68388c();
            bnsl6.mo68437a(e6);
            bnsl6.mo68405a("Failed to get writable SQLite database");
            return false;
        }
    }
}
