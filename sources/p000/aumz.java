package p000;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;

/* renamed from: aumz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aumz extends aumw {

    /* renamed from: a */
    public static final aumz f92123a = new aumz();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50684a(ContentValues contentValues, String str, Object obj) {
        String str2 = (String) obj;
        String asString = contentValues.getAsString(str);
        return asString == null ? str2 : asString;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo50689b(ContentValues contentValues, String str, Object obj) {
        contentValues.put(str, (String) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50685a(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo50686a(Cursor cursor, String str) {
        String str2 = null;
        String string = cursor.getString(cursor.getColumnIndex(str));
        return string == null ? str2 : string;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50687a(SharedPreferences.Editor editor, String str, Object obj) {
        editor.putString(str, (String) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50688a(MatrixCursor.RowBuilder rowBuilder, String str, Object obj) {
        String str2 = (String) obj;
        if (str2 != null) {
            rowBuilder.add(str, str2);
        }
    }
}
