package p000;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: anih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anih {

    /* renamed from: a */
    public String f76941a;

    /* renamed from: b */
    public final String f76942b;

    public anih(String str, String str2) {
        this.f76941a = str;
        this.f76942b = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m64471a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.beginTransaction();
        try {
            m64472b(sQLiteDatabase, str);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            anhj.m64401a();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: b */
    static void m64472b(SQLiteDatabase sQLiteDatabase, String str) {
        String[] strArr = {str};
        sQLiteDatabase.delete("ApplicationStates", "packageName = ?", strArr);
        sQLiteDatabase.delete("LogSources", "packageName = ?", strArr);
        sQLiteDatabase.delete("WeakExperimentIds", "packageName = ?", strArr);
        sQLiteDatabase.delete("ExperimentTokens", "packageName = ?", strArr);
        sQLiteDatabase.delete("Flags", "packageName = ?", strArr);
        sQLiteDatabase.delete("FlagOverrides", "packageName = ?", strArr);
        sQLiteDatabase.delete("ApplicationTags", "packageName = ?", strArr);
        sQLiteDatabase.delete("CrossLoggedExperimentTokens", "toPackageName = ?", strArr);
        sQLiteDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ?", strArr);
        sQLiteDatabase.delete("Packages", "packageName = ?", strArr);
        sQLiteDatabase.delete("GenericDimensions", "packageName = ?", strArr);
        sQLiteDatabase.delete("RequestTags", null, null);
    }
}
