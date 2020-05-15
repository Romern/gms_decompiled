package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bbyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyy extends SQLiteOpenHelper {

    /* renamed from: a */
    public final bmxv f103780a;

    /* renamed from: b */
    private final bqgj f103781b = bboz.m88304a().f103024a;

    /* renamed from: a */
    private static final void m88643a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);");
        sQLiteDatabase.execSQL("CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));");
        sQLiteDatabase.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    /* renamed from: b */
    private static final void m88644b(SQLiteDatabase sQLiteDatabase) {
        bcbc.m88746a(sQLiteDatabase);
        m88643a(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m88643a(sQLiteDatabase);
        if (this.f103780a.mo66813a()) {
            this.f103781b.mo25812a(new bbyx(this));
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 >= 7) {
            bcbc.m88749a(sQLiteDatabase, "registration", "CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);", bcee.f104026a);
            bcbc.m88749a(sQLiteDatabase, "reachability", "CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));", bcec.f104025a);
            sQLiteDatabase.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
            return;
        }
        m88644b(sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        if (i >= 5) {
            for (int i3 = i + 1; i3 <= i2; i3++) {
                if (i3 == 6) {
                    sQLiteDatabase.execSQL("ALTER TABLE reachability ADD COLUMN reachability_normalized_id TEXT;");
                    int i4 = ContactId.ContactType.EMAIL.f111365f;
                    Cursor query = sQLiteDatabase.query("reachability", null, null, null, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                do {
                                    String string = query.getString(bceb.m88856a(1));
                                    int i5 = query.getInt(bceb.m88856a(2));
                                    int i6 = query.getInt(bceb.m88856a(3));
                                    ContentValues contentValues = new ContentValues();
                                    if (i5 == i4) {
                                        str = bboo.m88285a(string);
                                    } else {
                                        str = string;
                                    }
                                    contentValues.put("reachability_normalized_id", str);
                                    sQLiteDatabase.update("reachability", contentValues, "reachability_id = ? AND reachability_type = ? AND registration_id = ?", new String[]{string, Integer.toString(i5), Integer.toString(i6)});
                                } while (query.moveToNext());
                            }
                        } catch (Throwable th) {
                            bqye.m113761a(th, th);
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } else if (i3 == 7) {
                    sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN identity_key_type INT NOT NULL DEFAULT 1;");
                } else if (i3 == 8) {
                    sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN registration_properties BLOB;");
                }
            }
            return;
        }
        m88644b(sQLiteDatabase);
        return;
        throw th;
    }

    public bbyy(Context context, bmxv bmxv) {
        super(context, "lighter_registration.db", (SQLiteDatabase.CursorFactory) null, 8);
        this.f103780a = bmxv;
    }
}
