package p000;

import android.database.Cursor;
import java.util.Collection;

/* renamed from: aclz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class aclz {
    /* renamed from: a */
    protected static final int m49433a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getInt(columnIndex);
        }
        acnv.m49547b("Requested column %s didn't exist in the cursor.", str);
        return 0;
    }

    /* renamed from: b */
    protected static final String m49434b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        acnv.m49547b("Requested column %s didn't exist in the cursor.", str);
        return "";
    }

    /* renamed from: a */
    public abstract void mo32878a(acmz acmz, Cursor cursor);

    /* renamed from: a */
    public abstract void mo32879a(Collection collection);
}
