package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: aluo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aluo {

    /* renamed from: e */
    private static aluo f74313e;

    /* renamed from: a */
    public final sqv f74314a;

    /* renamed from: b */
    public final alun f74315b;

    /* renamed from: c */
    public final ContentValues f74316c = new ContentValues();

    /* renamed from: d */
    public final aluk f74317d;

    /* renamed from: f */
    private final Context f74318f;

    public aluo(Context context, String str) {
        this.f74318f = context.getApplicationContext();
        this.f74315b = new alun(this.f74318f, str);
        this.f74314a = ancm.m64005a(this.f74318f);
        this.f74317d = new aluk(this.f74314a);
    }

    /* renamed from: a */
    public static synchronized aluo m61909a(Context context) {
        aluo aluo;
        synchronized (aluo.class) {
            if (f74313e == null) {
                f74313e = new aluo(context, "peoplelog.db");
            }
            aluo = f74313e;
        }
        return aluo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteDatabase mo40801a() {
        try {
            return this.f74315b.getWritableDatabase();
        } catch (SQLiteException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40802a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i, String str3, long j, int i2, String str4) {
        this.f74316c.clear();
        this.f74316c.put("account_name", str);
        this.f74316c.put("page_id", str2);
        this.f74316c.put("process_id", Integer.valueOf(i));
        this.f74316c.put("message", str3);
        this.f74316c.put("timestamp", Long.valueOf(j));
        this.f74316c.put("thread_id", Integer.valueOf(i2));
        this.f74316c.put("log_tag", str4);
        sQLiteDatabase.insert("logs", null, this.f74316c);
    }
}
