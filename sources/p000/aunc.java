package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aunc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aunc extends auna {
    public aunc(Context context, aumm aumm) {
        super(context, aumm);
    }

    /* renamed from: a */
    public Cursor mo50690a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("__id__", str);
        return mo50691a(hashMap);
    }

    /* renamed from: a */
    public abstract SQLiteOpenHelper mo50697a();

    /* renamed from: a */
    public Cursor mo50691a(Map map) {
        String str;
        SQLiteDatabase readableDatabase = mo50697a().getReadableDatabase();
        aumy[] b = this.f92125b.mo50669b();
        int length = b.length;
        String[] strArr = new String[(length + 1)];
        int i = 0;
        strArr[0] = "__id__";
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            strArr[i3] = b[i2].f92120a;
            i2 = i3;
        }
        int size = map.size();
        StringBuilder sb = new StringBuilder();
        String[] strArr2 = new String[size];
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null || ((String) entry.getKey()).isEmpty() || entry.getValue() == null) {
                String valueOf = String.valueOf(entry);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb2.append("The input of condition: ");
                sb2.append(valueOf);
                sb2.append(" is illegal.");
                Log.w("Coffee-SQLPro", sb2.toString());
            } else {
                sb.append((String) entry.getKey());
                sb.append(" = ?");
                if (i != size - 1) {
                    sb.append(" AND ");
                }
                strArr2[i] = String.valueOf(entry.getValue());
                i++;
            }
        }
        if (!sb.toString().isEmpty()) {
            str = sb.toString();
        } else {
            str = null;
        }
        if (str == null) {
            strArr2 = null;
        }
        return readableDatabase.query(this.f92125b.mo50668a(), strArr, str, strArr2, null, null, null);
    }

    /* renamed from: b */
    public final void mo50694b(String str) {
        try {
            SQLiteDatabase writableDatabase = mo50697a().getWritableDatabase();
            writableDatabase.delete(this.f92125b.mo50668a(), "__id__ = ?", new String[]{String.valueOf(str)});
        } catch (SQLiteException e) {
            Log.e("Coffee-SQLPro", "Unable to get writable database", e);
        }
        mo50692a(2, str);
    }

    /* renamed from: a */
    public final void mo50693a(String str, ContentValues contentValues) {
        auml a = this.f92125b.mo50666a(str, contentValues);
        try {
            SQLiteDatabase writableDatabase = mo50697a().getWritableDatabase();
            ContentValues a2 = a.mo50670a();
            a2.put("__id__", a.f92085d);
            writableDatabase.insert(this.f92125b.mo50668a(), null, a2);
        } catch (SQLiteException e) {
            Log.e("Coffee-SQLPro", "Unable to get writable database", e);
        }
        mo50692a(1, str);
    }
}
