package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: aaxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaxw extends srp {

    /* renamed from: a */
    private static aaxw f56800a;

    /* renamed from: b */
    private int f56801b = -1;

    /* renamed from: a */
    static int m47200a() {
        return aaxx.m47206e() ? 24 : 23;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(93);
        sb.append("Downgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data");
        Log.w("gH_HelpResponseDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS help_responses");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(91);
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data");
        Log.w("gH_HelpResponseDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS help_responses");
        onCreate(sQLiteDatabase);
    }

    @Deprecated
    public aaxw(Context context) {
        super(context, m47202a(m47200a()), "help_responses.db", m47200a());
        context.deleteDatabase("help_responses.db");
        for (int i = 18; i < m47200a(); i++) {
            context.deleteDatabase(m47202a(i));
        }
    }

    /* renamed from: a */
    static synchronized aaxw m47201a(Context context) {
        synchronized (aaxw.class) {
            int a = m47200a();
            if (f56800a != null) {
                if (f56800a.f56801b != m47200a()) {
                    aart.m46807a(f56800a);
                } else {
                    aaxw aaxw = f56800a;
                    return aaxw;
                }
            }
            aaxw aaxw2 = new aaxw(context, a);
            f56800a = aaxw2;
            return aaxw2;
        }
    }

    /* renamed from: a */
    static String m47202a(int i) {
        StringBuilder sb = new StringBuilder(29);
        sb.append("help_responses.db.");
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (!aaxx.m47206e()) {
            str = "CREATE TABLE help_responses(id TEXT,app_package_name TEXT,type INTEGER,title TEXT,snippet TEXT,url TEXT,api_url TEXT,intent_url TEXT,setting_action_definition BLOB,navigation_action_url TEXT,etag TEXT,visited_time INTEGER,child_ids TEXT,is_feeling_lucky INTEGER,is_in_dark_mode INTEGER,saved_timestamp INTEGER,PRIMARY KEY (id, app_package_name, is_in_dark_mode));";
        } else {
            str = "CREATE TABLE help_responses(id TEXT,prediction_id TEXT,reporting_id TEXT,app_package_name TEXT,type INTEGER,title TEXT,snippet TEXT,url TEXT,api_url TEXT,intent_url TEXT,setting_action_definition BLOB,navigation_action_url TEXT,etag TEXT,visited_time INTEGER,child_ids TEXT,is_feeling_lucky INTEGER,is_in_dark_mode INTEGER,saved_timestamp INTEGER,PRIMARY KEY (id, app_package_name, is_in_dark_mode));";
        }
        sQLiteDatabase.execSQL(str);
    }

    private aaxw(Context context, int i) {
        super(context, m47202a(i), "help_responses.db", i);
        context.deleteDatabase("help_responses.db");
        for (int i2 = 18; i2 < i; i2++) {
            context.deleteDatabase(m47202a(i2));
        }
        this.f56801b = i;
    }
}
