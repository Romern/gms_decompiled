package p000;

import android.database.Cursor;

/* renamed from: azda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azda extends azcx {

    /* renamed from: d */
    public final String f99026d;

    public azda(String str, long j, String str2, int i) {
        super(j, str2, i);
        this.f99026d = str;
    }

    /* renamed from: a */
    public static azda m85384a(Cursor cursor) {
        String string = cursor.getString(0);
        cursor.getBlob(1);
        cursor.getInt(6);
        int i = cursor.getInt(2);
        String string2 = cursor.getString(3);
        int i2 = cursor.getInt(4);
        cursor.getLong(5);
        return new azda(string, (long) i, string2, i2);
    }
}
