package p000;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vil extends unt {

    /* renamed from: d */
    public static final vil f49336d = new vil();

    /* renamed from: e */
    public static final String[] f49337e = {vik.MUTATION.name()};

    /* renamed from: f */
    private static final vpj f49338f = new vij();

    /* renamed from: g */
    private static final uns f49339g;

    static {
        uns uns = new uns(f49338f);
        uns.mo27729a(1, "MutationHistory");
        f49339g = uns;
    }

    private vil() {
        super(6, f49339g);
    }

    /* renamed from: a */
    public final int mo28487a(SQLiteDatabase sQLiteDatabase) {
        return (int) DatabaseUtils.queryNumEntries(sQLiteDatabase, mo27735b());
    }

    /* renamed from: a */
    public final void mo28488a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(vik.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(mo27735b(), null, contentValues);
    }
}
