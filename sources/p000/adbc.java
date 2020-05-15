package p000;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;

/* renamed from: adbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbc {
    /* renamed from: a */
    public static SQLiteDatabase m50103a(srp srp, String str, boolean z) {
        String str2;
        try {
            return srp.getWritableDatabase();
        } catch (SQLiteCantOpenDatabaseException e) {
            if (z) {
                File databasePath = rpr.m34216b().getDatabasePath(str);
                if (databasePath.length() < 1) {
                    SQLiteDatabase.deleteDatabase(databasePath);
                    str2 = "The database file is corrupted and has zero byte, delete the file";
                    throw new SQLiteException(str2, e);
                }
            }
            str2 = "Failed to get a writable database";
            throw new SQLiteException(str2, e);
        }
    }
}
