package p000;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;

/* renamed from: aumx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aumx extends aumw {

    /* renamed from: a */
    public static final aumx f92119a = new aumx();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50684a(ContentValues contentValues, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        Boolean asBoolean = contentValues.getAsBoolean(str);
        return asBoolean == null ? bool : asBoolean;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo50689b(ContentValues contentValues, String str, Object obj) {
        contentValues.put(str, (Boolean) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50685a(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.contains(str) ? Boolean.valueOf(sharedPreferences.getBoolean(str, false)) : null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50686a(Cursor cursor, String str) {
        int i;
        boolean z = null;
        Boolean bool = null;
        if (!cursor.isNull(cursor.getColumnIndex(str))) {
            i = cursor.getInt(cursor.getColumnIndex(str));
        } else {
            i = -1;
        }
        if (i == 0) {
            z = false;
        } else if (i == 1) {
            z = true;
        }
        return z != null ? z : bool;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50687a(SharedPreferences.Editor editor, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            editor.remove(str);
        } else {
            editor.putBoolean(str, bool.booleanValue());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50688a(MatrixCursor.RowBuilder rowBuilder, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            rowBuilder.add(str, -1);
        } else if (bool.equals(Boolean.TRUE)) {
            rowBuilder.add(str, 1);
        } else {
            rowBuilder.add(str, 0);
        }
    }
}
