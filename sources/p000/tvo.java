package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: tvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvo {

    /* renamed from: a */
    private static final String f46722a = ("feature_name=?");

    /* renamed from: b */
    private static final String f46723b = ("last_connection_timestamp>=?");

    /* renamed from: c */
    private static final String f46724c = ("last_connection_timestamp<?");

    /* renamed from: d */
    private static final AtomicLong f46725d = new AtomicLong(0);

    /* renamed from: e */
    private static tvo f46726e;

    /* renamed from: f */
    private final Context f46727f;

    /* renamed from: g */
    private final twb f46728g;

    public tvo(Context context) {
        this.f46727f = context;
        this.f46728g = new twb(context);
        new tvp(this, context);
    }

    /* renamed from: a */
    public static synchronized tvo m37525a(Context context) {
        tvo tvo;
        synchronized (tvo.class) {
            if (f46726e == null) {
                f46726e = new tvo(context.getApplicationContext());
            }
            tvo = f46726e;
        }
        return tvo;
    }

    /* renamed from: b */
    private final SQLiteDatabase m37526b() {
        try {
            return this.f46728g.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.w("DeviceConnectionAgent", "Can't get database for device connection logging.", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        return r14;
     */
    /* renamed from: a */
    public final synchronized int mo26823a(String[] strArr) {
        int i;
        if (((Boolean) tvr.f46738a.mo25081c()).booleanValue()) {
            SQLiteDatabase b = m37526b();
            if (b != null) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = false;
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("feature_name", strArr[i2]);
                    contentValues.put("last_connection_timestamp", Long.valueOf(currentTimeMillis));
                    int update = b.update("device_features", contentValues, f46722a, new String[]{strArr[i2]});
                    if (update == 0) {
                        if (b.insert("device_features", null, contentValues) == -1) {
                            String valueOf = String.valueOf(contentValues.toString());
                            Log.w("DeviceConnectionAgent", valueOf.length() == 0 ? new String("Insert failed for the following values: ") : "Insert failed for the following values: ".concat(valueOf));
                        } else {
                            z = true;
                        }
                    } else if (update > 1) {
                        String valueOf2 = String.valueOf(contentValues.toString());
                        Log.w("DeviceConnectionAgent", valueOf2.length() == 0 ? new String("Update affected multiple rows for the following values: ") : "Update affected multiple rows for the following values: ".concat(valueOf2));
                    }
                }
                if (z) {
                    this.f46727f.sendBroadcast(new Intent("com.google.android.gms.deviceconnection.device_feature_added"));
                }
            } else {
                i = 8;
            }
        } else {
            i = 3;
        }
    }

    /* renamed from: a */
    public final synchronized DataHolder mo26824a() {
        DataHolder b = DataHolder.m22539b(8);
        String[] strArr = {String.valueOf(System.currentTimeMillis() - ((Long) tvr.f46739b.mo25081c()).longValue())};
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) tvr.f46739b.mo25081c()).longValue();
        long j = f46725d.get();
        if (j <= elapsedRealtime - longValue || j == 0) {
            SQLiteDatabase b2 = m37526b();
            if (b2 == null) {
                return b;
            }
            try {
                b2.delete("device_features", f46724c, strArr);
                f46725d.set(SystemClock.elapsedRealtime());
            } finally {
                b2.close();
            }
        }
        SQLiteDatabase b3 = m37526b();
        if (b3 == null) {
            return b;
        }
        return new DataHolder(b3.query("device_features", tvu.f46744a, f46723b, strArr, null, null, "last_connection_timestamp DESC"), null);
    }
}
