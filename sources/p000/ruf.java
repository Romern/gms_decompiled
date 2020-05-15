package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.List;

/* renamed from: ruf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ruf extends SQLiteOpenHelper implements AutoCloseable {
    public ruf() {
        super(aytw.m84817d(rpr.m34216b()), "com.google.android.gms.devicedoctor.db", (SQLiteDatabase.CursorFactory) null, 201515);
    }

    /* renamed from: d */
    public static final void m34470d() {
        if (null == null) {
            long j = ruc.f43686a;
        }
    }

    /* renamed from: e */
    public static final List m34471e() {
        return bngx.m109358a(new ruc(), new ruj(), new rul());
    }

    /* renamed from: f */
    private static final void m34472f() {
        if (null == null) {
            int i = rul.f43712b;
        }
    }

    /* renamed from: a */
    public final List mo25176a() {
        m34472f();
        return rul.m34486a(getWritableDatabase(), null, null);
    }

    /* renamed from: b */
    public final List mo25178b() {
        m34472f();
        return rul.m34488e(getWritableDatabase());
    }

    /* renamed from: c */
    public final rud mo25179c() {
        rud rud;
        m34470d();
        Cursor query = getWritableDatabase().query("crash_count", new String[]{"crash_hash", "stack_trace", "count", "start_time", "latest_tme", "latest_error_dialog_time", "latest_notification_time"}, null, null, null, null, "latest_tme DESC", "1");
        try {
            if (query.moveToFirst()) {
                if (query != null) {
                    rud = ruc.m34461a(query, query.getString(query.getColumnIndexOrThrow("crash_hash")));
                } else {
                    rud = null;
                }
                if (query != null) {
                    query.close();
                    return rud;
                }
            } else if (query != null) {
                query.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sdo.checkIfNull(sQLiteDatabase, "db cannot be null");
        Log.i("DeviceDrDatabaseHelper", "Creating databases!");
        List e = m34471e();
        for (int i = 0; i < e.size(); i++) {
            ((ruh) e.get(i)).mo25170a(sQLiteDatabase);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sdo.checkIfNull(sQLiteDatabase, "db cannot be null");
        StringBuilder sb = new StringBuilder(65);
        sb.append("Downgrade database: oldVersion=");
        sb.append(i);
        sb.append(" newVersion=");
        sb.append(i2);
        Log.i("DeviceDrDatabaseHelper", sb.toString());
        List e = m34471e();
        for (int i3 = 0; i3 < e.size(); i3++) {
            ((ruh) e.get(i3)).mo25172c(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sdo.checkIfNull(sQLiteDatabase, "db cannot be null");
        StringBuilder sb = new StringBuilder(63);
        sb.append("Upgrade database: oldVersion=");
        sb.append(i);
        sb.append(" newVersion=");
        sb.append(i2);
        Log.i("DeviceDrDatabaseHelper", sb.toString());
        List e = m34471e();
        for (int i3 = 0; i3 < e.size(); i3++) {
            ((ruh) e.get(i3)).mo25173d(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public final void mo25177a(ruk ruk) {
        int a = bpur.m112304a((int) ruk.f43708g);
        int i = a == 0 ? 1 : a;
        m34472f();
        rul.m34487a(getWritableDatabase(), ruk.f43702a, ruk.f43703b, ruk.f43704c, ruk.f43705d, ruk.f43706e, ruk.f43707f, i, ruk.f43709h, ruk.f43710i);
    }
}
