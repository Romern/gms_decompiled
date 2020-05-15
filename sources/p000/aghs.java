package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/* renamed from: aghs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aghs extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ aght f65540a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aghs(aght aght, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f65540a = aght;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException e2) {
            this.f65540a.mo35497E().f65564c.mo35435a("Opening the local database failed, dropping and recreating it");
            String q = this.f65540a.mo35418q();
            if (!this.f65540a.mo35542z().getDatabasePath(q).delete()) {
                this.f65540a.mo35497E().f65564c.mo35436a("Failed to delete corrupted local db file", q);
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                this.f65540a.mo35497E().f65564c.mo35436a("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        agdm.m54095a(this.f65540a.mo35497E(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = Build.VERSION.SDK_INT;
        agdm.m54096a(this.f65540a.mo35497E(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
