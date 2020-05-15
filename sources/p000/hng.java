package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: hng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hng {

    /* renamed from: a */
    public static final sek f20067a = ght.m13172b("DatabaseManager");

    /* renamed from: b */
    private static hng f20068b;

    /* renamed from: c */
    private final hnf f20069c;

    private hng(Context context) {
        this.f20069c = new hnf(context);
    }

    /* renamed from: a */
    public static synchronized hng m14641a(Context context) {
        hng hng;
        synchronized (hng.class) {
            if (f20068b == null) {
                f20068b = new hng(context.getApplicationContext());
            }
            hng = f20068b;
        }
        return hng;
    }

    /* renamed from: a */
    public final SQLiteDatabase mo12630a() {
        try {
            return adbc.m50103a(this.f20069c, "auth.credentials.credential_store", ccci.f178747a.mo6606a().mo75764a());
        } catch (SQLiteException e) {
            adbd a = adbe.m50105a();
            a.f61233b = e;
            a.f61234c = 8;
            a.f61232a = e.getMessage();
            throw a.mo33301a();
        }
    }

    /* renamed from: a */
    public final Object mo12631a(String str, String[] strArr, hni hni, Object obj) {
        Cursor rawQuery = mo12630a().rawQuery(str, strArr);
        try {
            if (rawQuery.moveToFirst()) {
                return hni.mo12634a(rawQuery);
            }
            rawQuery.close();
            return obj;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: a */
    public final void mo12632a(hnh hnh) {
        SQLiteDatabase a = mo12630a();
        a.beginTransaction();
        try {
            if (hnh.mo12633a(a)) {
                a.setTransactionSuccessful();
            }
        } finally {
            a.endTransaction();
        }
    }
}
