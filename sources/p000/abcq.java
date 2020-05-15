package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: abcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abcq extends srp {

    /* renamed from: a */
    private static abcq f57041a;

    /* renamed from: b */
    private int f57042b = -1;

    /* renamed from: a */
    static synchronized abcq m47450a(Context context) {
        synchronized (abcq.class) {
            if (f57041a != null) {
                if (f57041a.f57042b != 22) {
                    aart.m46807a(f57041a);
                } else {
                    abcq abcq = f57041a;
                    return abcq;
                }
            }
            abcq abcq2 = new abcq(context, null);
            f57041a = abcq2;
            return abcq2;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(94);
        sb.append("Downgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data.");
        Log.w("gH_MetricsDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metrics");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(92);
        sb.append("Upgrading database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(", which will destroy all old data.");
        Log.w("gH_MetricsDatabase", sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metrics");
        onCreate(sQLiteDatabase);
    }

    @Deprecated
    public abcq(Context context) {
        super(context, m47451a(22), "metrics.db", 22);
        context.deleteDatabase("metrics.db");
        for (int i = 15; i < 22; i++) {
            context.deleteDatabase(m47451a(i));
        }
    }

    /* renamed from: a */
    static String m47451a(int i) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("metrics.db.");
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE metrics(_id INTEGER PRIMARY KEY AUTOINCREMENT,app_package_name TEXT,user_account_id TEXT,product_specific_context TEXT,session_id TEXT,user_action_type INTEGER,sub_user_action_type INTEGER,shown_content_list TEXT,query TEXT,url TEXT,click_rank INTEGER,contact_mode_type INTEGER,elapsed_millis LONG,content_unit_type_enum INTEGER,fragment_type INTEGER,network_type_enum INTEGER,timestamp_millis LONG,gcore_version INTEGER,client_version INTEGER,offline INTEGER,feedback_policy_set_version INTEGER,experiment_token TEXT,flow TEXT,feedback_psd_count INTEGER,feedback_psbd_count INTEGER,feedback_screenshot_present INTEGER,ocarina_elapsed_millis INTEGER,ocarina_num_bytes INTEGER);");
    }

    private abcq(Context context, byte[] bArr) {
        super(context, m47451a(22), "metrics.db", 22);
        context.deleteDatabase("metrics.db");
        for (int i = 15; i < 22; i++) {
            context.deleteDatabase(m47451a(i));
        }
        this.f57042b = 22;
    }
}
