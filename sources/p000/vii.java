package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vii extends unt {

    /* renamed from: d */
    public static final vii f49330d = new vii();

    /* renamed from: e */
    private static final vpj f49331e = new vig();

    /* renamed from: f */
    private static final uns f49332f;

    static {
        uns uns = new uns(f49331e);
        uns.mo27729a(1, "DocumentStore");
        f49332f = uns;
    }

    private vii() {
        super(6, f49332f);
    }

    /* renamed from: a */
    public final bkvo mo28481a(SQLiteDatabase sQLiteDatabase) {
        String a = mo28482a(sQLiteDatabase, "meSessionId");
        if (a == null) {
            return null;
        }
        return bkvo.m106713a(a, mo28482a(sQLiteDatabase, "meUserId"), mo28482a(sQLiteDatabase, "meDisplayName"), mo28482a(sQLiteDatabase, "meColor"), true, mo28482a(sQLiteDatabase, "mePhotoUrl"), mo28482a(sQLiteDatabase, "mePermissionId"));
    }

    /* renamed from: b */
    public final void mo28486b(SQLiteDatabase sQLiteDatabase, int i) {
        mo28484a(sQLiteDatabase, "snapshotLength", String.valueOf(i));
    }

    /* renamed from: a */
    public final String mo28482a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(mo27735b(), new String[]{vih.VALUE.name()}, String.valueOf(vih.KEY.name()).concat(" = ?"), new String[]{str}, null, null, null);
        try {
            if (query.getCount() == 1) {
                query.moveToFirst();
                return query.getString(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public final void mo28483a(SQLiteDatabase sQLiteDatabase, int i) {
        mo28484a(sQLiteDatabase, "revision", String.valueOf(i));
    }

    /* renamed from: a */
    public final void mo28484a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (str2 == null) {
            sQLiteDatabase.delete(mo27735b(), String.valueOf(vih.KEY.name()).concat(" = ?"), new String[]{str});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(vih.KEY.name(), str);
        contentValues.put(vih.VALUE.name(), str2);
        sQLiteDatabase.replaceOrThrow(mo27735b(), null, contentValues);
    }

    /* renamed from: a */
    public final void mo28485a(SQLiteDatabase sQLiteDatabase, boolean z) {
        mo28484a(sQLiteDatabase, "isReadOnly", Boolean.toString(z));
    }
}
