package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.io.IOException;

/* renamed from: ayti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayti {

    /* renamed from: a */
    public final SQLiteDatabase f98447a;

    public ayti(SQLiteDatabase sQLiteDatabase) {
        this.f98447a = sQLiteDatabase;
    }

    /* renamed from: a */
    public static Object m84786a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object ciwm;
        Cursor query = sQLiteDatabase.query("crypto_pre_keys", new String[]{"key_record"}, "key_type=? AND key_id=?", new String[]{String.valueOf(i), String.valueOf(i2)}, null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (i != 0) {
                        ciwm = new ciws(blob);
                    } else {
                        ciwm = new ciwm(blob);
                    }
                    query.close();
                    return ciwm;
                }
            } catch (IOException e) {
                aytl.m84792a(5, "DatabaseOperations", e, "EncryptionPreKey: IOException while deserializing PreKey or SignedPreKey", new Object[0]);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        if (query == null) {
            return null;
        }
        query.close();
        return null;
    }

    /* renamed from: b */
    public final int mo54420b() {
        m84787a();
        Cursor query = this.f98447a.query("crypto_pre_keys", new String[]{"key_id"}, null, null, null, null, "key_id DESC", "1");
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getInt(0);
                }
            } finally {
                query.close();
            }
        }
        if (query == null) {
            return -1;
        }
        query.close();
        return -1;
    }

    /* renamed from: a */
    public static void m84787a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("checkMainThread failed!");
        }
    }
}
