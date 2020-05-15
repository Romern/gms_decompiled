package p000;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: asfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfs extends asft {

    /* renamed from: a */
    public static asfs f88856a = null;

    /* renamed from: f */
    private static final bngx f88857f = bngx.m109364a("data_app_crash", "data_app_native_crash", "data_app_anr", "system_app_crash", "system_app_native_crash", "system_app_anr", "system_server_anr", "system_server_crash", "system_server_native_crash");

    /* renamed from: g */
    private static final bnic f88858g = bnic.m109489a((Object) 1);

    /* renamed from: a */
    public static void m73998a(calx calx) {
        SQLiteDatabase writableDatabase;
        if (cgth.m146982b()) {
            ArrayList<calv> arrayList = new ArrayList();
            bxwc bxwc = calx.f175211i;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                calv calv = (calv) bxwc.get(i);
                if (f88857f.contains(calv.f175183b)) {
                    arrayList.add(calv);
                }
            }
            if (!arrayList.isEmpty()) {
                asfo a = asfo.m73974a(rpr.m34216b());
                if (!sqw.m36041a((Collection) arrayList)) {
                    try {
                        writableDatabase = a.getWritableDatabase();
                        writableDatabase.beginTransaction();
                        for (calv calv2 : arrayList) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("wallclock_time", Long.valueOf(calv2.f175185d));
                            contentValues.put("package_name", calv2.f175187f);
                            contentValues.put("package_version", Integer.valueOf(calv2.f175188g));
                            contentValues.put("dropbox_tag", calv2.f175183b);
                            writableDatabase.insert("error_data", null, contentValues);
                        }
                        long queryNumEntries = DatabaseUtils.queryNumEntries(writableDatabase, "error_data");
                        if (queryNumEntries > 1000) {
                            writableDatabase.delete("error_data", "rowid IN (SELECT rowid FROM error_data ORDER BY wallclock_time LIMIT ?)", new String[]{Long.toString(queryNumEntries - 1000)});
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (SQLiteException e) {
                        Log.e("EastworldSqliteHelper", "Failed to insert error status.", e);
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014b A[SYNTHETIC, Splitter:B:48:0x014b] */
    /* renamed from: a */
    public final void mo49140a(int i, boolean z, boolean z2, bxvd bxvd) {
        int i2;
        cakv cakv;
        bxvd da;
        SQLiteDatabase writableDatabase;
        long j;
        if (!cgth.m146982b()) {
            f88860c.mo24383c("DisabledEastworldProcessorEastworldError").mo24359a();
            f88860c.mo24388e();
        } else if (f88858g.contains(Integer.valueOf(i))) {
            rpr b = rpr.m34216b();
            long currentTimeMillis = System.currentTimeMillis();
            asfo a = asfo.m73974a(b);
            long c = a.mo49138c();
            if (i == 1 && (c < 0 || currentTimeMillis - c > cgth.f187721a.mo6606a().mo84463a())) {
                bxvd da2 = cakv.f175064g.mo74144da();
                long a2 = a.mo49134a();
                long j2 = currentTimeMillis - a2;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cakv cakv2 = (cakv) da2.f164949b;
                cakv2.f175066a |= 2;
                cakv2.f175070e = j2;
                try {
                    SQLiteDatabase writableDatabase2 = a.getWritableDatabase();
                    long c2 = a.mo49138c();
                    if (a2 <= c2 || !cgth.m146984d()) {
                        j = 1;
                    } else {
                        j = 1;
                        asfo.m73976a(writableDatabase2, da2, c2, Math.max(0L, a2 - TimeUnit.DAYS.toMillis(1)), a2);
                        c2 = a2;
                    }
                    long millis = cgth.m146984d() ? a2 + TimeUnit.DAYS.toMillis(j) : Long.MAX_VALUE;
                    long max = currentTimeMillis - Math.max(c2, 0L);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cakv cakv3 = (cakv) da2.f164949b;
                    cakv3.f175066a |= 4;
                    cakv3.f175071f = max;
                    i2 = 4;
                    try {
                        asfo.m73976a(writableDatabase2, da2, c2, a2, millis);
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    i2 = 4;
                    Log.e("EastworldSqliteHelper", "Error fetching errors from database.", e);
                    cakv = (cakv) da2.mo74062i();
                    da = calg.f175118j.mo74144da();
                    if (da.f164950c) {
                    }
                    calg calg = (calg) da.f164949b;
                    calg.f175121b = i2;
                    int i3 = calg.f175120a | 1;
                    calg.f175120a = i3;
                    cakv.getClass();
                    calg.f175123d = cakv;
                    calg.f175120a = i3 | 8;
                    if (asft.m74000a(da, "EastworldError", "DROP_BOX_EASTWORLD", (int) cgth.f187721a.mo6606a().mo84466d(), cala.f175092h.mo74144da())) {
                    }
                    f88860c.mo24388e();
                }
                cakv = (cakv) da2.mo74062i();
                if (!cgth.f187721a.mo6606a().mo84468f() || cakv.f175069d.size() != 0) {
                    da = calg.f175118j.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    calg calg2 = (calg) da.f164949b;
                    calg2.f175121b = i2;
                    int i32 = calg2.f175120a | 1;
                    calg2.f175120a = i32;
                    cakv.getClass();
                    calg2.f175123d = cakv;
                    calg2.f175120a = i32 | 8;
                    if (asft.m74000a(da, "EastworldError", "DROP_BOX_EASTWORLD", (int) cgth.f187721a.mo6606a().mo84466d(), cala.f175092h.mo74144da())) {
                        try {
                            long min = Math.min(currentTimeMillis, a.mo49134a());
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("last_upload_wallclock_time", Long.valueOf(currentTimeMillis));
                            writableDatabase = a.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            writableDatabase.delete("error_data", "wallclock_time < ?", new String[]{Long.toString(min)});
                            writableDatabase.delete("error_status", null, null);
                            writableDatabase.insert("error_status", null, contentValues);
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                        } catch (SQLiteException e3) {
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                }
            }
            f88860c.mo24388e();
        }
    }
}
