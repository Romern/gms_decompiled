package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: gvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gvf extends srp {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        gvg.f19067a.mo25371b(String.format("Creating database %s...", "auth.account_transfer.store.db"));
        String[] strArr = gvi.f19071a;
        new Object[1][0] = "responses";
        imu.m15735a(sQLiteDatabase, "responses", gvi.f19071a, gvi.f19072b);
        imu.m15734a(sQLiteDatabase, "responses", gvi.f19073c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        gvg.f19067a.mo25371b(String.format("Opening database %s...", "auth.account_transfer.store.db"));
        super.mo10021b(sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        gvg.f19067a.mo25372b("AccountTransfer", String.format("Downgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2)));
        m13991c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        gvg.f19067a.mo25371b(String.format("Upgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2)));
        String[] strArr = gvi.f19071a;
        m13991c(sQLiteDatabase);
    }

    public gvf(Context context) {
        super(context, "auth.account_transfer.store.db", "auth.account_transfer.store.db", 2);
    }

    /* renamed from: c */
    private final void m13991c(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type IN ('table','view') AND name NOT LIKE 'sqlite_%'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN ('table','view')  ORDER BY 1 ", null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    String valueOf = String.valueOf(rawQuery.getString(0));
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
                } finally {
                    rawQuery.close();
                }
            }
        }
        onCreate(sQLiteDatabase);
    }
}
