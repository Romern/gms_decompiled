package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: viw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class viw extends unt {

    /* renamed from: d */
    public static final viw f49367d = new viw();

    /* renamed from: e */
    public static final String[] f49368e = {viv.MUTATION.name()};

    /* renamed from: f */
    private static final vpj f49369f = new viu();

    /* renamed from: g */
    private static final uns f49370g;

    static {
        uns uns = new uns(f49369f);
        uns.mo27729a(2, "RedoStack");
        f49370g = uns;
    }

    private viw() {
        super(6, f49370g);
    }

    /* renamed from: a */
    public final void mo28491a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(viv.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(mo27735b(), null, contentValues);
    }

    public viw(int i) {
        super(i, f49370g);
    }
}
