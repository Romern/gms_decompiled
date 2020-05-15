package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: ipp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipp extends srp {

    /* renamed from: a */
    public static final String[] f21521a = {"CREATE TABLE keys(key_handle STRING NOT NULL, key_name STRING NOT NULL, key_form INTEGER NOT NULL, key_type STRING NOT NULL, account STRING NOT NULL, master_key STRING, public_key STRING, private_key STRING, active_status INTEGER NOT NULL, creation_time INTEGER NOT NULL, exportable INTEGER NOT NULL, expiration_time INTEGER NOT NULL, PRIMARY KEY(key_handle,account));", "CREATE TABLE metadata(identifier STRING NOT NULL, account STRING NOT NULL, client_metadata STRING, PRIMARY KEY(account,identifier));", "CREATE TABLE group_keys(key_name STRING NOT NULL, account STRING NOT NULL, key_state INTEGER, public_key STRING, private_key STRING, PRIMARY KEY(key_name,account,key_state));"};

    /* renamed from: b */
    private static final Object f21522b = new Object();

    /* renamed from: c */
    private static ipp f21523c;

    /* renamed from: d */
    private static int f21524d = 0;

    /* renamed from: e */
    private static final Logger f21525e = new Logger(new String[]{"DatabaseHelper"}, (byte[]) null);

    /* renamed from: a */
    public static ipp m15839a(Context context) {
        ipp ipp;
        synchronized (f21522b) {
            if (f21523c == null) {
                f21524d = 0;
                f21523c = new ipp(context);
            }
            f21524d++;
            ipp = f21523c;
        }
        return ipp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        f21525e.mo25412b("opened database cryptauthkeys.db", new Object[0]);
    }

    public final synchronized void close() {
        synchronized (f21522b) {
            int i = f21524d - 1;
            f21524d = i;
            if (i == 0) {
                if (f21523c != null) {
                    super.close();
                }
                f21523c = null;
            }
        }
    }

    public final String getDatabaseName() {
        return "cryptauthkeys.db";
    }

    public final synchronized SQLiteDatabase getReadableDatabase() {
        int i = spn.f44932a;
        return super.getReadableDatabase();
    }

    public final synchronized SQLiteDatabase getWritableDatabase() {
        int i = spn.f44932a;
        try {
        } catch (SQLiteException e) {
            f21525e.mo25417e("Failed to open Cryptauth database.", e, new Object[0]);
            throw e;
        }
        return super.getWritableDatabase();
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Logger Logger = f21525e;
        StringBuilder sb = new StringBuilder(69);
        sb.append("Updating database version from ");
        sb.append(i);
        sb.append(" to new version ");
        sb.append(i2);
        Logger.mo25412b(sb.toString(), new Object[0]);
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            if (i == 2) {
                sQLiteDatabase.execSQL("ALTER TABLE keys ADD COLUMN exportable INTEGER DEFAULT 2");
            } else if (i == 3) {
                sQLiteDatabase.execSQL("CREATE TABLE metadata(identifier STRING NOT NULL, account STRING NOT NULL, client_metadata STRING, PRIMARY KEY(account,identifier));");
            } else if (i == 4) {
                sQLiteDatabase.execSQL("CREATE TABLE group_keys(key_name STRING NOT NULL, account STRING NOT NULL, key_state INTEGER, public_key STRING, private_key STRING, PRIMARY KEY(key_name,account,key_state));");
            } else if (i == 5) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS group_keys");
                sQLiteDatabase.execSQL("CREATE TABLE group_keys(key_name STRING NOT NULL, account STRING NOT NULL, key_state INTEGER, public_key STRING, private_key STRING, PRIMARY KEY(key_name,account,key_state));");
            }
        }
    }

    private ipp(Context context) {
        super(context, "cryptauthkeys.db", "cryptauthkeys.db", 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        f21525e.mo25412b("Creating Cryptauth database with version : 5", new Object[0]);
        String[] strArr = f21521a;
        for (String str : strArr) {
            Logger Logger = f21525e;
            String valueOf = String.valueOf(str);
            Logger.mo25412b(valueOf.length() == 0 ? new String("Executing: ") : "Executing: ".concat(valueOf), new Object[0]);
            sQLiteDatabase.execSQL(str);
        }
    }
}
