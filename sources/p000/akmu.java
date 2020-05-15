package p000;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: akmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akmu extends srp {

    /* renamed from: a */
    public static volatile akmu f72275a = null;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteDatabase mo39564a() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new akmt(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SQLiteDatabase mo39565b() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new akmt(e);
        }
    }

    public akmu(Context context) {
        super(context, "netrec", "netrec", 9);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        akmy.m60047a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        akmy.m60047a(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        akmy.m60047a(sQLiteDatabase);
    }
}
