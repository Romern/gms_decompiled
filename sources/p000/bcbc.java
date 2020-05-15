package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;

/* renamed from: bcbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcbc {

    /* renamed from: a */
    private static final String[] f103927a = {"name"};

    /* renamed from: a */
    public static Uri m88743a(String str, String str2, String str3, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(str);
        builder.appendEncodedPath(str2);
        builder.appendEncodedPath(str3);
        for (String str4 : strArr) {
            builder.appendEncodedPath(str4);
        }
        return builder.build();
    }

    /* renamed from: a */
    public static String m88744a(int i) {
        if (i >= 0) {
            return TextUtils.join(",", Collections.nCopies(i, "?"));
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid size for list placeholder: ");
        sb.append(i);
        bbos.m88294d("TableUtils", sb.toString());
        return "";
    }

    /* renamed from: a */
    public static String m88745a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m88746a(SQLiteDatabase sQLiteDatabase) {
        String string;
        String string2;
        Cursor query = sQLiteDatabase.query("sqlite_master", f103927a, "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    string2 = query.getString(0);
                    String valueOf = String.valueOf(string2);
                    sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP VIEW IF EXISTS ") : "DROP VIEW IF EXISTS ".concat(valueOf));
                } catch (SQLiteException e) {
                    String valueOf2 = String.valueOf(string2);
                    bbos.m88292b("TableUtils", valueOf2.length() == 0 ? new String("View drop failure") : "View drop failure".concat(valueOf2), e);
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        Cursor query2 = sQLiteDatabase.query("sqlite_master", f103927a, "type='index'", null, null, null, null);
        if (query2 != null) {
            while (query2.moveToNext()) {
                try {
                    string = query2.getString(0);
                    String valueOf3 = String.valueOf(string);
                    sQLiteDatabase.execSQL(valueOf3.length() == 0 ? new String("DROP INDEX IF EXISTS ") : "DROP INDEX IF EXISTS ".concat(valueOf3));
                } catch (SQLiteException e2) {
                    String valueOf4 = String.valueOf(string);
                    bbos.m88292b("TableUtils", valueOf4.length() == 0 ? new String("Index drop failure") : "Index drop failure".concat(valueOf4), e2);
                } catch (Throwable th2) {
                    query2.close();
                    throw th2;
                }
            }
            query2.close();
        }
        Cursor query3 = sQLiteDatabase.query("sqlite_master", f103927a, "type='table'", null, null, null, null);
        if (query3 != null) {
            while (query3.moveToNext()) {
                try {
                    String string3 = query3.getString(0);
                    if (!string3.startsWith("android_") && !string3.startsWith("sqlite_")) {
                        m88747a(sQLiteDatabase, string3);
                    }
                } finally {
                    query3.close();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m88747a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE IF EXISTS ") : "DROP TABLE IF EXISTS ".concat(valueOf));
        } catch (SQLiteException e) {
            String valueOf2 = String.valueOf(str);
            bbos.m88292b("TableUtils", valueOf2.length() == 0 ? new String("Table drop failure ") : "Table drop failure ".concat(valueOf2), e);
        }
    }

    /* renamed from: a */
    public static void m88748a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        m88749a(sQLiteDatabase, str, str2, (String[]) null);
    }

    /* renamed from: a */
    public static void m88749a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String str3;
        String str4;
        String concat = str.concat("_backup");
        StringBuilder sb = new StringBuilder(str.length() + 23 + String.valueOf(concat).length());
        sb.append("ALTER TABLE ");
        sb.append(str);
        sb.append(" RENAME TO ");
        sb.append(concat);
        sQLiteDatabase.execSQL(sb.toString());
        sQLiteDatabase.execSQL(str2);
        if (strArr != null) {
            str3 = bmxr.m108544a(", ").mo66873a().mo66876a((Object[]) strArr);
        } else {
            str3 = "*";
        }
        if (strArr != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 3);
            sb2.append(" (");
            sb2.append(str3);
            sb2.append(")");
            str4 = sb2.toString();
        } else {
            str4 = "";
        }
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length + 26 + String.valueOf(str4).length() + String.valueOf(str3).length() + String.valueOf(concat).length());
        sb3.append("INSERT INTO ");
        sb3.append(str);
        sb3.append(str4);
        sb3.append(" SELECT ");
        sb3.append(str3);
        sb3.append(" FROM ");
        sb3.append(concat);
        sQLiteDatabase.execSQL(sb3.toString());
        String valueOf = String.valueOf(concat);
        sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("DROP TABLE ") : "DROP TABLE ".concat(valueOf));
    }

    /* renamed from: a */
    public static String[] m88750a(String str, String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = m88745a(str, strArr[i]);
        }
        return strArr2;
    }

    /* renamed from: a */
    public static String[] m88751a(String[]... strArr) {
        int i = 0;
        for (String[] strArr2 : strArr) {
            i += strArr2.length;
        }
        String[] strArr3 = new String[i];
        int i2 = 0;
        for (String[] strArr4 : strArr) {
            int length = strArr4.length;
            System.arraycopy(strArr4, 0, strArr3, i2, length);
            i2 += length;
        }
        return strArr3;
    }
}
