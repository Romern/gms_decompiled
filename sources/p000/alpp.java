package p000;

import android.database.Cursor;
import java.util.Collection;

/* renamed from: alpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class alpp {
    /* renamed from: a */
    protected static final int m61486a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getInt(columnIndex);
        }
        amdk.m62659b("ContactsDataHandler", "Requested column %s didn't exist in the cursor.", str);
        return 0;
    }

    /* renamed from: b */
    protected static final String m61487b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        amdk.m62659b("ContactsDataHandler", "Requested column %s didn't exist in the cursor.", str);
        return "";
    }

    /* renamed from: a */
    public abstract void mo40634a(alqk alqk, Cursor cursor);

    /* renamed from: a */
    public abstract void mo40635a(Collection collection);
}
