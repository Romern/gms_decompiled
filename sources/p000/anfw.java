package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: anfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anfw extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a */
    public static final srn f76780a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    static final bmzi f76781b = bmzn.m108681a(anfk.f76770a);

    /* renamed from: c */
    static final Object f76782c = new Object();

    /* renamed from: d */
    protected static volatile anfw f76783d;

    /* renamed from: e */
    protected static volatile anfw f76784e;

    /* renamed from: h */
    private static final Method f76785h;

    /* renamed from: i */
    private static final Method f76786i;

    /* renamed from: f */
    int f76787f = 0;

    /* renamed from: g */
    ScheduledFuture f76788g;

    /* renamed from: j */
    private final ScheduledExecutorService f76789j;

    static {
        Method method;
        int i = Build.VERSION.SDK_INT;
        Method method2 = null;
        try {
            method = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
            method.setAccessible(true);
        } catch (Throwable th) {
            bnsl bnsl = (bnsl) f76780a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("anfw", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to reflect getThreadSession");
            method = null;
        }
        f76785h = method;
        if (method != null) {
            try {
                method2 = method.getReturnType().getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
            } catch (Throwable th2) {
                bnsl bnsl2 = (bnsl) f76780a.mo68387b();
                bnsl2.mo68437a(th2);
                bnsl2.mo68432a("anfw", "c", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Unable to reflect beginTransaction");
            }
        }
        f76786i = method2;
        Charset.forName("UTF-8");
    }

    public anfw(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, ((Integer) f76781b.mo6606a()).intValue());
        this.f76789j = scheduledExecutorService;
    }

    /* renamed from: a */
    public static ContentValues m64175a(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        ContentValues contentValues = new ContentValues();
        for (int i = 0; i < columnNames.length; i++) {
            int type = cursor.getType(i);
            if (type == 1) {
                contentValues.put(columnNames[i], Integer.valueOf(cursor.getInt(i)));
            } else if (type == 2) {
                contentValues.put(columnNames[i], Float.valueOf(cursor.getFloat(i)));
            } else if (type != 4) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
        return contentValues;
    }

    /* renamed from: b */
    public static String m64184b(SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("PRAGMA integrity_check;");
        try {
            String simpleQueryForString = compileStatement.simpleQueryForString();
            if (compileStatement != null) {
                compileStatement.close();
            }
            return simpleQueryForString;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private static Method m64187c() {
        Method method = f76785h;
        if (method == null) {
            return null;
        }
        try {
            return method.getReturnType().getDeclaredMethod("beginTransaction", Integer.TYPE, SQLiteTransactionListener.class, Integer.TYPE, CancellationSignal.class);
        } catch (Throwable th) {
            bnsl bnsl = (bnsl) f76780a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("anfw", "c", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to reflect beginTransaction");
            return null;
        }
    }

    public final synchronized void close() {
        synchronized (f76782c) {
            int i = this.f76787f - 1;
            this.f76787f = i;
            if (i == 0) {
                this.f76788g = this.f76789j.schedule(new anfj(this), cgbz.f186551a.mo6606a().mo83487b(), TimeUnit.SECONDS);
            }
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        sQLiteDatabase.enableWriteAheadLogging();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        anfu.m64170a(sQLiteDatabase);
        sQLiteDatabase2.execSQL(m64178a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
        String[] strArr = new String[3];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "user TEXT NOT NULL";
        String valueOf = String.valueOf(m64179a("packageName", "user"));
        strArr[2] = valueOf.length() == 0 ? new String("version INTEGER NOT NULL") : "version INTEGER NOT NULL".concat(valueOf);
        sQLiteDatabase2.execSQL(m64178a("MultiCommitApplicationStates", strArr));
        String[] strArr2 = anfr.f76776a;
        String[] strArr3 = new String[2];
        strArr3[0] = "logSourceName TEXT NOT NULL";
        String valueOf2 = String.valueOf(m64179a("logSourceName", "packageName"));
        strArr3[1] = valueOf2.length() == 0 ? new String("packageName TEXT NOT NULL") : "packageName TEXT NOT NULL".concat(valueOf2);
        sQLiteDatabase2.execSQL(m64178a("LogSources", strArr3));
        sQLiteDatabase2.execSQL(m64177a("LogSources", "packageName", "packageName"));
        sQLiteDatabase2.execSQL(m64178a("WeakExperimentIds", "packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(m64177a("WeakExperimentIds", "packageName", "packageName"));
        anfo.m64165a(sQLiteDatabase);
        String[] strArr4 = anfq.f76774a;
        String[] strArr5 = new String[12];
        strArr5[0] = "packageName TEXT NOT NULL";
        strArr5[1] = "version INTEGER NOT NULL";
        strArr5[2] = "flagType INTEGER NOT NULL";
        strArr5[3] = "partitionId INTEGER NOT NULL";
        strArr5[4] = "user TEXT NOT NULL";
        strArr5[5] = "name TEXT NOT NULL";
        strArr5[6] = "intVal INTEGER";
        strArr5[7] = "boolVal INTEGER";
        strArr5[8] = "floatVal REAL";
        strArr5[9] = "stringVal TEXT";
        strArr5[10] = "extensionVal BLOB";
        String valueOf3 = String.valueOf(m64179a("packageName", "version", "flagType", "partitionId", "user", "name", "committed"));
        strArr5[11] = valueOf3.length() == 0 ? new String("committed INTEGER NOT NULL") : "committed INTEGER NOT NULL".concat(valueOf3);
        sQLiteDatabase2.execSQL(m64178a("Flags", strArr5));
        sQLiteDatabase2.execSQL(m64177a("Flags", "committed", "packageName", "version", "user", "committed"));
        sQLiteDatabase2.execSQL(m64178a("RequestTags", "user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"));
        String[] strArr6 = new String[5];
        strArr6[0] = "packageName TEXT NOT NULL";
        strArr6[1] = "version INTEGER NOT NULL";
        strArr6[2] = "partitionId INTEGER NOT NULL";
        strArr6[3] = "user TEXT NOT NULL";
        String valueOf4 = String.valueOf(m64179a("packageName", "version", "partitionId", "user"));
        strArr6[4] = valueOf4.length() == 0 ? new String("tag BLOB NOT NULL") : "tag BLOB NOT NULL".concat(valueOf4);
        sQLiteDatabase2.execSQL(m64178a("ApplicationTags", strArr6));
        String[] strArr7 = anfn.f76771a;
        sQLiteDatabase2.execSQL(m64178a("CrossLoggedExperimentTokens", "fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(m64177a("CrossLoggedExperimentTokens", "apply", "fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"));
        sQLiteDatabase2.execSQL(m64177a("CrossLoggedExperimentTokens", "remove", "toPackageName"));
        sQLiteDatabase2.execSQL(m64178a("ChangeCounts", "packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(m64178a("DogfoodsToken", "key INTEGER NOT NULL PRIMARY KEY", "token BLOB"));
        sQLiteDatabase2.execSQL(m64178a("LastFetch", "key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"));
        String[] strArr8 = anfp.f76773a;
        String[] strArr9 = new String[10];
        strArr9[0] = "packageName TEXT NOT NULL";
        strArr9[1] = "user TEXT NOT NULL";
        strArr9[2] = "name TEXT NOT NULL";
        strArr9[3] = "flagType INTEGER NOT NULL";
        strArr9[4] = "intVal INTEGER";
        strArr9[5] = "boolVal INTEGER";
        strArr9[6] = "floatVal REAL";
        strArr9[7] = "stringVal TEXT";
        strArr9[8] = "extensionVal BLOB";
        String valueOf5 = String.valueOf(m64179a("packageName", "user", "name", "committed"));
        strArr9[9] = valueOf5.length() == 0 ? new String("committed") : "committed".concat(valueOf5);
        sQLiteDatabase2.execSQL(m64178a("FlagOverrides", strArr9));
        sQLiteDatabase2.execSQL(m64178a("GenericDimensions", "packageName TEXT NOT NULL", "isolationkey TEXT NOT NULL DEFAULT ''", "namespace INTEGER NOT NULL", "instance INTEGER NOT NULL"));
        sQLiteDatabase2.execSQL(m64177a("GenericDimensions", "configPackageIsolationKey", "packageName", "isolationkey"));
        if (((Integer) f76781b.mo6606a()).intValue() >= 22) {
            sQLiteDatabase2.execSQL(m64178a("LastSyncAfterRequest", "packageName TEXT NOT NULL PRIMARY KEY", "servingVersion INTEGER NOT NULL DEFAULT 0"));
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 != 22 || i < 23) {
            bnsl bnsl = (bnsl) f76780a.mo68390d();
            bnsl.mo68432a("anfw", "onDowngrade", 1736, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("onDowngrade %d to %d", i, i2);
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type ='table'", null);
            while (rawQuery.moveToNext()) {
                try {
                    if (!"android_metadata".equals(rawQuery.getString(0))) {
                        String valueOf = String.valueOf(rawQuery.getString(0));
                        sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            onCreate(sQLiteDatabase);
            return;
        }
        return;
        throw th;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        String str2;
        String str3;
        int i3;
        String str4;
        String str5;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i4 = i;
        int i5 = i2;
        bnsl bnsl = (bnsl) f76780a.mo68390d();
        bnsl.mo68432a("anfw", "onUpgrade", 1207, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68411a("onUpgrade %d to %d", i4, i5);
        if (i4 >= 3 || i5 < 3) {
            str = "version INTEGER NOT NULL";
            str3 = "androidPackageName";
            str2 = "Packages";
        } else {
            bnsl bnsl2 = (bnsl) f76780a.mo68390d();
            bnsl2.mo68432a("anfw", "onUpgrade", 1210, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Wiping Phenotype Database.");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS Packages");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ApplicationStates");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS LogSources");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS WeakExperimentIds");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ExperimentTokens");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS Flags");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS RequestTags");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ApplicationTags");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS CrossLoggedExperimentTokens");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ChangeCounts");
            sQLiteDatabase2.execSQL(m64178a("Packages", "packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL"));
            sQLiteDatabase2.execSQL(m64177a("Packages", "androidPackageName", "androidPackageName"));
            str3 = "androidPackageName";
            sQLiteDatabase2.execSQL(m64178a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
            String[] strArr = new String[2];
            strArr[0] = "logSourceName TEXT NOT NULL";
            String valueOf = String.valueOf(m64179a("logSourceName", "packageName"));
            strArr[1] = valueOf.length() == 0 ? new String("packageName TEXT NOT NULL") : "packageName TEXT NOT NULL".concat(valueOf);
            sQLiteDatabase2.execSQL(m64178a("LogSources", strArr));
            sQLiteDatabase2.execSQL(m64177a("LogSources", "packageName", "packageName"));
            sQLiteDatabase2.execSQL(m64178a("WeakExperimentIds", "packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"));
            sQLiteDatabase2.execSQL(m64177a("WeakExperimentIds", "packageName", "packageName"));
            String[] strArr2 = new String[6];
            strArr2[0] = "packageName TEXT NOT NULL";
            strArr2[1] = "version INTEGER NOT NULL";
            strArr2[2] = "user TEXT NOT NULL";
            strArr2[3] = "isCommitted INTEGER NOT NULL";
            strArr2[4] = "experimentToken BLOB NOT NULL";
            String valueOf2 = String.valueOf(m64179a("packageName", "version", "user", "isCommitted"));
            str2 = "Packages";
            strArr2[5] = valueOf2.length() == 0 ? new String("serverToken TEXT NOT NULL") : "serverToken TEXT NOT NULL".concat(valueOf2);
            sQLiteDatabase2.execSQL(m64178a("ExperimentTokens", strArr2));
            sQLiteDatabase2.execSQL(m64177a("ExperimentTokens", "committed", "packageName", "version", "user", "isCommitted"));
            String[] strArr3 = new String[12];
            strArr3[0] = "packageName TEXT NOT NULL";
            strArr3[1] = "version INTEGER NOT NULL";
            strArr3[2] = "flagType INTEGER NOT NULL";
            strArr3[3] = "partitionId INTEGER NOT NULL";
            strArr3[4] = "user TEXT NOT NULL";
            strArr3[5] = "name TEXT NOT NULL";
            strArr3[6] = "intVal INTEGER";
            strArr3[7] = "boolVal INTEGER";
            strArr3[8] = "floatVal REAL";
            strArr3[9] = "stringVal TEXT";
            strArr3[10] = "extensionVal BLOB";
            String valueOf3 = String.valueOf(m64179a("packageName", "version", "flagType", "partitionId", "user", "name", "committed"));
            strArr3[11] = valueOf3.length() == 0 ? new String("committed INTEGER NOT NULL") : "committed INTEGER NOT NULL".concat(valueOf3);
            sQLiteDatabase2.execSQL(m64178a("Flags", strArr3));
            sQLiteDatabase2.execSQL(m64177a("Flags", "committed", "packageName", "version", "user", "committed"));
            sQLiteDatabase2.execSQL(m64178a("RequestTags", "user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"));
            String[] strArr4 = new String[5];
            strArr4[0] = "packageName TEXT NOT NULL";
            strArr4[1] = "version INTEGER NOT NULL";
            strArr4[2] = "partitionId INTEGER NOT NULL";
            strArr4[3] = "user TEXT NOT NULL";
            str = "version INTEGER NOT NULL";
            String valueOf4 = String.valueOf(m64179a("packageName", "version", "partitionId", "user"));
            strArr4[4] = valueOf4.length() == 0 ? new String("tag BLOB NOT NULL") : "tag BLOB NOT NULL".concat(valueOf4);
            sQLiteDatabase2.execSQL(m64178a("ApplicationTags", strArr4));
            sQLiteDatabase2.execSQL(m64178a("CrossLoggedExperimentTokens", "fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"));
            sQLiteDatabase2.execSQL(m64177a("CrossLoggedExperimentTokens", "apply", "fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"));
            sQLiteDatabase2.execSQL(m64177a("CrossLoggedExperimentTokens", "remove", "toPackageName"));
            sQLiteDatabase2.execSQL(m64178a("ChangeCounts", "key INTEGER NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        }
        if (i4 < 4) {
            i3 = i2;
            if (i3 >= 4) {
                bnsl bnsl3 = (bnsl) f76780a.mo68390d();
                bnsl3.mo68432a("anfw", "onUpgrade", 1393, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Adding DogfoodsToken table");
                sQLiteDatabase2.execSQL(m64178a("DogfoodsToken", "key INTEGER NOT NULL PRIMARY KEY", "token BLOB"));
            }
        } else {
            i3 = i2;
        }
        if (i4 < 5 && i3 >= 5) {
            bnsl bnsl4 = (bnsl) f76780a.mo68390d();
            bnsl4.mo68432a("anfw", "onUpgrade", 1403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Adding configHash to ExperimentTokens table");
            sQLiteDatabase2.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN configHash TEXT NOT NULL DEFAULT ''");
        }
        if (i4 < 6 && i3 >= 6) {
            bnsl bnsl5 = (bnsl) f76780a.mo68390d();
            bnsl5.mo68432a("anfw", "onUpgrade", 1413, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Adding LastFetch table");
            sQLiteDatabase2.execSQL(m64178a("LastFetch", "key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"));
        }
        if (i4 < 7 && i3 >= 7) {
            bnsl bnsl6 = (bnsl) f76780a.mo68390d();
            bnsl6.mo68432a("anfw", "onUpgrade", 1423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Relaxing LogSources Table restrictions");
            String[] strArr5 = new String[2];
            strArr5[0] = "logSourceName TEXT NOT NULL";
            String valueOf5 = String.valueOf(m64179a("logSourceName", "packageName"));
            strArr5[1] = valueOf5.length() == 0 ? new String("packageName TEXT NOT NULL") : "packageName TEXT NOT NULL".concat(valueOf5);
            sQLiteDatabase2.execSQL(m64178a("LogSources_copy", strArr5));
            sQLiteDatabase2.execSQL("INSERT INTO LogSources_copy (logSourceName, packageName) SELECT logSourceName, packageName FROM LogSources");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS LogSources");
            sQLiteDatabase2.execSQL("ALTER TABLE LogSources_copy RENAME TO LogSources");
        }
        if (i4 < 8 && i3 >= 8) {
            bnsl bnsl7 = (bnsl) f76780a.mo68390d();
            bnsl7.mo68432a("anfw", "onUpgrade", 1452, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Add isSynced to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN isSynced DEFAULT 0");
        }
        if (i4 < 9 && i3 >= 9) {
            bnsl bnsl8 = (bnsl) f76780a.mo68390d();
            bnsl8.mo68432a("anfw", "onUpgrade", 1457, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl8.mo68405a("Add subscribedGcm to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN subscribedGcm INTEGER NOT NULL DEFAULT 0");
            bnsl bnsl9 = (bnsl) f76780a.mo68390d();
            bnsl9.mo68432a("anfw", "onUpgrade", 1466, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl9.mo68405a("Add UnsubscribeGcmPackages table");
            sQLiteDatabase2.execSQL(m64178a("UnsubscribeGcmPackages", "packageName TEXT NOT NULL PRIMARY KEY"));
        }
        if (i4 < 10 && i3 >= 10) {
            bnsl bnsl10 = (bnsl) f76780a.mo68390d();
            bnsl10.mo68432a("anfw", "onUpgrade", 1472, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl10.mo68405a("Adding FlagOverrides table");
            String[] strArr6 = new String[10];
            strArr6[0] = "packageName TEXT NOT NULL";
            strArr6[1] = "user TEXT NOT NULL";
            strArr6[2] = "name TEXT NOT NULL";
            strArr6[3] = "flagType INTEGER NOT NULL";
            strArr6[4] = "intVal INTEGER";
            strArr6[5] = "boolVal INTEGER";
            strArr6[6] = "floatVal REAL";
            strArr6[7] = "stringVal TEXT";
            strArr6[8] = "extensionVal BLOB";
            String valueOf6 = String.valueOf(m64179a("packageName", "user", "name", "committed"));
            strArr6[9] = valueOf6.length() == 0 ? new String("committed") : "committed".concat(valueOf6);
            sQLiteDatabase2.execSQL(m64178a("FlagOverrides", strArr6));
        }
        if (i4 < 11 && i3 >= 11) {
            bnsl bnsl11 = (bnsl) f76780a.mo68390d();
            bnsl11.mo68432a("anfw", "onUpgrade", 1495, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl11.mo68405a("Update patchable to nullable in ApplicationStates");
            sQLiteDatabase2.execSQL("ALTER TABLE ApplicationStates RENAME TO OldApplicationStates");
            sQLiteDatabase2.execSQL(m64178a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", str, "patchable INTEGER"));
            StringBuilder sb = new StringBuilder(134);
            sb.append("INSERT INTO ApplicationStates(packageName,user,version,patchable) SELECT packageName,user,version,patchable FROM OldApplicationStates;");
            sQLiteDatabase2.execSQL(sb.toString());
            sQLiteDatabase2.execSQL("DROP TABLE OldApplicationStates;");
        }
        if (i4 < 12 && i3 >= 12) {
            bnsl bnsl12 = (bnsl) f76780a.mo68390d();
            bnsl12.mo68432a("anfw", "onUpgrade", 1526, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl12.mo68405a("Fix Phenotype registration to be weak");
            sQLiteDatabase2.execSQL("UPDATE Packages SET weak = 1 WHERE packageName = 'com.google.android.gms.phenotype'");
        }
        if (i4 < 13 && i3 >= 13) {
            bnsl bnsl13 = (bnsl) f76780a.mo68390d();
            bnsl13.mo68432a("anfw", "onUpgrade", 1532, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl13.mo68405a("Update ChangeCounts schema");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS ChangeCounts");
            sQLiteDatabase2.execSQL(m64178a("ChangeCounts", "packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        }
        if (i4 < 14 && i3 >= 14) {
            bnsl bnsl14 = (bnsl) f76780a.mo68390d();
            bnsl14.mo68432a("anfw", "onUpgrade", 1543, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl14.mo68405a("Add servingVersion to ExperimentTokens");
            sQLiteDatabase2.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN servingVersion INTEGER NOT NULL DEFAULT 0");
        }
        if (i4 < 15 && i3 >= 15) {
            bnsl bnsl15 = (bnsl) f76780a.mo68390d();
            bnsl15.mo68432a("anfw", "onUpgrade", 1555, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl15.mo68405a("Add dynamicParams to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN dynamicParams BLOB DEFAULT NULL");
        }
        if (i4 >= 16) {
            str5 = str3;
            str4 = str2;
        } else if (i3 >= 16) {
            bnsl bnsl16 = (bnsl) f76780a.mo68390d();
            bnsl16.mo68432a("anfw", "onUpgrade", 1566, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl16.mo68405a("Restructuring GCM data");
            sQLiteDatabase2.execSQL(m64178a("GcmState", "packageName TEXT NOT NULL PRIMARY KEY", "isSubscribed INTEGER NOT NULL", "subscribeAfterTime INTEGER NOT NULL DEFAULT 0"));
            sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM Packages WHERE subscribedGcm = 1");
            sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM UnsubscribeGcmPackages");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS UnsubscribeGcmPackages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages RENAME TO OldPackages");
            str4 = str2;
            sQLiteDatabase2.execSQL(m64178a(str4, "packageName TEXT NOT NULL PRIMARY KEY", str, "params BLOB", "dynamicParams BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL", "isSynced INTEGER"));
            str5 = str3;
            sQLiteDatabase2.execSQL(m64177a(str4, str5, str3));
            StringBuilder sb2 = new StringBuilder(194);
            sb2.append("INSERT INTO Packages(packageName,version,params,dynamicParams,weak,androidPackageName,isSynced) SELECT packageName,version,params,dynamicParams,weak,androidPackageName,isSynced FROM OldPackages;");
            sQLiteDatabase2.execSQL(sb2.toString());
            sQLiteDatabase2.execSQL("DROP TABLE OldPackages;");
        } else {
            str5 = str3;
            str4 = str2;
        }
        if (i4 < 17 && i3 >= 17) {
            bnsl bnsl17 = (bnsl) f76780a.mo68390d();
            bnsl17.mo68432a("anfw", "onUpgrade", 1608, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl17.mo68405a("Add serializedDeclarativeRegInfo to Packages");
            sQLiteDatabase2.execSQL("ALTER TABLE Packages ADD COLUMN serializedDeclarativeRegInfo BLOB DEFAULT NULL");
        }
        if (i4 < 18 && i3 >= 18) {
            sQLiteDatabase2.execSQL(m64178a("GenericDimensions", "packageName TEXT NOT NULL", "isolationkey TEXT NOT NULL DEFAULT ''", "namespace INTEGER NOT NULL", "instance INTEGER NOT NULL"));
            sQLiteDatabase2.execSQL(m64177a("GenericDimensions", "configPackageIsolationKey", "packageName", "isolationkey"));
            sQLiteDatabase2.execSQL(m64177a("LogSources", "packageName", "packageName"));
            sQLiteDatabase2.execSQL(m64177a(str4, str5, str5));
        }
        if (i4 < 19 && i3 >= 19) {
            sQLiteDatabase2.execSQL("DROP TABLE GcmState;");
        }
        if (i4 < 20 && i3 >= 20) {
            bnsl bnsl18 = (bnsl) f76780a.mo68390d();
            bnsl18.mo68432a("anfw", "onUpgrade", 1638, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl18.mo68405a("Add tokensTag to ExperimentTokens");
            sQLiteDatabase2.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN tokensTag BLOB DEFAULT NULL");
        }
        if (i4 < 21 && i3 >= 21) {
            String[] strArr7 = new String[3];
            strArr7[0] = "packageName TEXT NOT NULL";
            strArr7[1] = "user TEXT NOT NULL";
            String valueOf7 = String.valueOf(m64179a("packageName", "user"));
            strArr7[2] = valueOf7.length() == 0 ? new String(str) : str.concat(valueOf7);
            sQLiteDatabase2.execSQL(m64178a("MultiCommitApplicationStates", strArr7));
        }
        if (i4 < 22 && i3 >= 22) {
            bnsl bnsl19 = (bnsl) f76780a.mo68390d();
            bnsl19.mo68432a("anfw", "onUpgrade", 1657, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl19.mo68405a("Create LastSyncAfterRequest table");
            sQLiteDatabase2.execSQL(m64178a("LastSyncAfterRequest", "packageName TEXT NOT NULL PRIMARY KEY", "servingVersion INTEGER NOT NULL DEFAULT 0"));
            bnsl bnsl20 = (bnsl) f76780a.mo68390d();
            bnsl20.mo68432a("anfw", "onUpgrade", 1663, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl20.mo68405a("Add flagsHash to ExperimentTokens");
            m64182a(sQLiteDatabase2, "ExperimentTokens", "flagsHash", " INTEGER DEFAULT NULL");
        }
        if (i4 < 23 && i3 >= 23) {
            bnsl bnsl21 = (bnsl) f76780a.mo68390d();
            bnsl21.mo68432a("anfw", "onUpgrade", 1669, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl21.mo68405a("Add configTier to Packages");
            m64182a(sQLiteDatabase2, str4, "configTier", " INTEGER DEFAULT NULL");
        }
    }

    /* renamed from: b */
    public static String m64185b(String[] strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder("?");
        for (int i = 1; i < strArr.length; i++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static Method m64186b() {
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th) {
            bnsl bnsl = (bnsl) f76780a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("anfw", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to reflect getThreadSession");
            return null;
        }
    }

    /* renamed from: a */
    public static Pair m64176a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (!bdyj.m91582b(str)) {
            return anfl.m64159a(sQLiteDatabase, str);
        }
        Integer a = anfs.m64167a(sQLiteDatabase, str, str2);
        if (a != null) {
            return Pair.create(str2, a);
        }
        return null;
    }

    /* renamed from: a */
    public static String m64177a(String str, String str2, String... strArr) {
        StringBuilder sb = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
        sb.append(str2);
        sb.append(" ON ");
        sb.append(str);
        sb.append(" (");
        m64183a(sb, strArr);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m64178a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append(" (");
        m64183a(sb, strArr);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m64179a(String... strArr) {
        StringBuilder sb = new StringBuilder(", PRIMARY KEY(");
        m64183a(sb, strArr);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m64180a(SQLiteDatabase sQLiteDatabase) {
        Method method;
        Method method2 = f76785h;
        if (method2 == null || (method = f76786i) == null) {
            sQLiteDatabase.beginTransaction();
            return;
        }
        try {
            method.invoke(method2.invoke(sQLiteDatabase, new Object[0]), 0, null, 0, null);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f76780a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("anfw", "a", 1761, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to use reflective deferred transaction");
            sQLiteDatabase.beginTransaction();
        }
    }

    /* renamed from: a */
    public static void m64181a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", new byte[0]);
        sQLiteDatabase.update("ApplicationTags", contentValues, "packageName = ? AND user = ? AND version = ? ", new String[]{str, str2, Integer.toString(i)});
        anfo.m64166a(sQLiteDatabase, str, str2, i);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("bytesTag", anfv.f76779a);
        sQLiteDatabase.update("RequestTags", contentValues2, "user = ?", new String[]{str2});
        sQLiteDatabase.update("RequestTags", contentValues2, "user = ?", new String[]{"ALL_USERS"});
    }

    /* renamed from: a */
    private static void m64182a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM %s", str2, str), null);
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (rawQuery != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(str2, (String) null);
                sQLiteDatabase.update(str, contentValues, null, null);
                return;
            }
        } catch (SQLiteException e) {
        }
        sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s%s;", str, str2, str3));
    }

    /* renamed from: a */
    private static void m64183a(StringBuilder sb, String... strArr) {
        int length = strArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            i++;
            z = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo41774a() {
        synchronized (f76782c) {
            if (this.f76787f == 0) {
                if (this == f76784e) {
                    super.close();
                    f76784e = null;
                }
                if (this == f76783d) {
                    super.close();
                    f76783d = null;
                }
            }
        }
    }
}
