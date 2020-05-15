package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxq extends srp {
    static {
        bnic.m109491a("metadata", "manifest_deps", "pinned_deps");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        zyh.m46683c("FontsDBHelper", "Creating database with version %s", 1);
        zyh.m46683c("FontsDBHelper", "Executing SQL to create metadata table: %s", "CREATE TABLE metadata(id INTEGER PRIMARY KEY AUTOINCREMENT, family TEXT, width FLOAT DEFAULT 100, weight INTEGER DEFAULT 400, italic INTEGER DEFAULT 0, version INTEGER DEFAULT 1, last_accessed TIMESTAMP DEFAULT CURRENT_TIMESTAMP, UNIQUE (family, width, weight, italic));");
        sQLiteDatabase.execSQL("CREATE TABLE metadata(id INTEGER PRIMARY KEY AUTOINCREMENT, family TEXT, width FLOAT DEFAULT 100, weight INTEGER DEFAULT 400, italic INTEGER DEFAULT 0, version INTEGER DEFAULT 1, last_accessed TIMESTAMP DEFAULT CURRENT_TIMESTAMP, UNIQUE (family, width, weight, italic));");
        zyh.m46683c("FontsDBHelper", "Executing SQL to create manifest dep table: %s", "CREATE TABLE manifest_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
        sQLiteDatabase.execSQL("CREATE TABLE manifest_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
        zyh.m46683c("FontsDBHelper", "Executing SQL to create pinned dep table: %s", "CREATE TABLE pinned_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
        sQLiteDatabase.execSQL("CREATE TABLE pinned_deps(package TEXT, font_id INTEGER, FOREIGN KEY (font_id) REFERENCES metadata(id));");
    }

    /* renamed from: c */
    public final void mo31562c(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                zyh.m46680a("FontsDBHelper", "Error closing SQLiteDatabase ", e);
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public zxq(Context context) {
        super(context, "metadata.db", "metadata.db", 1);
    }

    /* renamed from: a */
    public final void mo31560a(String str) {
        try {
            getWritableDatabase().delete("manifest_deps", "package = ?", new String[]{str});
            try {
                getWritableDatabase().close();
            } catch (SQLiteException e) {
            }
        } catch (SQLiteException e2) {
        }
    }

    /* renamed from: a */
    public final boolean mo31561a(String str, FontMatchSpec fontMatchSpec, SQLiteDatabase sQLiteDatabase) {
        int i;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT id FROM metadata WHERE family = ?  AND width = ?  AND weight = ?  AND italic = ?", new String[]{fontMatchSpec.f32464b, String.valueOf(fontMatchSpec.f32465c), String.valueOf(fontMatchSpec.f32466d), String.valueOf(fontMatchSpec.f32467e)});
        if (rawQuery.getCount() == 0) {
            rawQuery.close();
            i = -1;
        } else {
            rawQuery.moveToNext();
            i = rawQuery.getInt(0);
            rawQuery.close();
        }
        if (i != -1) {
            Integer valueOf = Integer.valueOf(i);
            zyh.m46683c("FontsDBHelper", "Add manifest dep: Font %s resolved to fontId %d", fontMatchSpec.toString(), valueOf);
            ContentValues contentValues = new ContentValues();
            contentValues.put("package", str);
            contentValues.put("font_id", valueOf);
            sQLiteDatabase.insertWithOnConflict("manifest_deps", null, contentValues, 5);
            return true;
        }
        zyh.m46683c("FontsDBHelper", "Add manifest dep: Font not found in database: %s", fontMatchSpec.toString());
        return false;
    }
}
