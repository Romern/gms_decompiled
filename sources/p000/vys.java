package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vys {

    /* renamed from: a */
    public final srp f50248a;

    /* renamed from: b */
    public final vwf f50249b;

    public vys(Context context, String str) {
        this.f50248a = new vyr(context, str);
        this.f50249b = vwf.m41483a(context);
    }

    /* renamed from: a */
    public final void mo28979a(byte[] bArr) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f50248a.getWritableDatabase();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("a", bArr);
            if (writableDatabase.update("t", contentValues, null, null) == 0) {
                writableDatabase.insert("t", null, contentValues);
            }
            writableDatabase.close();
        } catch (RuntimeException e) {
            this.f50249b.mo28911a(e);
        } catch (Throwable th) {
            writableDatabase.close();
            throw th;
        }
    }
}
