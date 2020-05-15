package p000;

import android.database.Cursor;
import java.util.Collection;

/* renamed from: aozp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aozp {
    /* renamed from: a */
    protected static final int m69911a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getInt(columnIndex);
        }
        aozy.f83961a.mo46986d("Requested column %s didn't exist in the cursor.", str);
        return 0;
    }

    /* renamed from: b */
    protected static final String m69912b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        aozy.f83961a.mo46986d("Requested column %s didn't exist in the cursor.", str);
        return "";
    }

    /* renamed from: a */
    public abstract void mo47042a(apaw apaw, Cursor cursor);

    /* renamed from: a */
    public abstract void mo47043a(Collection collection);
}
