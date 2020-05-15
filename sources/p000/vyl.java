package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: vyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyl {

    /* renamed from: a */
    public final Context f50239a;

    /* renamed from: a */
    public final synchronized vyj mo28959a(vym vym) {
        Cursor query;
        try {
            SQLiteDatabase readableDatabase = new vyk(this).getReadableDatabase();
            readableDatabase.beginTransaction();
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                StringBuilder sb = new StringBuilder(70);
                sb.append("a = ? AND b <= ");
                sb.append(currentTimeMillis);
                sb.append(" AND ");
                sb.append(currentTimeMillis);
                sb.append(" < (");
                sb.append("b");
                sb.append(" + ");
                sb.append("c");
                sb.append(")");
                query = readableDatabase.query("main", new String[]{"f", "d", "e", "c", "g"}, sb.toString(), new String[]{vym.toString()}, null, null, "b DESC", "1");
                if (query.moveToNext()) {
                    byte[] blob = query.getBlob(0);
                    vyy vyy = new vyy(query.getString(1));
                    vym.toString();
                    vyj vyj = new vyj(blob, vyy, query.getLong(3), query.getBlob(4));
                    query.close();
                    readableDatabase.setTransactionSuccessful();
                    readableDatabase.endTransaction();
                    readableDatabase.close();
                    return vyj;
                }
                query.close();
                readableDatabase.setTransactionSuccessful();
                readableDatabase.endTransaction();
                readableDatabase.close();
                return null;
            } catch (Throwable th) {
                readableDatabase.endTransaction();
                readableDatabase.close();
                throw th;
            }
        } catch (SQLiteException e) {
            throw new vxy("Database read error.", e);
        }
    }

    public vyl(Context context) {
        this.f50239a = context;
    }

    /* renamed from: a */
    public final synchronized void mo28960a(vym vym, vyj vyj) {
        SQLiteDatabase writableDatabase;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("a", vym.toString());
            contentValues.put("b", Long.valueOf(currentTimeMillis / 1000));
            contentValues.put("c", Long.valueOf(vyj.f50237c));
            contentValues.put("d", vyj.f50236b.f50261a);
            contentValues.put("e", "");
            contentValues.put("f", vyj.f50235a);
            contentValues.put("g", vyj.f50238d);
            writableDatabase = new vyk(this).getWritableDatabase();
            writableDatabase.beginTransaction();
            String[] strArr = {vym.toString()};
            if (vyj.f50237c <= 0) {
                writableDatabase.delete("main", "a = ?", strArr);
            } else if (writableDatabase.update("main", contentValues, "a = ?", strArr) == 0) {
                writableDatabase.insert("main", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteException e) {
            throw new vxy("Database access error.", e);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            writableDatabase.close();
            throw th;
        }
    }
}
