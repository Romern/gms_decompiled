package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: aytr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytr extends SQLiteOpenHelper {

    /* renamed from: a */
    private static final String[] f98463a = {"name"};

    /* renamed from: b */
    private static final String[] f98464b = {"CREATE TABLE conversation_participants(conversation_id TEXT,participant_id TEXT, PRIMARY KEY (conversation_id,participant_id))", "CREATE TABLE crypto_identity_keys(sender TEXT PRIMARY KEY NOT NULL,identity_key TEXT)", "CREATE TABLE crypto_pre_keys(key_id INTEGER PRIMARY KEY,key_type INT NOT NULL DEFAULT(0),key_record TEXT,timestamp LONG)", "CREATE TABLE crypto_sessions(user_id TEXT NOT NULL,device_id INT NOT NULL DEFAULT(0),session_record TEXT,PRIMARY KEY (user_id,device_id))", "CREATE TABLE crypto_sender_key_distribution_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT, group_conversation_id TEXT NOT NULL,message_record TEXT NOT NULL)", "CREATE TABLE crypto_sender_keys(group_conversation_id INT NOT NULL,sender_id TEXT NOT NULL,device_id INT NOT NULL DEFAULT(0),key_record TEXT,timestamp_millis LONG, PRIMARY KEY (group_conversation_id,sender_id,device_id))"};

    /* renamed from: c */
    private static final String[] f98465c = {"CREATE INDEX index_crypto_pre_keys_timestamp ON crypto_pre_keys(timestamp)"};

    /* renamed from: d */
    private static final Object f98466d = new Object();

    /* renamed from: e */
    private static aytr f98467e;

    /* renamed from: f */
    private final Context f98468f;

    /* renamed from: a */
    public static aytr m84806a(String str, Context context) {
        aytr aytr;
        synchronized (f98466d) {
            if (f98467e == null) {
                f98467e = new aytr(str, context.getApplicationContext());
            }
            aytr = f98467e;
        }
        return aytr;
    }

    /* renamed from: b */
    public static void m84808b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=off;");
        Cursor query = sQLiteDatabase.query("sqlite_master", f98463a, "type='table'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    if (!string.startsWith("android_") && !string.startsWith("sqlite_")) {
                        try {
                            String valueOf = String.valueOf(string);
                            sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                        } catch (SQLiteException e) {
                        }
                    }
                } finally {
                    query.close();
                }
            }
        }
        m84807a(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            if (e instanceof SQLiteDatabaseCorruptException) {
                this.f98468f.deleteDatabase(getDatabaseName());
                sQLiteDatabase = super.getWritableDatabase();
            } else {
                throw e;
            }
        }
        return sQLiteDatabase;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m84807a(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m84808b(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        do {
            i++;
        } while (i <= i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public aytr(String str, Context context) {
        super(context, r1.toString(), (SQLiteDatabase.CursorFactory) null, 1);
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("signal_client_");
        sb.append(str);
        sb.append(".db");
        this.f98468f = context;
    }

    /* renamed from: a */
    protected static void m84807a(SQLiteDatabase sQLiteDatabase) {
        for (String str : f98464b) {
            sQLiteDatabase.execSQL(str);
        }
        for (String str2 : f98465c) {
            sQLiteDatabase.execSQL(str2);
        }
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }
}
