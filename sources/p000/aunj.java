package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aunj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aunj extends aunc {
    public aunj(Context context, aumm aumm) {
        super(context, aumm);
    }

    /* renamed from: a */
    public final Cursor mo50690a(String str) {
        HashMap hashMap = new HashMap();
        String a = this.f92125b.mo50668a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 30 + String.valueOf(str).length());
        sb.append("SELECT * FROM ");
        sb.append(a);
        sb.append(" WHERE __id__ = ");
        sb.append(str);
        hashMap.put("sql_query_key", sb.toString());
        return mo50691a(hashMap);
    }

    /* renamed from: a */
    public final Cursor mo50691a(Map map) {
        SQLiteDatabase readableDatabase = aunh.m77384a().getReadableDatabase();
        String str = (String) map.get("sql_query_key");
        if (str != null) {
            return readableDatabase.rawQuery(str, null);
        }
        Log.e("Coffee-TrustStatusModelProvider", "The input condition does not provide SQL query.");
        return new MatrixCursor(new String[0]);
    }

    /* renamed from: a */
    public final SQLiteOpenHelper mo50697a() {
        return aunh.m77384a();
    }
}
