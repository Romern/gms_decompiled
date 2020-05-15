package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: di */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0932di implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    final /* synthetic */ C0931dh f13200a;

    public C0932di(C0931dh dhVar) {
        this.f13200a = dhVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f13200a.mo8484a(new C0938do(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
