package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: acng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acng {
    /* renamed from: a */
    public static final CharSequence m49498a(long j) {
        return j != 0 ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(j)) : "0";
    }

    /* renamed from: a */
    public static void m49499a(SQLiteDatabase sQLiteDatabase, String str, PrintWriter printWriter, String str2) {
        Cursor rawQuery;
        m49500a(printWriter, str, "Table ", str2, ":");
        String concat = str.concat("  ");
        try {
            rawQuery = sQLiteDatabase.rawQuery(str2.length() == 0 ? new String("SELECT * FROM ") : "SELECT * FROM ".concat(str2), null);
            if (rawQuery != null) {
                m49500a(printWriter, concat, TextUtils.join("|", rawQuery.getColumnNames()));
                int columnCount = rawQuery.getColumnCount();
                StringBuilder sb = new StringBuilder();
                while (rawQuery.moveToNext()) {
                    sb.setLength(0);
                    for (int i = 0; i < columnCount; i++) {
                        sb.append(rawQuery.getString(i));
                        sb.append('|');
                    }
                    m49500a(printWriter, concat, sb.toString());
                }
                rawQuery.close();
            }
        } catch (SQLiteException e) {
            if (e.getMessage() != null) {
                m49500a(printWriter, concat, e.getMessage());
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m49500a(PrintWriter printWriter, Object... objArr) {
        for (Object obj : objArr) {
            printWriter.print(String.valueOf(obj));
        }
        printWriter.println();
    }
}
