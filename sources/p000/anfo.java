package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* renamed from: anfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfo {

    /* renamed from: a */
    public static final String[] f76772a;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("packageName");
        arrayList.add("version");
        arrayList.add("user");
        arrayList.add("isCommitted");
        arrayList.add("experimentToken");
        arrayList.add("serverToken");
        arrayList.add("configHash");
        arrayList.add("servingVersion");
        arrayList.add("tokensTag");
        arrayList.add("flagsHash");
        f76772a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static Cursor m64163a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z, String str3) {
        String str4;
        String[] strArr = {str3};
        String[] strArr2 = new String[4];
        strArr2[0] = str;
        strArr2[1] = Integer.toString(i);
        strArr2[2] = str2;
        if (!z) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        strArr2[3] = str4;
        return sQLiteDatabase.query("ExperimentTokens", strArr, "packageName = ? AND version = ? AND user = ? AND isCommitted = ?", strArr2, null, null, null);
    }

    /* renamed from: a */
    public static String m64164a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor a = m64163a(sQLiteDatabase, str, i, str2, z, "configHash");
        try {
            if (!a.moveToFirst()) {
                if (a != null) {
                    a.close();
                }
                return "";
            }
            String string = a.getString(0);
            if (a != null) {
                a.close();
            }
            return string;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static void m64165a(SQLiteDatabase sQLiteDatabase) {
        String[] strArr = new String[9];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "user TEXT NOT NULL";
        strArr[3] = "isCommitted INTEGER NOT NULL";
        strArr[4] = "experimentToken BLOB NOT NULL";
        strArr[5] = "serverToken TEXT NOT NULL";
        strArr[6] = "configHash TEXT NOT NULL DEFAULT ''";
        strArr[7] = "servingVersion INTEGER NOT NULL DEFAULT 0";
        String valueOf = String.valueOf(anfw.m64179a("packageName", "version", "user", "isCommitted"));
        strArr[8] = valueOf.length() == 0 ? new String("tokensTag BLOB DEFAULT NULL, flagsHash INTEGER DEFAULT NULL") : "tokensTag BLOB DEFAULT NULL, flagsHash INTEGER DEFAULT NULL".concat(valueOf);
        sQLiteDatabase.execSQL(anfw.m64178a("ExperimentTokens", strArr));
        sQLiteDatabase.execSQL(anfw.m64177a("ExperimentTokens", "committed", "packageName", "version", "user", "isCommitted"));
    }

    /* renamed from: a */
    public static void m64166a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tokensTag", new byte[0]);
        contentValues.put("experimentToken", new byte[0]);
        sQLiteDatabase.update("ExperimentTokens", contentValues, "packageName = ? AND user = ? AND version = ?", new String[]{str, str2, Integer.toString(i)});
    }
}
