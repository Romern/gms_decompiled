package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: pnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pnv extends srp {

    /* renamed from: a */
    private final qav f39890a = new qav("SQLiteCastDBHelper");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        this.f39890a.mo23673b("Creating cast database", new Object[0]);
        sQLiteDatabase.execSQL(C1587poc.f39901a);
        sQLiteDatabase.execSQL(pnx.f39896a);
        sQLiteDatabase.execSQL(poa.f39899a);
        sQLiteDatabase.execSQL(pnz.f39898a);
        sQLiteDatabase.execSQL(pny.f39897a);
        sQLiteDatabase.execSQL(pob.f39900a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo23512c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS NetworkInfo");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DeviceInfo");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS NetworkToDevice");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS GuestModeDiscoveryInfo");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS GuestModeAppInfo");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ProbedSocketAddress");
        onCreate(sQLiteDatabase);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f39890a.mo23673b("Downgrading cast database from version %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        mo23512c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f39890a.mo23673b("Upgrading cast database from version %d to %d", Integer.valueOf(i), Integer.valueOf(i2));
        mo23512c(sQLiteDatabase);
    }

    public pnv(Context context) {
        super(context, "cast.db", "cast.db", 9);
    }
}
