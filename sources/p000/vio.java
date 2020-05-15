package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vio extends unt {

    /* renamed from: d */
    public static final vio f49344d = new vio();

    /* renamed from: e */
    public static final String[] f49345e = {vin.MUTATION.name()};

    /* renamed from: f */
    private static final vpj f49346f = new vim();

    /* renamed from: g */
    private static final uns f49347g;

    static {
        uns uns = new uns(f49346f);
        uns.mo27729a(1, "PendingMutation");
        f49347g = uns;
    }

    private vio() {
        super(6, f49347g);
    }

    /* renamed from: a */
    public final void mo28489a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(vin.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(mo27735b(), null, contentValues);
    }
}
