package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: viz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class viz extends unt {

    /* renamed from: d */
    public static final viz f49375d = new viz();

    /* renamed from: e */
    public static final String[] f49376e = {viy.MUTATION.name()};

    /* renamed from: f */
    private static final vpj f49377f = new vix();

    /* renamed from: g */
    private static final uns f49378g;

    static {
        uns uns = new uns(f49377f);
        uns.mo27729a(2, "UndoStack");
        f49378g = uns;
    }

    private viz() {
        super(6, f49378g);
    }

    /* renamed from: a */
    public final void mo28492a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(viy.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(mo27735b(), null, contentValues);
    }

    public viz(int i) {
        super(i, f49378g);
    }
}
