package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

/* renamed from: bcax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcax implements bdae {

    /* renamed from: a */
    private final SQLiteOpenHelper f103924a;

    public bcax(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f103924a = sQLiteOpenHelper;
    }

    /* renamed from: a */
    private static final String m88732a(Uri uri) {
        return uri.getPathSegments().get(1);
    }

    /* renamed from: b */
    public final void mo54679b() {
        this.f103924a.getWritableDatabase().endTransaction();
    }

    /* renamed from: c */
    public final boolean mo54680c() {
        return this.f103924a.getWritableDatabase().inTransaction();
    }

    /* renamed from: d */
    public final void mo54681d() {
        this.f103924a.getWritableDatabase().setTransactionSuccessful();
    }

    /* renamed from: a */
    public final int mo54674a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f103924a.getWritableDatabase().update(m88732a(uri), contentValues, str, strArr);
    }

    /* renamed from: a */
    public final int mo54675a(Uri uri, String str, String[] strArr) {
        return this.f103924a.getWritableDatabase().delete(m88732a(uri), str, strArr);
    }

    /* renamed from: a */
    public final long mo54676a(Uri uri, ContentValues contentValues, int i) {
        return this.f103924a.getWritableDatabase().insertWithOnConflict(m88732a(uri), null, contentValues, i);
    }

    /* renamed from: a */
    public final Cursor mo54677a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) {
        return this.f103924a.getReadableDatabase().query(m88732a(uri), strArr, str, strArr2, null, null, str2, str3);
    }

    /* renamed from: a */
    public final void mo54678a() {
        this.f103924a.getWritableDatabase().beginTransaction();
    }
}
