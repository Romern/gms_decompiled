package p000;

import android.database.Cursor;

/* renamed from: azdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdf extends azcx {

    /* renamed from: d */
    public final String f99064d;

    public azdf(long j, String str, int i, String str2) {
        super(j, str, i);
        this.f99064d = str2;
    }

    /* renamed from: a */
    public static azdf m85394a(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(3);
        int i = cursor.getInt(4);
        cursor.getLong(5);
        String string2 = cursor.getString(1);
        cursor.getString(2);
        return new azdf(j, string, i, string2);
    }
}
