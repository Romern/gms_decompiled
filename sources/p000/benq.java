package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: benq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class benq implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    private final Object[] f111888a;

    public benq(Object[] objArr) {
        this.f111888a = objArr;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        if (this.f111888a != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f111888a;
                if (i >= objArr.length) {
                    break;
                }
                int i2 = i + 1;
                Object obj = objArr[i];
                if (obj == null) {
                    sQLiteQuery.bindNull(i2);
                } else if (obj instanceof String) {
                    sQLiteQuery.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    sQLiteQuery.bindBlob(i2, (byte[]) obj);
                } else if (obj instanceof Long) {
                    sQLiteQuery.bindLong(i2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    sQLiteQuery.bindDouble(i2, ((Double) obj).doubleValue());
                } else {
                    throw new AssertionError("Attempted to bind an unsupported type");
                }
                i = i2;
            }
        }
        int i3 = bens.f111889c;
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
