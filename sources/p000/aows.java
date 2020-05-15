package p000;

import android.database.Cursor;

/* renamed from: aows */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aows {
    /* renamed from: a */
    public static Long m69725a(Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            return Long.valueOf(cursor.getLong(i));
        }
        return null;
    }

    /* renamed from: b */
    public static Integer m69726b(Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            return Integer.valueOf(cursor.getInt(i));
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m69727c(Cursor cursor, int i) {
        if (cursor.isNull(i) || cursor.getInt(i) != 1) {
            return false;
        }
        return true;
    }
}
