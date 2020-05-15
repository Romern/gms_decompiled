package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDoneException;
import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ayfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfn {

    /* renamed from: a */
    public final ayfm f97489a;

    public ayfn(ayfm ayfm) {
        this.f97489a = ayfm;
    }

    /* renamed from: a */
    private static final ConnectionConfiguration m83929a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("name"));
        String string2 = cursor.getString(cursor.getColumnIndex("pairedBtAddress"));
        int i = cursor.getInt(cursor.getColumnIndex("connectionType"));
        int i2 = cursor.getInt(cursor.getColumnIndex("role"));
        int i3 = cursor.getInt(cursor.getColumnIndex("connectionEnabled"));
        String string3 = cursor.getString(cursor.getColumnIndex("nodeId"));
        String str = null;
        String str2 = !string.equals("NULL_STRING") ? string : null;
        if (!string2.equals("NULL_STRING")) {
            str = string2;
        }
        return new ConnectionConfiguration(str2, str, i, i2, i3 > 0, string3);
    }

    /* renamed from: b */
    public final String mo53982b(String str) {
        if (str != null) {
            try {
                return DatabaseUtils.stringForQuery(this.f97489a.getReadableDatabase(), "select nodeId FROM connectionConfigurations WHERE name=?", new String[]{str});
            } catch (SQLiteDoneException e) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final int mo53983c(String str) {
        if (str == null) {
            str = "NULL_STRING";
        }
        return this.f97489a.getWritableDatabase().delete("connectionConfigurations", "name=?", new String[]{str});
    }

    /* renamed from: d */
    public final String mo53984d(String str) {
        if (str != null) {
            try {
                return DatabaseUtils.stringForQuery(this.f97489a.getReadableDatabase(), "select crypto FROM connectionConfigurations WHERE name=?", new String[]{str});
            } catch (SQLiteDoneException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final ConnectionConfiguration mo53979a(String str) {
        if (str == null) {
            str = "NULL_STRING";
        }
        Cursor query = this.f97489a.getReadableDatabase().query("connectionConfigurations", null, "name=?", new String[]{str}, null, null, null);
        ConnectionConfiguration connectionConfiguration = null;
        if (query != null) {
            if (query.moveToFirst()) {
                connectionConfiguration = m83929a(query);
            }
            query.close();
        }
        return connectionConfiguration;
    }

    /* renamed from: a */
    public final List mo53980a() {
        if (Log.isLoggable("ConnectionConfig", 3)) {
            Log.d("ConnectionConfig", "loadConnectionConfigs");
        }
        Cursor query = this.f97489a.getReadableDatabase().query("connectionConfigurations", null, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(m83929a(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: a */
    public final void mo53981a(ConnectionConfiguration connectionConfiguration) {
        if (Log.isLoggable("ConnectionConfig", 3)) {
            String valueOf = String.valueOf(connectionConfiguration);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("saveConnectionConfig=");
            sb.append(valueOf);
            Log.d("ConnectionConfig", sb.toString());
        }
        ContentValues contentValues = new ContentValues();
        String str = connectionConfiguration.f110864a;
        String str2 = "NULL_STRING";
        if (str == null) {
            str = str2;
        }
        String str3 = connectionConfiguration.f110865b;
        if (str3 != null) {
            str2 = str3;
        }
        contentValues.put("name", str);
        contentValues.put("pairedBtAddress", str2);
        contentValues.put("connectionType", Integer.valueOf(connectionConfiguration.f110866c));
        contentValues.put("role", Integer.valueOf(connectionConfiguration.f110867d));
        contentValues.put("connectionEnabled", Boolean.valueOf(connectionConfiguration.f110868e));
        String b = mo53982b(connectionConfiguration.f110864a);
        if (b != null) {
            contentValues.put("nodeId", b);
        }
        String d = mo53984d(connectionConfiguration.f110864a);
        if (d != null) {
            contentValues.put("crypto", d);
        }
        this.f97489a.getWritableDatabase().insertWithOnConflict("connectionConfigurations", null, contentValues, 5);
    }
}
