package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: vir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vir extends unt {

    /* renamed from: d */
    public static final vir f49351d = new vir();

    /* renamed from: e */
    public static final String[] f49352e = {viq.MUTATION.name()};

    /* renamed from: f */
    private static final vpj f49353f = new vip();

    /* renamed from: g */
    private static final uns f49354g;

    static {
        uns uns = new uns(f49353f);
        uns.mo27729a(3, "PendingUndoStackTable");
        f49354g = uns;
    }

    private vir() {
        super(6, f49354g);
    }

    /* renamed from: a */
    public final void mo28490a(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(viq.MUTATION.name(), str);
        sQLiteDatabase.insertOrThrow(mo27735b(), null, contentValues);
    }
}
