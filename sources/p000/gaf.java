package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: gaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gaf extends srp {

    /* renamed from: a */
    private static gaf f17786a = null;

    /* renamed from: a */
    public static synchronized gaf m12845a(Context context) {
        gaf gaf;
        synchronized (gaf.class) {
            if (f17786a == null) {
                f17786a = new gaf(context, "app_state.db");
            }
            gaf = f17786a;
        }
        return gaf;
    }

    /* renamed from: c */
    private static final void m12846c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS client_contexts;");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS app_states;");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS app_states_app_id_index;");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (Log.isLoggable("AppStateDatabaseHelper", 4)) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Downgrading from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            Log.i("AppStateDatabaseHelper", sb.toString());
        }
        if (i2 <= 3) {
            Log.i("AppStateDatabaseHelper", "Prelaunch policy: wipe all data!");
            m12846c(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i <= 3) {
            StringBuilder sb = new StringBuilder(74);
            sb.append("Upgrading from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            sb.append(", all data will be wiped!");
            Log.i("AppStateDatabaseHelper", sb.toString());
            m12846c(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        } else if (Log.isLoggable("AppStateDatabaseHelper", 4)) {
            StringBuilder sb2 = new StringBuilder(49);
            sb2.append("Upgrading from version ");
            sb2.append(i);
            sb2.append(" to ");
            sb2.append(i2);
            Log.i("AppStateDatabaseHelper", sb2.toString());
        }
    }

    protected gaf(Context context, String str) {
        super(context, str, str, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE client_contexts (_id INTEGER PRIMARY KEY AUTOINCREMENT,package_name TEXT NOT NULL,package_uid INTEGER NOT NULL,account_name TEXT NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE app_states (_id INTEGER PRIMARY KEY AUTOINCREMENT,app_id TEXT NOT NULL,client_context_id INTEGER REFERENCES client_contexts(_id) NOT NULL,key INTEGER NOT NULL,local_version TEXT,local_data BLOB,conflict_version TEXT,conflict_data BLOB,data_dirty INTEGER NOT NULL DEFAULT 0,upsync_required INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE INDEX app_states_app_id_index ON app_states (app_id);");
    }
}
