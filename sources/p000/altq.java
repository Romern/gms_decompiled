package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.api.operations.DatabaseUpdateOperation;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: altq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altq {

    /* renamed from: a */
    public static final ancd f74241a = new ance();

    /* renamed from: h */
    public static final ancw f74242h = anbx.INSTANCE;

    /* renamed from: j */
    public static final String f74243j = String.format(Locale.US, "(SELECT %s FROM %s WHERE %s=? AND %s IS NULL) ", "_id", "owners", "account_name", "page_gaia_id");

    /* renamed from: n */
    private static final String[] f74244n = {"value"};

    /* renamed from: o */
    private static altq f74245o;

    /* renamed from: b */
    public final Context f74246b;

    /* renamed from: c */
    public final altp f74247c;

    /* renamed from: d */
    public alto f74248d;

    /* renamed from: e */
    public final altv f74249e;

    /* renamed from: f */
    public final altn f74250f;

    /* renamed from: g */
    public volatile CountDownLatch f74251g = new CountDownLatch(1);

    /* renamed from: i */
    public almi f74252i;

    /* renamed from: k */
    private final Object f74253k = new Object();

    /* renamed from: l */
    private final altl f74254l = new altl();

    /* renamed from: m */
    private alto f74255m;

    private altq(Context context) {
        this.f74246b = context.getApplicationContext();
        this.f74247c = new altp(this, this.f74246b, "pluscontacts.db", "pluscontacts.db");
        this.f74250f = new altn(this);
        this.f74249e = new altv(this, context);
        ancm.m64005a(this.f74246b);
    }

    /* renamed from: a */
    public static int m61805a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT last_sync_status FROM owners WHERE account_name=? AND page_gaia_id IS NULL", new String[]{str});
        } catch (SQLiteDoneException e) {
            return -1;
        }
    }

    /* renamed from: b */
    private static int m61814b(Context context, SQLiteDatabase sQLiteDatabase) {
        LinkedHashSet<String> linkedHashSet;
        String str;
        Cursor rawQuery;
        int i;
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83293aW()).booleanValue()) {
            linkedHashSet = new LinkedHashSet(ancx.m64047a(context));
        } else {
            linkedHashSet = new LinkedHashSet(f74242h.mo41679c(context));
        }
        sQLiteDatabase.beginTransaction();
        try {
            amig.m62939a();
            if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83326bC()).booleanValue()) {
                str = "SELECT DISTINCT account_name FROM owners";
            } else {
                str = "SELECT DISTINCT account_name FROM owners WHERE page_gaia_id IS NULL";
            }
            rawQuery = sQLiteDatabase.rawQuery(str, null);
            rawQuery.moveToPosition(-1);
            while (true) {
                i = 0;
                if (!rawQuery.moveToNext()) {
                    break;
                }
                linkedHashSet.remove(rawQuery.getString(0));
            }
            rawQuery.close();
            ContentValues contentValues = new ContentValues();
            for (String str2 : linkedHashSet) {
                contentValues.clear();
                contentValues.put("account_name", str2);
                sQLiteDatabase.insertOrThrow("owners", null, contentValues);
                i++;
                aluj.m61900a(context, "PeopleDatabaseHelper", str2, (String) null, "Account added");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return i;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: c */
    public static void m61816c(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT sql FROM sqlite_master WHERE name='owners' AND type='table'", null);
        rawQuery.moveToFirst();
        if (!rawQuery.getString(0).contains("cover_photo_id")) {
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN cover_photo_url TEXT;");
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN  cover_photo_height INTEGER NOT NULL DEFAULT 0;");
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN  cover_photo_width INTEGER NOT NULL DEFAULT 0;");
            sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN cover_photo_id TEXT;");
        }
        rawQuery.close();
    }

    /* renamed from: d */
    static void m61817d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE owners ADD COLUMN last_full_people_sync_time INTEGER NOT NULL DEFAULT 0;");
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
    /* renamed from: e */
    public static void m61818e(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_status", (Integer) 4);
        contentValues.put("last_successful_sync_time", (Integer) 0);
        sQLiteDatabase.update("owners", contentValues, null, null);
    }

    /* renamed from: f */
    public final int mo40772f() {
        return mo40760a("ac_people", "owners", "owner_id", "_id");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final void mo40774g() {
        almi almi;
        int i;
        int i2;
        int i3;
        almi almi2;
        amig.m62939a();
        bmza b = bmza.m108658b();
        int b2 = m61814b(this.f74246b, mo40768c().f74233b);
        if (b2 > 0) {
            almx a = almx.m61368a(this.f74246b);
            a.mo40598a(null, null, 1);
            a.mo40599b();
        }
        if (((Boolean) amhj.f74912a.mo41191a()).booleanValue() && (almi2 = this.f74252i) != null) {
            almi2.f73714c = b2;
        }
        if (((Boolean) amhk.f74913a.mo41191a()).booleanValue() && this.f74252i != null) {
            bmza b3 = bmza.m108658b();
            Cursor rawQuery = mo40763b().f74233b.rawQuery("SELECT COUNT(*),COUNT(DISTINCT account_name),SUM(CASE WHEN page_gaia_id IS NULL THEN 1 ELSE 0 END) FROM owners", null);
            try {
                if (!rawQuery.moveToFirst()) {
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                } else if (rawQuery.getColumnCount() == 3) {
                    i3 = rawQuery.getInt(0);
                    i2 = rawQuery.getInt(1);
                    i = rawQuery.getInt(2);
                } else {
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                rawQuery.close();
                almi almi3 = this.f74252i;
                long a2 = b3.mo66928a(TimeUnit.MICROSECONDS);
                bxvd da = ammj.f75289f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ammj ammj = (ammj) da.f164949b;
                int i4 = ammj.f75291a | 8;
                ammj.f75291a = i4;
                ammj.f75295e = i3;
                int i5 = 1 | i4;
                ammj.f75291a = i5;
                ammj.f75292b = i2;
                int i6 = i5 | 2;
                ammj.f75291a = i6;
                ammj.f75293c = i;
                ammj.f75291a = i6 | 4;
                ammj.f75294d = a2;
                almi3.f73718g = (ammj) da.mo74062i();
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        if (((Boolean) amgt.f74896a.mo41191a()).booleanValue() && (almi = this.f74252i) != null) {
            almi.f73720i = b.mo66928a(TimeUnit.MICROSECONDS);
        }
    }

    /* renamed from: a */
    public static synchronized altq m61806a(Context context) {
        altq altq;
        synchronized (altq.class) {
            if (f74245o == null) {
                f74245o = new altq(context.getApplicationContext());
                if (!m61812a()) {
                    m61814b(context, f74245o.mo40768c().f74233b);
                    f74245o.mo40764b("gcoreVersion", String.valueOf(spn.m35881e(context)));
                }
                context.startService(IntentOperation.getStartIntent(context, DatabaseUpdateOperation.class, "com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC"));
            }
            altq = f74245o;
        }
        return altq;
    }

    /* renamed from: d */
    public final void mo40769d() {
        altn altn = this.f74250f;
        altn.f74226b.clear();
        altn.f74227c.clear();
        almx.m61368a(this.f74246b).mo40599b();
    }

    /* renamed from: f */
    public final void mo40773f(SQLiteDatabase sQLiteDatabase) {
        altp.m61799c(sQLiteDatabase);
        altp.m61802f(sQLiteDatabase);
    }

    /* renamed from: e */
    public final int mo40771e() {
        return mo40760a("ac_container", "ac_people", "people_id", "_id");
    }

    /* renamed from: c */
    public final long mo40766c(String str) {
        return DatabaseUtils.queryNumEntries(mo40763b().f74233b, str);
    }

    /* renamed from: d */
    public final void mo40770d(String str) {
        mo40764b(str, "1");
    }

    /* renamed from: c */
    public final long mo40767c(String str, String str2) {
        String b = this.f74250f.mo40739b(str, null);
        alto b2 = mo40763b();
        StringBuilder sb = new StringBuilder(str2.length() + 31);
        sb.append("SELECT ");
        sb.append(str2);
        sb.append(" FROM owners WHERE _id=?");
        return b2.mo40743a(sb.toString(), new String[]{b}, -1);
    }

    /* renamed from: c */
    public final alto mo40768c() {
        alto alto;
        andd a;
        boolean b = cfzd.m143999b();
        synchronized (this.f74253k) {
            if (this.f74255m == null) {
                try {
                    this.f74255m = new alto(this.f74246b, this, this.f74254l, this.f74247c.getWritableDatabase(), true);
                } catch (Exception e) {
                    a.mo41718a(e, ((Double) amgz.f74902a.mo41191a()).doubleValue());
                    if (b && (e instanceof SQLiteCantOpenDatabaseException)) {
                        return null;
                    }
                    throw e;
                } catch (SQLiteException e2) {
                    if (b) {
                        if (e2 instanceof SQLiteCantOpenDatabaseException) {
                            if (!cgbe.f186279a.mo6606a().mo83426cx()) {
                                return null;
                            }
                            try {
                                this.f74247c.close();
                                this.f74255m = new alto(this.f74246b, this, this.f74254l, this.f74247c.getWritableDatabase(), true);
                            } catch (SQLiteException e3) {
                                return null;
                            }
                        }
                    }
                    amig.m62939a();
                    if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83336bM()).booleanValue()) {
                        a = ande.f76660a.mo41719a(this.f74246b);
                        a.mo41718a(e2, ((Double) amgz.f74902a.mo41191a()).doubleValue());
                        File databasePath = rpr.m34216b().getDatabasePath("pluscontacts.db");
                        databasePath.getAbsolutePath();
                        SQLiteDatabase.deleteDatabase(databasePath);
                        this.f74255m = new alto(this.f74246b, this, this.f74254l, this.f74247c.getWritableDatabase(), true);
                    } else {
                        throw e2;
                    }
                }
            }
            alto = this.f74255m;
        }
        return alto;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(boolean, boolean):android.os.Bundle
     arg types: [int, int]
     candidates:
      amea.a(java.lang.String, long):java.util.List
      amea.a(android.accounts.Account, java.lang.String):void
      amea.a(java.lang.String, java.lang.String):void
      amea.a(boolean, boolean):android.os.Bundle */
    /* renamed from: a */
    public static void m61807a(Context context, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens;");
        amea a = amea.m62724a(context);
        aluj.m61904b(a.f74784a, "PeopleSync", "requestAllFullSyncForDbUpgrade");
        bnrd a2 = a.f74786c.mo41680d(a.f74784a).iterator();
        while (a2.hasNext()) {
            amea.m62728a((Account) a2.next(), "com.google.android.gms.people", amea.m62725a(false, false));
        }
    }

    /* renamed from: a */
    public static void m61808a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE name = 'people';");
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE name = 'gaiamap';");
        sQLiteDatabase.execSQL("DELETE FROM sync_tokens WHERE name = 'autocomplete';");
    }

    /* renamed from: a */
    private static void m61809a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put("value", str2);
        sQLiteDatabase.replace("properties", null, contentValues);
    }

    /* renamed from: a */
    public static void m61810a(SQLiteDatabase sQLiteDatabase, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sQLiteDatabase.execSQL((String) list.get(i));
        }
    }

    /* renamed from: a */
    public static void m61811a(SQLiteDatabase sQLiteDatabase, Locale locale) {
        m61809a(sQLiteDatabase, "dbLocale", locale.toString());
    }

    /* renamed from: a */
    public static boolean m61812a() {
        boolean equals = "1".equals(stn.m36304a("gms.people.read_only", ""));
        if (equals) {
            amdk.m62658a("PeopleDatabaseHelper", "%s is set.  Some features are disabled.", "gms.people.read_only");
        }
        return equals;
    }

    /* renamed from: a */
    private final boolean m61813a(String str, String[] strArr) {
        Cursor a = mo40763b().mo40744a(str, strArr);
        try {
            return a.moveToFirst();
        } finally {
            a.close();
        }
    }

    /* renamed from: b */
    public static void m61815b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DELETE FROM people WHERE in_contacts=0 AND NOT EXISTS (SELECT * FROM circle_members AS cm WHERE cm.owner_id = people.owner_id AND cm.qualified_id = people.qualified_id)");
    }

    /* renamed from: a */
    public final int mo40760a(String str, String str2, String str3, String str4) {
        SQLiteDatabase sQLiteDatabase = mo40763b().f74233b;
        int length = str.length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 73 + length2 + str3.length() + str4.length());
        sb.append("SELECT COUNT(1) FROM ");
        sb.append(str);
        sb.append(" WHERE  NOT EXISTS( SELECT 1 FROM ");
        sb.append(str2);
        sb.append(" AS p WHERE ");
        sb.append(str3);
        sb.append(" = p.");
        sb.append(str4);
        sb.append(")");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            int i = 0;
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            return i;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    public final alto mo40763b() {
        alto alto;
        synchronized (this.f74253k) {
            if (this.f74248d == null) {
                try {
                    this.f74248d = new alto(this.f74246b, this, this.f74254l, this.f74247c.getReadableDatabase(), false);
                } catch (SQLiteCantOpenDatabaseException e) {
                    if (cfzd.m143999b()) {
                        return null;
                    }
                    throw e;
                }
            }
            alto = this.f74248d;
        }
        return alto;
    }

    /* renamed from: a */
    public final long mo40761a(String str) {
        return mo40767c(str, "last_sync_finish_time");
    }

    /* renamed from: a */
    public final String mo40762a(String str, String str2) {
        String str3;
        Cursor a = mo40763b().mo40745a("properties", f74244n, "name=?", new String[]{str});
        try {
            if (a.moveToFirst()) {
                str3 = a.getString(0);
            } else {
                str3 = null;
            }
            return str3 != null ? str3 : str2;
        } finally {
            a.close();
        }
    }

    /* renamed from: b */
    public final void mo40764b(String str, String str2) {
        m61809a(mo40768c().f74233b, str, str2);
    }

    /* renamed from: b */
    public final boolean mo40765b(String str) {
        String str2 = f74243j;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 50);
        sb.append("SELECT 1 FROM people WHERE owner_id IN (");
        sb.append(str2);
        sb.append(" ) LIMIT 1");
        if (!m61813a(sb.toString(), new String[]{str})) {
            String str3 = f74243j;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 126);
            sb2.append("SELECT 1 FROM ac_people p JOIN ac_container c ON p._id=c.people_id WHERE (p.owner_id IN (");
            sb2.append(str3);
            sb2.append(" )) AND (c.container_type!=1) LIMIT 1");
            if (!m61813a(sb2.toString(), new String[]{str})) {
                return false;
            }
        }
        return true;
    }
}
