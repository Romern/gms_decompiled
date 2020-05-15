package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: eeb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eeb extends srp {

    /* renamed from: a */
    private final Context f14764a;

    /* renamed from: b */
    private final String f14765b;

    protected eeb(Context context, String str) {
        super(context, str, "context_feature", 2);
        this.f14764a = context;
        this.f14765b = str;
    }

    /* renamed from: c */
    private static void m10209c(SQLiteDatabase sQLiteDatabase) {
        eed.m10216a(sQLiteDatabase, "feature", ees.f14797c);
    }

    /* renamed from: d */
    private static void m10210d(SQLiteDatabase sQLiteDatabase) {
        String[][] strArr;
        for (String[] strArr2 : ees.f14797c) {
            String a = eed.m10214a("feature", strArr2);
            eeq.m10251b();
            sQLiteDatabase.execSQL(new eem(a).f14783a.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        m10209c(sQLiteDatabase);
    }

    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (SQLiteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eeb", "getReadableDatabase", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextDbFileManager] Could not get readable feature database.  Re-creating.");
            String str = this.f14765b;
            if (str != null) {
                this.f14764a.getDatabasePath(str).delete();
            }
            return super.getReadableDatabase();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eeb", "getWritableDatabase", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ContextDbFileManager] Could not get writable feature database.  Re-creating.");
            String str = this.f14765b;
            if (str != null) {
                this.f14764a.getDatabasePath(str).delete();
            }
            return super.getWritableDatabase();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            m10210d(sQLiteDatabase);
            m10209c(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 1 && i2 == 2) {
            m10210d(sQLiteDatabase);
            m10209c(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        eed.m10215a(sQLiteDatabase, "feature", ees.f14795a, ees.f14796b);
        m10209c(sQLiteDatabase);
    }
}
