package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.List;

/* renamed from: asfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfo extends srp {

    /* renamed from: a */
    private static asfo f88849a = null;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, long, long):void
     arg types: [int, java.lang.String, int, int]
     candidates:
      bmxy.a(boolean, java.lang.String, int, int):void
      bmxy.a(boolean, java.lang.String, long, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, java.lang.Object, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, long, long):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Illegal instructions before constructor call */
    private asfo(Context context) {
        super(context, "eastworld.db", "eastworld.db", (int) Math.min(Math.max(r0, 2L), 2L));
        long l = cgtd.f187715a.mo6606a().mo84483l();
        bmxy.m108594a(true, "min (%s) must be less than or equal to max (%s)", 2L, 2L);
    }

    /* renamed from: a */
    public static final int m73973a(int i, boolean z, boolean z2, boolean z3) {
        return (i * 1000) + ((z ? 1 : 0) * true) + ((z2 ? 1 : 0) * true) + (z3 ? 1 : 0);
    }

    /* renamed from: b */
    public final int mo49136b(String str) {
        Cursor query;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            query = readableDatabase.query("battery_counter", new String[]{"counter_val"}, "counter_key = ?", new String[]{str}, null, null, null);
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndexOrThrow("counter_val"));
                if (query != null) {
                    query.close();
                }
                return i;
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (SQLiteException e) {
            return 0;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final long mo49138c() {
        Cursor query;
        long j = -1;
        try {
            query = getReadableDatabase().query("error_status", new String[]{"last_upload_wallclock_time"}, null, null, null, null, null);
            if (query.moveToFirst()) {
                j = query.getLong(query.getColumnIndexOrThrow("last_upload_wallclock_time"));
            }
            if (query != null) {
                try {
                    query.close();
                } catch (SQLiteException e) {
                    e = e;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            Log.e("EastworldSqliteHelper", "Failed to fetch last upload time.", e);
            return j;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        return j;
        throw th;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            sQLiteDatabase = getWritableDatabase();
        }
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS eastworld_stats;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS battery_status;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS battery_counter;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS error_data;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS error_status;");
        } catch (SQLiteException e) {
        }
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    public static synchronized asfo m73974a(Context context) {
        asfo asfo;
        synchronized (asfo.class) {
            if (f88849a == null) {
                f88849a = new asfo(context);
            }
            asfo = f88849a;
        }
        return asfo;
    }

    /* renamed from: a */
    public static final List m73975a(int i) {
        bngs j = bngx.m109377j();
        j.mo67668c(Integer.valueOf(m73973a(i, true, true, true)));
        j.mo67668c(Integer.valueOf(m73973a(i, false, true, true)));
        j.mo67668c(Integer.valueOf(m73973a(i, true, false, true)));
        j.mo67668c(Integer.valueOf(m73973a(i, false, false, true)));
        j.mo67668c(Integer.valueOf(m73973a(i, true, true, false)));
        j.mo67668c(Integer.valueOf(m73973a(i, false, true, false)));
        j.mo67668c(Integer.valueOf(m73973a(i, true, false, false)));
        j.mo67668c(Integer.valueOf(m73973a(i, false, false, false)));
        return j.mo67664a();
    }

    /* renamed from: b */
    public final boolean mo49137b() {
        Cursor rawQuery;
        try {
            rawQuery = getReadableDatabase().rawQuery("SELECT  * FROM battery_status", null);
            boolean z = rawQuery.getCount() > 0;
            if (rawQuery != null) {
                rawQuery.close();
            }
            return z;
        } catch (SQLiteException e) {
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static void m73976a(SQLiteDatabase sQLiteDatabase, bxvd bxvd, long j, long j2, long j3) {
        String str;
        Throwable th;
        Throwable th2;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        bxvd bxvd2 = bxvd;
        boolean z = false;
        String[] strArr = {Long.toString(j2), Long.toString(j3), Long.toString(j), Long.toString(j3)};
        if (!cgth.m146985e()) {
            str = "SELECT package_name, package_version, dropbox_tag, SUM(CASE WHEN wallclock_time > ? AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_random_split, SUM(CASE WHEN wallclock_time > ?  AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_last_upload FROM error_data GROUP BY package_name, package_version, dropbox_tag HAVING cnt_since_last_upload > 0";
        } else {
            str = "SELECT package_name, dropbox_tag, SUM(CASE WHEN wallclock_time > ? AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_random_split, SUM(CASE WHEN wallclock_time > ?  AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_last_upload FROM error_data GROUP BY package_name, dropbox_tag HAVING cnt_since_last_upload > 0";
        }
        Cursor rawQuery = sQLiteDatabase2.rawQuery(str, strArr);
        try {
            if (rawQuery.moveToFirst()) {
                do {
                    bxvd da = caku.f175056g.mo74144da();
                    String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("package_name"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caku caku = (caku) da.f164949b;
                    string.getClass();
                    caku.f175058a |= 1;
                    caku.f175059b = string;
                    if (!cgth.m146985e()) {
                        int i = (int) rawQuery.getLong(rawQuery.getColumnIndexOrThrow("package_version"));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caku caku2 = (caku) da.f164949b;
                        caku2.f175058a |= 2;
                        caku2.f175060c = i;
                    }
                    String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("dropbox_tag"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caku caku3 = (caku) da.f164949b;
                    string2.getClass();
                    caku3.f175058a |= 4;
                    caku3.f175061d = string2;
                    int i2 = (int) rawQuery.getLong(rawQuery.getColumnIndexOrThrow("cnt_since_random_split"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caku caku4 = (caku) da.f164949b;
                    caku4.f175058a |= 16;
                    caku4.f175062e = i2;
                    int i3 = (int) rawQuery.getLong(rawQuery.getColumnIndexOrThrow("cnt_since_last_upload"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caku caku5 = (caku) da.f164949b;
                    caku5.f175058a |= 32;
                    caku5.f175063f = i3;
                    caku caku6 = (caku) da.mo74062i();
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cakv cakv = (cakv) bxvd2.f164949b;
                    cakv cakv2 = cakv.f175064g;
                    caku6.getClass();
                    if (!cakv.f175067b.mo73666a()) {
                        cakv.f175067b = bxvk.m124021a(cakv.f175067b);
                    }
                    cakv.f175067b.add(caku6);
                } while (rawQuery.moveToNext());
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (cgth.f187721a.mo6606a().mo84471i()) {
                Cursor rawQuery2 = sQLiteDatabase2.rawQuery("SELECT dropbox_tag, SUM(CASE WHEN wallclock_time > ? AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_random_split, SUM(CASE WHEN wallclock_time > ?  AND wallclock_time <= ? THEN 1 ELSE 0 END) AS cnt_since_last_upload FROM error_data GROUP BY dropbox_tag", strArr);
                try {
                    if (rawQuery2.moveToFirst()) {
                        long j4 = 0;
                        long j5 = 0;
                        while (true) {
                            String string3 = rawQuery2.getString(rawQuery2.getColumnIndexOrThrow("dropbox_tag"));
                            long j6 = rawQuery2.getLong(rawQuery2.getColumnIndexOrThrow("cnt_since_random_split"));
                            j4 += j6;
                            long j7 = rawQuery2.getLong(rawQuery2.getColumnIndexOrThrow("cnt_since_last_upload"));
                            j5 += j7;
                            bxvd da2 = caku.f175056g.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = z;
                            }
                            caku caku7 = (caku) da2.f164949b;
                            string3.getClass();
                            caku7.f175058a |= 4;
                            caku7.f175061d = string3;
                            int b = bqcn.m112585b(j6);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            caku caku8 = (caku) da2.f164949b;
                            caku8.f175058a |= 16;
                            caku8.f175062e = b;
                            int b2 = bqcn.m112585b(j7);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            caku caku9 = (caku) da2.f164949b;
                            caku9.f175058a |= 32;
                            caku9.f175063f = b2;
                            caku caku10 = (caku) da2.mo74062i();
                            if (bxvd2.f164950c) {
                                bxvd.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            cakv cakv3 = (cakv) bxvd2.f164949b;
                            cakv cakv4 = cakv.f175064g;
                            caku10.getClass();
                            if (!cakv3.f175068c.mo73666a()) {
                                cakv3.f175068c = bxvk.m124021a(cakv3.f175068c);
                            }
                            cakv3.f175068c.add(caku10);
                            if (!rawQuery2.moveToNext()) {
                                break;
                            }
                            z = false;
                        }
                        bxvd da3 = caku.f175056g.mo74144da();
                        int b3 = bqcn.m112585b(j4);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        caku caku11 = (caku) da3.f164949b;
                        caku11.f175058a |= 16;
                        caku11.f175062e = b3;
                        int b4 = bqcn.m112585b(j5);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        caku caku12 = (caku) da3.f164949b;
                        caku12.f175058a |= 32;
                        caku12.f175063f = b4;
                        caku caku13 = (caku) da3.mo74062i();
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        cakv cakv5 = (cakv) bxvd2.f164949b;
                        caku13.getClass();
                        if (!cakv5.f175069d.mo73666a()) {
                            cakv5.f175069d = bxvk.m124021a(cakv5.f175069d);
                        }
                        cakv5.f175069d.add(caku13);
                    }
                    if (rawQuery2 != null) {
                        rawQuery2.close();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
            } else {
                return;
            }
            throw th;
            throw th2;
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }

    /* renamed from: a */
    public final int mo49133a(String str) {
        Cursor query;
        try {
            query = getReadableDatabase().query("battery_status", new String[]{str}, null, null, null, null, null);
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndexOrThrow(str));
                if (query != null) {
                    query.close();
                }
                return i;
            }
            if (query != null) {
                query.close();
            }
            return -1;
        } catch (SQLiteException e) {
            return -1;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final long mo49134a() {
        Cursor query;
        try {
            query = getReadableDatabase().query("eastworld_stats", new String[]{"last_split_millis"}, null, null, null, null, null);
            if (query.moveToFirst()) {
                long j = query.getLong(query.getColumnIndexOrThrow("last_split_millis"));
                if (query != null) {
                    query.close();
                }
                return j;
            }
            if (query != null) {
                query.close();
            }
            return -1;
        } catch (SQLiteException e) {
            return -1;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo49135a(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("counter_val", Integer.valueOf(i2));
        try {
            getWritableDatabase().update("battery_counter", contentValues, "counter_key = ?", new String[]{String.valueOf(i)});
        } catch (SQLiteException e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE eastworld_stats (mtv_day INTEGER,last_split_millis LONG,stats_proto TEXT NOT NULL);");
            sQLiteDatabase.execSQL("CREATE TABLE battery_status (elapsed_time LONG,wallclock_time LONG,battery_level INTEGER,screen_on INTEGER,on_battery INTEGER,boot_count INTEGER,event_count INTEGER DEFAULT 0,last_event_time LONG,log_upload_count INTEGER DEFAULT 0,last_upload_elapsed_time LONG DEFAULT 0,last_upload_wallclock_time LONG DEFAULT 0);");
            sQLiteDatabase.execSQL("CREATE TABLE battery_counter (counter_key INTEGER,counter_val INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE error_data (package_name TEXT NOT NULL,package_version INTEGER,dropbox_tag TEXT NOT NULL,wallclock_time LONG);");
            sQLiteDatabase.execSQL("CREATE TABLE error_status (last_upload_wallclock_time LONG DEFAULT 0);");
            sQLiteDatabase.execSQL("INSERT INTO eastworld_stats(mtv_day,last_split_millis,stats_proto) VALUES (-1,-1,'');");
        } catch (SQLiteException e) {
        }
    }
}
