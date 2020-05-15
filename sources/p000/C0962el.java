package p000;

import android.database.Cursor;

/* renamed from: el */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0962el {
    /* renamed from: a */
    public static int m10613a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
