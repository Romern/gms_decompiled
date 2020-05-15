package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: audj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audj extends srp {

    /* renamed from: a */
    public static audj f91417a;

    static {
        audg.m76790a("SpamDbHelper");
    }

    /* renamed from: a */
    public static synchronized audj m76808a(Context context) {
        audj audj;
        synchronized (audj.class) {
            if (f91417a == null) {
                f91417a = new audj(context.getApplicationContext(), "telephonyspam.db");
            }
            audj = f91417a;
        }
        return audj;
    }

    /* renamed from: b */
    public final int mo50428b(String str, int i) {
        Cursor a = mo50427a("client_spam_table", "number=?", new String[]{str});
        try {
            if (a.getCount() != 0) {
                while (a.moveToNext()) {
                    int i2 = a.getInt(a.getColumnIndex("app_type"));
                    int i3 = a.getInt(a.getColumnIndex("spam_status"));
                    if (i2 == i) {
                        if (i3 == 1) {
                            if (a != null) {
                                a.close();
                            }
                            return 1;
                        } else if (i3 == 0) {
                            if (a == null) {
                                return 2;
                            }
                            a.close();
                            return 2;
                        }
                    }
                }
                if (a != null) {
                    a.close();
                }
                return 0;
            }
            if (a != null) {
                a.close();
            }
            return 0;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS server_spam_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS server_sms_spam_table");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sip_header_table");
        onCreate(sQLiteDatabase);
    }

    private audj(Context context, String str) {
        super(context, str, str, 4);
    }

    /* renamed from: a */
    public final int mo50426a(String str, int i) {
        String str2;
        if (i != 2) {
            str2 = "server_spam_table";
        } else {
            str2 = "server_sms_spam_table";
        }
        Cursor a = mo50427a(str2, "number=?", new String[]{str});
        try {
            if (a.getCount() > 0) {
                if (a != null) {
                    a.close();
                }
                return 1;
            }
            if (a != null) {
                a.close();
            }
            return 0;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final Cursor mo50427a(String str, String str2, String[] strArr) {
        return f91417a.getReadableDatabase().query(str, null, str2, strArr, null, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS server_spam_table (number TEXT PRIMARY KEY);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS server_sms_spam_table (number TEXT PRIMARY KEY);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS client_spam_table (number TEXT, spam_status INTEGER, app_type INTEGER, PRIMARY KEY (number, app_type) );");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sip_header_table(number TEXT PRIMARY KEY, timestamp INTEGER, result TEXT, p_asserted_identity TEXT, to_hostname TEXT, from_header TEXT, content_length INTEGER, max_forwards INTEGER, user_agent TEXT, is_ims INTEGER, is_forwarded INTEGER, carrier TEXT);");
    }
}
