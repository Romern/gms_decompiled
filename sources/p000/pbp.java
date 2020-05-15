package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbp extends nyv {

    /* renamed from: a */
    public static final bnsn f38794a = odk.m28481a("CAR.SETTING");

    public pbp(Context context) {
        super(context, "carservicedata.db");
    }

    /* renamed from: a */
    private static CarInfoInternal m30147a(Cursor cursor, String str) {
        boolean z;
        Cursor cursor2 = cursor;
        CarInfo carInfo = new CarInfo(cursor2.getString(cursor2.getColumnIndex("manufacturer")), cursor2.getString(cursor2.getColumnIndex("model")), cursor2.getString(cursor2.getColumnIndex("modelyear")), cursor2.getString(cursor2.getColumnIndex("vehicleidclient")), cursor2.getInt(cursor2.getColumnIndex("headUnitProtocolMajorVersionNumber")), cursor2.getInt(cursor2.getColumnIndex("headUnitProtocolMinorVersionNumber")), false, 0, null, null, null, null, false, false, false, cursor2.getString(cursor2.getColumnIndex("nickname")), null);
        String string = cursor2.getString(cursor2.getColumnIndex("vehicleid"));
        if (cursor2.getInt(cursor2.getColumnIndex("bluetoothConnectionAllowed")) != 0) {
            z = true;
        } else {
            z = false;
        }
        return new CarInfoInternal(carInfo, string, z, cursor2.getLong(cursor2.getColumnIndex("id")), cursor2.getLong(cursor2.getColumnIndex("connectiontime")), cursor2.getString(cursor2.getColumnIndex("bluetoothaddress")), cursor2.getString(cursor2.getColumnIndex("wifissid")), cursor2.getString(cursor2.getColumnIndex("wifibssid")), cursor2.getString(cursor2.getColumnIndex("wifipassword")), cursor2.getInt(cursor2.getColumnIndex("wifisecurity")), null, 0, 0, 0, true, "allowedcars".equals(str));
    }

    /* renamed from: b */
    public static boolean m30153b(Context context) {
        File a = m30149a(context);
        if (!a.exists()) {
            return true;
        }
        bnsi d = f38794a.mo68390d();
        d.mo68432a("pbp", "b", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Removing car database.");
        return a.delete();
    }

    /* renamed from: c */
    private static final String m30154c() {
        return Long.toHexString(new SecureRandom().nextLong());
    }

    /* JADX INFO: finally extract failed */
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        bnsi c = f38794a.mo68388c();
        c.mo68432a("pbp", "onDowngrade", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68411a("Downgrading database %d -> %d", i, i2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type IN ('table','view') AND name NOT LIKE 'sqlite_%'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN ('table','view')  ORDER BY 1 ", null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    String valueOf = String.valueOf(rawQuery.getString(0));
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            onCreate(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 4) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS allowedcars");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS rejectedcars");
            onCreate(sQLiteDatabase);
            return;
        }
        if (i == 4) {
            i = 6;
        }
        if (i == 5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS allowedcars");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS rejectedcars");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vehicleid");
            onCreate(sQLiteDatabase);
            return;
        }
        if (i == 6) {
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN  vehicleidclient TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN  bluetoothConnectionAllowed INTEGER DEFAULT 0");
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM rejectedcars", null);
            try {
                int columnIndex = rawQuery.getColumnIndex("id");
                if (rawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("vehicleidclient", m30154c());
                        sQLiteDatabase.update("rejectedcars", contentValues, "id = ?", new String[]{String.valueOf(rawQuery.getLong(columnIndex))});
                    } while (rawQuery.moveToNext());
                }
                if (rawQuery != null) {
                    rawQuery.close();
                    i = 7;
                } else {
                    i = 7;
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (i == 7) {
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN connectiontime INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN connectiontime INTEGER DEFAULT 0");
            i = 8;
        }
        if (i == 8) {
            sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN nickname TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN nickname TEXT");
        } else if (i != 9) {
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN bluetoothaddress TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifissid TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifibssid TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifipassword TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE allowedcars ADD COLUMN wifisecurity INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN bluetoothaddress TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifissid TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifibssid TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE rejectedcars ADD COLUMN wifisecurity INTEGER DEFAULT 0");
        return;
        throw th;
    }

    /* renamed from: c */
    private final void m30155c(CarInfoInternal carInfoInternal, String str) {
        CarInfo carInfo = carInfoInternal.f29539a;
        String str2 = carInfo.f29335d;
        if (str2 == null) {
            bnsi c = f38794a.mo68388c();
            c.mo68432a("pbp", "c", 827, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("vehicleId for client is null!");
            return;
        }
        String[] strArr = {str2, carInfo.f29332a};
        ContentValues contentValues = new ContentValues();
        contentValues.put("bluetoothaddress", carInfoInternal.f29544f);
        contentValues.put("wifissid", carInfoInternal.f29545g);
        contentValues.put("wifibssid", carInfoInternal.f29546h);
        contentValues.put("wifipassword", carInfoInternal.f29547i);
        contentValues.put("wifisecurity", Integer.valueOf(carInfoInternal.f29548j));
        try {
            getWritableDatabase().update(str, contentValues, "vehicleidclient = ? AND manufacturer = ?", strArr);
        } catch (Exception e) {
            bnsi b = f38794a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pbp", "c", 842, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error updating car wifi info");
        }
    }

    /* renamed from: b */
    public final void mo22887b() {
        m30151a("allowedcars");
        m30151a("rejectedcars");
    }

    /* renamed from: b */
    public final void mo22888b(CarInfoInternal carInfoInternal, String str) {
        if (carInfoInternal.f29540b == null) {
            bnsi c = f38794a.mo68388c();
            c.mo68432a("pbp", "b", 767, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("vehicleId is null!");
            return;
        }
        try {
            getWritableDatabase().delete(str, "vehicleid = ? AND manufacturer = ?", new String[]{carInfoInternal.f29540b, carInfoInternal.f29539a.f29332a});
        } catch (Exception e) {
            bnsi b = f38794a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pbp", "b", 778, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error removing car from table");
        }
    }

    /* renamed from: a */
    private final CarInfoInternal m30148a(String str, String str2, String[] strArr) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery(str2, strArr, null);
            try {
                if (rawQuery.moveToFirst()) {
                    return m30147a(rawQuery, str);
                }
                rawQuery.close();
                return null;
            } finally {
                rawQuery.close();
            }
        } catch (SQLiteException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo22889b(CarInfoInternal carInfoInternal) {
        return mo22880a(carInfoInternal, "rejectedcars", false) != null;
    }

    /* renamed from: a */
    public static File m30149a(Context context) {
        return context.getDatabasePath("carservicedata.db");
    }

    /* renamed from: a */
    private static final void m30150a(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder(str.length() + 375);
        sb.append("CREATE TABLE ");
        sb.append(str);
        sb.append("(id INTEGER PRIMARY KEY, manufacturer TEXT, model TEXT, modelyear TEXT, vehicleid TEXT, vehicleidclient TEXT, headUnitProtocolMajorVersionNumber INTEGER, headUnitProtocolMinorVersionNumber INTEGER, bluetoothConnectionAllowed INTEGER, connectiontime INTEGER, nickname TEXT,bluetoothaddress TEXT,wifissid TEXT,wifibssid TEXT,wifipassword TEXT,wifisecurity INTEGER)");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: a */
    private final void m30151a(String str) {
        try {
            getWritableDatabase().delete(str, null, null);
        } catch (SQLiteException e) {
            bnsi b = f38794a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pbp", "a", 759, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Error removing all cars from table");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* renamed from: a */
    private final boolean m30152a(CarInfoInternal carInfoInternal, String str, String str2, int i) {
        Cursor cursor;
        CarInfoInternal carInfoInternal2 = carInfoInternal;
        String str3 = str2;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Cursor query = writableDatabase.query(str, new String[]{str3}, "id = ?", new String[]{Long.toString(carInfoInternal2.f29542d)}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return false;
                } else if (query.getInt(query.getColumnIndex(str3)) != i) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(str3, Integer.valueOf(i));
                    writableDatabase.update(str, contentValues, "id = ?", new String[]{Long.toString(carInfoInternal2.f29542d)});
                    if (query != null) {
                        query.close();
                    }
                    return true;
                } else {
                    if (query != null) {
                        query.close();
                    }
                    return true;
                }
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    bnsi b = f38794a.mo68387b();
                    b.mo68437a(e);
                    b.mo68432a("pbp", "a", 870, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Exception while updating database");
                    if (cursor != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
            bnsi b2 = f38794a.mo68387b();
            b2.mo68437a(e);
            b2.mo68432a("pbp", "a", 870, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("Exception while updating database");
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final CarInfoInternal mo22879a(CarInfo carInfo, String str) {
        StringBuilder sb = new StringBuilder(str.length() + ErrorInfo.TYPE_SDU_UNKNOWN);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" WHERE manufacturer = ?     AND model = ?     AND modelyear = ?     AND vehicleidclient = ?     AND headUnitProtocolMajorVersionNumber = ?     AND headUnitProtocolMinorVersionNumber = ?");
        return m30148a(str, sb.toString(), new String[]{carInfo.f29332a, carInfo.f29333b, carInfo.f29334c, carInfo.f29335d, String.valueOf(carInfo.f29336e), String.valueOf(carInfo.f29337f)});
    }

    /* renamed from: a */
    public final CarInfoInternal mo22880a(CarInfoInternal carInfoInternal, String str, boolean z) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 193);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" WHERE manufacturer = ?     AND model = ?     AND modelyear = ?     AND vehicleid = ?     AND headUnitProtocolMajorVersionNumber = ?     AND headUnitProtocolMinorVersionNumber = ?");
        String sb2 = sb.toString();
        CarInfo carInfo = carInfoInternal.f29539a;
        CarInfoInternal a = m30148a(str, sb2, new String[]{carInfo.f29332a, carInfo.f29333b, carInfo.f29334c, carInfoInternal.f29540b, String.valueOf(carInfo.f29336e), String.valueOf(carInfoInternal.f29539a.f29337f)});
        if (a != null && z) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                long currentTimeMillis = System.currentTimeMillis();
                a.f29543e = currentTimeMillis;
                a.f29544f = carInfoInternal.f29544f;
                contentValues.put("connectiontime", Long.valueOf(currentTimeMillis));
                contentValues.put("bluetoothaddress", carInfoInternal.f29544f);
                writableDatabase.update(str, contentValues, "id = ?", new String[]{String.valueOf(a.f29542d)});
            } catch (SQLiteException e) {
                bnsi b = f38794a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("pbp", "a", 472, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error updating last connection timestamp or bluetooth address for car");
            }
        }
        return a;
    }

    /* renamed from: a */
    public final List mo22881a() {
        return mo22882a("allowedcars", getReadableDatabase());
    }

    /* renamed from: a */
    public final List mo22882a(String str, SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(str.length() + 43);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" ORDER BY connectiontime DESC");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(m30147a(rawQuery, str));
                } while (rawQuery.moveToNext());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        m30150a(sQLiteDatabase, "allowedcars");
        m30150a(sQLiteDatabase, "rejectedcars");
    }

    /* renamed from: a */
    public final void mo22883a(String str, String str2, String str3) {
        if (str != null) {
            try {
                getWritableDatabase().delete(str3, "vehicleidclient = ? AND manufacturer = ?", new String[]{str, str2});
            } catch (SQLiteException e) {
                bnsi b = f38794a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("pbp", "a", 800, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error removing car from table");
            }
        } else {
            bnsi c = f38794a.mo68388c();
            c.mo68432a("pbp", "a", 788, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("vehicleId for client is null!");
        }
    }

    /* renamed from: a */
    public final void mo22884a(String str, String str2, String str3, String str4) {
        if (str != null) {
            String[] strArr = {str, str2};
            ContentValues contentValues = new ContentValues();
            contentValues.put("nickname", str3);
            try {
                getWritableDatabase().update(str4, contentValues, "vehicleidclient = ? AND manufacturer = ?", strArr);
            } catch (Exception e) {
                bnsi b = f38794a.mo68387b();
                b.mo68437a(e);
                b.mo68432a("pbp", "a", 820, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error updating car nickname");
            }
        } else {
            bnsi c = f38794a.mo68388c();
            c.mo68432a("pbp", "a", 808, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("vehicleId for client is null!");
        }
    }

    /* renamed from: a */
    public final boolean mo22885a(CarInfoInternal carInfoInternal) {
        return mo22880a(carInfoInternal, "allowedcars", false) != null;
    }

    /* renamed from: a */
    public final boolean mo22886a(CarInfoInternal carInfoInternal, String str) {
        carInfoInternal.f29539a.f29335d = m30154c();
        carInfoInternal.f29543e = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("manufacturer", carInfoInternal.f29539a.f29332a);
        contentValues.put("model", carInfoInternal.f29539a.f29333b);
        contentValues.put("modelyear", carInfoInternal.f29539a.f29334c);
        contentValues.put("vehicleid", carInfoInternal.f29540b);
        contentValues.put("vehicleidclient", carInfoInternal.f29539a.f29335d);
        contentValues.put("headUnitProtocolMajorVersionNumber", Integer.valueOf(carInfoInternal.f29539a.f29336e));
        contentValues.put("headUnitProtocolMinorVersionNumber", Integer.valueOf(carInfoInternal.f29539a.f29337f));
        contentValues.put("bluetoothConnectionAllowed", Integer.valueOf(carInfoInternal.f29541c ? 1 : 0));
        contentValues.put("nickname", carInfoInternal.f29539a.f29347p);
        contentValues.put("connectiontime", Long.valueOf(carInfoInternal.f29543e));
        contentValues.put("bluetoothaddress", carInfoInternal.f29544f);
        contentValues.put("wifissid", carInfoInternal.f29545g);
        contentValues.put("wifibssid", carInfoInternal.f29546h);
        contentValues.put("wifipassword", carInfoInternal.f29547i);
        contentValues.put("wifisecurity", Integer.valueOf(carInfoInternal.f29548j));
        try {
            long insert = getWritableDatabase().insert(str, null, contentValues);
            if (insert == -1) {
                bnsi c = f38794a.mo68388c();
                c.mo68432a("pbp", "a", 726, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("adding car info to db table %s failed", str);
                return false;
            }
            carInfoInternal.f29542d = insert;
            carInfoInternal.f29554p = "allowedcars".equals(str);
            return true;
        } catch (SQLiteException e) {
            bnsi b = f38794a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("pbp", "a", 733, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Exception while inserting into database");
            return false;
        }
    }
}
