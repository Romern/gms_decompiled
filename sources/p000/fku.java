package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fku extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ fkv f16819a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fku(fkv fkv, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f16819a = fkv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* renamed from: a */
    private final boolean m11901a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                e = e;
                try {
                    this.f16819a.mo10932c("Error querying for table", str, e);
                    if (cursor != null) {
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f16819a.mo10932c("Error querying for table", str, e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static final Set m11902b(SQLiteDatabase sQLiteDatabase, String str) {
        String[] columnNames;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        fkv fkv = this.f16819a;
        String str = fkv.f16820a;
        if (fkv.f16823e.mo11060a(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e) {
                this.f16819a.f16823e.mo11059a();
                this.f16819a.mo10942g("Opening the database failed, dropping the table and recreating it");
                this.f16819a.mo10939f().getDatabasePath(this.f16819a.mo10987x()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f16819a.f16823e.mo11061b();
                    return writableDatabase;
                } catch (SQLiteException e2) {
                    this.f16819a.mo10938e("Failed to open freshly created database", e2);
                    throw e2;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException e) {
            fnq.m12017a("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = Build.VERSION.SDK_INT;
        if (!m11901a(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(fkv.f16820a);
        } else {
            Set b = m11902b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (!b.remove(str)) {
                    String valueOf = String.valueOf(str);
                    throw new SQLiteException(valueOf.length() == 0 ? new String("Database hits2 is missing required column: ") : "Database hits2 is missing required column: ".concat(valueOf));
                }
            }
            boolean z = !b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (m11901a(sQLiteDatabase, "properties")) {
            Set b2 = m11902b(sQLiteDatabase, "properties");
            String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            for (int i3 = 0; i3 < 6; i3++) {
                String str2 = strArr2[i3];
                if (!b2.remove(str2)) {
                    String valueOf2 = String.valueOf(str2);
                    throw new SQLiteException(valueOf2.length() == 0 ? new String("Database properties is missing required column: ") : "Database properties is missing required column: ".concat(valueOf2));
                }
            }
            if (!b2.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
