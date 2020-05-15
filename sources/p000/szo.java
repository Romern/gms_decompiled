package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;

/* renamed from: szo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szo extends srp implements Closeable {

    /* renamed from: a */
    private static final Object f45516a = new Object();

    /* renamed from: b */
    private static szo f45517b = null;

    /* renamed from: c */
    private static int f45518c = 0;

    /* renamed from: d */
    private static final Logger f45519d = tea.m36798a("database_helper");

    /* renamed from: f */
    private static final String[] f45520f = {"CREATE TABLE sim_verifications(_id INTEGER PRIMARY KEY AUTOINCREMENT, phone_number TEXT, verification_time INTEGER, imsi TEXT UNIQUE NOT NULL, sim_readable_number TEXT, state INTEGER, verification_method TEXT DEFAULT '' );", "CREATE TABLE gaia_verifications(_id INTEGER PRIMARY KEY AUTOINCREMENT, phone_number TEXT, verification_time INTEGER, gaia_id TEXT NOT NULL,  UNIQUE ( phone_number, gaia_id) ON CONFLICT REPLACE);", "CREATE TABLE signals_events(_id INTEGER PRIMARY KEY AUTOINCREMENT, subscription_id INTEGER, event_time INTEGER, event_type INTEGER, successful INTEGER, event_proto BLOB);"};

    /* renamed from: e */
    private final Context f45521e;

    /* renamed from: a */
    public static szo m36665a(Context context) {
        szo szo;
        synchronized (f45516a) {
            if (f45517b == null) {
                f45517b = new szo(context.getApplicationContext());
            }
            f45518c++;
            szo = f45517b;
        }
        return szo;
    }

    public final synchronized void close() {
        synchronized (f45516a) {
            int i = f45518c - 1;
            f45518c = i;
            if (i == 0) {
                super.close();
                f45517b = null;
            }
        }
    }

    public final synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (SQLiteException e) {
            f45519d.mo25417e("Failed to open database", e, new Object[0]);
            if (e instanceof SQLiteDatabaseCorruptException) {
                f45519d.mo25412b("Deleting database file %s", getDatabaseName());
                this.f45521e.deleteDatabase(getDatabaseName());
                return super.getWritableDatabase();
            }
            throw e;
        }
        return super.getWritableDatabase();
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sim_verifications;");
        sQLiteDatabase.execSQL("CREATE TABLE sim_verifications(_id INTEGER PRIMARY KEY AUTOINCREMENT, phone_number TEXT, verification_time INTEGER, imsi TEXT UNIQUE NOT NULL, sim_readable_number TEXT, state INTEGER, verification_method TEXT DEFAULT '' );");
        while (i > i2) {
            if (i == 2) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS signals_events;");
            }
            i--;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            if (i == 2) {
                sQLiteDatabase.execSQL("CREATE TABLE signals_events(_id INTEGER PRIMARY KEY AUTOINCREMENT, subscription_id INTEGER, event_time INTEGER, event_type INTEGER, successful INTEGER, event_proto BLOB);");
            } else if (i == 3) {
                sQLiteDatabase.execSQL("ALTER TABLE sim_verifications ADD COLUMN verification_method TEXT DEFAULT ''");
            }
        }
    }

    private szo(Context context) {
        super(context, "constellation.db", "constellation.db", 3);
        this.f45521e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        f45519d.mo25412b("Creating database with version %s", 3);
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        String[] strArr = f45520f;
        for (String str : strArr) {
            f45519d.mo25412b("Execute:%s", str);
            sQLiteDatabase.execSQL(str);
        }
    }
}
