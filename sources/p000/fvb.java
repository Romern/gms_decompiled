package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: fvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvb {

    /* renamed from: b */
    private static fvb f17327b;

    /* renamed from: a */
    public final ReentrantLock f17328a = new ReentrantLock();

    private fvb() {
    }

    /* renamed from: a */
    public static synchronized fvb m12459a() {
        fvb fvb;
        synchronized (fvb.class) {
            if (f17327b == null) {
                f17327b = new fvb();
            }
            fvb = f17327b;
        }
        return fvb;
    }

    /* renamed from: a */
    public final void mo11387a(Context context, String str, int i) {
        this.f17328a.lock();
        try {
            SQLiteDatabase writableDatabase = fvc.m12461a(context).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            writableDatabase.update("sms", contentValues, "invitation_id=?", new String[]{str});
        } catch (SQLiteException e) {
        } finally {
            this.f17328a.unlock();
        }
    }
}
