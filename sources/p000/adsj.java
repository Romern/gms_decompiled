package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: adsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adsj extends srp {

    /* renamed from: a */
    private static adsj f62623a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private adsj(Context context, String str) {
        super(context, str, str, 3);
        sdo.m34959a(context);
    }

    /* renamed from: a */
    public static synchronized adsj m51086a(Context context) {
        adsj adsj;
        synchronized (adsj.class) {
            if (f62623a == null) {
                f62623a = new adsj(context, "mediastore-indexer.db");
            }
            adsj = f62623a;
        }
        return adsj;
    }

    /* JADX INFO: finally extract failed */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = adsi.f62621c;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS IntermediateStore");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS IntermediateStore (_ID INTEGER PRIMARY KEY ON CONFLICT REPLACE, MEDIA_TYPE INTEGER);");
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.beginTransaction();
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS PhotoTagStore");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        int i = adsi.f62621c;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS IntermediateStore (_ID INTEGER PRIMARY KEY ON CONFLICT REPLACE, MEDIA_TYPE INTEGER);");
    }
}
