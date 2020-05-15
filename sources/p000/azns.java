package p000;

import android.database.Cursor;
import android.text.TextUtils;

/* renamed from: azns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azns {
    /* renamed from: a */
    public static boolean m85869a(Cursor cursor) {
        return azoy.m85985a(cursor.getString(2), cursor.getInt(3));
    }

    /* renamed from: b */
    public static boolean m85871b(Cursor cursor) {
        boolean z;
        int i = cursor.getInt(12);
        boolean z2 = false;
        if (i == 32) {
            z = false;
        } else {
            z = true;
        }
        String string = cursor.getString(2);
        if (i == 32 || cursor.isLast()) {
            return z;
        }
        if (!TextUtils.isEmpty(string)) {
            cursor.moveToNext();
            if (!string.equals(cursor.getString(2)) || azoy.m85994j(cursor.getString(9))) {
                z2 = true;
            }
            cursor.moveToPrevious();
            return z2;
        } else if (!azdd.m85390c(i)) {
            return z;
        } else {
            cursor.moveToNext();
            int i2 = cursor.getInt(12);
            cursor.moveToPrevious();
            return !azdd.m85390c(i2);
        }
    }

    /* renamed from: a */
    public static boolean m85870a(aznz aznz, Cursor cursor) {
        return aznz.mo55105c() && aznz.f99775b.equals("FB") && aznz.f99777d.equals(cursor.getString(2)) && aznz.f99776c == cursor.getInt(3);
    }
}
