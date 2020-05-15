package p000;

import android.database.Cursor;

/* renamed from: adph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adph {
    /* renamed from: a */
    public static void m50934a(Cursor cursor, int i, int i2, adrj adrj) {
        while (!cursor.isAfterLast()) {
            adrj.mo33741a(new adqz(Long.valueOf(cursor.getLong(i)), Integer.valueOf(cursor.getInt(i2))));
            cursor.moveToNext();
        }
    }
}
