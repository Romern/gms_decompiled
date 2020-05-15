package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

/* renamed from: swi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class swi extends srp {

    /* renamed from: a */
    public boolean f45274a = false;

    /* renamed from: b */
    public boolean f45275b = false;

    public swi(Context context) {
        super(context, "config.db", "config.db", 7, cdnd.m134166b());
    }

    /* renamed from: c */
    private static final void m36519c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS main (package TEXT, namespace TEXT, key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS override (package TEXT, namespace TEXT, key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiment (package TEXT, namespace TEXT, key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS fetch_metadata (package TEXT, namespace_digest TEXT, recent_success_times TEXT, recent_failure_times TEXT, device_context_digest BLOB, app_context_digest BLOB, PRIMARY KEY (package))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS internal_metadata (key TEXT, value BLOB, PRIMARY KEY (key))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiment_payload (package TEXT, payload BLOB , PRIMARY KEY (package, payload))");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        m36519c(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        if (!sQLiteDatabase.isReadOnly()) {
            m36519c(sQLiteDatabase);
        }
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM override");
        try {
            boolean z2 = true;
            if (compileStatement.simpleQueryForLong() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f45274a = z;
            compileStatement.close();
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM experiment");
            try {
                if (compileStatement2.simpleQueryForLong() <= 0) {
                    z2 = false;
                }
                this.f45275b = z2;
            } finally {
                compileStatement2.close();
            }
        } catch (Throwable th) {
            compileStatement.close();
            throw th;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(63);
        sb.append("onDowngrade(): oldVersion: ");
        sb.append(i);
        sb.append(", newVersion: ");
        sb.append(i2);
        Log.w("ConfigChimeraService", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS override");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fetch_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS internal_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS experiment");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS experiment_payload");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS phenotype");
        m36519c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("onUpgrade(): oldVersion: ");
        sb.append(i);
        sb.append(", newVersion: ");
        sb.append(i2);
        Log.i("ConfigChimeraService", sb.toString());
        if (i >= 7 || i2 != 7) {
            throw new IllegalStateException("unexpected version upgrade of config.db");
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS override");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fetch_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS internal_metadata");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS experiment_payload");
        if (i == 4) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS experiment (package TEXT, namespace TEXT , key TEXT, value BLOB, PRIMARY KEY (package, namespace, key))");
            sQLiteDatabase.execSQL("INSERT INTO experiment (package, namespace, key, value) SELECT package, \"configns:p4\", key, value FROM phenotype");
            sQLiteDatabase.execSQL("DROP TABLE phenotype");
        }
        m36519c(sQLiteDatabase);
    }
}
