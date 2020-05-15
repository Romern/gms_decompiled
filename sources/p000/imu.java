package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: imu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imu {
    static {
        imu.class.getSimpleName();
    }

    /* renamed from: a */
    public static void m15733a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str2.length() + 19 + str.length());
        sb.append("Adding column ");
        sb.append(str2);
        sb.append(" to ");
        sb.append(str);
        sb.append(".");
        sb.toString();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 25 + str2.length() + str3.length());
        sb2.append("ALTER TABLE ");
        sb2.append(str);
        sb2.append(" ADD COLUMN ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(str3);
        String sb3 = sb2.toString();
        if (str4 != null && !str4.isEmpty()) {
            String valueOf = String.valueOf(sb3);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 9 + str4.length());
            sb4.append(valueOf);
            sb4.append(" DEFAULT ");
            sb4.append(str4);
            sb3 = sb4.toString();
        }
        sQLiteDatabase.execSQL(String.valueOf(sb3).concat(";"));
    }

    /* renamed from: b */
    public static Long m15738b(Cursor cursor, String str) {
        return Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str)));
    }

    /* renamed from: c */
    public static String m15739c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: d */
    public static boolean m15740d(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0;
    }

    /* renamed from: a */
    public static void m15734a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        StringBuilder sb = new StringBuilder(128);
        sb.append("CREATE INDEX IF NOT EXISTS idx_");
        sb.append(str);
        for (String str2 : strArr) {
            sb.append('_');
            sb.append(str2);
        }
        sb.append(" ON ");
        sb.append(str);
        sb.append('(');
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(strArr[i]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: a */
    public static void m15735a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        m15736a(sQLiteDatabase, str, strArr, strArr2, (String[]) null);
    }

    /* renamed from: a */
    public static void m15736a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2, String[] strArr3) {
        boolean z;
        int i = 0;
        if (strArr3 == null || strArr3.length <= 0) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS ");
        sb.append(str);
        sb.append('(');
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                break;
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            sb.append(strArr2[i2]);
            if (z || i2 + 1 < length) {
                sb.append(',');
            }
            i2++;
        }
        if (z) {
            while (true) {
                int length2 = strArr3.length;
                if (i >= length2) {
                    break;
                }
                sb.append(strArr3[i]);
                i++;
                if (i < length2) {
                    sb.append(',');
                }
            }
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Creating table: ");
        } else {
            "Creating table: ".concat(valueOf);
        }
    }

    /* renamed from: a */
    public static byte[] m15737a(Cursor cursor, String str) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow(str));
    }
}
